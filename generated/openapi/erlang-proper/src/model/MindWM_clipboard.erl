-module(MindWM_clipboard).

-include("MindWM.hrl").

-export([MindWM_clipboard/0]).

-export([MindWM_clipboard/1]).

-export_type([MindWM_clipboard/0]).

-type MindWM_clipboard() ::
  [ {'type', binary() }
  | {'source', binary() }
  | {'data', MindWM_clipboard_payload:MindWM_clipboard_payload() }
  | {'id', binary() }
  | {'specversion', binary() }
  | {'datacontenttype', binary() }
  | {'dataschema', MindWM_u_ri:MindWM_u_ri() }
  | {'subject', binary() }
  | {'time', datetime() }
  | {'data_base64', binary() }
  ].


MindWM_clipboard() ->
    MindWM_clipboard([]).

MindWM_clipboard(Fields) ->
  Default = [ {'type', binary() }
            , {'source', binary() }
            , {'data', MindWM_clipboard_payload:MindWM_clipboard_payload() }
            , {'id', binary(1) }
            , {'specversion', binary(1) }
            , {'datacontenttype', binary(1) }
            , {'dataschema', binary(1) }
            , {'subject', binary() }
            , {'time', datetime() }
            , {'data_base64', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

