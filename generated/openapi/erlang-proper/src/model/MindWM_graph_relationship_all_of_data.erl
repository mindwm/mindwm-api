-module(MindWM_graph_relationship_all_of_data).

-include("MindWM.hrl").

-export([MindWM_graph_relationship_all_of_data/0]).

-export([MindWM_graph_relationship_all_of_data/1]).

-export_type([MindWM_graph_relationship_all_of_data/0]).

-type MindWM_graph_relationship_all_of_data() ::
  [ {'headers', map() }
  | {'message_key', binary() }
  | {'meta', MindWM_neo4j_capture_data_change_meta:MindWM_neo4j_capture_data_change_meta() }
  | {'offset', integer() }
  | {'partition', integer() }
  | {'source_type', binary() }
  | {'timestamp', datetime() }
  | {'topic', binary() }
  | {'schema', MindWM_neo4j_capture_data_change_schema:MindWM_neo4j_capture_data_change_schema() }
  | {'payload', MindWM_neo4j_capture_data_change_relationship_payload:MindWM_neo4j_capture_data_change_relationship_payload() }
  ].


MindWM_graph_relationship_all_of_data() ->
    MindWM_graph_relationship_all_of_data([]).

MindWM_graph_relationship_all_of_data(Fields) ->
  Default = [ {'headers', map() }
            , {'message_key', binary() }
            , {'meta', MindWM_neo4j_capture_data_change_meta:MindWM_neo4j_capture_data_change_meta() }
            , {'offset', integer() }
            , {'partition', integer() }
            , {'source_type', binary() }
            , {'timestamp', datetime() }
            , {'topic', binary() }
            , {'schema', MindWM_neo4j_capture_data_change_schema:MindWM_neo4j_capture_data_change_schema() }
            , {'payload', MindWM_neo4j_capture_data_change_relationship_payload:MindWM_neo4j_capture_data_change_relationship_payload() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

