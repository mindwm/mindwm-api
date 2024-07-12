-module(MindwWM_clipboard_payload).

-include("MindwWM.hrl").

-export([MindwWM_clipboard_payload/0]).

-export([MindwWM_clipboard_payload/1]).

-export_type([MindwWM_clipboard_payload/0]).

-type MindwWM_clipboard_payload() ::
  [ {'start', list(integer()) }
  | {'stop', list(integer()) }
  | {'data', binary() }
  | {'type', binary() }
  | {'context', MindwWM_clipboard_payload_context:MindwWM_clipboard_payload_context() }
  ].


MindwWM_clipboard_payload() ->
    MindwWM_clipboard_payload([]).

MindwWM_clipboard_payload(Fields) ->
  Default = [ {'start', list(integer(), 2, 2) }
            , {'stop', list(integer(), 2, 2) }
            , {'data', binary(1) }
            , {'type', elements([<<"primary">>, <<"secondary">>, <<"clipboard">>]) }
            , {'context', MindwWM_clipboard_payload_context:MindwWM_clipboard_payload_context() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

