-module(MindwWM_neo4j_capture_data_change_meta).

-include("MindwWM.hrl").

-export([MindwWM_neo4j_capture_data_change_meta/0]).

-export([MindwWM_neo4j_capture_data_change_meta/1]).

-export_type([MindwWM_neo4j_capture_data_change_meta/0]).

-type MindwWM_neo4j_capture_data_change_meta() ::
  [ {'operation', binary() }
  | {'source', MindwWM_neo4j_capture_data_change_meta_source:MindwWM_neo4j_capture_data_change_meta_source() }
  | {'timestamp', integer() }
  | {'txEventId', integer() }
  | {'txEventsCount', integer() }
  | {'txId', integer() }
  | {'username', binary() }
  ].


MindwWM_neo4j_capture_data_change_meta() ->
    MindwWM_neo4j_capture_data_change_meta([]).

MindwWM_neo4j_capture_data_change_meta(Fields) ->
  Default = [ {'operation', binary() }
            , {'source', MindwWM_neo4j_capture_data_change_meta_source:MindwWM_neo4j_capture_data_change_meta_source() }
            , {'timestamp', integer() }
            , {'txEventId', integer() }
            , {'txEventsCount', integer() }
            , {'txId', integer() }
            , {'username', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

