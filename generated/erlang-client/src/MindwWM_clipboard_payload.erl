-module(MindwWM_clipboard_payload).

-export([encode/1]).

-export_type([MindwWM_clipboard_payload/0]).

-type MindwWM_clipboard_payload() ::
    #{ 'start' => list(),
       'stop' => list(),
       'data' => binary(),
       'type' => binary(),
       'context' => MindwWM_clipboard_payload_context:MindwWM_clipboard_payload_context()
     }.

encode(#{ 'start' := Start,
          'stop' := Stop,
          'data' := Data,
          'type' := Type,
          'context' := Context
        }) ->
    #{ 'start' => Start,
       'stop' => Stop,
       'data' => Data,
       'type' => Type,
       'context' => Context
     }.
