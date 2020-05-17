package cz.tul.dba.controller.api;

import cz.tul.dba.blogic.entity.DeviceConfigurationEntity;
import cz.tul.dba.blogic.entity.DeviceEntity;
import cz.tul.dba.blogic.service.device.DeviceService;
import cz.tul.dba.dto.in.*;
import cz.tul.dba.dto.out.*;
import cz.tul.dba.dto.out.responce.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//TODO Odebrani zarizeni + vytvoření machine pokud neexistuje
/**
 * 1) Získání všech volných jednotek
 * 2) Zabraní si volné jednotny
 * 3) Posílání dat IOT
 * 4) Zíkání konfigurace
 * 5) Nastavení konfigurace
 */
@RestController
public class IOTDeviceController {

    private DeviceService deviceService;

    @Autowired
    public IOTDeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @RequestMapping(path = "/api/v1/device/allFree", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public AllFreeDeviceDTO getAllFreeDevice() {
        List<DeviceEntity> deviceEntityList = deviceService.getAllFreeDevices();
        AllFreeDeviceDTO allFreeDevice = new AllFreeDeviceDTO();
        allFreeDevice.setDeviceEntityList(deviceEntityList);
        return allFreeDevice;
    }



    @RequestMapping(path = "/api/v1/device/setTaken", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public TakeDeviceResponse takeDevice(@RequestBody TakeDeviceDTO takeDeviceDTO) {
        boolean isOk = deviceService.setDeviceOnMachine(takeDeviceDTO.getDeviceSerialNumber(), takeDeviceDTO.getMachineVin());
        TakeDeviceResponse takeDeviceResponse = new TakeDeviceResponse();
        takeDeviceResponse.setOk(isOk);
        return takeDeviceResponse;
    }

    @RequestMapping(path = "/api/v1/device/record", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public RecordNewStateResponse recordNewState(@RequestBody RecordMachineStateDTO recordMachineStateDTO) {
        boolean isOk = deviceService.saveMachineState(recordMachineStateDTO);
        RecordNewStateResponse recordNewStateResponse = new RecordNewStateResponse();
        recordNewStateResponse.setOk(isOk);
        return recordNewStateResponse;
    }

    @RequestMapping(path = "/api/v1/device/configuration/{serialNumber}", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public DeviceConfigurationDTO getDeviceConfiguration(@PathVariable String serialNumber) {
        DeviceConfigurationEntity deviceConfigurationEntity = deviceService.getDeviceConfiguration(serialNumber);
        DeviceConfigurationDTO deviceConfigurationDTO = new DeviceConfigurationDTO();
        deviceConfigurationDTO.setDeviceConfigurationEntity(deviceConfigurationEntity);
        return deviceConfigurationDTO;
    }

    @RequestMapping(path = "/api/v1/device/configuration/set/{serialNumber}", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public DeviceConfigurationResponse setDeviceConfiguration(@PathVariable String serialNumber, @RequestBody NewDeviceConfigurationDTO newDeviceConfigurationDTO) {
        boolean isOk = deviceService.createNewDeviceConfiguration(serialNumber, newDeviceConfigurationDTO);
        DeviceConfigurationResponse deviceConfigurationResponse = new DeviceConfigurationResponse();
        deviceConfigurationResponse.setOk(isOk);
        return deviceConfigurationResponse;
    }

    @RequestMapping(path = "/api/v1/device/create", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public CreateDeviceResponse createDevice(@RequestBody CreateDeviceDTO createDeviceDTO) {
        CreateDeviceResponse response = new CreateDeviceResponse();
        boolean ok = deviceService.createDevice(createDeviceDTO);
        response.setOk(ok);
        return response;
    }

    @RequestMapping(path = "/api/v1/device/update/{serialNumber}", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public UpdateDeviceResponse updateDevice(@RequestBody UpdateDeviceDTO updateDeviceDTO, @PathVariable String serialNumber) {
        UpdateDeviceResponse response = new UpdateDeviceResponse();
        boolean ok = deviceService.updateDevice(serialNumber, updateDeviceDTO);
        response.setOk(ok);
        return response;
    }

    @RequestMapping(path = "/api/v1/device/delete/{serialNumber}", method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public DeleteDeviceResponse deleteDevice(@PathVariable String serialNumber) {
        DeleteDeviceResponse response = new DeleteDeviceResponse();
        boolean ok = deviceService.deleteDevice(serialNumber);
        response.setOk(ok);
        return response;
    }
}
