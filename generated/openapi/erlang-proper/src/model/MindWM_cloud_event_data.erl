-module(MindWM_cloud_event_data).

-include("MindWM.hrl").

-export([MindWM_cloud_event_data/0]).

-export([MindWM_cloud_event_data/1]).

-export_type([MindWM_cloud_event_data/0]).

-type MindWM_cloud_event_data() ::
  [ 
  ].


MindWM_cloud_event_data() ->
    MindWM_cloud_event_data([]).

MindWM_cloud_event_data(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

