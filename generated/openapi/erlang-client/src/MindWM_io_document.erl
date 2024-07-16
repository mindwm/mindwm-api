-module(MindWM_io_document).

-export([encode/1]).

-export_type([MindWM_io_document/0]).

-type MindWM_io_document() ::
    #{ 'type' => binary(),
       'source' => binary(),
       'data' => MindWM_tmux_pane_io_document:MindWM_tmux_pane_io_document(),
       'id' := binary(),
       'specversion' := binary(),
       'datacontenttype' => binary(),
       'dataschema' => MindWM_u_ri:MindWM_u_ri(),
       'subject' => binary(),
       'time' => MindWM_date_time:MindWM_date_time(),
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
