package cz.tul.dba.blogic.entity;

import javax.persistence.*;

@Entity
@Table(name = "device_configuration")
public class DeviceConfigurationEntity {

    @Id
    @Column(name = "device_conf_id")
    private long id;

    @OneToOne(mappedBy = "deviceConfigurationEntity", fetch = FetchType.LAZY)
    private DeviceEntity deviceEntity;

    @Column(name = "second_latency")
    private int secondLatency;

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

    public int getSecondLatency() {
        return secondLatency;
    }

    public void setSecondLatency(int secondLatency) {
        this.secondLatency = secondLatency;
    }
}
