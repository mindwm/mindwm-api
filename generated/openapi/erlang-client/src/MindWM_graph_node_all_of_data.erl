-module(MindWM_graph_node_all_of_data).

-export([encode/1]).

-export_type([MindWM_graph_node_all_of_data/0]).

-type MindWM_graph_node_all_of_data() ::
    #{ 'headers' := maps:map(),
       'message_key' := binary(),
       'meta' := MindWM_neo4j_capture_data_change_meta:MindWM_neo4j_capture_data_change_meta(),
       'offset' := integer(),
       'partition' := integer(),
       'source_type' := binary(),
       'timestamp' := MindWM_date_time:MindWM_date_time(),
       'topic' := binary(),
       'schema' := MindWM_neo4j_capture_data_change_schema:MindWM_neo4j_capture_data_change_schema(),
       'payload' := MindWM_neo4j_capture_data_change_node_payload:MindWM_neo4j_capture_data_change_node_payload()
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
