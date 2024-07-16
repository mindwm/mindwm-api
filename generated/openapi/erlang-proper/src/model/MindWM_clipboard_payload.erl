-module(MindWM_clipboard_payload).

-include("MindWM.hrl").

-export([MindWM_clipboard_payload/0]).

-export([MindWM_clipboard_payload/1]).

-export_type([MindWM_clipboard_payload/0]).

-type MindWM_clipboard_payload() ::
  [ {'start', list(integer()) }
  | {'stop', list(integer()) }
  | {'data', binary() }
  | {'type', binary() }
  | {'context', MindWM_clipboard_payload_context:MindWM_clipboard_payload_context() }
  ].


MindWM_clipboard_payload() ->
    MindWM_clipboard_payload([]).

MindWM_clipboard_payload(Fields) ->
  Default = [ {'start', list(integer(), 2, 2) }
            , {'stop', list(integer(), 2, 2) }
            , {'data', binary(1) }
            , {'type', elements([<<"primary">>, <<"secondary">>, <<"clipboard">>]) }
            , {'context', MindWM_clipboard_payload_context:MindWM_clipboard_payload_context() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

