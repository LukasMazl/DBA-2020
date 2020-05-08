# IO.Swagger.Api.IndexcontrollerApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetIndexUsingGET**](IndexcontrollerApi.md#getindexusingget) | **GET** /index | getIndex


<a name="getindexusingget"></a>
# **GetIndexUsingGET**
> string GetIndexUsingGET (string modelMap = null)

getIndex

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class GetIndexUsingGETExample
    {
        public void main()
        {
            
            var apiInstance = new IndexcontrollerApi();
            var modelMap = modelMap_example;  // string | modelMap (optional) 

            try
            {
                // getIndex
                string result = apiInstance.GetIndexUsingGET(modelMap);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling IndexcontrollerApi.GetIndexUsingGET: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelMap** | **string**| modelMap | [optional] 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *_/_*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

