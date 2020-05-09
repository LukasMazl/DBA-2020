package cz.tul.dba.client;

import io.swagger.client.ApiException;
import io.swagger.client.api.IotdevicecontrollerApi;

public class Application {
    public static void main(String[] args) throws ApiException {
        IotdevicecontrollerApi iotdevicecontrollerApi = new IotdevicecontrollerApi();
          iotdevicecontrollerApi.getDeviceConfigurationUsingPOST("ASDASDF");
    }
}
