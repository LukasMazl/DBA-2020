# IO.Swagger.Api.DeviceEntityEntityApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteDeviceEntityUsingDELETE**](DeviceEntityEntityApi.md#deletedeviceentityusingdelete) | **DELETE** /deviceEntities/{id} | deleteDeviceEntity
[**DeviceEntityMachineEntityUsingDELETE**](DeviceEntityEntityApi.md#deviceentitymachineentityusingdelete) | **DELETE** /deviceEntities/{id}/machineEntity | deviceEntityMachineEntity
[**DeviceEntityMachineEntityUsingGET**](DeviceEntityEntityApi.md#deviceentitymachineentityusingget) | **GET** /deviceEntities/{id}/machineEntity | deviceEntityMachineEntity
[**DeviceEntityMachineEntityUsingPATCH**](DeviceEntityEntityApi.md#deviceentitymachineentityusingpatch) | **PATCH** /deviceEntities/{id}/machineEntity | deviceEntityMachineEntity
[**DeviceEntityMachineEntityUsingPOST**](DeviceEntityEntityApi.md#deviceentitymachineentityusingpost) | **POST** /deviceEntities/{id}/machineEntity | deviceEntityMachineEntity
[**DeviceEntityMachineEntityUsingPUT**](DeviceEntityEntityApi.md#deviceentitymachineentityusingput) | **PUT** /deviceEntities/{id}/machineEntity | deviceEntityMachineEntity
[**FindAllByMachineEntityIsNullDeviceEntityUsingGET**](DeviceEntityEntityApi.md#findallbymachineentityisnulldeviceentityusingget) | **GET** /deviceEntities/search/findAllByMachineEntityIsNull | findAllByMachineEntityIsNullDeviceEntity
[**FindAllDeviceEntityUsingGET**](DeviceEntityEntityApi.md#findalldeviceentityusingget) | **GET** /deviceEntities | findAllDeviceEntity
[**FindByIdDeviceEntityUsingGET**](DeviceEntityEntityApi.md#findbyiddeviceentityusingget) | **GET** /deviceEntities/{id} | findByIdDeviceEntity
[**SaveDeviceEntityUsingPATCH**](DeviceEntityEntityApi.md#savedeviceentityusingpatch) | **PATCH** /deviceEntities/{id} | saveDeviceEntity
[**SaveDeviceEntityUsingPOST**](DeviceEntityEntityApi.md#savedeviceentityusingpost) | **POST** /deviceEntities | saveDeviceEntity
[**SaveDeviceEntityUsingPUT**](DeviceEntityEntityApi.md#savedeviceentityusingput) | **PUT** /deviceEntities/{id} | saveDeviceEntity


<a name="deletedeviceentityusingdelete"></a>
# **DeleteDeviceEntityUsingDELETE**
> void DeleteDeviceEntityUsingDELETE (long? id)

deleteDeviceEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteDeviceEntityUsingDELETEExample
    {
        public void main()
        {
            
            var apiInstance = new DeviceEntityEntityApi();
            var id = 789;  // long? | id

            try
            {
                // deleteDeviceEntity
                apiInstance.DeleteDeviceEntityUsingDELETE(id);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DeviceEntityEntityApi.DeleteDeviceEntityUsingDELETE: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **long?**| id | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deviceentitymachineentityusingdelete"></a>
# **DeviceEntityMachineEntityUsingDELETE**
> void DeviceEntityMachineEntityUsingDELETE (long? id)

deviceEntityMachineEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeviceEntityMachineEntityUsingDELETEExample
    {
        public void main()
        {
            
            var apiInstance = new DeviceEntityEntityApi();
            var id = 789;  // long? | id

            try
            {
                // deviceEntityMachineEntity
                apiInstance.DeviceEntityMachineEntityUsingDELETE(id);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DeviceEntityEntityApi.DeviceEntityMachineEntityUsingDELETE: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **long?**| id | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deviceentitymachineentityusingget"></a>
# **DeviceEntityMachineEntityUsingGET**
> EntityModelMachineEntity DeviceEntityMachineEntityUsingGET (long? id)

deviceEntityMachineEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeviceEntityMachineEntityUsingGETExample
    {
        public void main()
        {
            
            var apiInstance = new DeviceEntityEntityApi();
            var id = 789;  // long? | id

            try
            {
                // deviceEntityMachineEntity
                EntityModelMachineEntity result = apiInstance.DeviceEntityMachineEntityUsingGET(id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DeviceEntityEntityApi.DeviceEntityMachineEntityUsingGET: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **long?**| id | 

### Return type

[**EntityModelMachineEntity**](EntityModelMachineEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deviceentitymachineentityusingpatch"></a>
# **DeviceEntityMachineEntityUsingPATCH**
> EntityModelMachineEntity DeviceEntityMachineEntityUsingPATCH (string body, long? id)

deviceEntityMachineEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeviceEntityMachineEntityUsingPATCHExample
    {
        public void main()
        {
            
            var apiInstance = new DeviceEntityEntityApi();
            var body = body_example;  // string | body
            var id = 789;  // long? | id

            try
            {
                // deviceEntityMachineEntity
                EntityModelMachineEntity result = apiInstance.DeviceEntityMachineEntityUsingPATCH(body, id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DeviceEntityEntityApi.DeviceEntityMachineEntityUsingPATCH: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **string**| body | 
 **id** | **long?**| id | 

### Return type

[**EntityModelMachineEntity**](EntityModelMachineEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deviceentitymachineentityusingpost"></a>
# **DeviceEntityMachineEntityUsingPOST**
> EntityModelMachineEntity DeviceEntityMachineEntityUsingPOST (string body, long? id)

deviceEntityMachineEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeviceEntityMachineEntityUsingPOSTExample
    {
        public void main()
        {
            
            var apiInstance = new DeviceEntityEntityApi();
            var body = body_example;  // string | body
            var id = 789;  // long? | id

            try
            {
                // deviceEntityMachineEntity
                EntityModelMachineEntity result = apiInstance.DeviceEntityMachineEntityUsingPOST(body, id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DeviceEntityEntityApi.DeviceEntityMachineEntityUsingPOST: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **string**| body | 
 **id** | **long?**| id | 

### Return type

[**EntityModelMachineEntity**](EntityModelMachineEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deviceentitymachineentityusingput"></a>
# **DeviceEntityMachineEntityUsingPUT**
> EntityModelMachineEntity DeviceEntityMachineEntityUsingPUT (string body, long? id)

deviceEntityMachineEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeviceEntityMachineEntityUsingPUTExample
    {
        public void main()
        {
            
            var apiInstance = new DeviceEntityEntityApi();
            var body = body_example;  // string | body
            var id = 789;  // long? | id

            try
            {
                // deviceEntityMachineEntity
                EntityModelMachineEntity result = apiInstance.DeviceEntityMachineEntityUsingPUT(body, id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DeviceEntityEntityApi.DeviceEntityMachineEntityUsingPUT: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **string**| body | 
 **id** | **long?**| id | 

### Return type

[**EntityModelMachineEntity**](EntityModelMachineEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="findallbymachineentityisnulldeviceentityusingget"></a>
# **FindAllByMachineEntityIsNullDeviceEntityUsingGET**
> CollectionModelDeviceEntity FindAllByMachineEntityIsNullDeviceEntityUsingGET ()

findAllByMachineEntityIsNullDeviceEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class FindAllByMachineEntityIsNullDeviceEntityUsingGETExample
    {
        public void main()
        {
            
            var apiInstance = new DeviceEntityEntityApi();

            try
            {
                // findAllByMachineEntityIsNullDeviceEntity
                CollectionModelDeviceEntity result = apiInstance.FindAllByMachineEntityIsNullDeviceEntityUsingGET();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DeviceEntityEntityApi.FindAllByMachineEntityIsNullDeviceEntityUsingGET: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="findalldeviceentityusingget"></a>
# **FindAllDeviceEntityUsingGET**
> CollectionModelDeviceEntity FindAllDeviceEntityUsingGET (int? page = null, int? size = null, string sort = null)

findAllDeviceEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class FindAllDeviceEntityUsingGETExample
    {
        public void main()
        {
            
            var apiInstance = new DeviceEntityEntityApi();
            var page = 56;  // int? | page (optional) 
            var size = 56;  // int? | size (optional) 
            var sort = sort_example;  // string | sort (optional) 

            try
            {
                // findAllDeviceEntity
                CollectionModelDeviceEntity result = apiInstance.FindAllDeviceEntityUsingGET(page, size, sort);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DeviceEntityEntityApi.FindAllDeviceEntityUsingGET: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **int?**| page | [optional] 
 **size** | **int?**| size | [optional] 
 **sort** | **string**| sort | [optional] 

### Return type

[**CollectionModelDeviceEntity**](CollectionModelDeviceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json, text/uri-list, application/x-spring-data-compact+json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="findbyiddeviceentityusingget"></a>
# **FindByIdDeviceEntityUsingGET**
> EntityModelDeviceEntity FindByIdDeviceEntityUsingGET (long? id)

findByIdDeviceEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class FindByIdDeviceEntityUsingGETExample
    {
        public void main()
        {
            
            var apiInstance = new DeviceEntityEntityApi();
            var id = 789;  // long? | id

            try
            {
                // findByIdDeviceEntity
                EntityModelDeviceEntity result = apiInstance.FindByIdDeviceEntityUsingGET(id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DeviceEntityEntityApi.FindByIdDeviceEntityUsingGET: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **long?**| id | 

### Return type

[**EntityModelDeviceEntity**](EntityModelDeviceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="savedeviceentityusingpatch"></a>
# **SaveDeviceEntityUsingPATCH**
> EntityModelDeviceEntity SaveDeviceEntityUsingPATCH (DeviceEntity body, long? id)

saveDeviceEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SaveDeviceEntityUsingPATCHExample
    {
        public void main()
        {
            
            var apiInstance = new DeviceEntityEntityApi();
            var body = new DeviceEntity(); // DeviceEntity | body
            var id = 789;  // long? | id

            try
            {
                // saveDeviceEntity
                EntityModelDeviceEntity result = apiInstance.SaveDeviceEntityUsingPATCH(body, id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DeviceEntityEntityApi.SaveDeviceEntityUsingPATCH: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeviceEntity**](DeviceEntity.md)| body | 
 **id** | **long?**| id | 

### Return type

[**EntityModelDeviceEntity**](EntityModelDeviceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="savedeviceentityusingpost"></a>
# **SaveDeviceEntityUsingPOST**
> EntityModelDeviceEntity SaveDeviceEntityUsingPOST (DeviceEntity body)

saveDeviceEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SaveDeviceEntityUsingPOSTExample
    {
        public void main()
        {
            
            var apiInstance = new DeviceEntityEntityApi();
            var body = new DeviceEntity(); // DeviceEntity | body

            try
            {
                // saveDeviceEntity
                EntityModelDeviceEntity result = apiInstance.SaveDeviceEntityUsingPOST(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DeviceEntityEntityApi.SaveDeviceEntityUsingPOST: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="savedeviceentityusingput"></a>
# **SaveDeviceEntityUsingPUT**
> EntityModelDeviceEntity SaveDeviceEntityUsingPUT (DeviceEntity body, long? id)

saveDeviceEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SaveDeviceEntityUsingPUTExample
    {
        public void main()
        {
            
            var apiInstance = new DeviceEntityEntityApi();
            var body = new DeviceEntity(); // DeviceEntity | body
            var id = 789;  // long? | id

            try
            {
                // saveDeviceEntity
                EntityModelDeviceEntity result = apiInstance.SaveDeviceEntityUsingPUT(body, id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DeviceEntityEntityApi.SaveDeviceEntityUsingPUT: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DeviceEntity**](DeviceEntity.md)| body | 
 **id** | **long?**| id | 

### Return type

[**EntityModelDeviceEntity**](EntityModelDeviceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

