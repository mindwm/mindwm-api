-module(MindWM_cloud_event).

-include("MindWM.hrl").

-export([MindWM_cloud_event/0]).

-export([MindWM_cloud_event/1]).

-export_type([MindWM_cloud_event/0]).

-type MindWM_cloud_event() ::
  [ {'id', binary() }
  | {'source', binary() }
  | {'specversion', binary() }
  | {'type', binary() }
  | {'datacontenttype', binary() }
  | {'dataschema', MindWM_u_ri:MindWM_u_ri() }
  | {'subject', binary() }
  | {'time', datetime() }
  | {'data', MindWM_cloud_event_data:MindWM_cloud_event_data() }
  | {'data_base64', binary() }
  ].


MindWM_cloud_event() ->
    MindWM_cloud_event([]).

MindWM_cloud_event(Fields) ->
  Default = [ {'id', binary(1) }
            , {'source', binary(1) }
            , {'specversion', binary(1) }
            , {'type', binary(1) }
            , {'datacontenttype', binary(1) }
            , {'dataschema', binary(1) }
            , {'subject', binary(1) }
            , {'time', datetime() }
            , {'data', MindWM_cloud_event_data:MindWM_cloud_event_data() }
            , {'data_base64', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

