/* 
 * DBA 2020
 *
 * semestral work
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace IO.Swagger.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IMachinecontrollerApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// createMachine
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="createMachineDTO">createMachineDTO</param>
        /// <returns>CreateMachineResponse</returns>
        CreateMachineResponse CreateMachineUsingPOST (CreateMachineDTO createMachineDTO);

        /// <summary>
        /// createMachine
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="createMachineDTO">createMachineDTO</param>
        /// <returns>ApiResponse of CreateMachineResponse</returns>
        ApiResponse<CreateMachineResponse> CreateMachineUsingPOSTWithHttpInfo (CreateMachineDTO createMachineDTO);
        /// <summary>
        /// deleteMachine
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deleteMachineDTO">deleteMachineDTO</param>
        /// <returns>DeteleMachineResponse</returns>
        DeteleMachineResponse DeleteMachineUsingPOST (DeleteMachineDTO deleteMachineDTO);

        /// <summary>
        /// deleteMachine
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deleteMachineDTO">deleteMachineDTO</param>
        /// <returns>ApiResponse of DeteleMachineResponse</returns>
        ApiResponse<DeteleMachineResponse> DeleteMachineUsingPOSTWithHttpInfo (DeleteMachineDTO deleteMachineDTO);
        /// <summary>
        /// updateMachine
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="updateMachineDTO">updateMachineDTO</param>
        /// <param name="vinCode">vin-code</param>
        /// <returns>UpdateMachineResponse</returns>
        UpdateMachineResponse UpdateMachineUsingPOST (UpdateMachineDTO updateMachineDTO, string vinCode);

        /// <summary>
        /// updateMachine
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="updateMachineDTO">updateMachineDTO</param>
        /// <param name="vinCode">vin-code</param>
        /// <returns>ApiResponse of UpdateMachineResponse</returns>
        ApiResponse<UpdateMachineResponse> UpdateMachineUsingPOSTWithHttpInfo (UpdateMachineDTO updateMachineDTO, string vinCode);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// createMachine
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="createMachineDTO">createMachineDTO</param>
        /// <returns>Task of CreateMachineResponse</returns>
        System.Threading.Tasks.Task<CreateMachineResponse> CreateMachineUsingPOSTAsync (CreateMachineDTO createMachineDTO);

        /// <summary>
        /// createMachine
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="createMachineDTO">createMachineDTO</param>
        /// <returns>Task of ApiResponse (CreateMachineResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<CreateMachineResponse>> CreateMachineUsingPOSTAsyncWithHttpInfo (CreateMachineDTO createMachineDTO);
        /// <summary>
        /// deleteMachine
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deleteMachineDTO">deleteMachineDTO</param>
        /// <returns>Task of DeteleMachineResponse</returns>
        System.Threading.Tasks.Task<DeteleMachineResponse> DeleteMachineUsingPOSTAsync (DeleteMachineDTO deleteMachineDTO);

        /// <summary>
        /// deleteMachine
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deleteMachineDTO">deleteMachineDTO</param>
        /// <returns>Task of ApiResponse (DeteleMachineResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<DeteleMachineResponse>> DeleteMachineUsingPOSTAsyncWithHttpInfo (DeleteMachineDTO deleteMachineDTO);
        /// <summary>
        /// updateMachine
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="updateMachineDTO">updateMachineDTO</param>
        /// <param name="vinCode">vin-code</param>
        /// <returns>Task of UpdateMachineResponse</returns>
        System.Threading.Tasks.Task<UpdateMachineResponse> UpdateMachineUsingPOSTAsync (UpdateMachineDTO updateMachineDTO, string vinCode);

        /// <summary>
        /// updateMachine
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="updateMachineDTO">updateMachineDTO</param>
        /// <param name="vinCode">vin-code</param>
        /// <returns>Task of ApiResponse (UpdateMachineResponse)</returns>
        System.Threading.Tasks.Task<ApiResponse<UpdateMachineResponse>> UpdateMachineUsingPOSTAsyncWithHttpInfo (UpdateMachineDTO updateMachineDTO, string vinCode);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class MachinecontrollerApi : IMachinecontrollerApi
    {
        private IO.Swagger.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="MachinecontrollerApi"/> class.
        /// </summary>
        /// <returns></returns>
        public MachinecontrollerApi(String basePath)
        {
            this.Configuration = new Configuration(new ApiClient(basePath));

            ExceptionFactory = IO.Swagger.Client.Configuration.DefaultExceptionFactory;

            // ensure API client has configuration ready
            if (Configuration.ApiClient.Configuration == null)
            {
                this.Configuration.ApiClient.Configuration = this.Configuration;
            }
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="MachinecontrollerApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public MachinecontrollerApi(Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = IO.Swagger.Client.Configuration.DefaultExceptionFactory;

            // ensure API client has configuration ready
            if (Configuration.ApiClient.Configuration == null)
            {
                this.Configuration.ApiClient.Configuration = this.Configuration;
            }
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public IO.Swagger.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public Dictionary<String, String> DefaultHeader()
        {
            return this.Configuration.DefaultHeader;
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// createMachine 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="createMachineDTO">createMachineDTO</param>
        /// <returns>CreateMachineResponse</returns>
        public CreateMachineResponse CreateMachineUsingPOST (CreateMachineDTO createMachineDTO)
        {
             ApiResponse<CreateMachineResponse> localVarResponse = CreateMachineUsingPOSTWithHttpInfo(createMachineDTO);
             return localVarResponse.Data;
        }

        /// <summary>
        /// createMachine 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="createMachineDTO">createMachineDTO</param>
        /// <returns>ApiResponse of CreateMachineResponse</returns>
        public ApiResponse< CreateMachineResponse > CreateMachineUsingPOSTWithHttpInfo (CreateMachineDTO createMachineDTO)
        {
            // verify the required parameter 'createMachineDTO' is set
            if (createMachineDTO == null)
                throw new ApiException(400, "Missing required parameter 'createMachineDTO' when calling MachinecontrollerApi->CreateMachineUsingPOST");

            var localVarPath = "/api/v1/machine/create";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (createMachineDTO != null && createMachineDTO.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(createMachineDTO); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createMachineDTO; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateMachineUsingPOST", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<CreateMachineResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (CreateMachineResponse) Configuration.ApiClient.Deserialize(localVarResponse, typeof(CreateMachineResponse)));
            
        }

        /// <summary>
        /// createMachine 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="createMachineDTO">createMachineDTO</param>
        /// <returns>Task of CreateMachineResponse</returns>
        public async System.Threading.Tasks.Task<CreateMachineResponse> CreateMachineUsingPOSTAsync (CreateMachineDTO createMachineDTO)
        {
             ApiResponse<CreateMachineResponse> localVarResponse = await CreateMachineUsingPOSTAsyncWithHttpInfo(createMachineDTO);
             return localVarResponse.Data;

        }

        /// <summary>
        /// createMachine 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="createMachineDTO">createMachineDTO</param>
        /// <returns>Task of ApiResponse (CreateMachineResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<CreateMachineResponse>> CreateMachineUsingPOSTAsyncWithHttpInfo (CreateMachineDTO createMachineDTO)
        {
            // verify the required parameter 'createMachineDTO' is set
            if (createMachineDTO == null)
                throw new ApiException(400, "Missing required parameter 'createMachineDTO' when calling MachinecontrollerApi->CreateMachineUsingPOST");

            var localVarPath = "/api/v1/machine/create";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (createMachineDTO != null && createMachineDTO.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(createMachineDTO); // http body (model) parameter
            }
            else
            {
                localVarPostBody = createMachineDTO; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateMachineUsingPOST", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<CreateMachineResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (CreateMachineResponse) Configuration.ApiClient.Deserialize(localVarResponse, typeof(CreateMachineResponse)));
            
        }

        /// <summary>
        /// deleteMachine 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deleteMachineDTO">deleteMachineDTO</param>
        /// <returns>DeteleMachineResponse</returns>
        public DeteleMachineResponse DeleteMachineUsingPOST (DeleteMachineDTO deleteMachineDTO)
        {
             ApiResponse<DeteleMachineResponse> localVarResponse = DeleteMachineUsingPOSTWithHttpInfo(deleteMachineDTO);
             return localVarResponse.Data;
        }

        /// <summary>
        /// deleteMachine 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deleteMachineDTO">deleteMachineDTO</param>
        /// <returns>ApiResponse of DeteleMachineResponse</returns>
        public ApiResponse< DeteleMachineResponse > DeleteMachineUsingPOSTWithHttpInfo (DeleteMachineDTO deleteMachineDTO)
        {
            // verify the required parameter 'deleteMachineDTO' is set
            if (deleteMachineDTO == null)
                throw new ApiException(400, "Missing required parameter 'deleteMachineDTO' when calling MachinecontrollerApi->DeleteMachineUsingPOST");

            var localVarPath = "/api/v1/machine/delete";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (deleteMachineDTO != null && deleteMachineDTO.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(deleteMachineDTO); // http body (model) parameter
            }
            else
            {
                localVarPostBody = deleteMachineDTO; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteMachineUsingPOST", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DeteleMachineResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (DeteleMachineResponse) Configuration.ApiClient.Deserialize(localVarResponse, typeof(DeteleMachineResponse)));
            
        }

        /// <summary>
        /// deleteMachine 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deleteMachineDTO">deleteMachineDTO</param>
        /// <returns>Task of DeteleMachineResponse</returns>
        public async System.Threading.Tasks.Task<DeteleMachineResponse> DeleteMachineUsingPOSTAsync (DeleteMachineDTO deleteMachineDTO)
        {
             ApiResponse<DeteleMachineResponse> localVarResponse = await DeleteMachineUsingPOSTAsyncWithHttpInfo(deleteMachineDTO);
             return localVarResponse.Data;

        }

        /// <summary>
        /// deleteMachine 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="deleteMachineDTO">deleteMachineDTO</param>
        /// <returns>Task of ApiResponse (DeteleMachineResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<DeteleMachineResponse>> DeleteMachineUsingPOSTAsyncWithHttpInfo (DeleteMachineDTO deleteMachineDTO)
        {
            // verify the required parameter 'deleteMachineDTO' is set
            if (deleteMachineDTO == null)
                throw new ApiException(400, "Missing required parameter 'deleteMachineDTO' when calling MachinecontrollerApi->DeleteMachineUsingPOST");

            var localVarPath = "/api/v1/machine/delete";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (deleteMachineDTO != null && deleteMachineDTO.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(deleteMachineDTO); // http body (model) parameter
            }
            else
            {
                localVarPostBody = deleteMachineDTO; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteMachineUsingPOST", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<DeteleMachineResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (DeteleMachineResponse) Configuration.ApiClient.Deserialize(localVarResponse, typeof(DeteleMachineResponse)));
            
        }

        /// <summary>
        /// updateMachine 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="updateMachineDTO">updateMachineDTO</param>
        /// <param name="vinCode">vin-code</param>
        /// <returns>UpdateMachineResponse</returns>
        public UpdateMachineResponse UpdateMachineUsingPOST (UpdateMachineDTO updateMachineDTO, string vinCode)
        {
             ApiResponse<UpdateMachineResponse> localVarResponse = UpdateMachineUsingPOSTWithHttpInfo(updateMachineDTO, vinCode);
             return localVarResponse.Data;
        }

        /// <summary>
        /// updateMachine 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="updateMachineDTO">updateMachineDTO</param>
        /// <param name="vinCode">vin-code</param>
        /// <returns>ApiResponse of UpdateMachineResponse</returns>
        public ApiResponse< UpdateMachineResponse > UpdateMachineUsingPOSTWithHttpInfo (UpdateMachineDTO updateMachineDTO, string vinCode)
        {
            // verify the required parameter 'updateMachineDTO' is set
            if (updateMachineDTO == null)
                throw new ApiException(400, "Missing required parameter 'updateMachineDTO' when calling MachinecontrollerApi->UpdateMachineUsingPOST");
            // verify the required parameter 'vinCode' is set
            if (vinCode == null)
                throw new ApiException(400, "Missing required parameter 'vinCode' when calling MachinecontrollerApi->UpdateMachineUsingPOST");

            var localVarPath = "/api/v1/machine/update/{vin-code}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (vinCode != null) localVarPathParams.Add("vin-code", Configuration.ApiClient.ParameterToString(vinCode)); // path parameter
            if (updateMachineDTO != null && updateMachineDTO.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(updateMachineDTO); // http body (model) parameter
            }
            else
            {
                localVarPostBody = updateMachineDTO; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("UpdateMachineUsingPOST", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UpdateMachineResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (UpdateMachineResponse) Configuration.ApiClient.Deserialize(localVarResponse, typeof(UpdateMachineResponse)));
            
        }

        /// <summary>
        /// updateMachine 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="updateMachineDTO">updateMachineDTO</param>
        /// <param name="vinCode">vin-code</param>
        /// <returns>Task of UpdateMachineResponse</returns>
        public async System.Threading.Tasks.Task<UpdateMachineResponse> UpdateMachineUsingPOSTAsync (UpdateMachineDTO updateMachineDTO, string vinCode)
        {
             ApiResponse<UpdateMachineResponse> localVarResponse = await UpdateMachineUsingPOSTAsyncWithHttpInfo(updateMachineDTO, vinCode);
             return localVarResponse.Data;

        }

        /// <summary>
        /// updateMachine 
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="updateMachineDTO">updateMachineDTO</param>
        /// <param name="vinCode">vin-code</param>
        /// <returns>Task of ApiResponse (UpdateMachineResponse)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<UpdateMachineResponse>> UpdateMachineUsingPOSTAsyncWithHttpInfo (UpdateMachineDTO updateMachineDTO, string vinCode)
        {
            // verify the required parameter 'updateMachineDTO' is set
            if (updateMachineDTO == null)
                throw new ApiException(400, "Missing required parameter 'updateMachineDTO' when calling MachinecontrollerApi->UpdateMachineUsingPOST");
            // verify the required parameter 'vinCode' is set
            if (vinCode == null)
                throw new ApiException(400, "Missing required parameter 'vinCode' when calling MachinecontrollerApi->UpdateMachineUsingPOST");

            var localVarPath = "/api/v1/machine/update/{vin-code}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (vinCode != null) localVarPathParams.Add("vin-code", Configuration.ApiClient.ParameterToString(vinCode)); // path parameter
            if (updateMachineDTO != null && updateMachineDTO.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(updateMachineDTO); // http body (model) parameter
            }
            else
            {
                localVarPostBody = updateMachineDTO; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("UpdateMachineUsingPOST", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<UpdateMachineResponse>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (UpdateMachineResponse) Configuration.ApiClient.Deserialize(localVarResponse, typeof(UpdateMachineResponse)));
            
        }

    }
}
