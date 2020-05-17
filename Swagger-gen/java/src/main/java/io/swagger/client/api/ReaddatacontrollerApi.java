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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.swagger.client.model.AllMachineDTO;
import io.swagger.client.model.MachineDataRecordsDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReaddatacontrollerApi {
    private ApiClient apiClient;

    public ReaddatacontrollerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReaddatacontrollerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getAllMachinesUsingPOST */
    private com.squareup.okhttp.Call getAllMachinesUsingPOSTCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/api/v1/data/getAllMachines".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*_/_*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * getAllMachines
     * 
     * @return AllMachineDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AllMachineDTO getAllMachinesUsingPOST() throws ApiException {
        ApiResponse<AllMachineDTO> resp = getAllMachinesUsingPOSTWithHttpInfo();
        return resp.getData();
    }

    /**
     * getAllMachines
     * 
     * @return ApiResponse&lt;AllMachineDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AllMachineDTO> getAllMachinesUsingPOSTWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getAllMachinesUsingPOSTCall(null, null);
        Type localVarReturnType = new TypeToken<AllMachineDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getAllMachines (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllMachinesUsingPOSTAsync(final ApiCallback<AllMachineDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAllMachinesUsingPOSTCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AllMachineDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getRecordsForMachineUsingPOST */
    private com.squareup.okhttp.Call getRecordsForMachineUsingPOSTCall(List<String> columnValueList, Integer pages, String vin, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/api/v1/data/machine/{vin}".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (columnValueList != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "columnValueList", columnValueList));
        if (pages != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pages", pages));
        if (vin != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "vin", vin));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*_/_*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * getRecordsForMachine
     * 
     * @param columnValueList  (optional)
     * @param pages  (optional)
     * @param vin  (optional)
     * @return MachineDataRecordsDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MachineDataRecordsDTO getRecordsForMachineUsingPOST(List<String> columnValueList, Integer pages, String vin) throws ApiException {
        ApiResponse<MachineDataRecordsDTO> resp = getRecordsForMachineUsingPOSTWithHttpInfo(columnValueList, pages, vin);
        return resp.getData();
    }

    /**
     * getRecordsForMachine
     * 
     * @param columnValueList  (optional)
     * @param pages  (optional)
     * @param vin  (optional)
     * @return ApiResponse&lt;MachineDataRecordsDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MachineDataRecordsDTO> getRecordsForMachineUsingPOSTWithHttpInfo(List<String> columnValueList, Integer pages, String vin) throws ApiException {
        com.squareup.okhttp.Call call = getRecordsForMachineUsingPOSTCall(columnValueList, pages, vin, null, null);
        Type localVarReturnType = new TypeToken<MachineDataRecordsDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getRecordsForMachine (asynchronously)
     * 
     * @param columnValueList  (optional)
     * @param pages  (optional)
     * @param vin  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRecordsForMachineUsingPOSTAsync(List<String> columnValueList, Integer pages, String vin, final ApiCallback<MachineDataRecordsDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRecordsForMachineUsingPOSTCall(columnValueList, pages, vin, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MachineDataRecordsDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
