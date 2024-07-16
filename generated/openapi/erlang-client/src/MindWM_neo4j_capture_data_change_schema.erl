-module(MindWM_neo4j_capture_data_change_schema).

-export([encode/1]).

-export_type([MindWM_neo4j_capture_data_change_schema/0]).

-type MindWM_neo4j_capture_data_change_schema() ::
    #{ 'constraints' => maps:map(),
       'properties' => maps:map()
     }.

encode(#{ 'constraints' := Constraints,
          'properties' := Properties
        }) ->
    #{ 'constraints' => Constraints,
       'properties' => Properties
     }.
