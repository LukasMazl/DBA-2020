# IO.Swagger.Api.MachineEntityEntityApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteMachineEntityUsingDELETE**](MachineEntityEntityApi.md#deletemachineentityusingdelete) | **DELETE** /machineEntities/{id} | deleteMachineEntity
[**FindAllMachineEntityUsingGET**](MachineEntityEntityApi.md#findallmachineentityusingget) | **GET** /machineEntities | findAllMachineEntity
[**FindByIdMachineEntityUsingGET**](MachineEntityEntityApi.md#findbyidmachineentityusingget) | **GET** /machineEntities/{id} | findByIdMachineEntity
[**FindByVinMachineEntityUsingGET**](MachineEntityEntityApi.md#findbyvinmachineentityusingget) | **GET** /machineEntities/search/findByVin | findByVinMachineEntity
[**MachineEntityDeviceEntityUsingDELETE**](MachineEntityEntityApi.md#machineentitydeviceentityusingdelete) | **DELETE** /machineEntities/{id}/deviceEntity | machineEntityDeviceEntity
[**MachineEntityDeviceEntityUsingGET**](MachineEntityEntityApi.md#machineentitydeviceentityusingget) | **GET** /machineEntities/{id}/deviceEntity | machineEntityDeviceEntity
[**MachineEntityDeviceEntityUsingPATCH**](MachineEntityEntityApi.md#machineentitydeviceentityusingpatch) | **PATCH** /machineEntities/{id}/deviceEntity | machineEntityDeviceEntity
[**MachineEntityDeviceEntityUsingPOST**](MachineEntityEntityApi.md#machineentitydeviceentityusingpost) | **POST** /machineEntities/{id}/deviceEntity | machineEntityDeviceEntity
[**MachineEntityDeviceEntityUsingPUT**](MachineEntityEntityApi.md#machineentitydeviceentityusingput) | **PUT** /machineEntities/{id}/deviceEntity | machineEntityDeviceEntity
[**SaveMachineEntityUsingPATCH**](MachineEntityEntityApi.md#savemachineentityusingpatch) | **PATCH** /machineEntities/{id} | saveMachineEntity
[**SaveMachineEntityUsingPOST**](MachineEntityEntityApi.md#savemachineentityusingpost) | **POST** /machineEntities | saveMachineEntity
[**SaveMachineEntityUsingPUT**](MachineEntityEntityApi.md#savemachineentityusingput) | **PUT** /machineEntities/{id} | saveMachineEntity


<a name="deletemachineentityusingdelete"></a>
# **DeleteMachineEntityUsingDELETE**
> void DeleteMachineEntityUsingDELETE (long? id)

deleteMachineEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class DeleteMachineEntityUsingDELETEExample
    {
        public void main()
        {
            
            var apiInstance = new MachineEntityEntityApi();
            var id = 789;  // long? | id

            try
            {
                // deleteMachineEntity
                apiInstance.DeleteMachineEntityUsingDELETE(id);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MachineEntityEntityApi.DeleteMachineEntityUsingDELETE: " + e.Message );
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

<a name="findallmachineentityusingget"></a>
# **FindAllMachineEntityUsingGET**
> CollectionModelMachineEntity FindAllMachineEntityUsingGET (int? page = null, int? size = null, string sort = null)

findAllMachineEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class FindAllMachineEntityUsingGETExample
    {
        public void main()
        {
            
            var apiInstance = new MachineEntityEntityApi();
            var page = 56;  // int? | page (optional) 
            var size = 56;  // int? | size (optional) 
            var sort = sort_example;  // string | sort (optional) 

            try
            {
                // findAllMachineEntity
                CollectionModelMachineEntity result = apiInstance.FindAllMachineEntityUsingGET(page, size, sort);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MachineEntityEntityApi.FindAllMachineEntityUsingGET: " + e.Message );
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

[**CollectionModelMachineEntity**](CollectionModelMachineEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/hal+json, text/uri-list, application/x-spring-data-compact+json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="findbyidmachineentityusingget"></a>
# **FindByIdMachineEntityUsingGET**
> EntityModelMachineEntity FindByIdMachineEntityUsingGET (long? id)

findByIdMachineEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class FindByIdMachineEntityUsingGETExample
    {
        public void main()
        {
            
            var apiInstance = new MachineEntityEntityApi();
            var id = 789;  // long? | id

            try
            {
                // findByIdMachineEntity
                EntityModelMachineEntity result = apiInstance.FindByIdMachineEntityUsingGET(id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MachineEntityEntityApi.FindByIdMachineEntityUsingGET: " + e.Message );
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
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="findbyvinmachineentityusingget"></a>
# **FindByVinMachineEntityUsingGET**
> EntityModelMachineEntity FindByVinMachineEntityUsingGET (string param0 = null)

findByVinMachineEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class FindByVinMachineEntityUsingGETExample
    {
        public void main()
        {
            
            var apiInstance = new MachineEntityEntityApi();
            var param0 = param0_example;  // string | param0 (optional) 

            try
            {
                // findByVinMachineEntity
                EntityModelMachineEntity result = apiInstance.FindByVinMachineEntityUsingGET(param0);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MachineEntityEntityApi.FindByVinMachineEntityUsingGET: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param0** | **string**| param0 | [optional] 

### Return type

[**EntityModelMachineEntity**](EntityModelMachineEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="machineentitydeviceentityusingdelete"></a>
# **MachineEntityDeviceEntityUsingDELETE**
> void MachineEntityDeviceEntityUsingDELETE (long? id)

machineEntityDeviceEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class MachineEntityDeviceEntityUsingDELETEExample
    {
        public void main()
        {
            
            var apiInstance = new MachineEntityEntityApi();
            var id = 789;  // long? | id

            try
            {
                // machineEntityDeviceEntity
                apiInstance.MachineEntityDeviceEntityUsingDELETE(id);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MachineEntityEntityApi.MachineEntityDeviceEntityUsingDELETE: " + e.Message );
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

<a name="machineentitydeviceentityusingget"></a>
# **MachineEntityDeviceEntityUsingGET**
> EntityModelDeviceEntity MachineEntityDeviceEntityUsingGET (long? id)

machineEntityDeviceEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class MachineEntityDeviceEntityUsingGETExample
    {
        public void main()
        {
            
            var apiInstance = new MachineEntityEntityApi();
            var id = 789;  // long? | id

            try
            {
                // machineEntityDeviceEntity
                EntityModelDeviceEntity result = apiInstance.MachineEntityDeviceEntityUsingGET(id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MachineEntityEntityApi.MachineEntityDeviceEntityUsingGET: " + e.Message );
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
 - **Accept**: application/hal+json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="machineentitydeviceentityusingpatch"></a>
# **MachineEntityDeviceEntityUsingPATCH**
> EntityModelDeviceEntity MachineEntityDeviceEntityUsingPATCH (string body, long? id)

machineEntityDeviceEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class MachineEntityDeviceEntityUsingPATCHExample
    {
        public void main()
        {
            
            var apiInstance = new MachineEntityEntityApi();
            var body = body_example;  // string | body
            var id = 789;  // long? | id

            try
            {
                // machineEntityDeviceEntity
                EntityModelDeviceEntity result = apiInstance.MachineEntityDeviceEntityUsingPATCH(body, id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MachineEntityEntityApi.MachineEntityDeviceEntityUsingPATCH: " + e.Message );
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

[**EntityModelDeviceEntity**](EntityModelDeviceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="machineentitydeviceentityusingpost"></a>
# **MachineEntityDeviceEntityUsingPOST**
> EntityModelDeviceEntity MachineEntityDeviceEntityUsingPOST (string body, long? id)

machineEntityDeviceEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class MachineEntityDeviceEntityUsingPOSTExample
    {
        public void main()
        {
            
            var apiInstance = new MachineEntityEntityApi();
            var body = body_example;  // string | body
            var id = 789;  // long? | id

            try
            {
                // machineEntityDeviceEntity
                EntityModelDeviceEntity result = apiInstance.MachineEntityDeviceEntityUsingPOST(body, id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MachineEntityEntityApi.MachineEntityDeviceEntityUsingPOST: " + e.Message );
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

[**EntityModelDeviceEntity**](EntityModelDeviceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="machineentitydeviceentityusingput"></a>
# **MachineEntityDeviceEntityUsingPUT**
> EntityModelDeviceEntity MachineEntityDeviceEntityUsingPUT (string body, long? id)

machineEntityDeviceEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class MachineEntityDeviceEntityUsingPUTExample
    {
        public void main()
        {
            
            var apiInstance = new MachineEntityEntityApi();
            var body = body_example;  // string | body
            var id = 789;  // long? | id

            try
            {
                // machineEntityDeviceEntity
                EntityModelDeviceEntity result = apiInstance.MachineEntityDeviceEntityUsingPUT(body, id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MachineEntityEntityApi.MachineEntityDeviceEntityUsingPUT: " + e.Message );
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

[**EntityModelDeviceEntity**](EntityModelDeviceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="savemachineentityusingpatch"></a>
# **SaveMachineEntityUsingPATCH**
> EntityModelMachineEntity SaveMachineEntityUsingPATCH (MachineEntity body, long? id)

saveMachineEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SaveMachineEntityUsingPATCHExample
    {
        public void main()
        {
            
            var apiInstance = new MachineEntityEntityApi();
            var body = new MachineEntity(); // MachineEntity | body
            var id = 789;  // long? | id

            try
            {
                // saveMachineEntity
                EntityModelMachineEntity result = apiInstance.SaveMachineEntityUsingPATCH(body, id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MachineEntityEntityApi.SaveMachineEntityUsingPATCH: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MachineEntity**](MachineEntity.md)| body | 
 **id** | **long?**| id | 

### Return type

[**EntityModelMachineEntity**](EntityModelMachineEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="savemachineentityusingpost"></a>
# **SaveMachineEntityUsingPOST**
> EntityModelMachineEntity SaveMachineEntityUsingPOST (MachineEntity body)

saveMachineEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SaveMachineEntityUsingPOSTExample
    {
        public void main()
        {
            
            var apiInstance = new MachineEntityEntityApi();
            var body = new MachineEntity(); // MachineEntity | body

            try
            {
                // saveMachineEntity
                EntityModelMachineEntity result = apiInstance.SaveMachineEntityUsingPOST(body);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MachineEntityEntityApi.SaveMachineEntityUsingPOST: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="savemachineentityusingput"></a>
# **SaveMachineEntityUsingPUT**
> EntityModelMachineEntity SaveMachineEntityUsingPUT (MachineEntity body, long? id)

saveMachineEntity

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class SaveMachineEntityUsingPUTExample
    {
        public void main()
        {
            
            var apiInstance = new MachineEntityEntityApi();
            var body = new MachineEntity(); // MachineEntity | body
            var id = 789;  // long? | id

            try
            {
                // saveMachineEntity
                EntityModelMachineEntity result = apiInstance.SaveMachineEntityUsingPUT(body, id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MachineEntityEntityApi.SaveMachineEntityUsingPUT: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MachineEntity**](MachineEntity.md)| body | 
 **id** | **long?**| id | 

### Return type

[**EntityModelMachineEntity**](EntityModelMachineEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

