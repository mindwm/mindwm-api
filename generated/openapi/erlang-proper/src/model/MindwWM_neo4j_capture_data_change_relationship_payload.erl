-module(MindwWM_neo4j_capture_data_change_relationship_payload).

-include("MindwWM.hrl").

-export([MindwWM_neo4j_capture_data_change_relationship_payload/0]).

-export([MindwWM_neo4j_capture_data_change_relationship_payload/1]).

-export_type([MindwWM_neo4j_capture_data_change_relationship_payload/0]).

-type MindwWM_neo4j_capture_data_change_relationship_payload() ::
  [ {'After_', map() }
  | {'before', binary() }
  | {'End_', MindwWM_neo4j_capture_data_change_relationship_payload_end:MindwWM_neo4j_capture_data_change_relationship_payload_end() }
  | {'id', binary() }
  | {'label', binary() }
  | {'start', MindwWM_neo4j_capture_data_change_relationship_payload_end:MindwWM_neo4j_capture_data_change_relationship_payload_end() }
  | {'type', binary() }
  ].


MindwWM_neo4j_capture_data_change_relationship_payload() ->
    MindwWM_neo4j_capture_data_change_relationship_payload([]).

MindwWM_neo4j_capture_data_change_relationship_payload(Fields) ->
  Default = [ {'after', map() }
            , {'before', binary() }
            , {'end', MindwWM_neo4j_capture_data_change_relationship_payload_end:MindwWM_neo4j_capture_data_change_relationship_payload_end() }
            , {'id', binary() }
            , {'label', binary() }
            , {'start', MindwWM_neo4j_capture_data_change_relationship_payload_end:MindwWM_neo4j_capture_data_change_relationship_payload_end() }
            , {'type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

