-module(MindWM_neo4j_capture_data_change_meta).

-export([encode/1]).

-export_type([MindWM_neo4j_capture_data_change_meta/0]).

-type MindWM_neo4j_capture_data_change_meta() ::
    #{ 'operation' := binary(),
       'source' := MindWM_neo4j_capture_data_change_meta_source:MindWM_neo4j_capture_data_change_meta_source(),
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
