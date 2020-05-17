# MachinecontrollerApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMachineUsingPOST**](MachinecontrollerApi.md#createMachineUsingPOST) | **POST** /api/v1/machine/create | createMachine
[**deleteMachineUsingPOST**](MachinecontrollerApi.md#deleteMachineUsingPOST) | **POST** /api/v1/machine/delete | deleteMachine
[**updateMachineUsingPOST**](MachinecontrollerApi.md#updateMachineUsingPOST) | **POST** /api/v1/machine/update/{vin-code} | updateMachine


<a name="createMachineUsingPOST"></a>
# **createMachineUsingPOST**
> CreateMachineResponse createMachineUsingPOST(createMachineDTO)

createMachine

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MachinecontrollerApi;


MachinecontrollerApi apiInstance = new MachinecontrollerApi();
CreateMachineDTO createMachineDTO = new CreateMachineDTO(); // CreateMachineDTO | createMachineDTO
try {
    CreateMachineResponse result = apiInstance.createMachineUsingPOST(createMachineDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinecontrollerApi#createMachineUsingPOST");
    e.printStackTrace();
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

<a name="deleteMachineUsingPOST"></a>
# **deleteMachineUsingPOST**
> DeteleMachineResponse deleteMachineUsingPOST(deleteMachineDTO)

deleteMachine

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MachinecontrollerApi;


MachinecontrollerApi apiInstance = new MachinecontrollerApi();
DeleteMachineDTO deleteMachineDTO = new DeleteMachineDTO(); // DeleteMachineDTO | deleteMachineDTO
try {
    DeteleMachineResponse result = apiInstance.deleteMachineUsingPOST(deleteMachineDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinecontrollerApi#deleteMachineUsingPOST");
    e.printStackTrace();
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

<a name="updateMachineUsingPOST"></a>
# **updateMachineUsingPOST**
> UpdateMachineResponse updateMachineUsingPOST(vinCode, deviceDescription, deviceStateEntity, serialNumber)

updateMachine

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MachinecontrollerApi;


MachinecontrollerApi apiInstance = new MachinecontrollerApi();
String vinCode = "vinCode_example"; // String | vin-code
String deviceDescription = "deviceDescription_example"; // String | 
String deviceStateEntity = "deviceStateEntity_example"; // String | 
String serialNumber = "serialNumber_example"; // String | 
try {
    UpdateMachineResponse result = apiInstance.updateMachineUsingPOST(vinCode, deviceDescription, deviceStateEntity, serialNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinecontrollerApi#updateMachineUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vinCode** | **String**| vin-code |
 **deviceDescription** | **String**|  | [optional]
 **deviceStateEntity** | **String**|  | [optional] [enum: STOP, RUNNING, WAITING, DELETED, NEW]
 **serialNumber** | **String**|  | [optional]

### Return type

[**UpdateMachineResponse**](UpdateMachineResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

