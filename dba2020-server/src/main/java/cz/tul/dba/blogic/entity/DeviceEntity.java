package cz.tul.dba.blogic.entity;


import javax.persistence.*;

@Entity
@Table(name = "device")
public class DeviceEntity {

    @Id
    @Column(name = "device_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(mappedBy = "deviceEntity", fetch = FetchType.LAZY)
    private MachineEntity machineEntity;

    @OneToOne(mappedBy = "deviceEntity", fetch = FetchType.EAGER)
    private DeviceConfigurationEntity deviceConfigurationEntity;

    @Column(name = "deviceCode", nullable = false)
    private String deviceCode;

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

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }
}
