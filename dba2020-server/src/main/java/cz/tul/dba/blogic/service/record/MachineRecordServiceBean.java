package cz.tul.dba.blogic.service.record;

import cz.tul.dba.blogic.entity.MachineEntity;
import cz.tul.dba.blogic.entity.MachineStateEntity;
import cz.tul.dba.blogic.repository.MachineRepository;
import cz.tul.dba.blogic.repository.MachineStateRepository;
import cz.tul.dba.dto.in.GetRecordsForMachineDTO;
import cz.tul.dba.dto.out.machine.MachineDataRecordDTO;
import cz.tul.dba.dto.out.machine.MachineDataRecordsDTO;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MachineRecordServiceBean implements MachineRecordService {

    private MachineStateRepository machineStateRepository;
    private MachineRepository machineRepository;

    public MachineRecordServiceBean(MachineStateRepository repository, MachineRepository machineRepository) {
        this.machineStateRepository = repository;
        this.machineRepository = machineRepository;
    }

    @Override
    public MachineDataRecordsDTO readAllRecords(GetRecordsForMachineDTO data) {
        MachineDataRecordsDTO machineDataRecordsDTO = new MachineDataRecordsDTO();
        MachineEntity machineEntity = machineRepository.findByVin(data.getVin());
        Pageable pageable = PageRequest.of(data.getPage(), data.getPageSize(), Sort.by("created").descending());

        List<MachineStateEntity> machineStateEntityList = machineStateRepository.findAllByMachineEntity(machineEntity, pageable);
        List<MachineDataRecordDTO> machineDataRecordDTOS = new ArrayList<>();
        for (MachineStateEntity machineStateEntity : machineStateEntityList) {
            MachineDataRecordDTO machineDataRecordDTO = prepareMachineRecordsToDTO(machineStateEntity);
            machineDataRecordDTOS.add(machineDataRecordDTO);
        }
        machineDataRecordsDTO.setMachineDataRecordDTOS(machineDataRecordDTOS);
        return machineDataRecordsDTO;
    }

    private MachineDataRecordDTO prepareMachineRecordsToDTO(MachineStateEntity machineStateEntity) {
        MachineDataRecordDTO machineDataRecordDTO = new MachineDataRecordDTO();
        machineDataRecordDTO.setAction(machineStateEntity.getAction());
        machineDataRecordDTO.setGpsX(machineStateEntity.getGpsX());
        machineDataRecordDTO.setGpsY(machineStateEntity.getGpsY());
        machineDataRecordDTO.setSpeedX(machineStateEntity.getSpeedX());
        machineDataRecordDTO.setSpeedY(machineStateEntity.getSpeedY());
        machineDataRecordDTO.setSpeedZ(machineStateEntity.getSpeedZ());
        machineDataRecordDTO.setHumidity(machineStateEntity.getHumidity());
        machineDataRecordDTO.setSerialNumber(machineStateEntity.getDeviceEntity().getSerialNumber());
        machineDataRecordDTO.setVin(machineStateEntity.getMachineEntity().getVin());
        machineDataRecordDTO.setRestOfFuel(machineStateEntity.getRestOfFuel());
        machineDataRecordDTO.setStreesBattery(machineStateEntity.getStressBattery());
        machineDataRecordDTO.setTensometer(machineStateEntity.getTensometr());
        machineDataRecordDTO.setCreate(machineStateEntity.getCreated().toString());
        return machineDataRecordDTO;
    }

}
