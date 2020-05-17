package cz.tul.dba.blogic.service.machine;

import cz.tul.dba.blogic.entity.MachineEntityState;
import cz.tul.dba.blogic.entity.MachineTypeEntity;

public interface Machine {
    String getVin();

    MachineEntityState getMachineEntityState();

    MachineTypeEntity getMachineTypeEntity();

    String getDescription();

    String getManufacturer();

}
