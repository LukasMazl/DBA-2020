package cz.tul.dba.blogic.service.machine;

import cz.tul.dba.dto.DeviceDTO;
import cz.tul.dba.dto.in.UpdateMachineDTO;
import cz.tul.dba.dto.out.machine.AllMachineDTO;

import java.util.List;

public interface MachineService {

    boolean createMachine(Machine machine);

    boolean updateMachine(UpdateMachineDTO updateMachineDTO, String vinCode);

    boolean deleteMachine(String vinCode);

    List<DeviceDTO> readAll();

    AllMachineDTO getAllMachines();
}
