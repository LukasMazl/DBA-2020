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
import io.swagger.client.model.CreateMachineResponse;
import io.swagger.client.model.CreateMachineDTO;
import io.swagger.client.model.DeteleMachineResponse;
import io.swagger.client.model.DeleteMachineDTO;
import io.swagger.client.model.UpdateMachineResponse;
import io.swagger.client.model.UpdateMachineDTO;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MachinecontrollerApi
 */
public class MachinecontrollerApiTest {

    private final MachinecontrollerApi api = new MachinecontrollerApi();

    
    /**
     * createMachine
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMachineUsingPOSTTest() throws ApiException {
        CreateMachineDTO createMachineDTO = null;
        // CreateMachineResponse response = api.createMachineUsingPOST(createMachineDTO);

        // TODO: test validations
    }
    
    /**
     * deleteMachine
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMachineUsingPOSTTest() throws ApiException {
        DeleteMachineDTO deleteMachineDTO = null;
        // DeteleMachineResponse response = api.deleteMachineUsingPOST(deleteMachineDTO);

        // TODO: test validations
    }
    
    /**
     * updateMachine
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMachineUsingPOSTTest() throws ApiException {
        UpdateMachineDTO updateMachineDTO = null;
        String vinCode = null;
        // UpdateMachineResponse response = api.updateMachineUsingPOST(updateMachineDTO, vinCode);

        // TODO: test validations
    }
    
}
