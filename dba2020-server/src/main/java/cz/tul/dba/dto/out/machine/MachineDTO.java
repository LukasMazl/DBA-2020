package cz.tul.dba.dto.out.machine;

import cz.tul.dba.blogic.entity.MachineEntity;
import cz.tul.dba.blogic.entity.MachineEntityState;
import cz.tul.dba.blogic.entity.MachineTypeEntity;

import java.util.Date;

public class MachineDTO {

    private long id;
    private String description;
    private String vin;
    private String manufacturer;
    private String created;
    private MachineTypeEntity machineTypeEntity;
    private MachineEntityState machineEntityState;

    private boolean online;

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public MachineTypeEntity getMachineTypeEntity() {
        return machineTypeEntity;
    }

    public void setMachineTypeEntity(MachineTypeEntity machineTypeEntity) {
        this.machineTypeEntity = machineTypeEntity;
    }

    public MachineEntityState getMachineEntityState() {
        return machineEntityState;
    }

    public void setMachineEntityState(MachineEntityState machineEntityState) {
        this.machineEntityState = machineEntityState;
    }
}
