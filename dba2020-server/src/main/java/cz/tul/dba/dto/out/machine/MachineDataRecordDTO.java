package cz.tul.dba.dto.out.machine;

import cz.tul.dba.dto.out.DeviceConfigurationDTO;

public class MachineDataRecordDTO {
    private String vin;
    private String serialNumber;

    private String action;
    private Double gpsX;
    private Double gpsY;
    private Double humidity;
    private Double speedX;
    private Double speedY;
    private Double speedZ;
    private Double streesBattery;
    private Double restOfFuel;
    private Double tensometer;
    private String create;

    private DeviceConfigurationDTO deviceConfigurationDTO;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Double getGpsX() {
        return gpsX;
    }

    public void setGpsX(Double gpsX) {
        this.gpsX = gpsX;
    }

    public Double getGpsY() {
        return gpsY;
    }

    public void setGpsY(Double gpsY) {
        this.gpsY = gpsY;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getSpeedX() {
        return speedX;
    }

    public void setSpeedX(Double speedX) {
        this.speedX = speedX;
    }

    public Double getSpeedY() {
        return speedY;
    }

    public void setSpeedY(Double speedY) {
        this.speedY = speedY;
    }

    public Double getSpeedZ() {
        return speedZ;
    }

    public void setSpeedZ(Double speedZ) {
        this.speedZ = speedZ;
    }

    public Double getStreesBattery() {
        return streesBattery;
    }

    public void setStreesBattery(Double streesBattery) {
        this.streesBattery = streesBattery;
    }

    public Double getRestOfFuel() {
        return restOfFuel;
    }

    public void setRestOfFuel(Double restOfFuel) {
        this.restOfFuel = restOfFuel;
    }

    public Double getTensometer() {
        return tensometer;
    }

    public void setTensometer(Double tensometer) {
        this.tensometer = tensometer;
    }

    public DeviceConfigurationDTO getDeviceConfigurationDTO() {
        return deviceConfigurationDTO;
    }

    public void setDeviceConfigurationDTO(DeviceConfigurationDTO deviceConfigurationDTO) {
        this.deviceConfigurationDTO = deviceConfigurationDTO;
    }

    public String getCreate() {
        return create;
    }

    public void setCreate(String create) {
        this.create = create;
    }
}
