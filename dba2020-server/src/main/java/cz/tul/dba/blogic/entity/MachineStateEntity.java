package cz.tul.dba.blogic.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "machineState")
public class MachineStateEntity {

    @Id
    @Column(name = "state_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "device_id")
    private DeviceEntity deviceEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "device_conf_id")
    private DeviceConfigurationEntity configurationEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "machine_id")
    private MachineEntity machineEntity;

    @Column(name = "GPS_X", nullable = false)
    private Double gpsX;

    @Column(name = "GPS_Y", nullable = false)
    private Double gpsY;

    @Column(name = "speed_x", nullable = false)
    private Double speedX;

    @Column(name = "speed_y", nullable = false)
    private Double speedY;

    @Column(name = "speed_z", nullable = false)
    private Double speedZ;

    @Column(name = "bat_strees", nullable = false)
    private Double stressBattery;

    @Column(name = "humidity", nullable = false)
    private Double humidity;

    @Column(name = "tesometr", nullable = false)
    private Double tensometr;

    @Column(name = "fuel", nullable = false)
    private Double restOfFuel;

    @Column(name = "action", nullable = false)
    private String action;

    @Column(name = "created", nullable = false)
    private Date created;

    public DeviceEntity getDeviceEntity() {
        return deviceEntity;
    }

    public void setDeviceEntity(DeviceEntity deviceEntity) {
        this.deviceEntity = deviceEntity;
    }

    public DeviceConfigurationEntity getConfigurationEntity() {
        return configurationEntity;
    }

    public void setConfigurationEntity(DeviceConfigurationEntity configurationEntity) {
        this.configurationEntity = configurationEntity;
    }

    public MachineEntity getMachineEntity() {
        return machineEntity;
    }

    public void setMachineEntity(MachineEntity machineEntity) {
        this.machineEntity = machineEntity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Double getStressBattery() {
        return stressBattery;
    }

    public void setStressBattery(Double stressBattery) {
        this.stressBattery = stressBattery;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getTensometr() {
        return tensometr;
    }

    public void setTensometr(Double tensometr) {
        this.tensometr = tensometr;
    }

    public Double getRestOfFuel() {
        return restOfFuel;
    }

    public void setRestOfFuel(Double restOfFuel) {
        this.restOfFuel = restOfFuel;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
