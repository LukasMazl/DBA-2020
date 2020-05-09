package cz.tul.dba.dto.out;

import cz.tul.dba.blogic.entity.DeviceConfigurationEntity;

public class DeviceConfigurationDTO {
    private DeviceConfigurationEntity deviceConfigurationEntity;

    public DeviceConfigurationEntity getDeviceConfigurationEntity() {
        return deviceConfigurationEntity;
    }

    public void setDeviceConfigurationEntity(DeviceConfigurationEntity deviceConfigurationEntity) {
        this.deviceConfigurationEntity = deviceConfigurationEntity;
    }
}
