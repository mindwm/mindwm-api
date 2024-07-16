-module(MindWM_clipboard_payload_context).

-include("MindWM.hrl").

-export([MindWM_clipboard_payload_context/0]).

-export([MindWM_clipboard_payload_context/1]).

-export_type([MindWM_clipboard_payload_context/0]).

-type MindWM_clipboard_payload_context() ::
  [ {'window', binary() }
  ].


MindWM_clipboard_payload_context() ->
    MindWM_clipboard_payload_context([]).

MindWM_clipboard_payload_context(Fields) ->
  Default = [ {'window', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

