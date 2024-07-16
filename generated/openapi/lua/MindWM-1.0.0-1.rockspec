package = "MindWM"
version = "1.0.0-1"
source = {
	url = "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
}

description = {
	summary = "API client generated by OpenAPI Generator",
	detailed = [[
This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads]],
	homepage = "https://openapi-generator.tech",
	license = "Unlicense",
	maintainer = "OpenAPI Generator contributors",
}

dependencies = {
	"lua >= 5.2",
	"http",
	"dkjson",
	"basexx"
}

build = {
	type = "builtin",
	modules = {
		["MindWM.model.clipboard"] = "MindWM/model/clipboard.lua";
		["MindWM.model.clipboard_payload"] = "MindWM/model/clipboard_payload.lua";
		["MindWM.model.clipboard_payload_context"] = "MindWM/model/clipboard_payload_context.lua";
		["MindWM.model.cloud_event"] = "MindWM/model/cloud_event.lua";
		["MindWM.model.cloud_event_data"] = "MindWM/model/cloud_event_data.lua";
		["MindWM.model.graph_node"] = "MindWM/model/graph_node.lua";
		["MindWM.model.graph_node_all_of_data"] = "MindWM/model/graph_node_all_of_data.lua";
		["MindWM.model.graph_relationship"] = "MindWM/model/graph_relationship.lua";
		["MindWM.model.graph_relationship_all_of_data"] = "MindWM/model/graph_relationship_all_of_data.lua";
		["MindWM.model.io_document"] = "MindWM/model/io_document.lua";
		["MindWM.model.neo4j_capture_data_change"] = "MindWM/model/neo4j_capture_data_change.lua";
		["MindWM.model.neo4j_capture_data_change_meta"] = "MindWM/model/neo4j_capture_data_change_meta.lua";
		["MindWM.model.neo4j_capture_data_change_meta_source"] = "MindWM/model/neo4j_capture_data_change_meta_source.lua";
		["MindWM.model.neo4j_capture_data_change_node_payload"] = "MindWM/model/neo4j_capture_data_change_node_payload.lua";
		["MindWM.model.neo4j_capture_data_change_node_payload_after"] = "MindWM/model/neo4j_capture_data_change_node_payload_after.lua";
		["MindWM.model.neo4j_capture_data_change_payload"] = "MindWM/model/neo4j_capture_data_change_payload.lua";
		["MindWM.model.neo4j_capture_data_change_relationship_payload"] = "MindWM/model/neo4j_capture_data_change_relationship_payload.lua";
		["MindWM.model.neo4j_capture_data_change_relationship_payload_end"] = "MindWM/model/neo4j_capture_data_change_relationship_payload_end.lua";
		["MindWM.model.neo4j_capture_data_change_schema"] = "MindWM/model/neo4j_capture_data_change_schema.lua";
		["MindWM.model.tmux_pane_io_document"] = "MindWM/model/tmux_pane_io_document.lua";
	}
}
