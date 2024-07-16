-module(MindWM_neo4j_capture_data_change_payload).

-include("MindWM.hrl").

-export([MindWM_neo4j_capture_data_change_payload/0]).

-export([MindWM_neo4j_capture_data_change_payload/1]).

-export_type([MindWM_neo4j_capture_data_change_payload/0]).

-type MindWM_neo4j_capture_data_change_payload() ::
  [ {'After_', map() }
  | {'before', binary() }
  | {'id', binary() }
  | {'type', binary() }
  | {'End_', MindWM_neo4j_capture_data_change_relationship_payload_end:MindWM_neo4j_capture_data_change_relationship_payload_end() }
  | {'label', binary() }
  | {'start', MindWM_neo4j_capture_data_change_relationship_payload_end:MindWM_neo4j_capture_data_change_relationship_payload_end() }
  ].


MindWM_neo4j_capture_data_change_payload() ->
    MindWM_neo4j_capture_data_change_payload([]).

MindWM_neo4j_capture_data_change_payload(Fields) ->
  Default = [ {'after', map() }
            , {'before', binary() }
            , {'id', binary() }
            , {'type', binary() }
            , {'end', MindWM_neo4j_capture_data_change_relationship_payload_end:MindWM_neo4j_capture_data_change_relationship_payload_end() }
            , {'label', binary() }
            , {'start', MindWM_neo4j_capture_data_change_relationship_payload_end:MindWM_neo4j_capture_data_change_relationship_payload_end() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

