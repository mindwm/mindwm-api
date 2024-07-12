# mindwm.DefaultApi

All URIs are relative to *https://mindwmw.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ping_get**](DefaultApi.md#ping_get) | **GET** /ping | Ping the server


# **ping_get**
> PingGet200Response ping_get()

Ping the server

### Example


```python
import mindwm
from mindwm.models.ping_get200_response import PingGet200Response
from mindwm.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://mindwmw.io/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = mindwm.Configuration(
    host = "https://mindwmw.io/v1"
)


# Enter a context with an instance of the API client
with mindwm.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = mindwm.DefaultApi(api_client)

    try:
        # Ping the server
        api_response = api_instance.ping_get()
        print("The response of DefaultApi->ping_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->ping_get: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**PingGet200Response**](PingGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pong response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

