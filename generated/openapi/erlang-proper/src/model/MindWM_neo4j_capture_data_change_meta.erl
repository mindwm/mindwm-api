-module(MindWM_neo4j_capture_data_change_meta).

-include("MindWM.hrl").

-export([MindWM_neo4j_capture_data_change_meta/0]).

-export([MindWM_neo4j_capture_data_change_meta/1]).

-export_type([MindWM_neo4j_capture_data_change_meta/0]).

-type MindWM_neo4j_capture_data_change_meta() ::
  [ {'operation', binary() }
  | {'source', MindWM_neo4j_capture_data_change_meta_source:MindWM_neo4j_capture_data_change_meta_source() }
  | {'timestamp', integer() }
  | {'txEventId', integer() }
  | {'txEventsCount', integer() }
  | {'txId', integer() }
  | {'username', binary() }
  ].


MindWM_neo4j_capture_data_change_meta() ->
    MindWM_neo4j_capture_data_change_meta([]).

MindWM_neo4j_capture_data_change_meta(Fields) ->
  Default = [ {'operation', binary() }
            , {'source', MindWM_neo4j_capture_data_change_meta_source:MindWM_neo4j_capture_data_change_meta_source() }
            , {'timestamp', integer() }
            , {'txEventId', integer() }
            , {'txEventsCount', integer() }
            , {'txId', integer() }
            , {'username', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

