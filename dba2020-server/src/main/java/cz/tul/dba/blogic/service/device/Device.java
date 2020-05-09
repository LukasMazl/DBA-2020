package cz.tul.dba.blogic.service.device;

import cz.tul.dba.blogic.entity.DeviceStateEntity;

public interface Device {

    String getSerialNumber();

    String getDeviceDescription();

    DeviceStateEntity getDeviceStateEntity();

}
