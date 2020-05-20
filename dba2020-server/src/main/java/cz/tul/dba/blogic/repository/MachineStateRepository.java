package cz.tul.dba.blogic.repository;

import cz.tul.dba.blogic.entity.DeviceEntity;
import cz.tul.dba.blogic.entity.MachineEntity;
import cz.tul.dba.blogic.entity.MachineStateEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface MachineStateRepository extends CrudRepository<MachineStateEntity, Long> {
    List<MachineStateEntity> findAllByCreatedAfterAndDeviceEntity(Date date, DeviceEntity deviceEntity);

    List<MachineStateEntity> findAllByCreatedAfter(Date date);

    MachineStateEntity findTopByMachineEntityAndDeviceEntityOrderByCreatedDesc(MachineEntity machineEntity, DeviceEntity deviceEntity);

    MachineStateEntity findTopByDeviceEntityOrderByCreatedDesc(DeviceEntity deviceEntity);

    List<MachineStateEntity> findAllByMachineEntity(MachineEntity machineEntity, Pageable pageable);
}
