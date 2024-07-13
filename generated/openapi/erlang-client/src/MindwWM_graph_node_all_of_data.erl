-module(MindwWM_graph_node_all_of_data).

-export([encode/1]).

-export_type([MindwWM_graph_node_all_of_data/0]).

-type MindwWM_graph_node_all_of_data() ::
    #{ 'headers' := maps:map(),
       'message_key' := binary(),
       'meta' := MindwWM_neo4j_capture_data_change_meta:MindwWM_neo4j_capture_data_change_meta(),
       'offset' := integer(),
       'partition' := integer(),
       'source_type' := binary(),
       'timestamp' := MindwWM_date_time:MindwWM_date_time(),
       'topic' := binary(),
       'schema' := MindwWM_neo4j_capture_data_change_schema:MindwWM_neo4j_capture_data_change_schema(),
       'payload' := MindwWM_neo4j_capture_data_change_node_payload:MindwWM_neo4j_capture_data_change_node_payload()
     }.

encode(#{ 'headers' := Headers,
          'message_key' := MessageKey,
          'meta' := Meta,
          'offset' := Offset,
          'partition' := Partition,
          'source_type' := SourceType,
          'timestamp' := Timestamp,
          'topic' := Topic,
          'schema' := Schema,
          'payload' := Payload
        }) ->
    #{ 'headers' => Headers,
       'message_key' => MessageKey,
       'meta' => Meta,
       'offset' => Offset,
       'partition' => Partition,
       'source_type' => SourceType,
       'timestamp' => Timestamp,
       'topic' => Topic,
       'schema' => Schema,
       'payload' => Payload
     }.
