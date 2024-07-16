-module(MindWM_neo4j_capture_data_change_node_payload).

-export([encode/1]).

-export_type([MindWM_neo4j_capture_data_change_node_payload/0]).

-type MindWM_neo4j_capture_data_change_node_payload() ::
    #{ 'After_' := MindWM_neo4j_capture_data_change_node_payload_after:MindWM_neo4j_capture_data_change_node_payload_after(),
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
