package cz.tul.dba.blogic.service.record;

import cz.tul.dba.dto.in.GetRecordsForMachineDTO;
import cz.tul.dba.dto.out.machine.MachineDataRecordsDTO;
import org.springframework.stereotype.Service;

@Service
public class MachineRecordServiceBean implements MachineRecordService {


    @Override
    public boolean saveRecordToMachine() {
        return false;
    }

    @Override
    public MachineDataRecordsDTO readAllRecords(GetRecordsForMachineDTO data) {
        return null;
    }
}
