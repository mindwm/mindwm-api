-module(MindwWM_cloud_event_data).

-include("MindwWM.hrl").

-export([MindwWM_cloud_event_data/0]).

-export([MindwWM_cloud_event_data/1]).

-export_type([MindwWM_cloud_event_data/0]).

-type MindwWM_cloud_event_data() ::
  [ 
  ].


MindwWM_cloud_event_data() ->
    MindwWM_cloud_event_data([]).

MindwWM_cloud_event_data(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

