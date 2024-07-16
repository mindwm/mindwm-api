-module(MindWM_neo4j_capture_data_change_relationship_payload).

-include("MindWM.hrl").

-export([MindWM_neo4j_capture_data_change_relationship_payload/0]).

-export([MindWM_neo4j_capture_data_change_relationship_payload/1]).

-export_type([MindWM_neo4j_capture_data_change_relationship_payload/0]).

-type MindWM_neo4j_capture_data_change_relationship_payload() ::
  [ {'After_', map() }
  | {'before', binary() }
  | {'End_', MindWM_neo4j_capture_data_change_relationship_payload_end:MindWM_neo4j_capture_data_change_relationship_payload_end() }
  | {'id', binary() }
  | {'label', binary() }
  | {'start', MindWM_neo4j_capture_data_change_relationship_payload_end:MindWM_neo4j_capture_data_change_relationship_payload_end() }
  | {'type', binary() }
  ].


MindWM_neo4j_capture_data_change_relationship_payload() ->
    MindWM_neo4j_capture_data_change_relationship_payload([]).

MindWM_neo4j_capture_data_change_relationship_payload(Fields) ->
  Default = [ {'after', map() }
            , {'before', binary() }
            , {'end', MindWM_neo4j_capture_data_change_relationship_payload_end:MindWM_neo4j_capture_data_change_relationship_payload_end() }
            , {'id', binary() }
            , {'label', binary() }
            , {'start', MindWM_neo4j_capture_data_change_relationship_payload_end:MindWM_neo4j_capture_data_change_relationship_payload_end() }
            , {'type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

