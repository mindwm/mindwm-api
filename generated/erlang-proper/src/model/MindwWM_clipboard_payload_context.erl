-module(MindwWM_clipboard_payload_context).

-include("MindwWM.hrl").

-export([MindwWM_clipboard_payload_context/0]).

-export([MindwWM_clipboard_payload_context/1]).

-export_type([MindwWM_clipboard_payload_context/0]).

-type MindwWM_clipboard_payload_context() ::
  [ {'window', binary() }
  ].


MindwWM_clipboard_payload_context() ->
    MindwWM_clipboard_payload_context([]).

MindwWM_clipboard_payload_context(Fields) ->
  Default = [ {'window', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

