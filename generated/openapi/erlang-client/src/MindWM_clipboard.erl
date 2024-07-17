-module(MindWM_clipboard).

-export([encode/1]).

-export_type([MindWM_clipboard/0]).

-type MindWM_clipboard() ::
    #{ 'id' := binary(),
       'source' := binary(),
       'specversion' := binary(),
       'type' := binary(),
       'datacontenttype' => binary(),
       'dataschema' => MindWM_u_ri:MindWM_u_ri(),
       'subject' => binary(),
       'time' => MindWM_date_time:MindWM_date_time(),
       'data' => MindWM_clipboard_payload:MindWM_clipboard_payload(),
       'data_base64' => binary()
     }.

encode(#{ 'id' := Id,
          'source' := Source,
          'specversion' := Specversion,
          'type' := Type,
          'datacontenttype' := Datacontenttype,
          'dataschema' := Dataschema,
          'subject' := Subject,
          'time' := Time,
          'data' := Data,
          'data_base64' := DataBase64
        }) ->
    #{ 'id' => Id,
       'source' => Source,
       'specversion' => Specversion,
       'type' => Type,
       'datacontenttype' => Datacontenttype,
       'dataschema' => Dataschema,
       'subject' => Subject,
       'time' => Time,
       'data' => Data,
       'data_base64' => DataBase64
     }.
