-module(MindwWM_neo4j_capture_data_change_node_payload_after).

-export([encode/1]).

-export_type([MindwWM_neo4j_capture_data_change_node_payload_after/0]).

-type MindwWM_neo4j_capture_data_change_node_payload_after() ::
    #{ 'labels' := list(),
       'properties' := maps:map()
     }.

encode(#{ 'labels' := Labels,
          'properties' := Properties
        }) ->
    #{ 'labels' => Labels,
       'properties' => Properties
     }.
