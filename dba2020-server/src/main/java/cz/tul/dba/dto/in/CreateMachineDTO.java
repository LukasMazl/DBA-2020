package cz.tul.dba.dto.in;

import cz.tul.dba.blogic.entity.MachineEntityState;
import cz.tul.dba.blogic.entity.MachineTypeEntity;
import cz.tul.dba.blogic.service.machine.Machine;

public class CreateMachineDTO implements Machine {
    private String vin;
    private String description;
    private String manufacturer;
    private String name;
    private MachineEntityState machineEntityState;
    private MachineTypeEntity machineTypeEntity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public MachineEntityState getMachineEntityState() {
        return machineEntityState;
    }

    public void setMachineEntityState(MachineEntityState machineEntityState) {
        this.machineEntityState = machineEntityState;
    }

    @Override
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public MachineTypeEntity getMachineTypeEntity() {
        return machineTypeEntity;
    }

    public void setMachineTypeEntity(MachineTypeEntity machineTypeEntity) {
        this.machineTypeEntity = machineTypeEntity;
    }

    @Override
    public String toString() {
        return "CreateMachineDTO{" +
                "vin='" + vin + '\'' +
                ", description='" + description + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                ", machineEntityState=" + machineEntityState +
                ", machineTypeEntity=" + machineTypeEntity +
                '}';
    }
}
