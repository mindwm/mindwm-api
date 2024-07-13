-module(MindwWM_graph_relationship_all_of_data).

-include("MindwWM.hrl").

-export([MindwWM_graph_relationship_all_of_data/0]).

-export([MindwWM_graph_relationship_all_of_data/1]).

-export_type([MindwWM_graph_relationship_all_of_data/0]).

-type MindwWM_graph_relationship_all_of_data() ::
  [ {'headers', map() }
  | {'message_key', binary() }
  | {'meta', MindwWM_neo4j_capture_data_change_meta:MindwWM_neo4j_capture_data_change_meta() }
  | {'offset', integer() }
  | {'partition', integer() }
  | {'source_type', binary() }
  | {'timestamp', datetime() }
  | {'topic', binary() }
  | {'schema', MindwWM_neo4j_capture_data_change_schema:MindwWM_neo4j_capture_data_change_schema() }
  | {'payload', MindwWM_neo4j_capture_data_change_relationship_payload:MindwWM_neo4j_capture_data_change_relationship_payload() }
  ].


MindwWM_graph_relationship_all_of_data() ->
    MindwWM_graph_relationship_all_of_data([]).

MindwWM_graph_relationship_all_of_data(Fields) ->
  Default = [ {'headers', map() }
            , {'message_key', binary() }
            , {'meta', MindwWM_neo4j_capture_data_change_meta:MindwWM_neo4j_capture_data_change_meta() }
            , {'offset', integer() }
            , {'partition', integer() }
            , {'source_type', binary() }
            , {'timestamp', datetime() }
            , {'topic', binary() }
            , {'schema', MindwWM_neo4j_capture_data_change_schema:MindwWM_neo4j_capture_data_change_schema() }
            , {'payload', MindwWM_neo4j_capture_data_change_relationship_payload:MindwWM_neo4j_capture_data_change_relationship_payload() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

