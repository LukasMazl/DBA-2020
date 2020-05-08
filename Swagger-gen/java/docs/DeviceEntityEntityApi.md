# DeviceEntityEntityApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDeviceEntityUsingDELETE**](DeviceEntityEntityApi.md#deleteDeviceEntityUsingDELETE) | **DELETE** /deviceEntities/{id} | deleteDeviceEntity
[**deviceEntityMachineEntityUsingDELETE**](DeviceEntityEntityApi.md#deviceEntityMachineEntityUsingDELETE) | **DELETE** /deviceEntities/{id}/machineEntity | deviceEntityMachineEntity
[**deviceEntityMachineEntityUsingGET**](DeviceEntityEntityApi.md#deviceEntityMachineEntityUsingGET) | **GET** /deviceEntities/{id}/machineEntity | deviceEntityMachineEntity
[**deviceEntityMachineEntityUsingPATCH**](DeviceEntityEntityApi.md#deviceEntityMachineEntityUsingPATCH) | **PATCH** /deviceEntities/{id}/machineEntity | deviceEntityMachineEntity
[**deviceEntityMachineEntityUsingPOST**](DeviceEntityEntityApi.md#deviceEntityMachineEntityUsingPOST) | **POST** /deviceEntities/{id}/machineEntity | deviceEntityMachineEntity
[**deviceEntityMachineEntityUsingPUT**](DeviceEntityEntityApi.md#deviceEntityMachineEntityUsingPUT) | **PUT** /deviceEntities/{id}/machineEntity | deviceEntityMachineEntity
[**findAllByMachineEntityIsNullDeviceEntityUsingGET**](DeviceEntityEntityApi.md#findAllByMachineEntityIsNullDeviceEntityUsingGET) | **GET** /deviceEntities/search/findAllByMachineEntityIsNull | findAllByMachineEntityIsNullDeviceEntity
[**findAllDeviceEntityUsingGET**](DeviceEntityEntityApi.md#findAllDeviceEntityUsingGET) | **GET** /deviceEntities | findAllDeviceEntity
[**findByIdDeviceEntityUsingGET**](DeviceEntityEntityApi.md#findByIdDeviceEntityUsingGET) | **GET** /deviceEntities/{id} | findByIdDeviceEntity
[**saveDeviceEntityUsingPATCH**](DeviceEntityEntityApi.md#saveDeviceEntityUsingPATCH) | **PATCH** /deviceEntities/{id} | saveDeviceEntity
[**saveDeviceEntityUsingPOST**](DeviceEntityEntityApi.md#saveDeviceEntityUsingPOST) | **POST** /deviceEntities | saveDeviceEntity
[**saveDeviceEntityUsingPUT**](DeviceEntityEntityApi.md#saveDeviceEntityUsingPUT) | **PUT** /deviceEntities/{id} | saveDeviceEntity


<a name="deleteDeviceEntityUsingDELETE"></a>
# **deleteDeviceEntityUsingDELETE**
> deleteDeviceEntityUsingDELETE(id)

deleteDeviceEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DeviceEntityEntityApi;


DeviceEntityEntityApi apiInstance = new DeviceEntityEntityApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteDeviceEntityUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceEntityEntityApi#deleteDeviceEntityUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*

<a name="deviceEntityMachineEntityUsingDELETE"></a>
# **deviceEntityMachineEntityUsingDELETE**
> deviceEntityMachineEntityUsingDELETE(id)

deviceEntityMachineEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DeviceEntityEntityApi;


DeviceEntityEntityApi apiInstance = new DeviceEntityEntityApi();
Long id = 789L; // Long | id
try {
    apiInstance.deviceEntityMachineEntityUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceEntityEntityApi#deviceEntityMachineEntityUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: *_/_*

<a name="deviceEntityMachineEntityUsingGET"></a>
# **deviceEntityMachineEntityUsingGET**
> EntityModelMachineEntity deviceEntityMachineEntityUsingGET(id)

deviceEntityMachineEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DeviceEntityEntityApi;


DeviceEntityEntityApi apiInstance = new DeviceEntityEntityApi();
Long id = 789L; // Long | id
try {
    EntityModelMachineEntity result = apiInstance.deviceEntityMachineEntityUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceEntityEntityApi#deviceEntityMachineEntityUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**EntityModelMachineEntity**](EntityModelMachineEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

<a name="deviceEntityMachineEntityUsingPATCH"></a>
# **deviceEntityMachineEntityUsingPATCH**
> EntityModelMachineEntity deviceEntityMachineEntityUsingPATCH(body, id)

deviceEntityMachineEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DeviceEntityEntityApi;


DeviceEntityEntityApi apiInstance = new DeviceEntityEntityApi();
String body = "body_example"; // String | body
Long id = 789L; // Long | id
try {
    EntityModelMachineEntity result = apiInstance.deviceEntityMachineEntityUsingPATCH(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceEntityEntityApi#deviceEntityMachineEntityUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **Long**| id |

### Return type

[**EntityModelMachineEntity**](EntityModelMachineEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: *_/_*

<a name="deviceEntityMachineEntityUsingPOST"></a>
# **deviceEntityMachineEntityUsingPOST**
> EntityModelMachineEntity deviceEntityMachineEntityUsingPOST(body, id)

deviceEntityMachineEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DeviceEntityEntityApi;


DeviceEntityEntityApi apiInstance = new DeviceEntityEntityApi();
String body = "body_example"; // String | body
Long id = 789L; // Long | id
try {
    EntityModelMachineEntity result = apiInstance.deviceEntityMachineEntityUsingPOST(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceEntityEntityApi#deviceEntityMachineEntityUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **Long**| id |

### Return type

[**EntityModelMachineEntity**](EntityModelMachineEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: *_/_*

<a name="deviceEntityMachineEntityUsingPUT"></a>
# **deviceEntityMachineEntityUsingPUT**
> EntityModelMachineEntity deviceEntityMachineEntityUsingPUT(body, id)

deviceEntityMachineEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DeviceEntityEntityApi;


DeviceEntityEntityApi apiInstance = new DeviceEntityEntityApi();
String body = "body_example"; // String | body
Long id = 789L; // Long | id
try {
    EntityModelMachineEntity result = apiInstance.deviceEntityMachineEntityUsingPUT(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceEntityEntityApi#deviceEntityMachineEntityUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **Long**| id |

### Return type

[**EntityModelMachineEntity**](EntityModelMachineEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: *_/_*

<a name="findAllByMachineEntityIsNullDeviceEntityUsingGET"></a>
# **findAllByMachineEntityIsNullDeviceEntityUsingGET**
> CollectionModelDeviceEntity findAllByMachineEntityIsNullDeviceEntityUsingGET()

findAllByMachineEntityIsNullDeviceEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DeviceEntityEntityApi;


DeviceEntityEntityApi apiInstance = new DeviceEntityEntityApi();
try {
    CollectionModelDeviceEntity result = apiInstance.findAllByMachineEntityIsNullDeviceEntityUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceEntityEntityApi#findAllByMachineEntityIsNullDeviceEntityUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CollectionModelDeviceEntity**](CollectionModelDeviceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*

<a name="findAllDeviceEntityUsingGET"></a>
# **findAllDeviceEntityUsingGET**
> CollectionModelDeviceEntity findAllDeviceEntityUsingGET(page, size, sort)

findAllDeviceEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DeviceEntityEntityApi;


DeviceEntityEntityApi apiInstance = new DeviceEntityEntityApi();
Integer page = 56; // Integer | page
Integer size = 56; // Integer | size
String sort = "sort_example"; // String | sort
try {
    CollectionModelDeviceEntity result = apiInstance.findAllDeviceEntityUsingGET(page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceEntityEntityApi#findAllDeviceEntityUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| page | [optional]
 **size** | **Integer**| size | [optional]
 **sort** | **String**| sort | [optional]

### Return type

[**CollectionModelDeviceEntity**](CollectionModelDeviceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json, text/uri-list, application/x-spring-data-compact+json

<a name="findByIdDeviceEntityUsingGET"></a>
# **findByIdDeviceEntityUsingGET**
> EntityModelDeviceEntity findByIdDeviceEntityUsingGET(id)

findByIdDeviceEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DeviceEntityEntityApi;


DeviceEntityEntityApi apiInstance = new DeviceEntityEntityApi();
Long id = 789L; // Long | id
try {
    EntityModelDeviceEntity result = apiInstance.findByIdDeviceEntityUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceEntityEntityApi#findByIdDeviceEntityUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**EntityModelDeviceEntity**](EntityModelDeviceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*

<a name="saveDeviceEntityUsingPATCH"></a>
# **saveDeviceEntityUsingPATCH**
> EntityModelDeviceEntity saveDeviceEntityUsingPATCH(body, id)

saveDeviceEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DeviceEntityEntityApi;


DeviceEntityEntityApi apiInstance = new DeviceEntityEntityApi();
DeviceEntity body = new DeviceEntity(); // DeviceEntity | body
Long id = 789L; // Long | id
try {
    EntityModelDeviceEntity result = apiInstance.saveDeviceEntityUsingPATCH(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceEntityEntityApi#saveDeviceEntityUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeviceEntity**](DeviceEntity.md)| body |
 **id** | **Long**| id |

### Return type

[**EntityModelDeviceEntity**](EntityModelDeviceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

<a name="saveDeviceEntityUsingPOST"></a>
# **saveDeviceEntityUsingPOST**
> EntityModelDeviceEntity saveDeviceEntityUsingPOST(body)

saveDeviceEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DeviceEntityEntityApi;


DeviceEntityEntityApi apiInstance = new DeviceEntityEntityApi();
DeviceEntity body = new DeviceEntity(); // DeviceEntity | body
try {
    EntityModelDeviceEntity result = apiInstance.saveDeviceEntityUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceEntityEntityApi#saveDeviceEntityUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeviceEntity**](DeviceEntity.md)| body |

### Return type

[**EntityModelDeviceEntity**](EntityModelDeviceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

<a name="saveDeviceEntityUsingPUT"></a>
# **saveDeviceEntityUsingPUT**
> EntityModelDeviceEntity saveDeviceEntityUsingPUT(body, id)

saveDeviceEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DeviceEntityEntityApi;


DeviceEntityEntityApi apiInstance = new DeviceEntityEntityApi();
DeviceEntity body = new DeviceEntity(); // DeviceEntity | body
Long id = 789L; // Long | id
try {
    EntityModelDeviceEntity result = apiInstance.saveDeviceEntityUsingPUT(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeviceEntityEntityApi#saveDeviceEntityUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeviceEntity**](DeviceEntity.md)| body |
 **id** | **Long**| id |

### Return type

[**EntityModelDeviceEntity**](EntityModelDeviceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

