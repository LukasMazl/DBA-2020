package cz.tul.dba.controller.api;

import cz.tul.dba.blogic.service.device.DeviceService;
import cz.tul.dba.blogic.service.machine.MachineService;
import cz.tul.dba.blogic.service.record.MachineRecordService;
import cz.tul.dba.dto.in.GetRecordsForMachineDTO;
import cz.tul.dba.dto.out.AllDeviceDTO;
import cz.tul.dba.dto.out.machine.AllMachineDTO;
import cz.tul.dba.dto.out.machine.MachineDataRecordsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReadDataController {

    private MachineRecordService machineRecordService;
    private MachineService machineService;
    private SimpMessagingTemplate messageSender;
    private DeviceService deviceService;

    @Autowired
    public ReadDataController(MachineService machineService, MachineRecordService machineRecordService,
                              DeviceService deviceService, SimpMessagingTemplate messageSender) {
        this.machineService = machineService;
        this.machineRecordService = machineRecordService;
        this.messageSender = messageSender;
        this.deviceService = deviceService;
    }

    @RequestMapping(path = "/api/v1/data/getAllMachines", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public AllMachineDTO getAllMachines() {
        messageSender.convertAndSend("/topics/all", "helloo");
        return machineService.getAllMachines();
    }

    @RequestMapping(path = "/api/v1/data/getAllDevices", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public AllDeviceDTO getAllDevice() {
        return deviceService.getAllDevices();
    }

    @RequestMapping(path = "/api/v1/data/machine", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public MachineDataRecordsDTO getRecordsForMachine(@RequestBody GetRecordsForMachineDTO getRecordsForMachineDTO) {
        return machineRecordService.readAllRecords(getRecordsForMachineDTO);
    }

}
