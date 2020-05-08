package cz.tul.dba.client;

import io.swagger.client.ApiException;
import io.swagger.client.api.DeviceEntityEntityApi;
import io.swagger.client.model.DeviceEntity;

public class Application {
    public static void main(String[] args) throws ApiException {
        DeviceEntityEntityApi entityEntityApi = new DeviceEntityEntityApi();
        DeviceEntity deviceEntity = new DeviceEntity();
        deviceEntity.setSerialNumber("asdfasdf");
        entityEntityApi.saveDeviceEntityUsingPOST(deviceEntity);
    }
}
