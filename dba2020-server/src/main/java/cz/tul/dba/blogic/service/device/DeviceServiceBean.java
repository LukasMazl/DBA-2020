package cz.tul.dba.blogic.service.device;

import cz.tul.dba.blogic.entity.*;
import cz.tul.dba.blogic.exception.DeviceNotFoundException;
import cz.tul.dba.blogic.exception.MachineNotFoundException;
import cz.tul.dba.blogic.repository.DeviceConfigurationRepository;
import cz.tul.dba.blogic.repository.DeviceRepository;
import cz.tul.dba.blogic.repository.MachineRepository;
import cz.tul.dba.blogic.repository.MachineStateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DeviceServiceBean implements DeviceService {

    private DeviceRepository deviceRepository;
    private DeviceConfigurationRepository deviceConfigurationRepository;
    private MachineRepository machineRepository;
    private MachineStateRepository machineStateRepository;

    @Autowired
    public DeviceServiceBean(DeviceRepository deviceRepository, DeviceConfigurationRepository deviceConfigurationRepository,
                             MachineRepository machineRepository, MachineStateRepository machineStateRepository) {
        this.deviceRepository = deviceRepository;
        this.deviceConfigurationRepository = deviceConfigurationRepository;
        this.machineRepository = machineRepository;
        this.machineStateRepository = machineStateRepository;
    }

    @Override
    public List<DeviceEntity> getAllFreeDevices() {
        return deviceRepository.findAllByMachineEntityIsNullAndDeviceStateEntityNot(DeviceStateEntity.DELETED);
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
        deviceEntity.setDeviceStateEntity(deviceEntity.getDeviceStateEntity());
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
}