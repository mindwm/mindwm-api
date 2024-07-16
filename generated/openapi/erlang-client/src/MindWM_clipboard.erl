-module(MindWM_clipboard).

-export([encode/1]).

-export_type([MindWM_clipboard/0]).

-type MindWM_clipboard() ::
    #{ 'type' => binary(),
       'source' => binary(),
       'data' => MindWM_clipboard_payload:MindWM_clipboard_payload(),
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
