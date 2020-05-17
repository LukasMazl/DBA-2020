package cz.tul.dba.blogic.entity;

import javax.persistence.*;
import java.util.Date;

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

    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    private MachineTypeEntity machineTypeEntity;

    @Column(name = "vin", nullable = false, unique = true)
    private String vin;

    @Column(name = "description")
    private String description;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "created")
    private Date created;

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

    public MachineTypeEntity getMachineTypeEntity() {
        return machineTypeEntity;
    }

    public void setMachineTypeEntity(MachineTypeEntity machineTypeEntity) {
        this.machineTypeEntity = machineTypeEntity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
