-module(MindWM_neo4j_capture_data_change_meta_source).

-export([encode/1]).

-export_type([MindWM_neo4j_capture_data_change_meta_source/0]).

-type MindWM_neo4j_capture_data_change_meta_source() ::
    #{ 'hostname' := binary()
     }.

encode(#{ 'hostname' := Hostname
        }) ->
    #{ 'hostname' => Hostname
     }.
