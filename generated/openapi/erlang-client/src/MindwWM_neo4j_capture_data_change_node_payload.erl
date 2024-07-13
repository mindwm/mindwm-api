-module(MindwWM_neo4j_capture_data_change_node_payload).

-export([encode/1]).

-export_type([MindwWM_neo4j_capture_data_change_node_payload/0]).

-type MindwWM_neo4j_capture_data_change_node_payload() ::
    #{ 'After_' := MindwWM_neo4j_capture_data_change_node_payload_after:MindwWM_neo4j_capture_data_change_node_payload_after(),
       'before' := binary(),
       'id' := binary(),
       'type' := binary()
     }.

encode(#{ 'After_' := After,
          'before' := Before,
          'id' := Id,
          'type' := Type
        }) ->
    #{ 'after' => After,
       'before' => Before,
       'id' => Id,
       'type' => Type
     }.
