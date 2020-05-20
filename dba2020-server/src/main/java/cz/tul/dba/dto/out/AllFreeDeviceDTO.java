package cz.tul.dba.dto.out;

import cz.tul.dba.blogic.entity.DeviceEntity;
import cz.tul.dba.dto.DeviceDTO;

import java.util.List;

public class AllFreeDeviceDTO {
    private List<DeviceDTO> deviceEntityList;

    public List<DeviceDTO> getDeviceEntityList() {
        return deviceEntityList;
    }

    public void setDeviceEntityList(List<DeviceDTO> deviceEntityList) {
        this.deviceEntityList = deviceEntityList;
    }
}
