package cz.tul.dba.dto.in;

import cz.tul.dba.blogic.service.device.DeviceConfiguration;

public class NewDeviceConfigurationDTO implements DeviceConfiguration {
    @Override
    public int getSecondLatency() {
        return 0;
    }
}
