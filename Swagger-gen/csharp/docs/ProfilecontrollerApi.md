# IO.Swagger.Api.ProfilecontrollerApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ListAllFormsOfMetadataUsingGET**](ProfilecontrollerApi.md#listallformsofmetadatausingget) | **GET** /profile | listAllFormsOfMetadata
[**ProfileOptionsUsingOPTIONS**](ProfilecontrollerApi.md#profileoptionsusingoptions) | **OPTIONS** /profile | profileOptions


<a name="listallformsofmetadatausingget"></a>
# **ListAllFormsOfMetadataUsingGET**
> RepresentationModelobject ListAllFormsOfMetadataUsingGET ()

listAllFormsOfMetadata

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ListAllFormsOfMetadataUsingGETExample
    {
        public void main()
        {
            
            var apiInstance = new ProfilecontrollerApi();

            try
            {
                // listAllFormsOfMetadata
                RepresentationModelobject result = apiInstance.ListAllFormsOfMetadataUsingGET();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProfilecontrollerApi.ListAllFormsOfMetadataUsingGET: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="profileoptionsusingoptions"></a>
# **ProfileOptionsUsingOPTIONS**
> Object ProfileOptionsUsingOPTIONS ()

profileOptions

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ProfileOptionsUsingOPTIONSExample
    {
        public void main()
        {
            
            var apiInstance = new ProfilecontrollerApi();

            try
            {
                // profileOptions
                Object result = apiInstance.ProfileOptionsUsingOPTIONS();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ProfilecontrollerApi.ProfileOptionsUsingOPTIONS: " + e.Message );
            }
        }
    }
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

