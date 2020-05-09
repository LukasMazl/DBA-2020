package cz.tul.dba.dto.in;

import cz.tul.dba.blogic.service.device.MachineState;

public class RecordMachineStateDTO implements MachineState {
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

    @Override
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

    @Override
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public Double getGpsX() {
        return gpsX;
    }

    public void setGpsX(Double gpsX) {
        this.gpsX = gpsX;
    }

    @Override
    public Double getGpsY() {
        return gpsY;
    }

    public void setGpsY(Double gpsY) {
        this.gpsY = gpsY;
    }

    @Override
    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    @Override
    public Double getSpeedX() {
        return speedX;
    }

    public void setSpeedX(Double speedX) {
        this.speedX = speedX;
    }

    @Override
    public Double getSpeedY() {
        return speedY;
    }

    public void setSpeedY(Double speedY) {
        this.speedY = speedY;
    }

    @Override
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

    @Override
    public Double getRestOfFuel() {
        return restOfFuel;
    }

    public void setRestOfFuel(Double restOfFuel) {
        this.restOfFuel = restOfFuel;
    }

    @Override
    public String getDeviceSerialNumber() {
        return serialNumber;
    }

    @Override
    public Double getStressBattery() {
        return streesBattery;
    }

    @Override
    public Double getTensometer() {
        return tensometer;
    }

    public void setTensomert(Double tensometer) {
        this.tensometer = tensometer;
    }
}
