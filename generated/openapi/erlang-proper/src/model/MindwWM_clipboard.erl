-module(MindwWM_clipboard).

-include("MindwWM.hrl").

-export([MindwWM_clipboard/0]).

-export([MindwWM_clipboard/1]).

-export_type([MindwWM_clipboard/0]).

-type MindwWM_clipboard() ::
  [ {'type', binary() }
  | {'source', binary() }
  | {'data', MindwWM_clipboard_payload:MindwWM_clipboard_payload() }
  | {'id', binary() }
  | {'specversion', binary() }
  | {'datacontenttype', binary() }
  | {'dataschema', MindwWM_u_ri:MindwWM_u_ri() }
  | {'subject', binary() }
  | {'time', datetime() }
  | {'data_base64', binary() }
  ].


MindwWM_clipboard() ->
    MindwWM_clipboard([]).

MindwWM_clipboard(Fields) ->
  Default = [ {'type', binary() }
            , {'source', binary() }
            , {'data', MindwWM_clipboard_payload:MindwWM_clipboard_payload() }
            , {'id', binary(1) }
            , {'specversion', binary(1) }
            , {'datacontenttype', binary(1) }
            , {'dataschema', binary(1) }
            , {'subject', binary() }
            , {'time', datetime() }
            , {'data_base64', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

