package cz.tul.dba.controller.api;


import cz.tul.dba.blogic.service.machine.MachineService;
import cz.tul.dba.dto.in.CreateMachineDTO;
import cz.tul.dba.dto.in.DeleteMachineDTO;
import cz.tul.dba.dto.in.UpdateMachineDTO;
import cz.tul.dba.dto.out.responce.CreateMachineResponse;
import cz.tul.dba.dto.out.responce.DeteleMachineResponse;
import cz.tul.dba.dto.out.responce.UpdateMachineResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class MachineController {

    private MachineService machineService;

    @Autowired
    public MachineController(MachineService machineService) {
        this.machineService = machineService;
    }

    @RequestMapping(path = "/api/v1/machine/create", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public CreateMachineResponse createMachine(@RequestBody CreateMachineDTO createMachineDTO) {
        boolean isOk = machineService.createMachine(createMachineDTO);
        CreateMachineResponse machineResponse = new CreateMachineResponse(isOk);
        return machineResponse;
    }

    @RequestMapping(path = "/api/v1/machine/update/{vin-code}", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public UpdateMachineResponse updateMachine(UpdateMachineDTO updateMachineDTO, @PathVariable("vin-code") String vinCode) {
        boolean isOk = machineService.updateMachine(updateMachineDTO, vinCode);
        UpdateMachineResponse machineResponse = new UpdateMachineResponse(isOk);
        return machineResponse;
    }

    /*@RequestMapping(path = "/api/v1/machine/delete/{vin-code}", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public DeteleMachineResponse deleteMachine(@PathVariable("vin-code") String vinCode) {
        boolean isOk = machineService.deleteMachine(vinCode);
        DeteleMachineResponse deteleMachineResponse = new DeteleMachineResponse();
        deteleMachineResponse.setOk(isOk);
        return deteleMachineResponse;
    }*/

    @RequestMapping(path = "/api/v1/machine/delete", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public DeteleMachineResponse deleteMachine(@RequestBody DeleteMachineDTO deleteMachineDTO) {
        boolean isOk = machineService.deleteMachine(deleteMachineDTO.getVin());
        DeteleMachineResponse deteleMachineResponse = new DeteleMachineResponse();
        deteleMachineResponse.setOk(isOk);
        return deteleMachineResponse;
    }
}
