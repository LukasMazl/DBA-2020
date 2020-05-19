package cz.tul.dba.blogic.helper;

import cz.tul.dba.blogic.entity.DeviceEntity;
import cz.tul.dba.dto.DeviceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceHelper {

    private MachineStateHelper machineStateHelper;

    @Autowired
    public DeviceHelper(MachineStateHelper machineStateHelper) {
        this.machineStateHelper = machineStateHelper;
    }

    public DeviceDTO prepareDeviceDTO(DeviceEntity deviceEntity) {
        DeviceDTO deviceDTO = new DeviceDTO();
        deviceDTO.setSerialNumber(deviceEntity.getSerialNumber());
        deviceDTO.setCreated(deviceEntity.getCreated());
        deviceDTO.setDeviceDescription(deviceEntity.getDeviceDescription());
        deviceDTO.setDeviceStateEntity(deviceEntity.getDeviceStateEntity());
        boolean isOnline = machineStateHelper.isDeviceOnline(5, deviceEntity);
        deviceDTO.setOnline(isOnline);
        return deviceDTO;
    }
}
