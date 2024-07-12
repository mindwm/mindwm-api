# \DefaultAPI

All URIs are relative to *https://mindwmw.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PingGet**](DefaultAPI.md#PingGet) | **Get** /ping | Ping the server



## PingGet

> PingGet200Response PingGet(ctx).Execute()

Ping the server

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DefaultAPI.PingGet(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DefaultAPI.PingGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `PingGet`: PingGet200Response
	fmt.Fprintf(os.Stdout, "Response from `DefaultAPI.PingGet`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiPingGetRequest struct via the builder pattern


### Return type

[**PingGet200Response**](PingGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

