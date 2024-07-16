-module(MindWM_tmux_pane_io_document).

-include("MindWM.hrl").

-export([MindWM_tmux_pane_io_document/0]).

-export([MindWM_tmux_pane_io_document/1]).

-export_type([MindWM_tmux_pane_io_document/0]).

-type MindWM_tmux_pane_io_document() ::
  [ {'input', binary() }
  | {'output', binary() }
  | {'ps1', binary() }
  ].


MindWM_tmux_pane_io_document() ->
    MindWM_tmux_pane_io_document([]).

MindWM_tmux_pane_io_document(Fields) ->
  Default = [ {'input', binary(1) }
            , {'output', binary(0) }
            , {'ps1', binary(1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

