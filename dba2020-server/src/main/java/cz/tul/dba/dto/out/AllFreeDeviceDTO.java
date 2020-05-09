package cz.tul.dba.dto.out;

import cz.tul.dba.blogic.entity.DeviceEntity;

import java.util.List;

public class AllFreeDeviceDTO {
    private List<DeviceEntity> deviceEntityList;

    public List<DeviceEntity> getDeviceEntityList() {
        return deviceEntityList;
    }

    public void setDeviceEntityList(List<DeviceEntity> deviceEntityList) {
        this.deviceEntityList = deviceEntityList;
    }
}
