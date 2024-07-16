-module(MindWM_neo4j_capture_data_change).

-include("MindWM.hrl").

-export([MindWM_neo4j_capture_data_change/0]).

-export([MindWM_neo4j_capture_data_change/1]).

-export_type([MindWM_neo4j_capture_data_change/0]).

-type MindWM_neo4j_capture_data_change() ::
  [ {'headers', map() }
  | {'message_key', binary() }
  | {'meta', MindWM_neo4j_capture_data_change_meta:MindWM_neo4j_capture_data_change_meta() }
  | {'offset', integer() }
  | {'partition', integer() }
  | {'source_type', binary() }
  | {'timestamp', datetime() }
  | {'topic', binary() }
  | {'schema', MindWM_neo4j_capture_data_change_schema:MindWM_neo4j_capture_data_change_schema() }
  | {'payload', MindWM_neo4j_capture_data_change_payload:MindWM_neo4j_capture_data_change_payload() }
  ].


MindWM_neo4j_capture_data_change() ->
    MindWM_neo4j_capture_data_change([]).

MindWM_neo4j_capture_data_change(Fields) ->
  Default = [ {'headers', map() }
            , {'message_key', binary() }
            , {'meta', MindWM_neo4j_capture_data_change_meta:MindWM_neo4j_capture_data_change_meta() }
            , {'offset', integer() }
            , {'partition', integer() }
            , {'source_type', binary() }
            , {'timestamp', datetime() }
            , {'topic', binary() }
            , {'schema', MindWM_neo4j_capture_data_change_schema:MindWM_neo4j_capture_data_change_schema() }
            , {'payload', MindWM_neo4j_capture_data_change_payload:MindWM_neo4j_capture_data_change_payload() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

