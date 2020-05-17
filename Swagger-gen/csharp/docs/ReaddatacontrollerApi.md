# IO.Swagger.Api.ReaddatacontrollerApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAllMachinesUsingPOST**](ReaddatacontrollerApi.md#getallmachinesusingpost) | **POST** /api/v1/data/getAllMachines | getAllMachines
[**GetRecordsForMachineUsingPOST**](ReaddatacontrollerApi.md#getrecordsformachineusingpost) | **POST** /api/v1/data/machine/{vin} | getRecordsForMachine


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
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getrecordsformachineusingpost"></a>
# **GetRecordsForMachineUsingPOST**
> MachineDataRecordsDTO GetRecordsForMachineUsingPOST (List<string> columnValueList = null, int? pages = null, string vin = null)

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
            var columnValueList = new List<string>(); // List<string> |  (optional) 
            var pages = 56;  // int? |  (optional) 
            var vin = vin_example;  // string |  (optional) 

            try
            {
                // getRecordsForMachine
                MachineDataRecordsDTO result = apiInstance.GetRecordsForMachineUsingPOST(columnValueList, pages, vin);
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
 **columnValueList** | [**List<string>**](string.md)|  | [optional] 
 **pages** | **int?**|  | [optional] 
 **vin** | **string**|  | [optional] 

### Return type

[**MachineDataRecordsDTO**](MachineDataRecordsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

