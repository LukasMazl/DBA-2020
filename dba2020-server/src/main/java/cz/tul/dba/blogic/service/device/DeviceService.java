package cz.tul.dba.blogic.service.device;

import cz.tul.dba.blogic.entity.DeviceConfigurationEntity;
import cz.tul.dba.blogic.entity.DeviceEntity;
import cz.tul.dba.dto.out.AllDeviceDTO;
import cz.tul.dba.dto.out.OnlineDeviceDTO;

import java.util.List;

public interface DeviceService {

    /**
     * Method returns list of free devices for selection on client side.
     *
     * @return free devices
     */
    List<DeviceEntity> getAllFreeDevices();

    /**
     * Method sets IOT unit on machine
     *
     * @param deviceSerialNumber
     * @param machineVin
     * @return True if everything is OK
     */
    boolean setDeviceOnMachine(String deviceSerialNumber, String machineVin);

    /**
     * Save new machine state
     *
     * @param machineState
     * @return True if everything is OK
     */
    boolean saveMachineState(MachineState machineState);

    /**
     * Method returns device configuration entity by serial number
     *
     * @param serialNumber
     * @return device configuration
     */
    DeviceConfigurationEntity getDeviceConfiguration(String serialNumber);

    /**
     * Can be used for creating new device configuration
     *
     * @param serialNumber
     * @param deviceConfiguration
     * @return True if everything is OK
     */
    boolean createNewDeviceConfiguration(String serialNumber, DeviceConfiguration deviceConfiguration);


    /**
     * Creates new instance of device
     *
     * @param device
     * @return
     */
    boolean createDevice(Device device);

    /**
     * Transfer device to delete state
     *
     * @return
     */
    boolean deleteDevice(String serialNumber);

    /**
     * Updates persistent entity
     *
     * @param serialNumber
     * @param device
     * @return
     */
    boolean updateDevice(String serialNumber, Device device);


    /**
     * Returns online devices
     *
     * @return
     */
    List<OnlineDeviceDTO> getOnlineDevices();

    /**
     * Returns all free devices for view on the client side
     *
     * @return
     */
    AllDeviceDTO getAllDevices();
}
