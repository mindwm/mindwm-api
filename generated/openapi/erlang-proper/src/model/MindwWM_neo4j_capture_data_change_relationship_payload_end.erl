-module(MindwWM_neo4j_capture_data_change_relationship_payload_end).

-include("MindwWM.hrl").

-export([MindwWM_neo4j_capture_data_change_relationship_payload_end/0]).

-export([MindwWM_neo4j_capture_data_change_relationship_payload_end/1]).

-export_type([MindwWM_neo4j_capture_data_change_relationship_payload_end/0]).

-type MindwWM_neo4j_capture_data_change_relationship_payload_end() ::
  [ {'id', binary() }
  | {'ids', map() }
  | {'labels', list(binary()) }
  ].


MindwWM_neo4j_capture_data_change_relationship_payload_end() ->
    MindwWM_neo4j_capture_data_change_relationship_payload_end([]).

MindwWM_neo4j_capture_data_change_relationship_payload_end(Fields) ->
  Default = [ {'id', binary() }
            , {'ids', map() }
            , {'labels', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

