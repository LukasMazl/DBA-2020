# MachineEntityEntityApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMachineEntityUsingDELETE**](MachineEntityEntityApi.md#deleteMachineEntityUsingDELETE) | **DELETE** /machineEntities/{id} | deleteMachineEntity
[**findAllMachineEntityUsingGET**](MachineEntityEntityApi.md#findAllMachineEntityUsingGET) | **GET** /machineEntities | findAllMachineEntity
[**findByIdMachineEntityUsingGET**](MachineEntityEntityApi.md#findByIdMachineEntityUsingGET) | **GET** /machineEntities/{id} | findByIdMachineEntity
[**findByVinMachineEntityUsingGET**](MachineEntityEntityApi.md#findByVinMachineEntityUsingGET) | **GET** /machineEntities/search/findByVin | findByVinMachineEntity
[**machineEntityDeviceEntityUsingDELETE**](MachineEntityEntityApi.md#machineEntityDeviceEntityUsingDELETE) | **DELETE** /machineEntities/{id}/deviceEntity | machineEntityDeviceEntity
[**machineEntityDeviceEntityUsingGET**](MachineEntityEntityApi.md#machineEntityDeviceEntityUsingGET) | **GET** /machineEntities/{id}/deviceEntity | machineEntityDeviceEntity
[**machineEntityDeviceEntityUsingPATCH**](MachineEntityEntityApi.md#machineEntityDeviceEntityUsingPATCH) | **PATCH** /machineEntities/{id}/deviceEntity | machineEntityDeviceEntity
[**machineEntityDeviceEntityUsingPOST**](MachineEntityEntityApi.md#machineEntityDeviceEntityUsingPOST) | **POST** /machineEntities/{id}/deviceEntity | machineEntityDeviceEntity
[**machineEntityDeviceEntityUsingPUT**](MachineEntityEntityApi.md#machineEntityDeviceEntityUsingPUT) | **PUT** /machineEntities/{id}/deviceEntity | machineEntityDeviceEntity
[**saveMachineEntityUsingPATCH**](MachineEntityEntityApi.md#saveMachineEntityUsingPATCH) | **PATCH** /machineEntities/{id} | saveMachineEntity
[**saveMachineEntityUsingPOST**](MachineEntityEntityApi.md#saveMachineEntityUsingPOST) | **POST** /machineEntities | saveMachineEntity
[**saveMachineEntityUsingPUT**](MachineEntityEntityApi.md#saveMachineEntityUsingPUT) | **PUT** /machineEntities/{id} | saveMachineEntity


<a name="deleteMachineEntityUsingDELETE"></a>
# **deleteMachineEntityUsingDELETE**
> deleteMachineEntityUsingDELETE(id)

deleteMachineEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MachineEntityEntityApi;


MachineEntityEntityApi apiInstance = new MachineEntityEntityApi();
Long id = 789L; // Long | id
try {
    apiInstance.deleteMachineEntityUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling MachineEntityEntityApi#deleteMachineEntityUsingDELETE");
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

<a name="findAllMachineEntityUsingGET"></a>
# **findAllMachineEntityUsingGET**
> CollectionModelMachineEntity findAllMachineEntityUsingGET(page, size, sort)

findAllMachineEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MachineEntityEntityApi;


MachineEntityEntityApi apiInstance = new MachineEntityEntityApi();
Integer page = 56; // Integer | page
Integer size = 56; // Integer | size
String sort = "sort_example"; // String | sort
try {
    CollectionModelMachineEntity result = apiInstance.findAllMachineEntityUsingGET(page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachineEntityEntityApi#findAllMachineEntityUsingGET");
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

[**CollectionModelMachineEntity**](CollectionModelMachineEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json, text/uri-list, application/x-spring-data-compact+json

<a name="findByIdMachineEntityUsingGET"></a>
# **findByIdMachineEntityUsingGET**
> EntityModelMachineEntity findByIdMachineEntityUsingGET(id)

findByIdMachineEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MachineEntityEntityApi;


MachineEntityEntityApi apiInstance = new MachineEntityEntityApi();
Long id = 789L; // Long | id
try {
    EntityModelMachineEntity result = apiInstance.findByIdMachineEntityUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachineEntityEntityApi#findByIdMachineEntityUsingGET");
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
 - **Accept**: *_/_*

<a name="findByVinMachineEntityUsingGET"></a>
# **findByVinMachineEntityUsingGET**
> EntityModelMachineEntity findByVinMachineEntityUsingGET(param0)

findByVinMachineEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MachineEntityEntityApi;


MachineEntityEntityApi apiInstance = new MachineEntityEntityApi();
String param0 = "param0_example"; // String | param0
try {
    EntityModelMachineEntity result = apiInstance.findByVinMachineEntityUsingGET(param0);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachineEntityEntityApi#findByVinMachineEntityUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | **String**| param0 | [optional]

### Return type

[**EntityModelMachineEntity**](EntityModelMachineEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*

<a name="machineEntityDeviceEntityUsingDELETE"></a>
# **machineEntityDeviceEntityUsingDELETE**
> machineEntityDeviceEntityUsingDELETE(id)

machineEntityDeviceEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MachineEntityEntityApi;


MachineEntityEntityApi apiInstance = new MachineEntityEntityApi();
Long id = 789L; // Long | id
try {
    apiInstance.machineEntityDeviceEntityUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling MachineEntityEntityApi#machineEntityDeviceEntityUsingDELETE");
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

<a name="machineEntityDeviceEntityUsingGET"></a>
# **machineEntityDeviceEntityUsingGET**
> EntityModelDeviceEntity machineEntityDeviceEntityUsingGET(id)

machineEntityDeviceEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MachineEntityEntityApi;


MachineEntityEntityApi apiInstance = new MachineEntityEntityApi();
Long id = 789L; // Long | id
try {
    EntityModelDeviceEntity result = apiInstance.machineEntityDeviceEntityUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachineEntityEntityApi#machineEntityDeviceEntityUsingGET");
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
 - **Accept**: application/hal+json

<a name="machineEntityDeviceEntityUsingPATCH"></a>
# **machineEntityDeviceEntityUsingPATCH**
> EntityModelDeviceEntity machineEntityDeviceEntityUsingPATCH(body, id)

machineEntityDeviceEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MachineEntityEntityApi;


MachineEntityEntityApi apiInstance = new MachineEntityEntityApi();
String body = "body_example"; // String | body
Long id = 789L; // Long | id
try {
    EntityModelDeviceEntity result = apiInstance.machineEntityDeviceEntityUsingPATCH(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachineEntityEntityApi#machineEntityDeviceEntityUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **Long**| id |

### Return type

[**EntityModelDeviceEntity**](EntityModelDeviceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: *_/_*

<a name="machineEntityDeviceEntityUsingPOST"></a>
# **machineEntityDeviceEntityUsingPOST**
> EntityModelDeviceEntity machineEntityDeviceEntityUsingPOST(body, id)

machineEntityDeviceEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MachineEntityEntityApi;


MachineEntityEntityApi apiInstance = new MachineEntityEntityApi();
String body = "body_example"; // String | body
Long id = 789L; // Long | id
try {
    EntityModelDeviceEntity result = apiInstance.machineEntityDeviceEntityUsingPOST(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachineEntityEntityApi#machineEntityDeviceEntityUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **Long**| id |

### Return type

[**EntityModelDeviceEntity**](EntityModelDeviceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: *_/_*

<a name="machineEntityDeviceEntityUsingPUT"></a>
# **machineEntityDeviceEntityUsingPUT**
> EntityModelDeviceEntity machineEntityDeviceEntityUsingPUT(body, id)

machineEntityDeviceEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MachineEntityEntityApi;


MachineEntityEntityApi apiInstance = new MachineEntityEntityApi();
String body = "body_example"; // String | body
Long id = 789L; // Long | id
try {
    EntityModelDeviceEntity result = apiInstance.machineEntityDeviceEntityUsingPUT(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachineEntityEntityApi#machineEntityDeviceEntityUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **Long**| id |

### Return type

[**EntityModelDeviceEntity**](EntityModelDeviceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: *_/_*

<a name="saveMachineEntityUsingPATCH"></a>
# **saveMachineEntityUsingPATCH**
> EntityModelMachineEntity saveMachineEntityUsingPATCH(body, id)

saveMachineEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MachineEntityEntityApi;


MachineEntityEntityApi apiInstance = new MachineEntityEntityApi();
MachineEntity body = new MachineEntity(); // MachineEntity | body
Long id = 789L; // Long | id
try {
    EntityModelMachineEntity result = apiInstance.saveMachineEntityUsingPATCH(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachineEntityEntityApi#saveMachineEntityUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MachineEntity**](MachineEntity.md)| body |
 **id** | **Long**| id |

### Return type

[**EntityModelMachineEntity**](EntityModelMachineEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

<a name="saveMachineEntityUsingPOST"></a>
# **saveMachineEntityUsingPOST**
> EntityModelMachineEntity saveMachineEntityUsingPOST(body)

saveMachineEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MachineEntityEntityApi;


MachineEntityEntityApi apiInstance = new MachineEntityEntityApi();
MachineEntity body = new MachineEntity(); // MachineEntity | body
try {
    EntityModelMachineEntity result = apiInstance.saveMachineEntityUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachineEntityEntityApi#saveMachineEntityUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MachineEntity**](MachineEntity.md)| body |

### Return type

[**EntityModelMachineEntity**](EntityModelMachineEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

<a name="saveMachineEntityUsingPUT"></a>
# **saveMachineEntityUsingPUT**
> EntityModelMachineEntity saveMachineEntityUsingPUT(body, id)

saveMachineEntity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MachineEntityEntityApi;


MachineEntityEntityApi apiInstance = new MachineEntityEntityApi();
MachineEntity body = new MachineEntity(); // MachineEntity | body
Long id = 789L; // Long | id
try {
    EntityModelMachineEntity result = apiInstance.saveMachineEntityUsingPUT(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MachineEntityEntityApi#saveMachineEntityUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MachineEntity**](MachineEntity.md)| body |
 **id** | **Long**| id |

### Return type

[**EntityModelMachineEntity**](EntityModelMachineEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

