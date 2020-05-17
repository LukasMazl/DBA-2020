package cz.tul.dba.dto.out.machine;

import java.util.List;

public class MachineDataRecordsDTO {
    private List<MachineDataRecordDTO> machineDataRecordDTOS;
    private boolean online;

    public List<MachineDataRecordDTO> getMachineDataRecordDTOS() {
        return machineDataRecordDTOS;
    }

    public void setMachineDataRecordDTOS(List<MachineDataRecordDTO> machineDataRecordDTOS) {
        this.machineDataRecordDTOS = machineDataRecordDTOS;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
}
