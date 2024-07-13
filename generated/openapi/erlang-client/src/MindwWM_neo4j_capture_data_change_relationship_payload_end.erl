-module(MindwWM_neo4j_capture_data_change_relationship_payload_end).

-export([encode/1]).

-export_type([MindwWM_neo4j_capture_data_change_relationship_payload_end/0]).

-type MindwWM_neo4j_capture_data_change_relationship_payload_end() ::
    #{ 'id' := binary(),
       'ids' := maps:map(),
       'labels' := list()
     }.

encode(#{ 'id' := Id,
          'ids' := Ids,
          'labels' := Labels
        }) ->
    #{ 'id' => Id,
       'ids' => Ids,
       'labels' => Labels
     }.
