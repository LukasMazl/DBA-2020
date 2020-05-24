package cz.tul.dba.dto.in;

import cz.tul.dba.blogic.service.device.DeviceConfiguration;

public class NewDeviceConfigurationDTO implements DeviceConfiguration {

    private int latency;
    private int speed;
    private int distance;


    public int getLatency() {
        return latency;
    }

    public void setLatency(int latency) {
        this.latency = latency;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public int getSecondLatency() {
        return latency;
    }

    @Override
    public int getMaxSpeed() {
        return speed;
    }

    @Override
    public int getMaxDistance() {
        return distance;
    }
}
