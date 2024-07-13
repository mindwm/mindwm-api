-module(MindwWM_neo4j_capture_data_change_payload).

-include("MindwWM.hrl").

-export([MindwWM_neo4j_capture_data_change_payload/0]).

-export([MindwWM_neo4j_capture_data_change_payload/1]).

-export_type([MindwWM_neo4j_capture_data_change_payload/0]).

-type MindwWM_neo4j_capture_data_change_payload() ::
  [ {'After_', map() }
  | {'before', binary() }
  | {'id', binary() }
  | {'type', binary() }
  | {'End_', MindwWM_neo4j_capture_data_change_relationship_payload_end:MindwWM_neo4j_capture_data_change_relationship_payload_end() }
  | {'label', binary() }
  | {'start', MindwWM_neo4j_capture_data_change_relationship_payload_end:MindwWM_neo4j_capture_data_change_relationship_payload_end() }
  ].


MindwWM_neo4j_capture_data_change_payload() ->
    MindwWM_neo4j_capture_data_change_payload([]).

MindwWM_neo4j_capture_data_change_payload(Fields) ->
  Default = [ {'after', map() }
            , {'before', binary() }
            , {'id', binary() }
            , {'type', binary() }
            , {'end', MindwWM_neo4j_capture_data_change_relationship_payload_end:MindwWM_neo4j_capture_data_change_relationship_payload_end() }
            , {'label', binary() }
            , {'start', MindwWM_neo4j_capture_data_change_relationship_payload_end:MindwWM_neo4j_capture_data_change_relationship_payload_end() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

