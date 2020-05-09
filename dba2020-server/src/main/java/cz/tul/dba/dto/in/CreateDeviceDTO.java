package cz.tul.dba.dto.in;

import cz.tul.dba.blogic.entity.DeviceStateEntity;
import cz.tul.dba.blogic.service.device.Device;

public class CreateDeviceDTO implements Device {
    private String serialNumber;

    private String deviceDescription;

    private DeviceStateEntity deviceStateEntity;

    @Override
    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String getDeviceDescription() {
        return deviceDescription;
    }

    @Override
    public DeviceStateEntity getDeviceStateEntity() {
        return deviceStateEntity;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setDeviceDescription(String deviceDescription) {
        this.deviceDescription = deviceDescription;
    }

    public void setDeviceStateEntity(DeviceStateEntity deviceStateEntity) {
        this.deviceStateEntity = deviceStateEntity;
    }

}
