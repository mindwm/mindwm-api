-module(MindwWM_neo4j_capture_data_change).

-export([encode/1]).

-export_type([MindwWM_neo4j_capture_data_change/0]).

-type MindwWM_neo4j_capture_data_change() ::
    #{ 'headers' := maps:map(),
       'message_key' := binary(),
       'meta' := MindwWM_neo4j_capture_data_change_meta:MindwWM_neo4j_capture_data_change_meta(),
       'offset' := integer(),
       'partition' := integer(),
       'source_type' := binary(),
       'timestamp' := MindwWM_date_time:MindwWM_date_time(),
       'topic' := binary(),
       'schema' := MindwWM_neo4j_capture_data_change_schema:MindwWM_neo4j_capture_data_change_schema(),
       'payload' := MindwWM_neo4j_capture_data_change_payload:MindwWM_neo4j_capture_data_change_payload()
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
