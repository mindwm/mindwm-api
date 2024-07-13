--[[
  Mindwm API

  This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

  The version of the OpenAPI document: 0.1.0
  
  Generated by: https://openapi-generator.tech
]]

-- graph_relationship class
local graph_relationship = {}
local graph_relationship_mt = {
	__name = "graph_relationship";
	__index = graph_relationship;
}

local function cast_graph_relationship(t)
	return setmetatable(t, graph_relationship_mt)
end

local function new_graph_relationship(id, source, specversion, type, datacontenttype, dataschema, subject, time, data, data_base64)
	return cast_graph_relationship({
		["id"] = id;
		["source"] = source;
		["specversion"] = specversion;
		["type"] = type;
		["datacontenttype"] = datacontenttype;
		["dataschema"] = dataschema;
		["subject"] = subject;
		["time"] = time;
		["data"] = data;
		["data_base64"] = data_base64;
	})
end

return {
	cast = cast_graph_relationship;
	new = new_graph_relationship;
}
