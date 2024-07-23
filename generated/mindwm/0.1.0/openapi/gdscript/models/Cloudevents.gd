extends Resource
class_name Cloudevents

# THIS FILE WAS AUTOMATICALLY GENERATED by the OpenAPI Generator project.
# For more information on how to customize templates, see:
# https://openapi-generator.tech
# https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator/src/main/resources/gdscript
# The OpenAPI Generator Community, © Public Domain, 2022

# Cloudevents Model
# CloudEvents Specification JSON Schema


# Required: True
# isArray: false
@export var id: String = "":
	set(value):
		__id__was__set = true
		id = value
var __id__was__set := false

# Required: True
# isArray: false
@export var source: String = "":
	set(value):
		__source__was__set = true
		source = value
var __source__was__set := false

# Required: True
# isArray: false
@export var specversion: String = "":
	set(value):
		__specversion__was__set = true
		specversion = value
var __specversion__was__set := false

# Required: True
# isArray: false
@export var type: String = "":
	set(value):
		__type__was__set = true
		type = value
var __type__was__set := false

# Required: False
# isArray: false
@export var datacontenttype: String = "":
	set(value):
		__datacontenttype__was__set = true
		datacontenttype = value
var __datacontenttype__was__set := false

# Required: False
# isArray: false
@export var dataschema: URI = "":
	set(value):
		__dataschema__was__set = true
		dataschema = value
var __dataschema__was__set := false

# Required: False
# isArray: false
@export var subject: String = "":
	set(value):
		__subject__was__set = true
		subject = value
var __subject__was__set := false

#       (but it's actually a DateTime ; no timezones support in Gdscript)
# Required: False
# isArray: false
@export var time: String:
	set(value):
		__time__was__set = true
		time = value
var __time__was__set := false

# Required: False
# isArray: false
@export var data: Object:
	set(value):
		__data__was__set = true
		data = value
var __data__was__set := false

# Required: False
# isArray: false
@export var dataUnderscorebase64: String = "":
	set(value):
		__dataUnderscorebase64__was__set = true
		dataUnderscorebase64 = value
var __dataUnderscorebase64__was__set := false


func bzz_collect_missing_properties() -> Array:
	var bzz_missing_properties := Array()
	if not self.__id__was__set:
		bzz_missing_properties.append("id")
	if not self.__source__was__set:
		bzz_missing_properties.append("source")
	if not self.__specversion__was__set:
		bzz_missing_properties.append("specversion")
	if not self.__type__was__set:
		bzz_missing_properties.append("type")
	return bzz_missing_properties


func bzz_normalize() -> Dictionary:
	var bzz_dictionary := Dictionary()
	if self.__id__was__set:
		bzz_dictionary["id"] = self.id
	if self.__source__was__set:
		bzz_dictionary["source"] = self.source
	if self.__specversion__was__set:
		bzz_dictionary["specversion"] = self.specversion
	if self.__type__was__set:
		bzz_dictionary["type"] = self.type
	if self.__datacontenttype__was__set:
		bzz_dictionary["datacontenttype"] = self.datacontenttype
	if self.__dataschema__was__set:
		bzz_dictionary["dataschema"] = self.dataschema
	if self.__subject__was__set:
		bzz_dictionary["subject"] = self.subject
	if self.__time__was__set:
		bzz_dictionary["time"] = self.time
	if self.__data__was__set:
		bzz_dictionary["data"] = self.data
	if self.__dataUnderscorebase64__was__set:
		bzz_dictionary["dataUnderscorebase64"] = self.dataUnderscorebase64
	return bzz_dictionary


# Won't work for JSON+LD
static func bzz_denormalize_single(from_dict: Dictionary):
	var me := new()
	if from_dict.has("id"):
		me.id = from_dict["id"]
	if from_dict.has("source"):
		me.source = from_dict["source"]
	if from_dict.has("specversion"):
		me.specversion = from_dict["specversion"]
	if from_dict.has("type"):
		me.type = from_dict["type"]
	if from_dict.has("datacontenttype"):
		me.datacontenttype = from_dict["datacontenttype"]
	if from_dict.has("dataschema"):
		me.dataschema = from_dict["dataschema"]
	if from_dict.has("subject"):
		me.subject = from_dict["subject"]
	if from_dict.has("time"):
		me.time = from_dict["time"]
	if from_dict.has("data"):
		me.data = from_dict["data"]
	if from_dict.has("dataUnderscorebase64"):
		me.dataUnderscorebase64 = from_dict["dataUnderscorebase64"]
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

