-module(MindwWM_neo4j_capture_data_change_meta_source).

-export([encode/1]).

-export_type([MindwWM_neo4j_capture_data_change_meta_source/0]).

-type MindwWM_neo4j_capture_data_change_meta_source() ::
    #{ 'hostname' := binary()
     }.

encode(#{ 'hostname' := Hostname
        }) ->
    #{ 'hostname' => Hostname
     }.
