package cz.tul.dba.blogic.service.record;

import cz.tul.dba.dto.in.GetRecordsForMachineDTO;
import cz.tul.dba.dto.out.machine.MachineDataRecordsDTO;

public interface MachineRecordService {

    MachineDataRecordsDTO readAllRecords(GetRecordsForMachineDTO data);

}
