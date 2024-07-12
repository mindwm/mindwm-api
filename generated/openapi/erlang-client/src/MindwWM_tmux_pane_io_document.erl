-module(MindwWM_tmux_pane_io_document).

-export([encode/1]).

-export_type([MindwWM_tmux_pane_io_document/0]).

-type MindwWM_tmux_pane_io_document() ::
    #{ 'input' := binary(),
       'output' := binary(),
       'ps1' := binary()
     }.

encode(#{ 'input' := Input,
          'output' := Output,
          'ps1' := Ps1
        }) ->
    #{ 'input' => Input,
       'output' => Output,
       'ps1' => Ps1
     }.
