-module(MindwWM_neo4j_capture_data_change_schema).

-include("MindwWM.hrl").

-export([MindwWM_neo4j_capture_data_change_schema/0]).

-export([MindwWM_neo4j_capture_data_change_schema/1]).

-export_type([MindwWM_neo4j_capture_data_change_schema/0]).

-type MindwWM_neo4j_capture_data_change_schema() ::
  [ {'constraints', map() }
  | {'properties', map() }
  ].


MindwWM_neo4j_capture_data_change_schema() ->
    MindwWM_neo4j_capture_data_change_schema([]).

MindwWM_neo4j_capture_data_change_schema(Fields) ->
  Default = [ {'constraints', map() }
            , {'properties', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

