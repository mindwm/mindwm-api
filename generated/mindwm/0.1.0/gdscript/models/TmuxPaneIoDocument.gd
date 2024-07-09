extends Resource
class_name TmuxPaneIoDocument

# THIS FILE WAS AUTOMATICALLY GENERATED by the OpenAPI Generator project.
# For more information on how to customize templates, see:
# https://openapi-generator.tech
# https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator/src/main/resources/gdscript
# The OpenAPI Generator Community, © Public Domain, 2022

# TmuxPaneIoDocument Model


# User input
# Required: True
# isArray: false
@export var some_input: String = "":
	set(value):
		__some_input__was__set = true
		some_input = value
var __some_input__was__set := false

# Command output (mix of stdout & stderr)
# Required: True
# isArray: false
@export var output: String = "":
	set(value):
		__output__was__set = true
		output = value
var __output__was__set := false

# ps1 (prompt) AFTER the input and output
# Required: True
# isArray: false
@export var ps1: String = "":
	set(value):
		__ps1__was__set = true
		ps1 = value
var __ps1__was__set := false


func bzz_collect_missing_properties() -> Array:
	var bzz_missing_properties := Array()
	if not self.__some_input__was__set:
		bzz_missing_properties.append("some_input")
	if not self.__output__was__set:
		bzz_missing_properties.append("output")
	if not self.__ps1__was__set:
		bzz_missing_properties.append("ps1")
	return bzz_missing_properties


func bzz_normalize() -> Dictionary:
	var bzz_dictionary := Dictionary()
	if self.__some_input__was__set:
		bzz_dictionary["some_input"] = self.some_input
	if self.__output__was__set:
		bzz_dictionary["output"] = self.output
	if self.__ps1__was__set:
		bzz_dictionary["ps1"] = self.ps1
	return bzz_dictionary


# Won't work for JSON+LD
static func bzz_denormalize_single(from_dict: Dictionary):
	var me := new()
	if from_dict.has("some_input"):
		me.some_input = from_dict["some_input"]
	if from_dict.has("output"):
		me.output = from_dict["output"]
	if from_dict.has("ps1"):
		me.ps1 = from_dict["ps1"]
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

