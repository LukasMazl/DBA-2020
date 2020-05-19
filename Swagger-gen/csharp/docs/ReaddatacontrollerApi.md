# IO.Swagger.Api.ReaddatacontrollerApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAllDeviceUsingPOST**](ReaddatacontrollerApi.md#getalldeviceusingpost) | **POST** /api/v1/data/getAllDevices | getAllDevice
[**GetAllMachinesUsingPOST**](ReaddatacontrollerApi.md#getallmachinesusingpost) | **POST** /api/v1/data/getAllMachines | getAllMachines
[**GetRecordsForMachineUsingPOST**](ReaddatacontrollerApi.md#getrecordsformachineusingpost) | **POST** /api/v1/data/machine | getRecordsForMachine


<a name="getalldeviceusingpost"></a>
# **GetAllDeviceUsingPOST**
> AllDeviceDTO GetAllDeviceUsingPOST ()

getAllDevice

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetAllDeviceUsingPOSTExample
    {
        public void main()
        {
            
            var apiInstance = new ReaddatacontrollerApi();

            try
            {
                // getAllDevice
                AllDeviceDTO result = apiInstance.GetAllDeviceUsingPOST();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ReaddatacontrollerApi.GetAllDeviceUsingPOST: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AllDeviceDTO**](AllDeviceDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getallmachinesusingpost"></a>
# **GetAllMachinesUsingPOST**
> AllMachineDTO GetAllMachinesUsingPOST ()

getAllMachines

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetAllMachinesUsingPOSTExample
    {
        public void main()
        {
            
            var apiInstance = new ReaddatacontrollerApi();

            try
            {
                // getAllMachines
                AllMachineDTO result = apiInstance.GetAllMachinesUsingPOST();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ReaddatacontrollerApi.GetAllMachinesUsingPOST: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AllMachineDTO**](AllMachineDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getrecordsformachineusingpost"></a>
# **GetRecordsForMachineUsingPOST**
> MachineDataRecordsDTO GetRecordsForMachineUsingPOST (GetRecordsForMachineDTO getRecordsForMachineDTO)

getRecordsForMachine

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetRecordsForMachineUsingPOSTExample
    {
        public void main()
        {
            
            var apiInstance = new ReaddatacontrollerApi();
            var getRecordsForMachineDTO = new GetRecordsForMachineDTO(); // GetRecordsForMachineDTO | getRecordsForMachineDTO

            try
            {
                // getRecordsForMachine
                MachineDataRecordsDTO result = apiInstance.GetRecordsForMachineUsingPOST(getRecordsForMachineDTO);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ReaddatacontrollerApi.GetRecordsForMachineUsingPOST: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getRecordsForMachineDTO** | [**GetRecordsForMachineDTO**](GetRecordsForMachineDTO.md)| getRecordsForMachineDTO | 

### Return type

[**MachineDataRecordsDTO**](MachineDataRecordsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

