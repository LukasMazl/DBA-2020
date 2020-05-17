package cz.tul.dba.dto;

import cz.tul.dba.blogic.entity.DeviceStateEntity;

import java.util.Date;

public class DeviceDTO {
    private boolean online;
    private String serialNumber;
    private String deviceDescription;
    private DeviceStateEntity deviceStateEntity;
    private Date created;


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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
