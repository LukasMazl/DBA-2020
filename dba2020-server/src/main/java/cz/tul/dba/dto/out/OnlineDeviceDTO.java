package cz.tul.dba.dto.out;

import java.util.Date;

public class OnlineDeviceDTO {

    private String serialNumber;
    private Date lastRecord;
    private String machineName;
    private int maxSpeed;
    private int maxDistance;
    private int interval;
    private boolean online;

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Date getLastRecord() {
        return lastRecord;
    }

    public void setLastRecord(Date lastRecord) {
        this.lastRecord = lastRecord;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
}
