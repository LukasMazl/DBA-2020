package cz.tul.dba.dto.out;

import cz.tul.dba.dto.DeviceDTO;

import java.util.List;

public class AllDeviceDTO {
    private List<DeviceDTO> deviceDTOList;

    public List<DeviceDTO> getDeviceDTOList() {
        return deviceDTOList;
    }

    public void setDeviceDTOList(List<DeviceDTO> deviceDTOList) {
        this.deviceDTOList = deviceDTOList;
    }
}
