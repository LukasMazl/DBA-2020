package cz.tul.dba.blogic.service.machine;

import cz.tul.dba.blogic.entity.MachineEntity;
import cz.tul.dba.blogic.entity.MachineEntityState;
import cz.tul.dba.blogic.helper.MachineStateHelper;
import cz.tul.dba.blogic.repository.DeviceRepository;
import cz.tul.dba.blogic.repository.MachineRepository;
import cz.tul.dba.blogic.repository.MachineStateRepository;
import cz.tul.dba.dto.out.machine.AllMachineDTO;
import cz.tul.dba.dto.out.machine.MachineDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MachineServiceBean implements MachineService {

    private MachineRepository machineRepository;
    private DeviceRepository deviceRepository;
    private MachineStateRepository machineStateRepository;
    private MachineStateHelper machineStateHelper;

    @Autowired
    public MachineServiceBean(MachineRepository machineRepository, DeviceRepository deviceRepository, MachineStateRepository machineStateRepository, MachineStateHelper machineStateHelper) {
        this.machineRepository = machineRepository;
        this.deviceRepository = deviceRepository;
        this.machineStateHelper = machineStateHelper;
        this.machineStateRepository = machineStateRepository;
    }

    @Override
    public boolean createMachine(Machine machine) {
        MachineEntity machineEntity = new MachineEntity();
        machineEntity.setCreated(new Date());
        machineEntity.setVin(machine.getVin());
        machineEntity.setManufacturer(machine.getManufacturer());
        machineEntity.setDescription(machine.getDescription());
        machineEntity.setMachineEntityState(MachineEntityState.STOPPED);
        machineEntity.setMachineTypeEntity(machine.getMachineTypeEntity());
        machineRepository.save(machineEntity);
        return true;
    }

    @Override
    public boolean updateMachine(Machine machine, String vinCode) {
        MachineEntity machineEntity = machineRepository.findByVin(vinCode);
        if (machineEntity == null) {
            return false;
        }

        machineEntity.setVin(machine.getVin());
        machineEntity.setMachineEntityState(machine.getMachineEntityState());
        machineEntity.setManufacturer(machine.getManufacturer());
        machineEntity.setMachineTypeEntity(machine.getMachineTypeEntity());
        machineEntity.setDescription(machine.getDescription());

        machineRepository.save(machineEntity);
        return true;
    }

    @Override
    public boolean deleteMachine(String vinCode) {
        MachineEntity machineEntity = machineRepository.findByVin(vinCode);

        if (machineEntity == null) {
            return false;
        }
        machineEntity.setMachineEntityState(MachineEntityState.REMOVED);
        machineRepository.save(machineEntity);
        return true;
    }

    @Override
    public AllMachineDTO getAllMachines() {
        AllMachineDTO allMachineDTO = new AllMachineDTO();
        List<MachineDTO> machineDTOS = new ArrayList();
        allMachineDTO.setMachineDTOList(machineDTOS);
        List<MachineEntity> machineEntities = machineRepository.findAllByMachineEntityStateIsNot(MachineEntityState.REMOVED);
        for (MachineEntity machineEntity : machineEntities) {
            machineDTOS.add(convertMachineEntityToDTO(machineEntity));
        }
        return allMachineDTO;
    }

    private MachineDTO convertMachineEntityToDTO(MachineEntity machineEntity) {
        MachineDTO machineDTO = new MachineDTO();
        boolean online = false;
        if (machineEntity.getDeviceEntity() != null) {
            online = machineStateHelper.isDeviceOnline(5, machineEntity.getDeviceEntity());
        }
        machineDTO.setOnline(online);
        machineDTO.setCreated(machineEntity.getCreated().toString());
        machineDTO.setId(machineEntity.getId());
        machineDTO.setVin(machineEntity.getVin());
        machineDTO.setMachineEntityState(machineEntity.getMachineEntityState());
        machineDTO.setMachineTypeEntity(machineEntity.getMachineTypeEntity());
        return machineDTO;
    }
}
