# IotdevicecontrollerApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDeviceUsingPOST**](IotdevicecontrollerApi.md#createDeviceUsingPOST) | **POST** /api/v1/device/create | createDevice
[**deleteDeviceUsingPOST**](IotdevicecontrollerApi.md#deleteDeviceUsingPOST) | **POST** /api/v1/device/delete/{serialNumber} | deleteDevice
[**getAllFreeDeviceUsingPOST**](IotdevicecontrollerApi.md#getAllFreeDeviceUsingPOST) | **POST** /api/v1/device/allFree | getAllFreeDevice
[**getDeviceConfigurationUsingPOST**](IotdevicecontrollerApi.md#getDeviceConfigurationUsingPOST) | **POST** /api/v1/device/configuration/{serialNumber} | getDeviceConfiguration
[**recordNewStateUsingPOST**](IotdevicecontrollerApi.md#recordNewStateUsingPOST) | **POST** /api/v1/device/record | recordNewState
[**setDeviceConfigurationUsingPOST**](IotdevicecontrollerApi.md#setDeviceConfigurationUsingPOST) | **POST** /api/v1/device/configuration/set/{serialNumber} | setDeviceConfiguration
[**takeDeviceUsingPOST**](IotdevicecontrollerApi.md#takeDeviceUsingPOST) | **POST** /api/v1/device/setTaken | takeDevice
[**updateDeviceUsingPOST**](IotdevicecontrollerApi.md#updateDeviceUsingPOST) | **POST** /api/v1/device/update/{serialNumber} | updateDevice


<a name="createDeviceUsingPOST"></a>
# **createDeviceUsingPOST**
> CreateDeviceResponse createDeviceUsingPOST(createDeviceDTO)

createDevice

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IotdevicecontrollerApi;


IotdevicecontrollerApi apiInstance = new IotdevicecontrollerApi();
CreateDeviceDTO createDeviceDTO = new CreateDeviceDTO(); // CreateDeviceDTO | createDeviceDTO
try {
    CreateDeviceResponse result = apiInstance.createDeviceUsingPOST(createDeviceDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IotdevicecontrollerApi#createDeviceUsingPOST");
    e.printStackTrace();
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

<a name="deleteDeviceUsingPOST"></a>
# **deleteDeviceUsingPOST**
> DeleteDeviceResponse deleteDeviceUsingPOST(serialNumber)

deleteDevice

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IotdevicecontrollerApi;


IotdevicecontrollerApi apiInstance = new IotdevicecontrollerApi();
String serialNumber = "serialNumber_example"; // String | serialNumber
try {
    DeleteDeviceResponse result = apiInstance.deleteDeviceUsingPOST(serialNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IotdevicecontrollerApi#deleteDeviceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serialNumber** | **String**| serialNumber |

### Return type

[**DeleteDeviceResponse**](DeleteDeviceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllFreeDeviceUsingPOST"></a>
# **getAllFreeDeviceUsingPOST**
> AllFreeDeviceDTO getAllFreeDeviceUsingPOST()

getAllFreeDevice

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IotdevicecontrollerApi;


IotdevicecontrollerApi apiInstance = new IotdevicecontrollerApi();
try {
    AllFreeDeviceDTO result = apiInstance.getAllFreeDeviceUsingPOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IotdevicecontrollerApi#getAllFreeDeviceUsingPOST");
    e.printStackTrace();
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

<a name="getDeviceConfigurationUsingPOST"></a>
# **getDeviceConfigurationUsingPOST**
> DeviceConfigurationDTO getDeviceConfigurationUsingPOST(serialNumber)

getDeviceConfiguration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IotdevicecontrollerApi;


IotdevicecontrollerApi apiInstance = new IotdevicecontrollerApi();
String serialNumber = "serialNumber_example"; // String | serialNumber
try {
    DeviceConfigurationDTO result = apiInstance.getDeviceConfigurationUsingPOST(serialNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IotdevicecontrollerApi#getDeviceConfigurationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serialNumber** | **String**| serialNumber |

### Return type

[**DeviceConfigurationDTO**](DeviceConfigurationDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="recordNewStateUsingPOST"></a>
# **recordNewStateUsingPOST**
> RecordNewStateResponse recordNewStateUsingPOST(recordMachineStateDTO)

recordNewState

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IotdevicecontrollerApi;


IotdevicecontrollerApi apiInstance = new IotdevicecontrollerApi();
RecordMachineStateDTO recordMachineStateDTO = new RecordMachineStateDTO(); // RecordMachineStateDTO | recordMachineStateDTO
try {
    RecordNewStateResponse result = apiInstance.recordNewStateUsingPOST(recordMachineStateDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IotdevicecontrollerApi#recordNewStateUsingPOST");
    e.printStackTrace();
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

<a name="setDeviceConfigurationUsingPOST"></a>
# **setDeviceConfigurationUsingPOST**
> DeviceConfigurationResponse setDeviceConfigurationUsingPOST(newDeviceConfigurationDTO, serialNumber)

setDeviceConfiguration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IotdevicecontrollerApi;


IotdevicecontrollerApi apiInstance = new IotdevicecontrollerApi();
NewDeviceConfigurationDTO newDeviceConfigurationDTO = new NewDeviceConfigurationDTO(); // NewDeviceConfigurationDTO | newDeviceConfigurationDTO
String serialNumber = "serialNumber_example"; // String | serialNumber
try {
    DeviceConfigurationResponse result = apiInstance.setDeviceConfigurationUsingPOST(newDeviceConfigurationDTO, serialNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IotdevicecontrollerApi#setDeviceConfigurationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newDeviceConfigurationDTO** | [**NewDeviceConfigurationDTO**](NewDeviceConfigurationDTO.md)| newDeviceConfigurationDTO |
 **serialNumber** | **String**| serialNumber |

### Return type

[**DeviceConfigurationResponse**](DeviceConfigurationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="takeDeviceUsingPOST"></a>
# **takeDeviceUsingPOST**
> TakeDeviceResponse takeDeviceUsingPOST(takeDeviceDTO)

takeDevice

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IotdevicecontrollerApi;


IotdevicecontrollerApi apiInstance = new IotdevicecontrollerApi();
TakeDeviceDTO takeDeviceDTO = new TakeDeviceDTO(); // TakeDeviceDTO | takeDeviceDTO
try {
    TakeDeviceResponse result = apiInstance.takeDeviceUsingPOST(takeDeviceDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IotdevicecontrollerApi#takeDeviceUsingPOST");
    e.printStackTrace();
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

<a name="updateDeviceUsingPOST"></a>
# **updateDeviceUsingPOST**
> UpdateDeviceResponse updateDeviceUsingPOST(serialNumber, updateDeviceDTO)

updateDevice

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IotdevicecontrollerApi;


IotdevicecontrollerApi apiInstance = new IotdevicecontrollerApi();
String serialNumber = "serialNumber_example"; // String | serialNumber
UpdateDeviceDTO updateDeviceDTO = new UpdateDeviceDTO(); // UpdateDeviceDTO | updateDeviceDTO
try {
    UpdateDeviceResponse result = apiInstance.updateDeviceUsingPOST(serialNumber, updateDeviceDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IotdevicecontrollerApi#updateDeviceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serialNumber** | **String**| serialNumber |
 **updateDeviceDTO** | [**UpdateDeviceDTO**](UpdateDeviceDTO.md)| updateDeviceDTO |

### Return type

[**UpdateDeviceResponse**](UpdateDeviceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

