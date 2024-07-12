-module(MindwWM_io_document).

-export([encode/1]).

-export_type([MindwWM_io_document/0]).

-type MindwWM_io_document() ::
    #{ 'type' => binary(),
       'source' => binary(),
       'data' => MindwWM_tmux_pane_io_document:MindwWM_tmux_pane_io_document(),
       'id' := binary(),
       'specversion' := binary(),
       'datacontenttype' => binary(),
       'dataschema' => MindwWM_u_ri:MindwWM_u_ri(),
       'subject' => binary(),
       'time' => MindwWM_date_time:MindwWM_date_time(),
       'data_base64' => binary()
     }.

encode(#{ 'type' := Type,
          'source' := Source,
          'data' := Data,
          'id' := Id,
          'specversion' := Specversion,
          'datacontenttype' := Datacontenttype,
          'dataschema' := Dataschema,
          'subject' := Subject,
          'time' := Time,
          'data_base64' := DataBase64
        }) ->
    #{ 'type' => Type,
       'source' => Source,
       'data' => Data,
       'id' => Id,
       'specversion' => Specversion,
       'datacontenttype' => Datacontenttype,
       'dataschema' => Dataschema,
       'subject' => Subject,
       'time' => Time,
       'data_base64' => DataBase64
     }.
