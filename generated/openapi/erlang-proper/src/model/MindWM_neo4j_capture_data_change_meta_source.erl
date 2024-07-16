-module(MindWM_neo4j_capture_data_change_meta_source).

-include("MindWM.hrl").

-export([MindWM_neo4j_capture_data_change_meta_source/0]).

-export([MindWM_neo4j_capture_data_change_meta_source/1]).

-export_type([MindWM_neo4j_capture_data_change_meta_source/0]).

-type MindWM_neo4j_capture_data_change_meta_source() ::
  [ {'hostname', binary() }
  ].


MindWM_neo4j_capture_data_change_meta_source() ->
    MindWM_neo4j_capture_data_change_meta_source([]).

MindWM_neo4j_capture_data_change_meta_source(Fields) ->
  Default = [ {'hostname', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

