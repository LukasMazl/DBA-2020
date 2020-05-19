# ReaddatacontrollerApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllDeviceUsingPOST**](ReaddatacontrollerApi.md#getAllDeviceUsingPOST) | **POST** /api/v1/data/getAllDevices | getAllDevice
[**getAllMachinesUsingPOST**](ReaddatacontrollerApi.md#getAllMachinesUsingPOST) | **POST** /api/v1/data/getAllMachines | getAllMachines
[**getRecordsForMachineUsingPOST**](ReaddatacontrollerApi.md#getRecordsForMachineUsingPOST) | **POST** /api/v1/data/machine | getRecordsForMachine


<a name="getAllDeviceUsingPOST"></a>
# **getAllDeviceUsingPOST**
> AllDeviceDTO getAllDeviceUsingPOST()

getAllDevice

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReaddatacontrollerApi;


ReaddatacontrollerApi apiInstance = new ReaddatacontrollerApi();
try {
    AllDeviceDTO result = apiInstance.getAllDeviceUsingPOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReaddatacontrollerApi#getAllDeviceUsingPOST");
    e.printStackTrace();
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

<a name="getAllMachinesUsingPOST"></a>
# **getAllMachinesUsingPOST**
> AllMachineDTO getAllMachinesUsingPOST()

getAllMachines

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReaddatacontrollerApi;


ReaddatacontrollerApi apiInstance = new ReaddatacontrollerApi();
try {
    AllMachineDTO result = apiInstance.getAllMachinesUsingPOST();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReaddatacontrollerApi#getAllMachinesUsingPOST");
    e.printStackTrace();
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

<a name="getRecordsForMachineUsingPOST"></a>
# **getRecordsForMachineUsingPOST**
> MachineDataRecordsDTO getRecordsForMachineUsingPOST(getRecordsForMachineDTO)

getRecordsForMachine

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReaddatacontrollerApi;


ReaddatacontrollerApi apiInstance = new ReaddatacontrollerApi();
GetRecordsForMachineDTO getRecordsForMachineDTO = new GetRecordsForMachineDTO(); // GetRecordsForMachineDTO | getRecordsForMachineDTO
try {
    MachineDataRecordsDTO result = apiInstance.getRecordsForMachineUsingPOST(getRecordsForMachineDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReaddatacontrollerApi#getRecordsForMachineUsingPOST");
    e.printStackTrace();
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

