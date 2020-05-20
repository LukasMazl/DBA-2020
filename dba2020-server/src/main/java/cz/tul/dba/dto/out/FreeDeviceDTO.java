package cz.tul.dba.dto.out;

import cz.tul.dba.blogic.entity.DeviceStateEntity;

import java.util.Date;

public class FreeDeviceDTO {
    private boolean online;
    private String serialNumber;
    private String deviceDescription;
    private DeviceStateEntity deviceStateEntity;
    private String created;


    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDeviceDescription() {
        return deviceDescription;
    }

    public void setDeviceDescription(String deviceDescription) {
        this.deviceDescription = deviceDescription;
    }

    public DeviceStateEntity getDeviceStateEntity() {
        return deviceStateEntity;
    }

    public void setDeviceStateEntity(DeviceStateEntity deviceStateEntity) {
        this.deviceStateEntity = deviceStateEntity;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}
