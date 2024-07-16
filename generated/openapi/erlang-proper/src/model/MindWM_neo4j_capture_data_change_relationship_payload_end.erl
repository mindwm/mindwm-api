-module(MindWM_neo4j_capture_data_change_relationship_payload_end).

-include("MindWM.hrl").

-export([MindWM_neo4j_capture_data_change_relationship_payload_end/0]).

-export([MindWM_neo4j_capture_data_change_relationship_payload_end/1]).

-export_type([MindWM_neo4j_capture_data_change_relationship_payload_end/0]).

-type MindWM_neo4j_capture_data_change_relationship_payload_end() ::
  [ {'id', binary() }
  | {'ids', map() }
  | {'labels', list(binary()) }
  ].


MindWM_neo4j_capture_data_change_relationship_payload_end() ->
    MindWM_neo4j_capture_data_change_relationship_payload_end([]).

MindWM_neo4j_capture_data_change_relationship_payload_end(Fields) ->
  Default = [ {'id', binary() }
            , {'ids', map() }
            , {'labels', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

