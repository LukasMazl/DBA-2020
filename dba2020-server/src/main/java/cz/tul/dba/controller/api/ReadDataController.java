package cz.tul.dba.controller.api;

import cz.tul.dba.blogic.service.machine.MachineService;
import cz.tul.dba.blogic.service.record.MachineRecordService;
import cz.tul.dba.dto.in.GetRecordsForMachineDTO;
import cz.tul.dba.dto.out.machine.AllMachineDTO;
import cz.tul.dba.dto.out.machine.MachineDataRecordsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadDataController {

    private MachineRecordService machineRecordService;
    private MachineService machineService;
    private SimpMessagingTemplate messageSender;

    @Autowired
    public ReadDataController(MachineService machineService, MachineRecordService machineRecordService,
                              SimpMessagingTemplate messageSender) {
        this.machineService = machineService;
        this.machineRecordService = machineRecordService;
        this.messageSender = messageSender;

    }

    @PostMapping("/api/v1/data/getAllMachines")
    public AllMachineDTO getAllMachines() {
        messageSender.convertAndSend("/topics/all", "helloo");
        return machineService.getAllMachines();
    }

    @PostMapping("/api/v1/data/machine/{vin}")
    public MachineDataRecordsDTO getRecordsForMachine(GetRecordsForMachineDTO getRecordsForMachineDTO) {
        return null;
    }

}
