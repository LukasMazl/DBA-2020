package cz.tul.dba.blogic.service.machine;

import cz.tul.dba.dto.out.machine.AllMachineDTO;

public interface MachineService {

    boolean createMachine(Machine machine);

    boolean updateMachine(Machine machine, String vinCode);

    boolean deleteMachine(String vinCode);

    AllMachineDTO getAllMachines();
}
