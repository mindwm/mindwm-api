-module(MindWM_neo4j_capture_data_change_relationship_payload).

-export([encode/1]).

-export_type([MindWM_neo4j_capture_data_change_relationship_payload/0]).

-type MindWM_neo4j_capture_data_change_relationship_payload() ::
    #{ 'After_' := maps:map(),
       'before' := binary(),
       'End_' := MindWM_neo4j_capture_data_change_relationship_payload_end:MindWM_neo4j_capture_data_change_relationship_payload_end(),
       'id' := binary(),
       'label' := binary(),
       'start' := MindWM_neo4j_capture_data_change_relationship_payload_end:MindWM_neo4j_capture_data_change_relationship_payload_end(),
       'type' := binary()
     }.

encode(#{ 'After_' := After,
          'before' := Before,
          'End_' := End,
          'id' := Id,
          'label' := Label,
          'start' := Start,
          'type' := Type
        }) ->
    #{ 'after' => After,
       'before' => Before,
       'end' => End,
       'id' => Id,
       'label' => Label,
       'start' => Start,
       'type' => Type
     }.
