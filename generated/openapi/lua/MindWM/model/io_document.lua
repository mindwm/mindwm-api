--[[
  Mindwm API

  This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

  The version of the OpenAPI document: 0.1.0
  
  Generated by: https://openapi-generator.tech
]]

-- io_document class
local io_document = {}
local io_document_mt = {
	__name = "io_document";
	__index = io_document;
}

local function cast_io_document(t)
	return setmetatable(t, io_document_mt)
end

local function new_io_document(type, source, data, id, specversion, datacontenttype, dataschema, subject, time, data_base64)
	return cast_io_document({
		["type"] = type;
		["source"] = source;
		["data"] = data;
		["id"] = id;
		["specversion"] = specversion;
		["datacontenttype"] = datacontenttype;
		["dataschema"] = dataschema;
		["subject"] = subject;
		["time"] = time;
		["data_base64"] = data_base64;
	})
end

return {
	cast = cast_io_document;
	new = new_io_document;
}