# IO.Swagger.Api.MachinecontrollerApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateMachineUsingPOST**](MachinecontrollerApi.md#createmachineusingpost) | **POST** /api/v1/machine/create | createMachine
[**DeleteMachineUsingPOST**](MachinecontrollerApi.md#deletemachineusingpost) | **POST** /api/v1/machine/delete | deleteMachine
[**UpdateMachineUsingPOST**](MachinecontrollerApi.md#updatemachineusingpost) | **POST** /api/v1/machine/update/{vin-code} | updateMachine


<a name="createmachineusingpost"></a>
# **CreateMachineUsingPOST**
> CreateMachineResponse CreateMachineUsingPOST (CreateMachineDTO createMachineDTO)

createMachine

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class CreateMachineUsingPOSTExample
    {
        public void main()
        {
            
            var apiInstance = new MachinecontrollerApi();
            var createMachineDTO = new CreateMachineDTO(); // CreateMachineDTO | createMachineDTO

            try
            {
                // createMachine
                CreateMachineResponse result = apiInstance.CreateMachineUsingPOST(createMachineDTO);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MachinecontrollerApi.CreateMachineUsingPOST: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createMachineDTO** | [**CreateMachineDTO**](CreateMachineDTO.md)| createMachineDTO | 

### Return type

[**CreateMachineResponse**](CreateMachineResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletemachineusingpost"></a>
# **DeleteMachineUsingPOST**
> DeteleMachineResponse DeleteMachineUsingPOST (DeleteMachineDTO deleteMachineDTO)

deleteMachine

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteMachineUsingPOSTExample
    {
        public void main()
        {
            
            var apiInstance = new MachinecontrollerApi();
            var deleteMachineDTO = new DeleteMachineDTO(); // DeleteMachineDTO | deleteMachineDTO

            try
            {
                // deleteMachine
                DeteleMachineResponse result = apiInstance.DeleteMachineUsingPOST(deleteMachineDTO);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MachinecontrollerApi.DeleteMachineUsingPOST: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteMachineDTO** | [**DeleteMachineDTO**](DeleteMachineDTO.md)| deleteMachineDTO | 

### Return type

[**DeteleMachineResponse**](DeteleMachineResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatemachineusingpost"></a>
# **UpdateMachineUsingPOST**
> UpdateMachineResponse UpdateMachineUsingPOST (UpdateMachineDTO updateMachineDTO, string vinCode)

updateMachine

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class UpdateMachineUsingPOSTExample
    {
        public void main()
        {
            
            var apiInstance = new MachinecontrollerApi();
            var updateMachineDTO = new UpdateMachineDTO(); // UpdateMachineDTO | updateMachineDTO
            var vinCode = vinCode_example;  // string | vin-code

            try
            {
                // updateMachine
                UpdateMachineResponse result = apiInstance.UpdateMachineUsingPOST(updateMachineDTO, vinCode);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MachinecontrollerApi.UpdateMachineUsingPOST: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateMachineDTO** | [**UpdateMachineDTO**](UpdateMachineDTO.md)| updateMachineDTO | 
 **vinCode** | **string**| vin-code | 

### Return type

[**UpdateMachineResponse**](UpdateMachineResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

