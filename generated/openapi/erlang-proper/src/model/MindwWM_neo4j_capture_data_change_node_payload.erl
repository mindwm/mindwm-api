-module(MindwWM_neo4j_capture_data_change_node_payload).

-include("MindwWM.hrl").

-export([MindwWM_neo4j_capture_data_change_node_payload/0]).

-export([MindwWM_neo4j_capture_data_change_node_payload/1]).

-export_type([MindwWM_neo4j_capture_data_change_node_payload/0]).

-type MindwWM_neo4j_capture_data_change_node_payload() ::
  [ {'After_', MindwWM_neo4j_capture_data_change_node_payload_after:MindwWM_neo4j_capture_data_change_node_payload_after() }
  | {'before', binary() }
  | {'id', binary() }
  | {'type', binary() }
  ].


MindwWM_neo4j_capture_data_change_node_payload() ->
    MindwWM_neo4j_capture_data_change_node_payload([]).

MindwWM_neo4j_capture_data_change_node_payload(Fields) ->
  Default = [ {'after', MindwWM_neo4j_capture_data_change_node_payload_after:MindwWM_neo4j_capture_data_change_node_payload_after() }
            , {'before', binary() }
            , {'id', binary() }
            , {'type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

