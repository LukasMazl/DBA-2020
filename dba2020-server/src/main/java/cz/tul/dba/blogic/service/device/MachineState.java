package cz.tul.dba.blogic.service.device;

public interface MachineState {
    String getVin();

    String getDeviceSerialNumber();

    String getAction();

    Double getGpsX();

    Double getGpsY();

    Double getHumidity();

    Double getRestOfFuel();

    Double getStressBattery();

    Double getSpeedX();

    Double getSpeedY();

    Double getSpeedZ();

    Double getTensometer();
}
