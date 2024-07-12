-module(MindwWM_io_document).

-include("MindwWM.hrl").

-export([MindwWM_io_document/0]).

-export([MindwWM_io_document/1]).

-export_type([MindwWM_io_document/0]).

-type MindwWM_io_document() ::
  [ {'type', binary() }
  | {'source', binary() }
  | {'data', MindwWM_tmux_pane_io_document:MindwWM_tmux_pane_io_document() }
  | {'id', binary() }
  | {'specversion', binary() }
  | {'datacontenttype', binary() }
  | {'dataschema', MindwWM_u_ri:MindwWM_u_ri() }
  | {'subject', binary() }
  | {'time', datetime() }
  | {'data_base64', binary() }
  ].


MindwWM_io_document() ->
    MindwWM_io_document([]).

MindwWM_io_document(Fields) ->
  Default = [ {'type', binary() }
            , {'source', binary() }
            , {'data', MindwWM_tmux_pane_io_document:MindwWM_tmux_pane_io_document() }
            , {'id', binary(1) }
            , {'specversion', binary(1) }
            , {'datacontenttype', binary(1) }
            , {'dataschema', binary(1) }
            , {'subject', binary() }
            , {'time', datetime() }
            , {'data_base64', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

