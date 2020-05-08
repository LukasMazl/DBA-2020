package cz.tul.dba.blogic.repository;

import cz.tul.dba.blogic.entity.MachineEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineRepository extends CrudRepository<MachineEntity, Long> {
    /**
     * Basic CRUD method for finding Machine by ID
     *
     * @param id of machine
     * @return machine entity
     */
    MachineEntity findById(long id);


    /**
     * Method returns Machine entity that has been found by VIN cod
     *
     * @param vin code
     * @return machine entity
     */
    MachineEntity findByVin(String vin);
}
