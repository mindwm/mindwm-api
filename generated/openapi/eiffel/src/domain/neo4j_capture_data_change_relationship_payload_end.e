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
class NEO4J_CAPTURE_DATA_CHANGE_RELATIONSHIP_PAYLOAD_END




feature --Access

    id: detachable STRING_32
      
    ids: detachable STRING_TABLE [ANY]
      
    labels: detachable LIST [STRING_32]
      

feature -- Change Element

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_ids (a_name: like ids)
        -- Set 'ids' with 'a_name'.
      do
        ids := a_name
      ensure
        ids_set: ids = a_name
      end

    set_labels (a_name: like labels)
        -- Set 'labels' with 'a_name'.
      do
        labels := a_name
      ensure
        labels_set: labels = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass NEO4J_CAPTURE_DATA_CHANGE_RELATIONSHIP_PAYLOAD_END%N")
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached ids as l_ids then
          Result.append ("%Nids:")
          across l_ids as ic loop
            Result.append ("%N")
            Result.append ("key:")
            Result.append (ic.key.out)
            Result.append (" - ")
            Result.append ("val:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached labels as l_labels then
          across l_labels as ic loop
            Result.append ("%N labels:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

