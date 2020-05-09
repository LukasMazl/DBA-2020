package cz.tul.dba.blogic.repository;

import cz.tul.dba.blogic.entity.DeviceEntity;
import cz.tul.dba.blogic.entity.DeviceStateEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceRepository extends CrudRepository<DeviceEntity, Long> {
    /**
     * Basic method for finding device entity
     *
     * @param id
     * @return
     */
    DeviceEntity findById(long id);

    /**
     * This method can be used for indicating whether machine is used or not
     *
     * @return set of Device Entity
     */
    List<DeviceEntity> findAllByMachineEntityIsNullAndDeviceStateEntityNot(DeviceStateEntity deviceStateEntity);

    /**
     * Returns Device Entity found by serialNumber
     * @param serialNumber
     * @return device entity
     */
    DeviceEntity findBySerialNumberAndDeviceStateEntityNot(String serialNumber, DeviceStateEntity deviceStateEntity);

    DeviceEntity findBySerialNumber(String serialNumber);
}
