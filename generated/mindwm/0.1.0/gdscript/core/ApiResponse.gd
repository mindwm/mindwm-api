extends Resource
class_name ApiResponse

# THIS FILE WAS AUTOMATICALLY GENERATED by the OpenAPI Generator project.
# For more information on how to customize templates, see:
# https://openapi-generator.tech
# https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator/src/main/resources/gdscript
# The OpenAPI Generator Community, © Public Domain, 2022

# Response wrapper provided to success callbacks
# ==============================================
#
# Holds the response metadata, its body, and the deserialized model(s), if any.
# This object is directly passed to the success callback, and in case of failure
# is injected in the error object.
#

# Headers sent back by the server
@export var headers := Dictionary()

# The HTTP response code, if any.  A constant like HTTPClient.RESPONSE_XXXX
@export var code := 0

# Raw body of this response, in String form (before deserialization)
@export var body := ""

# Deserialized body (may be pretty much any type)
var data


func _to_string() -> String:
	var s := "ApiResponse"
	if code:
		s += " %d" % code
	if body:
		s += " %s" % body
	return s
