# IO.Swagger.Api.IotdevicecontrollerApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateDeviceUsingPOST**](IotdevicecontrollerApi.md#createdeviceusingpost) | **POST** /api/v1/device/create | createDevice
[**DeleteDeviceUsingPOST**](IotdevicecontrollerApi.md#deletedeviceusingpost) | **POST** /api/v1/device/delete/{serialNumber} | deleteDevice
[**GetAllFreeDeviceUsingPOST**](IotdevicecontrollerApi.md#getallfreedeviceusingpost) | **POST** /api/v1/device/allFree | getAllFreeDevice
[**GetDeviceConfigurationUsingPOST**](IotdevicecontrollerApi.md#getdeviceconfigurationusingpost) | **POST** /api/v1/device/configuration/{serialNumber} | getDeviceConfiguration
[**RecordNewStateUsingPOST**](IotdevicecontrollerApi.md#recordnewstateusingpost) | **POST** /api/v1/device/record | recordNewState
[**SetDeviceConfigurationUsingPOST**](IotdevicecontrollerApi.md#setdeviceconfigurationusingpost) | **POST** /api/v1/device/configuration/set/{serialNumber} | setDeviceConfiguration
[**TakeDeviceUsingPOST**](IotdevicecontrollerApi.md#takedeviceusingpost) | **POST** /api/v1/device/setTaken | takeDevice
[**UpdateDeviceUsingPOST**](IotdevicecontrollerApi.md#updatedeviceusingpost) | **POST** /api/v1/device/update/{serialNumber} | updateDevice


<a name="createdeviceusingpost"></a>
# **CreateDeviceUsingPOST**
> CreateDeviceResponse CreateDeviceUsingPOST (CreateDeviceDTO createDeviceDTO)

createDevice

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CreateDeviceUsingPOSTExample
    {
        public void main()
        {
            
            var apiInstance = new IotdevicecontrollerApi();
            var createDeviceDTO = new CreateDeviceDTO(); // CreateDeviceDTO | createDeviceDTO

            try
            {
                // createDevice
                CreateDeviceResponse result = apiInstance.CreateDeviceUsingPOST(createDeviceDTO);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling IotdevicecontrollerApi.CreateDeviceUsingPOST: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createDeviceDTO** | [**CreateDeviceDTO**](CreateDeviceDTO.md)| createDeviceDTO | 

### Return type

[**CreateDeviceResponse**](CreateDeviceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletedeviceusingpost"></a>
# **DeleteDeviceUsingPOST**
> DeleteDeviceResponse DeleteDeviceUsingPOST (string serialNumber)

deleteDevice

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteDeviceUsingPOSTExample
    {
        public void main()
        {
            
            var apiInstance = new IotdevicecontrollerApi();
            var serialNumber = serialNumber_example;  // string | serialNumber

            try
            {
                // deleteDevice
                DeleteDeviceResponse result = apiInstance.DeleteDeviceUsingPOST(serialNumber);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling IotdevicecontrollerApi.DeleteDeviceUsingPOST: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serialNumber** | **string**| serialNumber | 

### Return type

[**DeleteDeviceResponse**](DeleteDeviceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getallfreedeviceusingpost"></a>
# **GetAllFreeDeviceUsingPOST**
> AllFreeDeviceDTO GetAllFreeDeviceUsingPOST ()

getAllFreeDevice

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetAllFreeDeviceUsingPOSTExample
    {
        public void main()
        {
            
            var apiInstance = new IotdevicecontrollerApi();

            try
            {
                // getAllFreeDevice
                AllFreeDeviceDTO result = apiInstance.GetAllFreeDeviceUsingPOST();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling IotdevicecontrollerApi.GetAllFreeDeviceUsingPOST: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AllFreeDeviceDTO**](AllFreeDeviceDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdeviceconfigurationusingpost"></a>
# **GetDeviceConfigurationUsingPOST**
> DeviceConfigurationDTO GetDeviceConfigurationUsingPOST (string serialNumber)

getDeviceConfiguration

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetDeviceConfigurationUsingPOSTExample
    {
        public void main()
        {
            
            var apiInstance = new IotdevicecontrollerApi();
            var serialNumber = serialNumber_example;  // string | serialNumber

            try
            {
                // getDeviceConfiguration
                DeviceConfigurationDTO result = apiInstance.GetDeviceConfigurationUsingPOST(serialNumber);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling IotdevicecontrollerApi.GetDeviceConfigurationUsingPOST: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serialNumber** | **string**| serialNumber | 

### Return type

[**DeviceConfigurationDTO**](DeviceConfigurationDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="recordnewstateusingpost"></a>
# **RecordNewStateUsingPOST**
> RecordNewStateResponse RecordNewStateUsingPOST (RecordMachineStateDTO recordMachineStateDTO)

recordNewState

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class RecordNewStateUsingPOSTExample
    {
        public void main()
        {
            
            var apiInstance = new IotdevicecontrollerApi();
            var recordMachineStateDTO = new RecordMachineStateDTO(); // RecordMachineStateDTO | recordMachineStateDTO

            try
            {
                // recordNewState
                RecordNewStateResponse result = apiInstance.RecordNewStateUsingPOST(recordMachineStateDTO);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling IotdevicecontrollerApi.RecordNewStateUsingPOST: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordMachineStateDTO** | [**RecordMachineStateDTO**](RecordMachineStateDTO.md)| recordMachineStateDTO | 

### Return type

[**RecordNewStateResponse**](RecordNewStateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="setdeviceconfigurationusingpost"></a>
# **SetDeviceConfigurationUsingPOST**
> DeviceConfigurationResponse SetDeviceConfigurationUsingPOST (NewDeviceConfigurationDTO newDeviceConfigurationDTO, string serialNumber)

setDeviceConfiguration

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SetDeviceConfigurationUsingPOSTExample
    {
        public void main()
        {
            
            var apiInstance = new IotdevicecontrollerApi();
            var newDeviceConfigurationDTO = new NewDeviceConfigurationDTO(); // NewDeviceConfigurationDTO | newDeviceConfigurationDTO
            var serialNumber = serialNumber_example;  // string | serialNumber

            try
            {
                // setDeviceConfiguration
                DeviceConfigurationResponse result = apiInstance.SetDeviceConfigurationUsingPOST(newDeviceConfigurationDTO, serialNumber);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling IotdevicecontrollerApi.SetDeviceConfigurationUsingPOST: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newDeviceConfigurationDTO** | [**NewDeviceConfigurationDTO**](NewDeviceConfigurationDTO.md)| newDeviceConfigurationDTO | 
 **serialNumber** | **string**| serialNumber | 

### Return type

[**DeviceConfigurationResponse**](DeviceConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="takedeviceusingpost"></a>
# **TakeDeviceUsingPOST**
> TakeDeviceResponse TakeDeviceUsingPOST (TakeDeviceDTO takeDeviceDTO)

takeDevice

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class TakeDeviceUsingPOSTExample
    {
        public void main()
        {
            
            var apiInstance = new IotdevicecontrollerApi();
            var takeDeviceDTO = new TakeDeviceDTO(); // TakeDeviceDTO | takeDeviceDTO

            try
            {
                // takeDevice
                TakeDeviceResponse result = apiInstance.TakeDeviceUsingPOST(takeDeviceDTO);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling IotdevicecontrollerApi.TakeDeviceUsingPOST: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **takeDeviceDTO** | [**TakeDeviceDTO**](TakeDeviceDTO.md)| takeDeviceDTO | 

### Return type

[**TakeDeviceResponse**](TakeDeviceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatedeviceusingpost"></a>
# **UpdateDeviceUsingPOST**
> UpdateDeviceResponse UpdateDeviceUsingPOST (string serialNumber, UpdateDeviceDTO updateDeviceDTO)

updateDevice

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UpdateDeviceUsingPOSTExample
    {
        public void main()
        {
            
            var apiInstance = new IotdevicecontrollerApi();
            var serialNumber = serialNumber_example;  // string | serialNumber
            var updateDeviceDTO = new UpdateDeviceDTO(); // UpdateDeviceDTO | updateDeviceDTO

            try
            {
                // updateDevice
                UpdateDeviceResponse result = apiInstance.UpdateDeviceUsingPOST(serialNumber, updateDeviceDTO);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling IotdevicecontrollerApi.UpdateDeviceUsingPOST: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serialNumber** | **string**| serialNumber | 
 **updateDeviceDTO** | [**UpdateDeviceDTO**](UpdateDeviceDTO.md)| updateDeviceDTO | 

### Return type

[**UpdateDeviceResponse**](UpdateDeviceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

