-module(MindwWM_tmux_pane_io_document).

-include("MindwWM.hrl").

-export([MindwWM_tmux_pane_io_document/0]).

-export([MindwWM_tmux_pane_io_document/1]).

-export_type([MindwWM_tmux_pane_io_document/0]).

-type MindwWM_tmux_pane_io_document() ::
  [ {'input', binary() }
  | {'output', binary() }
  | {'ps1', binary() }
  ].


MindwWM_tmux_pane_io_document() ->
    MindwWM_tmux_pane_io_document([]).

MindwWM_tmux_pane_io_document(Fields) ->
  Default = [ {'input', binary(1) }
            , {'output', binary(0) }
            , {'ps1', binary(1) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

