-module(MindwWM_neo4j_capture_data_change_meta).

-export([encode/1]).

-export_type([MindwWM_neo4j_capture_data_change_meta/0]).

-type MindwWM_neo4j_capture_data_change_meta() ::
    #{ 'operation' := binary(),
       'source' := MindwWM_neo4j_capture_data_change_meta_source:MindwWM_neo4j_capture_data_change_meta_source(),
       'timestamp' := integer(),
       'txEventId' := integer(),
       'txEventsCount' := integer(),
       'txId' := integer(),
       'username' := binary()
     }.

encode(#{ 'operation' := Operation,
          'source' := Source,
          'timestamp' := Timestamp,
          'txEventId' := TxEventId,
          'txEventsCount' := TxEventsCount,
          'txId' := TxId,
          'username' := Username
        }) ->
    #{ 'operation' => Operation,
       'source' => Source,
       'timestamp' => Timestamp,
       'txEventId' => TxEventId,
       'txEventsCount' => TxEventsCount,
       'txId' => TxId,
       'username' => Username
     }.
