# IndexcontrollerApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIndexUsingGET**](IndexcontrollerApi.md#getIndexUsingGET) | **GET** /index | getIndex


<a name="getIndexUsingGET"></a>
# **getIndexUsingGET**
> String getIndexUsingGET(modelMap)

getIndex

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IndexcontrollerApi;


IndexcontrollerApi apiInstance = new IndexcontrollerApi();
String modelMap = "modelMap_example"; // String | modelMap
try {
    String result = apiInstance.getIndexUsingGET(modelMap);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndexcontrollerApi#getIndexUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelMap** | **String**| modelMap | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*

