-module(MindwWM_neo4j_capture_data_change).

-include("MindwWM.hrl").

-export([MindwWM_neo4j_capture_data_change/0]).

-export([MindwWM_neo4j_capture_data_change/1]).

-export_type([MindwWM_neo4j_capture_data_change/0]).

-type MindwWM_neo4j_capture_data_change() ::
  [ {'headers', map() }
  | {'message_key', binary() }
  | {'meta', MindwWM_neo4j_capture_data_change_meta:MindwWM_neo4j_capture_data_change_meta() }
  | {'offset', integer() }
  | {'partition', integer() }
  | {'source_type', binary() }
  | {'timestamp', datetime() }
  | {'topic', binary() }
  | {'schema', MindwWM_neo4j_capture_data_change_schema:MindwWM_neo4j_capture_data_change_schema() }
  | {'payload', MindwWM_neo4j_capture_data_change_payload:MindwWM_neo4j_capture_data_change_payload() }
  ].


MindwWM_neo4j_capture_data_change() ->
    MindwWM_neo4j_capture_data_change([]).

MindwWM_neo4j_capture_data_change(Fields) ->
  Default = [ {'headers', map() }
            , {'message_key', binary() }
            , {'meta', MindwWM_neo4j_capture_data_change_meta:MindwWM_neo4j_capture_data_change_meta() }
            , {'offset', integer() }
            , {'partition', integer() }
            , {'source_type', binary() }
            , {'timestamp', datetime() }
            , {'topic', binary() }
            , {'schema', MindwWM_neo4j_capture_data_change_schema:MindwWM_neo4j_capture_data_change_schema() }
            , {'payload', MindwWM_neo4j_capture_data_change_payload:MindwWM_neo4j_capture_data_change_payload() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

