package cz.tul.dba.controller.api;

import cz.tul.dba.blogic.service.machine.MachineService;
import cz.tul.dba.blogic.service.record.MachineRecordService;
import cz.tul.dba.dto.in.GetRecordsForMachineDTO;
import cz.tul.dba.dto.out.machine.AllMachineDTO;
import cz.tul.dba.dto.out.machine.MachineDataRecordsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadDataController {

    private MachineRecordService machineRecordService;
    private MachineService machineService;

    @Autowired
    public ReadDataController(MachineService machineService, MachineRecordService machineRecordService) {
        this.machineService = machineService;
        this.machineRecordService = machineRecordService;
    }

    @PostMapping("/api/v1/data/getAllMachines")
    public AllMachineDTO getAllMachines() {
        return machineService.getAllMachines();
    }

    @PostMapping("/api/v1/data/machine/{vin}")
    public MachineDataRecordsDTO getRecordsForMachine(GetRecordsForMachineDTO getRecordsForMachineDTO) {
        return null;
    }

}
