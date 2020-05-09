/**
 * DBA 2020
 * semestral work
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.CreateDeviceResponse;
import io.swagger.client.model.CreateDeviceDTO;
import io.swagger.client.model.DeleteDeviceResponse;
import io.swagger.client.model.AllFreeDeviceDTO;
import io.swagger.client.model.DeviceConfigurationDTO;
import io.swagger.client.model.RecordMachineStateDTO;
import io.swagger.client.model.RecordNewStateResponse;
import io.swagger.client.model.DeviceConfigurationResponse;
import io.swagger.client.model.NewDeviceConfigurationDTO;
import io.swagger.client.model.TakeDeviceDTO;
import io.swagger.client.model.TakeDeviceResponse;
import io.swagger.client.model.UpdateDeviceResponse;
import io.swagger.client.model.UpdateDeviceDTO;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IotdevicecontrollerApi
 */
public class IotdevicecontrollerApiTest {

    private final IotdevicecontrollerApi api = new IotdevicecontrollerApi();

    
    /**
     * createDevice
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDeviceUsingPOSTTest() throws ApiException {
        CreateDeviceDTO createDeviceDTO = null;
        // CreateDeviceResponse response = api.createDeviceUsingPOST(createDeviceDTO);

        // TODO: test validations
    }
    
    /**
     * deleteDevice
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDeviceUsingPOSTTest() throws ApiException {
        String serialNumber = null;
        // DeleteDeviceResponse response = api.deleteDeviceUsingPOST(serialNumber);

        // TODO: test validations
    }
    
    /**
     * getAllFreeDevice
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllFreeDeviceUsingPOSTTest() throws ApiException {
        // AllFreeDeviceDTO response = api.getAllFreeDeviceUsingPOST();

        // TODO: test validations
    }
    
    /**
     * getDeviceConfiguration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeviceConfigurationUsingPOSTTest() throws ApiException {
        String serialNumber = null;
        // DeviceConfigurationDTO response = api.getDeviceConfigurationUsingPOST(serialNumber);

        // TODO: test validations
    }
    
    /**
     * recordNewState
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void recordNewStateUsingPOSTTest() throws ApiException {
        RecordMachineStateDTO recordMachineStateDTO = null;
        // RecordNewStateResponse response = api.recordNewStateUsingPOST(recordMachineStateDTO);

        // TODO: test validations
    }
    
    /**
     * setDeviceConfiguration
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setDeviceConfigurationUsingPOSTTest() throws ApiException {
        NewDeviceConfigurationDTO newDeviceConfigurationDTO = null;
        String serialNumber = null;
        // DeviceConfigurationResponse response = api.setDeviceConfigurationUsingPOST(newDeviceConfigurationDTO, serialNumber);

        // TODO: test validations
    }
    
    /**
     * takeDevice
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void takeDeviceUsingPOSTTest() throws ApiException {
        TakeDeviceDTO takeDeviceDTO = null;
        // TakeDeviceResponse response = api.takeDeviceUsingPOST(takeDeviceDTO);

        // TODO: test validations
    }
    
    /**
     * updateDevice
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDeviceUsingPOSTTest() throws ApiException {
        String serialNumber = null;
        UpdateDeviceDTO updateDeviceDTO = null;
        // UpdateDeviceResponse response = api.updateDeviceUsingPOST(serialNumber, updateDeviceDTO);

        // TODO: test validations
    }
    
}
