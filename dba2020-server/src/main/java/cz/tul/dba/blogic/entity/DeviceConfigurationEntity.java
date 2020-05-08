package cz.tul.dba.blogic.entity;

import javax.persistence.*;

@Entity
@Table(name = "device_configuration")
public class DeviceConfigurationEntity {

    @Id
    @Column(name = "device_conf_id")
    private long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id")
    private DeviceEntity deviceEntity;

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
}
