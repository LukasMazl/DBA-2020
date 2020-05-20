package cz.tul.dba.dto.out;

import cz.tul.dba.blogic.entity.DeviceEntity;
import cz.tul.dba.dto.DeviceDTO;

import java.util.List;

public class AllFreeDeviceDTO {
    private List<FreeDeviceDTO> deviceEntityList;

    public List<FreeDeviceDTO> getDeviceEntityList() {
        return deviceEntityList;
    }

    public void setDeviceEntityList(List<FreeDeviceDTO> deviceEntityList) {
        this.deviceEntityList = deviceEntityList;
    }
}
