package cz.tul.dba.blogic.repository;

import cz.tul.dba.blogic.entity.DeviceEntity;
import cz.tul.dba.blogic.entity.MachineStateEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface MachineStateRepository extends CrudRepository<MachineStateEntity, Long> {
    List<MachineStateEntity> findAllByCreatedAfterAndDeviceEntity(Date date, DeviceEntity deviceEntity);
}
