--[[
  Mindwm API

  This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

  The version of the OpenAPI document: 0.1.0
  
  Generated by: https://openapi-generator.tech
]]

-- neo4j_capture_data_change_meta_source class
local neo4j_capture_data_change_meta_source = {}
local neo4j_capture_data_change_meta_source_mt = {
	__name = "neo4j_capture_data_change_meta_source";
	__index = neo4j_capture_data_change_meta_source;
}

local function cast_neo4j_capture_data_change_meta_source(t)
	return setmetatable(t, neo4j_capture_data_change_meta_source_mt)
end

local function new_neo4j_capture_data_change_meta_source(hostname)
	return cast_neo4j_capture_data_change_meta_source({
		["hostname"] = hostname;
	})
end

return {
	cast = cast_neo4j_capture_data_change_meta_source;
	new = new_neo4j_capture_data_change_meta_source;
}
