note
 description:"[
		Mindwm API
 		This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
  		The version of the OpenAPI document: 0.1.0
 	    

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class NEO4J_CAPTURE_DATA_CHANGE_META




feature --Access

    operation: detachable STRING_32
      
    source: detachable NEO4J_CAPTURE_DATA_CHANGE_META_SOURCE
      
    timestamp: INTEGER_32
      
    tx_event_id: INTEGER_32
      
    tx_events_count: INTEGER_32
      
    tx_id: INTEGER_32
      
    username: detachable STRING_32
      

feature -- Change Element

    set_operation (a_name: like operation)
        -- Set 'operation' with 'a_name'.
      do
        operation := a_name
      ensure
        operation_set: operation = a_name
      end

    set_source (a_name: like source)
        -- Set 'source' with 'a_name'.
      do
        source := a_name
      ensure
        source_set: source = a_name
      end

    set_timestamp (a_name: like timestamp)
        -- Set 'timestamp' with 'a_name'.
      do
        timestamp := a_name
      ensure
        timestamp_set: timestamp = a_name
      end

    set_tx_event_id (a_name: like tx_event_id)
        -- Set 'tx_event_id' with 'a_name'.
      do
        tx_event_id := a_name
      ensure
        tx_event_id_set: tx_event_id = a_name
      end

    set_tx_events_count (a_name: like tx_events_count)
        -- Set 'tx_events_count' with 'a_name'.
      do
        tx_events_count := a_name
      ensure
        tx_events_count_set: tx_events_count = a_name
      end

    set_tx_id (a_name: like tx_id)
        -- Set 'tx_id' with 'a_name'.
      do
        tx_id := a_name
      ensure
        tx_id_set: tx_id = a_name
      end

    set_username (a_name: like username)
        -- Set 'username' with 'a_name'.
      do
        username := a_name
      ensure
        username_set: username = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass NEO4J_CAPTURE_DATA_CHANGE_META%N")
        if attached operation as l_operation then
          Result.append ("%Noperation:")
          Result.append (l_operation.out)
          Result.append ("%N")
        end
        if attached source as l_source then
          Result.append ("%Nsource:")
          Result.append (l_source.out)
          Result.append ("%N")
        end
        if attached timestamp as l_timestamp then
          Result.append ("%Ntimestamp:")
          Result.append (l_timestamp.out)
          Result.append ("%N")
        end
        if attached tx_event_id as l_tx_event_id then
          Result.append ("%Ntx_event_id:")
          Result.append (l_tx_event_id.out)
          Result.append ("%N")
        end
        if attached tx_events_count as l_tx_events_count then
          Result.append ("%Ntx_events_count:")
          Result.append (l_tx_events_count.out)
          Result.append ("%N")
        end
        if attached tx_id as l_tx_id then
          Result.append ("%Ntx_id:")
          Result.append (l_tx_id.out)
          Result.append ("%N")
        end
        if attached username as l_username then
          Result.append ("%Nusername:")
          Result.append (l_username.out)
          Result.append ("%N")
        end
      end
end
