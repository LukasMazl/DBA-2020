package cz.tul.dba.blogic.entity;

import javax.persistence.*;

@Entity
@Table(name = "machineState")
public class MachineStateEntity {

    @Id
    @Column(name = "state_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id")
    private DeviceEntity deviceEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_conf_id")
    private DeviceConfigurationEntity configurationEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "machine_id")
    private MachineEntity machineEntity;

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
}
