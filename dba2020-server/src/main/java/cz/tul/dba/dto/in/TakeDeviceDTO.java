package cz.tul.dba.dto.in;

public class TakeDeviceDTO {
    private String deviceSerialNumber;
    private String machineVin;

    public String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }

    public void setDeviceSerialNumber(String deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }

    public String getMachineVin() {
        return machineVin;
    }

    public void setMachineVin(String machineVin) {
        this.machineVin = machineVin;
    }
}
