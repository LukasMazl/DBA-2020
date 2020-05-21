package cz.tul.dba.blogic.service.device;

import cz.tul.dba.blogic.entity.*;
import cz.tul.dba.blogic.exception.DeviceNotFoundException;
import cz.tul.dba.blogic.exception.MachineNotFoundException;
import cz.tul.dba.blogic.helper.DeviceHelper;
import cz.tul.dba.blogic.helper.MachineStateHelper;
import cz.tul.dba.blogic.repository.DeviceConfigurationRepository;
import cz.tul.dba.blogic.repository.DeviceRepository;
import cz.tul.dba.blogic.repository.MachineRepository;
import cz.tul.dba.blogic.repository.MachineStateRepository;
import cz.tul.dba.dto.DeviceDTO;
import cz.tul.dba.dto.out.AllDeviceDTO;
import cz.tul.dba.dto.out.FreeDeviceDTO;
import cz.tul.dba.dto.out.OnlineDeviceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DeviceServiceBean implements DeviceService {

    private DeviceRepository deviceRepository;
    private DeviceConfigurationRepository deviceConfigurationRepository;
    private MachineRepository machineRepository;
    private MachineStateRepository machineStateRepository;
    private DeviceHelper deviceHelper;
    private MachineStateHelper machineStateHelper;

    @Autowired
    public DeviceServiceBean(DeviceRepository deviceRepository, DeviceConfigurationRepository deviceConfigurationRepository,
                             MachineRepository machineRepository, MachineStateRepository machineStateRepository,
                             DeviceHelper deviceHelper, MachineStateHelper machineStateHelper) {
        this.deviceRepository = deviceRepository;
        this.deviceConfigurationRepository = deviceConfigurationRepository;
        this.machineRepository = machineRepository;
        this.machineStateRepository = machineStateRepository;
        this.deviceHelper = deviceHelper;
        this.machineStateHelper = machineStateHelper;
    }

    @Override
    public List<FreeDeviceDTO> getAllFreeDevices() {
        List<DeviceEntity>  deviceEntities = deviceRepository.findAllByMachineEntityIsNullAndDeviceStateEntityNot(DeviceStateEntity.DELETED);
        List<FreeDeviceDTO> deviceDTOList = new ArrayList<>();
        for(DeviceEntity deviceEntity: deviceEntities) {
            FreeDeviceDTO deviceDTO = new FreeDeviceDTO();
            deviceDTO.setSerialNumber(deviceEntity.getSerialNumber());
            deviceDTO.setCreated(deviceEntity.getCreated().toString());
            deviceDTO.setDeviceDescription(deviceEntity.getDeviceDescription());
            deviceDTO.setDeviceStateEntity(deviceEntity.getDeviceStateEntity());
            boolean isOnline = machineStateHelper.isDeviceOnline(5, deviceEntity);
            deviceDTO.setOnline(isOnline);
            deviceDTOList.add(deviceDTO);
        }
        return deviceDTOList;
    }

    @Override
    public boolean setDeviceOnMachine(String deviceSerialNumber, String machineVin) {
        DeviceEntity deviceEntity = deviceRepository.findBySerialNumberAndDeviceStateEntityNot(deviceSerialNumber, DeviceStateEntity.DELETED);
        if (deviceEntity == null) {
            throw new DeviceNotFoundException("Device with serial number " + deviceSerialNumber + " not found.");
        }
        MachineEntity machineEntity = machineRepository.findByVin(machineVin);
        if (machineEntity == null) {
            throw new MachineNotFoundException("Machine with vin code " + machineVin + " not found.");
        }
        deviceEntity.setMachineEntity(machineEntity);
        machineEntity.setDeviceEntity(deviceEntity);
        machineRepository.save(machineEntity);
        deviceRepository.save(deviceEntity);
        return true;
    }

    @Override
    public boolean saveMachineState(MachineState machineState) {
        DeviceEntity deviceEntity = deviceRepository.findBySerialNumberAndDeviceStateEntityNot(machineState.getDeviceSerialNumber(), DeviceStateEntity.DELETED);
        if (deviceEntity == null) {
            throw new DeviceNotFoundException("Device with serial number " + machineState.getDeviceSerialNumber() + " not found.");
        }
        MachineEntity machineEntity = machineRepository.findByVin(machineState.getVin());
        if (machineEntity == null) {
            throw new MachineNotFoundException("Machine with vin code " + machineState.getVin() + " not found.");
        }
        DeviceConfigurationEntity deviceConfigurationEntity = deviceEntity.getDeviceConfigurationEntity();
        MachineStateEntity machineStateEntity = createMachineStateRecord(deviceEntity, machineEntity, machineState, deviceConfigurationEntity);
        machineStateRepository.save(machineStateEntity);
        return true;
    }

    private MachineStateEntity createMachineStateRecord(DeviceEntity deviceEntity, MachineEntity machineEntity, MachineState machineState,
                                                        DeviceConfigurationEntity deviceConfigurationEntity) {
        MachineStateEntity machineStateEntity = new MachineStateEntity();
        machineStateEntity.setMachineEntity(machineEntity);
        machineStateEntity.setDeviceEntity(deviceEntity);
        machineStateEntity.setConfigurationEntity(deviceConfigurationEntity);

        machineStateEntity.setCreated(new Date());
        machineStateEntity.setAction(machineState.getAction());
        machineStateEntity.setGpsX(machineState.getGpsX());
        machineStateEntity.setGpsY(machineState.getGpsY());
        machineStateEntity.setHumidity(machineState.getHumidity());
        machineStateEntity.setRestOfFuel(machineState.getRestOfFuel());
        machineStateEntity.setStressBattery(machineState.getStressBattery());
        machineStateEntity.setSpeedX(machineState.getSpeedX());
        machineStateEntity.setSpeedY(machineState.getSpeedY());
        machineStateEntity.setSpeedZ(machineState.getSpeedZ());
        machineStateEntity.setTensometr(machineState.getTensometer());

        return machineStateEntity;
    }

    @Override
    public DeviceConfigurationEntity getDeviceConfiguration(String serialNumber) {
        DeviceEntity deviceEntity = deviceRepository.findBySerialNumberAndDeviceStateEntityNot(serialNumber, DeviceStateEntity.DELETED);
        if (deviceEntity == null) {
            throw new DeviceNotFoundException("Device with serial number " + serialNumber + " not found.");
        }
        return deviceEntity.getDeviceConfigurationEntity();
    }

    @Override
    public boolean createNewDeviceConfiguration(String serialNumber, DeviceConfiguration deviceConfiguration) {
        DeviceEntity deviceEntity = deviceRepository.findBySerialNumberAndDeviceStateEntityNot(serialNumber, DeviceStateEntity.DELETED);
        if (deviceEntity == null) {
            throw new DeviceNotFoundException("Device with serial number " + serialNumber + " not found.");
        }
        DeviceConfigurationEntity deviceConfigurationEntity = createConfigurationEntity(deviceConfiguration);
        deviceConfigurationRepository.save(deviceConfigurationEntity);
        deviceEntity.setDeviceConfigurationEntity(deviceConfigurationEntity);
        deviceRepository.save(deviceEntity);
        return true;
    }

    private DeviceConfigurationEntity createConfigurationEntity(DeviceConfiguration deviceConfiguration) {
        DeviceConfigurationEntity deviceConfigurationEntity = new DeviceConfigurationEntity();
        deviceConfigurationEntity.setSecondLatency(deviceConfiguration.getSecondLatency());
        return deviceConfigurationEntity;
    }

    @Override
    public boolean createDevice(Device device) {
        DeviceEntity deviceEntity = new DeviceEntity();
        deviceEntity.setCreated(new Date());
        deviceEntity.setDeviceDescription(device.getDeviceDescription());
        deviceEntity.setDeviceStateEntity(device.getDeviceStateEntity());
        deviceEntity.setSerialNumber(device.getSerialNumber());
        deviceRepository.save(deviceEntity);
        return true;
    }

    @Override
    public boolean deleteDevice(String serialNumber) {
        DeviceEntity deviceEntity = deviceRepository.findBySerialNumber(serialNumber);
        if (deviceEntity == null) {
            throw new DeviceNotFoundException("Device with serial number " + serialNumber + " not found.");
        }
        deviceEntity.setDeviceStateEntity(DeviceStateEntity.DELETED);
        deviceRepository.save(deviceEntity);
        return true;
    }

    @Override
    public boolean updateDevice(String serialNumber, Device device) {
        DeviceEntity deviceEntity = deviceRepository.findBySerialNumber(serialNumber);
        if (deviceEntity == null) {
            throw new DeviceNotFoundException("Device with serial number " + serialNumber + " not found.");
        }
        deviceEntity.setDeviceStateEntity(device.getDeviceStateEntity());
        deviceEntity.setSerialNumber(device.getSerialNumber());
        deviceEntity.setDeviceDescription(device.getDeviceDescription());
        deviceRepository.save(deviceEntity);
        return true;
    }

    @Override
    public List<OnlineDeviceDTO> getOnlineDevices() {
        int minute = 5;
        Date date = new Date(System.currentTimeMillis() - 60 * 1000 * minute);
        List<MachineStateEntity> machineStateEntityList = machineStateRepository.findAllByCreatedAfter(date);
        Set<String> deviceSerialNumberSet = new HashSet<>();
        for (MachineStateEntity machineStateEntity : machineStateEntityList) {
            deviceSerialNumberSet.add(machineStateEntity.getDeviceEntity().getSerialNumber());
        }

        List<OnlineDeviceDTO> onlineDeviceDTOS = new ArrayList<>();
        for (String serialNumber : deviceSerialNumberSet) {
            OnlineDeviceDTO onlineDeviceDTO = prepareOnlineDeviceDTO(serialNumber);
            onlineDeviceDTOS.add(onlineDeviceDTO);
        }

        return onlineDeviceDTOS;
    }

    private OnlineDeviceDTO prepareOnlineDeviceDTO(String serialNumber) {
        OnlineDeviceDTO onlineDeviceDTO = new OnlineDeviceDTO();
        DeviceEntity deviceEntity = deviceRepository.findBySerialNumber(serialNumber);
        if (deviceEntity.getDeviceConfigurationEntity() != null) {
            onlineDeviceDTO.setMaxSpeed(deviceEntity.getDeviceConfigurationEntity().getMaxSpeed());
            onlineDeviceDTO.setMaxDistance(deviceEntity.getDeviceConfigurationEntity().getMaxDistance());
            onlineDeviceDTO.setInterval(deviceEntity.getDeviceConfigurationEntity().getSecondLatency());
        }
        onlineDeviceDTO.setSerialNumber(serialNumber);

        onlineDeviceDTO.setOnline(true);
        if (deviceEntity.getMachineEntity() != null) {
            onlineDeviceDTO.setMachineName(deviceEntity.getMachineEntity().getVin());
        } else {
            onlineDeviceDTO.setMachineName("----");
        }
        MachineStateEntity machineStateEntity = machineStateRepository.findTopByDeviceEntityOrderByCreatedDesc(deviceEntity);
        if (machineStateEntity != null) {
            onlineDeviceDTO.setLastRecord(machineStateEntity.getCreated());
        } else {
            //onlineDeviceDTO.setLastRecord();
        }
        return onlineDeviceDTO;
    }

    @Override
    public AllDeviceDTO getAllDevices() {
        AllDeviceDTO allDeviceDTO = new AllDeviceDTO();
        List<DeviceDTO> deviceDTOS = new ArrayList<>();
        List<DeviceEntity> deviceEntities = deviceRepository.findAllByDeviceStateEntityIsNot(DeviceStateEntity.DELETED);
        for(DeviceEntity deviceEntity : deviceEntities) {
            DeviceDTO deviceDTO = deviceHelper.prepareDeviceDTO(deviceEntity);
            deviceDTOS.add(deviceDTO);
        }
        allDeviceDTO.setDeviceDTOList(deviceDTOS);
        return allDeviceDTO;
    }
}
