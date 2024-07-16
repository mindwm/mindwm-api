-module(MindWM_neo4j_capture_data_change_schema).

-include("MindWM.hrl").

-export([MindWM_neo4j_capture_data_change_schema/0]).

-export([MindWM_neo4j_capture_data_change_schema/1]).

-export_type([MindWM_neo4j_capture_data_change_schema/0]).

-type MindWM_neo4j_capture_data_change_schema() ::
  [ {'constraints', map() }
  | {'properties', map() }
  ].


MindWM_neo4j_capture_data_change_schema() ->
    MindWM_neo4j_capture_data_change_schema([]).

MindWM_neo4j_capture_data_change_schema(Fields) ->
  Default = [ {'constraints', map() }
            , {'properties', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

