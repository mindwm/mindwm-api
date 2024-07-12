-module(MindwWM_cloud_event).

-include("MindwWM.hrl").

-export([MindwWM_cloud_event/0]).

-export([MindwWM_cloud_event/1]).

-export_type([MindwWM_cloud_event/0]).

-type MindwWM_cloud_event() ::
  [ {'id', binary() }
  | {'source', binary() }
  | {'specversion', binary() }
  | {'type', binary() }
  | {'datacontenttype', binary() }
  | {'dataschema', MindwWM_u_ri:MindwWM_u_ri() }
  | {'subject', binary() }
  | {'time', datetime() }
  | {'data', MindwWM_cloud_event_data:MindwWM_cloud_event_data() }
  | {'data_base64', binary() }
  ].


MindwWM_cloud_event() ->
    MindwWM_cloud_event([]).

MindwWM_cloud_event(Fields) ->
  Default = [ {'id', binary(1) }
            , {'source', binary(1) }
            , {'specversion', binary(1) }
            , {'type', binary(1) }
            , {'datacontenttype', binary(1) }
            , {'dataschema', binary(1) }
            , {'subject', binary(1) }
            , {'time', datetime() }
            , {'data', MindwWM_cloud_event_data:MindwWM_cloud_event_data() }
            , {'data_base64', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

