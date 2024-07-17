--[[
  Mindwm API

  This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

  The version of the OpenAPI document: 0.1.0
  
  Generated by: https://openapi-generator.tech
]]

-- clipboard_payload_context class
local clipboard_payload_context = {}
local clipboard_payload_context_mt = {
	__name = "clipboard_payload_context";
	__index = clipboard_payload_context;
}

local function cast_clipboard_payload_context(t)
	return setmetatable(t, clipboard_payload_context_mt)
end

local function new_clipboard_payload_context(window)
	return cast_clipboard_payload_context({
		["window"] = window;
	})
end

return {
	cast = cast_clipboard_payload_context;
	new = new_clipboard_payload_context;
}