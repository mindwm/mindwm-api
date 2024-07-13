-module(MindwWM_neo4j_capture_data_change_node_payload_after).

-include("MindwWM.hrl").

-export([MindwWM_neo4j_capture_data_change_node_payload_after/0]).

-export([MindwWM_neo4j_capture_data_change_node_payload_after/1]).

-export_type([MindwWM_neo4j_capture_data_change_node_payload_after/0]).

-type MindwWM_neo4j_capture_data_change_node_payload_after() ::
  [ {'labels', list(binary()) }
  | {'properties', map() }
  ].


MindwWM_neo4j_capture_data_change_node_payload_after() ->
    MindwWM_neo4j_capture_data_change_node_payload_after([]).

MindwWM_neo4j_capture_data_change_node_payload_after(Fields) ->
  Default = [ {'labels', list(binary()) }
            , {'properties', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

