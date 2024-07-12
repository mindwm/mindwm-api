<a name="__pageTop"></a>
# DefaultApi   { #DefaultApi }


All URIs are relative to *https://mindwmw.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ping_get**](#ping_get) | **GET** `/ping` | Ping the server

# **ping_get**   { #ping_get }
<a name="ping_get"></a>

> `ping_get( on_success: Callable, on_failure: Callable)`

Ping the server



### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.ping_get(
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "ping_get", response)
		assert(response.data is _ping_get_200_response)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```


### Authorization

No authorization required.

[[Back to top]](#__pageTop) \
[[Back to API list]](../README.md#documentation-for-api-endpoints) \
[[Back to Model list]](../README.md#documentation-for-models) \
[[Back to README]](../README.md) \

