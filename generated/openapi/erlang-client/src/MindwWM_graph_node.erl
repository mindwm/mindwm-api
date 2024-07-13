-module(MindwWM_graph_node).

-export([encode/1]).

-export_type([MindwWM_graph_node/0]).

-type MindwWM_graph_node() ::
    #{ 'id' := binary(),
       'source' := binary(),
       'specversion' := binary(),
       'type' := binary(),
       'datacontenttype' => binary(),
       'dataschema' => MindwWM_u_ri:MindwWM_u_ri(),
       'subject' => binary(),
       'time' => MindwWM_date_time:MindwWM_date_time(),
       'data' => MindwWM_graph_node_all_of_data:MindwWM_graph_node_all_of_data(),
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
