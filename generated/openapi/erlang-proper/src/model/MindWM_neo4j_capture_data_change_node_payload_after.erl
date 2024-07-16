-module(MindWM_neo4j_capture_data_change_node_payload_after).

-include("MindWM.hrl").

-export([MindWM_neo4j_capture_data_change_node_payload_after/0]).

-export([MindWM_neo4j_capture_data_change_node_payload_after/1]).

-export_type([MindWM_neo4j_capture_data_change_node_payload_after/0]).

-type MindWM_neo4j_capture_data_change_node_payload_after() ::
  [ {'labels', list(binary()) }
  | {'properties', map() }
  ].


MindWM_neo4j_capture_data_change_node_payload_after() ->
    MindWM_neo4j_capture_data_change_node_payload_after([]).

MindWM_neo4j_capture_data_change_node_payload_after(Fields) ->
  Default = [ {'labels', list(binary()) }
            , {'properties', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

