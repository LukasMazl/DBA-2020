package cz.tul.dba.blogic.entity;

import javax.persistence.*;

@Entity
@Table(name = "machine")
public class MachineEntity {

    @Id
    @Column(name = "machine_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id")
    private DeviceEntity deviceEntity;

    @Enumerated(EnumType.STRING)
    private MachineEntityState machineEntityState;

    @Column(name = "vin", nullable = false, unique = true)
    private String vin;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public DeviceEntity getDeviceEntity() {
        return deviceEntity;
    }

    public void setDeviceEntity(DeviceEntity deviceEntity) {
        this.deviceEntity = deviceEntity;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public MachineEntityState getMachineEntityState() {
        return machineEntityState;
    }

    public void setMachineEntityState(MachineEntityState machineEntityState) {
        this.machineEntityState = machineEntityState;
    }
}
