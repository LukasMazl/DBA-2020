package cz.tul.dba.blogic.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "device")
public class DeviceEntity {

    @Id
    @Column(name = "device_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(mappedBy = "deviceEntity", fetch = FetchType.LAZY)
    private MachineEntity machineEntity;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_conf_id")
    private DeviceConfigurationEntity deviceConfigurationEntity;

    @Column(name = "serial_number", nullable = false, unique = true)
    private String serialNumber;

    @Column(name = "description")
    private String deviceDescription;

    @Column(name = "state", nullable = false)
    @Enumerated(EnumType.STRING)
    private DeviceStateEntity deviceStateEntity;

    @Column(name = "crated", nullable = false)
    private Date created;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public MachineEntity getMachineEntity() {
        return machineEntity;
    }

    public void setMachineEntity(MachineEntity machineEntity) {
        this.machineEntity = machineEntity;
    }

    public DeviceConfigurationEntity getDeviceConfigurationEntity() {
        return deviceConfigurationEntity;
    }

    public void setDeviceConfigurationEntity(DeviceConfigurationEntity deviceConfigurationEntity) {
        this.deviceConfigurationEntity = deviceConfigurationEntity;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDeviceDescription() {
        return deviceDescription;
    }

    public void setDeviceDescription(String deviceDescription) {
        this.deviceDescription = deviceDescription;
    }

    public DeviceStateEntity getDeviceStateEntity() {
        return deviceStateEntity;
    }

    public void setDeviceStateEntity(DeviceStateEntity deviceStateEntity) {
        this.deviceStateEntity = deviceStateEntity;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
