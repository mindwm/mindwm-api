-module(MindwWM_neo4j_capture_data_change_payload).

-export([encode/1]).

-export_type([MindwWM_neo4j_capture_data_change_payload/0]).

-type MindwWM_neo4j_capture_data_change_payload() ::
    #{ 'After_' := maps:map(),
       'before' := binary(),
       'id' := binary(),
       'type' := binary(),
       'End_' := MindwWM_neo4j_capture_data_change_relationship_payload_end:MindwWM_neo4j_capture_data_change_relationship_payload_end(),
       'label' := binary(),
       'start' := MindwWM_neo4j_capture_data_change_relationship_payload_end:MindwWM_neo4j_capture_data_change_relationship_payload_end()
     }.

encode(#{ 'After_' := After,
          'before' := Before,
          'id' := Id,
          'type' := Type,
          'End_' := End,
          'label' := Label,
          'start' := Start
        }) ->
    #{ 'after' => After,
       'before' => Before,
       'id' => Id,
       'type' => Type,
       'end' => End,
       'label' => Label,
       'start' => Start
     }.
