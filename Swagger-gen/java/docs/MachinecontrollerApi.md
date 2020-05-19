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
> UpdateMachineResponse updateMachineUsingPOST(updateMachineDTO, vinCode)

updateMachine

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MachinecontrollerApi;


MachinecontrollerApi apiInstance = new MachinecontrollerApi();
UpdateMachineDTO updateMachineDTO = new UpdateMachineDTO(); // UpdateMachineDTO | updateMachineDTO
String vinCode = "vinCode_example"; // String | vin-code
try {
    UpdateMachineResponse result = apiInstance.updateMachineUsingPOST(updateMachineDTO, vinCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachinecontrollerApi#updateMachineUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateMachineDTO** | [**UpdateMachineDTO**](UpdateMachineDTO.md)| updateMachineDTO |
 **vinCode** | **String**| vin-code |

### Return type

[**UpdateMachineResponse**](UpdateMachineResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

