package cz.tul.dba.dto.out.machine;

import java.util.List;

public class AllMachineDTO {
    private List<MachineDTO> machineDTOList;

    public List<MachineDTO> getMachineDTOList() {
        return machineDTOList;
    }

    public void setMachineDTOList(List<MachineDTO> machineDTOList) {
        this.machineDTOList = machineDTOList;
    }
}
