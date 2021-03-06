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

import io.swagger.client.model.CreateMachineResponse;
import io.swagger.client.model.CreateMachineDTO;
import io.swagger.client.model.DeteleMachineResponse;
import io.swagger.client.model.DeleteMachineDTO;
import io.swagger.client.model.UpdateMachineResponse;
import io.swagger.client.model.UpdateMachineDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MachinecontrollerApi {
    private ApiClient apiClient;

    public MachinecontrollerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MachinecontrollerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createMachineUsingPOST */
    private com.squareup.okhttp.Call createMachineUsingPOSTCall(CreateMachineDTO createMachineDTO, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createMachineDTO;
        
        // verify the required parameter 'createMachineDTO' is set
        if (createMachineDTO == null) {
            throw new ApiException("Missing the required parameter 'createMachineDTO' when calling createMachineUsingPOST(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/api/v1/machine/create".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
     * createMachine
     * 
     * @param createMachineDTO createMachineDTO (required)
     * @return CreateMachineResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateMachineResponse createMachineUsingPOST(CreateMachineDTO createMachineDTO) throws ApiException {
        ApiResponse<CreateMachineResponse> resp = createMachineUsingPOSTWithHttpInfo(createMachineDTO);
        return resp.getData();
    }

    /**
     * createMachine
     * 
     * @param createMachineDTO createMachineDTO (required)
     * @return ApiResponse&lt;CreateMachineResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateMachineResponse> createMachineUsingPOSTWithHttpInfo(CreateMachineDTO createMachineDTO) throws ApiException {
        com.squareup.okhttp.Call call = createMachineUsingPOSTCall(createMachineDTO, null, null);
        Type localVarReturnType = new TypeToken<CreateMachineResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * createMachine (asynchronously)
     * 
     * @param createMachineDTO createMachineDTO (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createMachineUsingPOSTAsync(CreateMachineDTO createMachineDTO, final ApiCallback<CreateMachineResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createMachineUsingPOSTCall(createMachineDTO, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateMachineResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteMachineUsingPOST */
    private com.squareup.okhttp.Call deleteMachineUsingPOSTCall(DeleteMachineDTO deleteMachineDTO, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = deleteMachineDTO;
        
        // verify the required parameter 'deleteMachineDTO' is set
        if (deleteMachineDTO == null) {
            throw new ApiException("Missing the required parameter 'deleteMachineDTO' when calling deleteMachineUsingPOST(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/api/v1/machine/delete".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
     * deleteMachine
     * 
     * @param deleteMachineDTO deleteMachineDTO (required)
     * @return DeteleMachineResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeteleMachineResponse deleteMachineUsingPOST(DeleteMachineDTO deleteMachineDTO) throws ApiException {
        ApiResponse<DeteleMachineResponse> resp = deleteMachineUsingPOSTWithHttpInfo(deleteMachineDTO);
        return resp.getData();
    }

    /**
     * deleteMachine
     * 
     * @param deleteMachineDTO deleteMachineDTO (required)
     * @return ApiResponse&lt;DeteleMachineResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeteleMachineResponse> deleteMachineUsingPOSTWithHttpInfo(DeleteMachineDTO deleteMachineDTO) throws ApiException {
        com.squareup.okhttp.Call call = deleteMachineUsingPOSTCall(deleteMachineDTO, null, null);
        Type localVarReturnType = new TypeToken<DeteleMachineResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * deleteMachine (asynchronously)
     * 
     * @param deleteMachineDTO deleteMachineDTO (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteMachineUsingPOSTAsync(DeleteMachineDTO deleteMachineDTO, final ApiCallback<DeteleMachineResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteMachineUsingPOSTCall(deleteMachineDTO, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeteleMachineResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateMachineUsingPOST */
    private com.squareup.okhttp.Call updateMachineUsingPOSTCall(UpdateMachineDTO updateMachineDTO, String vinCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = updateMachineDTO;
        
        // verify the required parameter 'updateMachineDTO' is set
        if (updateMachineDTO == null) {
            throw new ApiException("Missing the required parameter 'updateMachineDTO' when calling updateMachineUsingPOST(Async)");
        }
        
        // verify the required parameter 'vinCode' is set
        if (vinCode == null) {
            throw new ApiException("Missing the required parameter 'vinCode' when calling updateMachineUsingPOST(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/api/v1/machine/update/{vin-code}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "vin-code" + "\\}", apiClient.escapeString(vinCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
     * updateMachine
     * 
     * @param updateMachineDTO updateMachineDTO (required)
     * @param vinCode vin-code (required)
     * @return UpdateMachineResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpdateMachineResponse updateMachineUsingPOST(UpdateMachineDTO updateMachineDTO, String vinCode) throws ApiException {
        ApiResponse<UpdateMachineResponse> resp = updateMachineUsingPOSTWithHttpInfo(updateMachineDTO, vinCode);
        return resp.getData();
    }

    /**
     * updateMachine
     * 
     * @param updateMachineDTO updateMachineDTO (required)
     * @param vinCode vin-code (required)
     * @return ApiResponse&lt;UpdateMachineResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UpdateMachineResponse> updateMachineUsingPOSTWithHttpInfo(UpdateMachineDTO updateMachineDTO, String vinCode) throws ApiException {
        com.squareup.okhttp.Call call = updateMachineUsingPOSTCall(updateMachineDTO, vinCode, null, null);
        Type localVarReturnType = new TypeToken<UpdateMachineResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * updateMachine (asynchronously)
     * 
     * @param updateMachineDTO updateMachineDTO (required)
     * @param vinCode vin-code (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateMachineUsingPOSTAsync(UpdateMachineDTO updateMachineDTO, String vinCode, final ApiCallback<UpdateMachineResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateMachineUsingPOSTCall(updateMachineDTO, vinCode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UpdateMachineResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
