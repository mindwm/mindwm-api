-module(MindwWM_neo4j_capture_data_change_meta_source).

-include("MindwWM.hrl").

-export([MindwWM_neo4j_capture_data_change_meta_source/0]).

-export([MindwWM_neo4j_capture_data_change_meta_source/1]).

-export_type([MindwWM_neo4j_capture_data_change_meta_source/0]).

-type MindwWM_neo4j_capture_data_change_meta_source() ::
  [ {'hostname', binary() }
  ].


MindwWM_neo4j_capture_data_change_meta_source() ->
    MindwWM_neo4j_capture_data_change_meta_source([]).

MindwWM_neo4j_capture_data_change_meta_source(Fields) ->
  Default = [ {'hostname', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

