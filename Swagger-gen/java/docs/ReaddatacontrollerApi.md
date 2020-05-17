# ReaddatacontrollerApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllMachinesUsingPOST**](ReaddatacontrollerApi.md#getAllMachinesUsingPOST) | **POST** /api/v1/data/getAllMachines | getAllMachines
[**getRecordsForMachineUsingPOST**](ReaddatacontrollerApi.md#getRecordsForMachineUsingPOST) | **POST** /api/v1/data/machine/{vin} | getRecordsForMachine


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
 - **Accept**: *_/_*

<a name="getRecordsForMachineUsingPOST"></a>
# **getRecordsForMachineUsingPOST**
> MachineDataRecordsDTO getRecordsForMachineUsingPOST(columnValueList, pages, vin)

getRecordsForMachine

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReaddatacontrollerApi;


ReaddatacontrollerApi apiInstance = new ReaddatacontrollerApi();
List<String> columnValueList = Arrays.asList("columnValueList_example"); // List<String> | 
Integer pages = 56; // Integer | 
String vin = "vin_example"; // String | 
try {
    MachineDataRecordsDTO result = apiInstance.getRecordsForMachineUsingPOST(columnValueList, pages, vin);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReaddatacontrollerApi#getRecordsForMachineUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columnValueList** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: SPEED, POSSITION, TENZOMETR, ACTION, BATTERY_STRESS, REST_OF_FUEL, HUMIDITY]
 **pages** | **Integer**|  | [optional]
 **vin** | **String**|  | [optional]

### Return type

[**MachineDataRecordsDTO**](MachineDataRecordsDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

