-module(MindwWM_clipboard_payload_context).

-export([encode/1]).

-export_type([MindwWM_clipboard_payload_context/0]).

-type MindwWM_clipboard_payload_context() ::
    #{ 'window' => binary()
     }.

encode(#{ 'window' := Window
        }) ->
    #{ 'window' => Window
     }.
