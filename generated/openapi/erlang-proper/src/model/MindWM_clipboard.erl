-module(MindWM_clipboard).

-include("MindWM.hrl").

-export([MindWM_clipboard/0]).

-export([MindWM_clipboard/1]).

-export_type([MindWM_clipboard/0]).

-type MindWM_clipboard() ::
  [ {'id', binary() }
  | {'source', binary() }
  | {'specversion', binary() }
  | {'type', binary() }
  | {'datacontenttype', binary() }
  | {'dataschema', MindWM_u_ri:MindWM_u_ri() }
  | {'subject', binary() }
  | {'time', datetime() }
  | {'data', MindWM_clipboard_payload:MindWM_clipboard_payload() }
  | {'data_base64', binary() }
  ].


MindWM_clipboard() ->
    MindWM_clipboard([]).

MindWM_clipboard(Fields) ->
  Default = [ {'id', binary(1) }
            , {'source', binary() }
            , {'specversion', binary(1) }
            , {'type', binary() }
            , {'datacontenttype', binary(1) }
            , {'dataschema', binary(1) }
            , {'subject', binary() }
            , {'time', datetime() }
            , {'data', MindWM_clipboard_payload:MindWM_clipboard_payload() }
            , {'data_base64', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

