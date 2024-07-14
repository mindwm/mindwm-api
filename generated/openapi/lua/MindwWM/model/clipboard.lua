--[[
  Mindwm API

  This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

  The version of the OpenAPI document: 0.1.0
  
  Generated by: https://openapi-generator.tech
]]

-- clipboard class
local clipboard = {}
local clipboard_mt = {
	__name = "clipboard";
	__index = clipboard;
}

local function cast_clipboard(t)
	return setmetatable(t, clipboard_mt)
end

local function new_clipboard(type, source, data, id, specversion, datacontenttype, dataschema, subject, time, data_base64)
	return cast_clipboard({
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
	cast = cast_clipboard;
	new = new_clipboard;
}