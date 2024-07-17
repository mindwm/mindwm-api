-module(MindWM_io_document).

-include("MindWM.hrl").

-export([MindWM_io_document/0]).

-export([MindWM_io_document/1]).

-export_type([MindWM_io_document/0]).

-type MindWM_io_document() ::
  [ {'id', binary() }
  | {'source', binary() }
  | {'specversion', binary() }
  | {'type', binary() }
  | {'datacontenttype', binary() }
  | {'dataschema', MindWM_u_ri:MindWM_u_ri() }
  | {'subject', binary() }
  | {'time', datetime() }
  | {'data', MindWM_tmux_pane_io_document:MindWM_tmux_pane_io_document() }
  | {'data_base64', binary() }
  ].


MindWM_io_document() ->
    MindWM_io_document([]).

MindWM_io_document(Fields) ->
  Default = [ {'id', binary(1) }
            , {'source', binary() }
            , {'specversion', binary(1) }
            , {'type', binary() }
            , {'datacontenttype', binary(1) }
            , {'dataschema', binary(1) }
            , {'subject', binary() }
            , {'time', datetime() }
            , {'data', MindWM_tmux_pane_io_document:MindWM_tmux_pane_io_document() }
            , {'data_base64', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

