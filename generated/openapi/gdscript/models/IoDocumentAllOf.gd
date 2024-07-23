extends Resource
class_name IoDocumentAllOf

# THIS FILE WAS AUTOMATICALLY GENERATED by the OpenAPI Generator project.
# For more information on how to customize templates, see:
# https://openapi-generator.tech
# https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator/src/main/resources/gdscript
# The OpenAPI Generator Community, © Public Domain, 2022

# IoDocumentAllOf Model


# Required: False
# isArray: false
@export var type: String = "IoDocument":
	set(value):
		__type__was__set = true
		type = value
var __type__was__set := false

# Required: False
# isArray: false
@export var subject: String = "IoDocument":
	set(value):
		__subject__was__set = true
		subject = value
var __subject__was__set := false

# Required: False
# isArray: false
@export var source: String = "":
	set(value):
		__source__was__set = true
		source = value
var __source__was__set := false


func bzz_collect_missing_properties() -> Array:
	var bzz_missing_properties := Array()
	return bzz_missing_properties


func bzz_normalize() -> Dictionary:
	var bzz_dictionary := Dictionary()
	if self.__type__was__set:
		bzz_dictionary["type"] = self.type
	if self.__subject__was__set:
		bzz_dictionary["subject"] = self.subject
	if self.__source__was__set:
		bzz_dictionary["source"] = self.source
	return bzz_dictionary


# Won't work for JSON+LD
static func bzz_denormalize_single(from_dict: Dictionary):
	var me := new()
	if from_dict.has("type"):
		me.type = from_dict["type"]
	if from_dict.has("subject"):
		me.subject = from_dict["subject"]
	if from_dict.has("source"):
		me.source = from_dict["source"]
	return me


# Won't work for JSON+LD
static func bzz_denormalize_multiple(from_array: Array):
	var mes := Array()
	for element in from_array:
		if element is Array:
			mes.append(bzz_denormalize_multiple(element))
		elif element is Dictionary:
			# TODO: perhaps check first if it looks like a match or an intermediate container
			mes.append(bzz_denormalize_single(element))
		else:
			mes.append(element)
	return mes

