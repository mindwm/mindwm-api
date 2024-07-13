--[[
  Mindwm API

  This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

  The version of the OpenAPI document: 0.1.0
  
  Generated by: https://openapi-generator.tech
]]

-- graph_node class
local graph_node = {}
local graph_node_mt = {
	__name = "graph_node";
	__index = graph_node;
}

local function cast_graph_node(t)
	return setmetatable(t, graph_node_mt)
end

local function new_graph_node(id, source, specversion, type, datacontenttype, dataschema, subject, time, data, data_base64)
	return cast_graph_node({
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
	cast = cast_graph_node;
	new = new_graph_node;
}
