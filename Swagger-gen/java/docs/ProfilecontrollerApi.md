# ProfilecontrollerApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAllFormsOfMetadataUsingGET**](ProfilecontrollerApi.md#listAllFormsOfMetadataUsingGET) | **GET** /profile | listAllFormsOfMetadata
[**profileOptionsUsingOPTIONS**](ProfilecontrollerApi.md#profileOptionsUsingOPTIONS) | **OPTIONS** /profile | profileOptions


<a name="listAllFormsOfMetadataUsingGET"></a>
# **listAllFormsOfMetadataUsingGET**
> RepresentationModelobject listAllFormsOfMetadataUsingGET()

listAllFormsOfMetadata

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProfilecontrollerApi;


ProfilecontrollerApi apiInstance = new ProfilecontrollerApi();
try {
    RepresentationModelobject result = apiInstance.listAllFormsOfMetadataUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilecontrollerApi#listAllFormsOfMetadataUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RepresentationModelobject**](RepresentationModelobject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*

<a name="profileOptionsUsingOPTIONS"></a>
# **profileOptionsUsingOPTIONS**
> Object profileOptionsUsingOPTIONS()

profileOptions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProfilecontrollerApi;


ProfilecontrollerApi apiInstance = new ProfilecontrollerApi();
try {
    Object result = apiInstance.profileOptionsUsingOPTIONS();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilecontrollerApi#profileOptionsUsingOPTIONS");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

