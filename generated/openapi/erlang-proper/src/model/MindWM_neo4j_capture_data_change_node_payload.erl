-module(MindWM_neo4j_capture_data_change_node_payload).

-include("MindWM.hrl").

-export([MindWM_neo4j_capture_data_change_node_payload/0]).

-export([MindWM_neo4j_capture_data_change_node_payload/1]).

-export_type([MindWM_neo4j_capture_data_change_node_payload/0]).

-type MindWM_neo4j_capture_data_change_node_payload() ::
  [ {'After_', MindWM_neo4j_capture_data_change_node_payload_after:MindWM_neo4j_capture_data_change_node_payload_after() }
  | {'before', binary() }
  | {'id', binary() }
  | {'type', binary() }
  ].


MindWM_neo4j_capture_data_change_node_payload() ->
    MindWM_neo4j_capture_data_change_node_payload([]).

MindWM_neo4j_capture_data_change_node_payload(Fields) ->
  Default = [ {'after', MindWM_neo4j_capture_data_change_node_payload_after:MindWM_neo4j_capture_data_change_node_payload_after() }
            , {'before', binary() }
            , {'id', binary() }
            , {'type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

