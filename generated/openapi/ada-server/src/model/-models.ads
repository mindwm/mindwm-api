--  Mindwm API
--  This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
--
--  The version of the OpenAPI document: 0.1.0
--
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.7.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

with Swagger.Streams;
with Ada.Containers.Vectors;
package .Models is
   pragma Style_Checks ("-bmrIu");



   type ClipboardPayloadContext_Type is
     record
       Window : Swagger.Nullable_UString;
     end record;


   package ClipboardPayloadContext_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.ClipboardPayloadContext_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.ClipboardPayloadContext_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in ClipboardPayloadContext_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.ClipboardPayloadContext_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out ClipboardPayloadContext_Type_Vectors.Vector);



   type CloudEventData_Type is new anyOf<string,number,boolean>;


   package CloudEventData_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.CloudEventData_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.CloudEventData_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CloudEventData_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.CloudEventData_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out CloudEventData_Type_Vectors.Vector);



   type Neo4jCaptureDataChangeMetaSource_Type is
     record
       Hostname : Swagger.UString;
     end record;


   package Neo4jCaptureDataChangeMetaSource_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.Neo4jCaptureDataChangeMetaSource_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.Neo4jCaptureDataChangeMetaSource_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Neo4jCaptureDataChangeMetaSource_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.Neo4jCaptureDataChangeMetaSource_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out Neo4jCaptureDataChangeMetaSource_Type_Vectors.Vector);



   type TmuxPaneIoDocument_Type is
     record
       Input : Swagger.UString;
       Output : Swagger.UString;
       Ps_1 : Swagger.UString;
     end record;


   package TmuxPaneIoDocument_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.TmuxPaneIoDocument_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.TmuxPaneIoDocument_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in TmuxPaneIoDocument_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.TmuxPaneIoDocument_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out TmuxPaneIoDocument_Type_Vectors.Vector);



   type ClipboardPayload_Type is
     record
       Start : Integer_Vectors.Vector;
       Stop : Integer_Vectors.Vector;
       Data : Swagger.Nullable_UString;
       P_Type : Swagger.Nullable_UString;
       Context : .Models.ClipboardPayloadContext_Type;
     end record;


   package ClipboardPayload_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.ClipboardPayload_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.ClipboardPayload_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in ClipboardPayload_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.ClipboardPayload_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out ClipboardPayload_Type_Vectors.Vector);



   type Clipboard_Type is
     record
       P_Type : Swagger.Nullable_UString;
       Source : Swagger.Nullable_UString;
       Data : .Models.ClipboardPayload_Type;
       Id : Swagger.UString;
       Specversion : Swagger.UString;
       Datacontenttype : Swagger.Nullable_UString;
       Dataschema : Swagger.Nullable_UString;
       Subject : Swagger.Nullable_UString;
       Time : Swagger.Nullable_Date;
       Data_Base_64 : Swagger.Nullable_UString;
     end record;


   package Clipboard_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.Clipboard_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.Clipboard_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Clipboard_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.Clipboard_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out Clipboard_Type_Vectors.Vector);



   type CloudEvent_Type is
     record
       Id : Swagger.UString;
       Source : Swagger.UString;
       Specversion : Swagger.UString;
       P_Type : Swagger.UString;
       Datacontenttype : Swagger.Nullable_UString;
       Dataschema : Swagger.Nullable_UString;
       Subject : Swagger.Nullable_UString;
       Time : Swagger.Nullable_Date;
       Data : .Models.CloudEventData_Type;
       Data_Base_64 : Swagger.Nullable_UString;
     end record;


   package CloudEvent_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.CloudEvent_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.CloudEvent_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in CloudEvent_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.CloudEvent_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out CloudEvent_Type_Vectors.Vector);



   type GraphRelationshipAllOfData_Type is
     record
       Headers : Swagger.Object;
       Message_Key : Swagger.UString;
       Meta : .Models.Neo4jCaptureDataChangeMeta_Type;
       Offset : Integer;
       Partition : Integer;
       Source_Type : Swagger.UString;
       Timestamp : Swagger.Datetime;
       Topic : Swagger.UString;
       Schema : .Models.Neo4jCaptureDataChangeSchema_Type;
       Payload : .Models.Neo4jCaptureDataChangeRelationshipPayload_Type;
     end record;


   package GraphRelationshipAllOfData_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.GraphRelationshipAllOfData_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.GraphRelationshipAllOfData_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in GraphRelationshipAllOfData_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.GraphRelationshipAllOfData_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out GraphRelationshipAllOfData_Type_Vectors.Vector);



   type GraphRelationship_Type is
     record
       Id : Swagger.UString;
       Source : Swagger.UString;
       Specversion : Swagger.UString;
       P_Type : Swagger.UString;
       Datacontenttype : Swagger.Nullable_UString;
       Dataschema : Swagger.Nullable_UString;
       Subject : Swagger.Nullable_UString;
       Time : Swagger.Nullable_Date;
       Data : .Models.GraphRelationshipAllOfData_Type;
       Data_Base_64 : Swagger.Nullable_UString;
     end record;


   package GraphRelationship_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.GraphRelationship_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.GraphRelationship_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in GraphRelationship_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.GraphRelationship_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out GraphRelationship_Type_Vectors.Vector);



   type IoDocument_Type is
     record
       P_Type : Swagger.Nullable_UString;
       Source : Swagger.Nullable_UString;
       Data : .Models.TmuxPaneIoDocument_Type;
       Id : Swagger.UString;
       Specversion : Swagger.UString;
       Datacontenttype : Swagger.Nullable_UString;
       Dataschema : Swagger.Nullable_UString;
       Subject : Swagger.Nullable_UString;
       Time : Swagger.Nullable_Date;
       Data_Base_64 : Swagger.Nullable_UString;
     end record;


   package IoDocument_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.IoDocument_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.IoDocument_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in IoDocument_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.IoDocument_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out IoDocument_Type_Vectors.Vector);



   type Neo4jCaptureDataChangeMeta_Type is
     record
       Operation : Swagger.UString;
       Source : .Models.Neo4jCaptureDataChangeMetaSource_Type;
       Timestamp : Integer;
       Tx_Event_Id : Integer;
       Tx_Events_Count : Integer;
       Tx_Id : Integer;
       Username : Swagger.UString;
     end record;


   package Neo4jCaptureDataChangeMeta_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.Neo4jCaptureDataChangeMeta_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.Neo4jCaptureDataChangeMeta_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Neo4jCaptureDataChangeMeta_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.Neo4jCaptureDataChangeMeta_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out Neo4jCaptureDataChangeMeta_Type_Vectors.Vector);



   type Neo4jCaptureDataChangeNodePayloadAfter_Type is
     record
       Labels : Swagger.UString_Vectors.Vector;
       Properties : .Models.AnyType_Type;
     end record;


   package Neo4jCaptureDataChangeNodePayloadAfter_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.Neo4jCaptureDataChangeNodePayloadAfter_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.Neo4jCaptureDataChangeNodePayloadAfter_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Neo4jCaptureDataChangeNodePayloadAfter_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.Neo4jCaptureDataChangeNodePayloadAfter_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out Neo4jCaptureDataChangeNodePayloadAfter_Type_Vectors.Vector);



   type Neo4jCaptureDataChangeNodePayload_Type is
     record
       After : .Models.Neo4jCaptureDataChangeNodePayloadAfter_Type;
       Before : Swagger.UString;
       Id : Swagger.UString;
       P_Type : Swagger.UString;
     end record;


   package Neo4jCaptureDataChangeNodePayload_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.Neo4jCaptureDataChangeNodePayload_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.Neo4jCaptureDataChangeNodePayload_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Neo4jCaptureDataChangeNodePayload_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.Neo4jCaptureDataChangeNodePayload_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out Neo4jCaptureDataChangeNodePayload_Type_Vectors.Vector);



   type Neo4jCaptureDataChangeRelationshipPayloadEnd_Type is
     record
       Id : Swagger.UString;
       Ids : .Models.AnyType_Type;
       Labels : Swagger.UString_Vectors.Vector;
     end record;


   package Neo4jCaptureDataChangeRelationshipPayloadEnd_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.Neo4jCaptureDataChangeRelationshipPayloadEnd_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.Neo4jCaptureDataChangeRelationshipPayloadEnd_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Neo4jCaptureDataChangeRelationshipPayloadEnd_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.Neo4jCaptureDataChangeRelationshipPayloadEnd_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out Neo4jCaptureDataChangeRelationshipPayloadEnd_Type_Vectors.Vector);



   type Neo4jCaptureDataChangePayload_Type is
     record
       After : Swagger.Object;
       Before : Swagger.UString;
       Id : Swagger.UString;
       P_Type : Swagger.UString;
       P_End : .Models.Neo4jCaptureDataChangeRelationshipPayloadEnd_Type;
       Label : Swagger.UString;
       Start : .Models.Neo4jCaptureDataChangeRelationshipPayloadEnd_Type;
     end record;


   package Neo4jCaptureDataChangePayload_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.Neo4jCaptureDataChangePayload_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.Neo4jCaptureDataChangePayload_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Neo4jCaptureDataChangePayload_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.Neo4jCaptureDataChangePayload_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out Neo4jCaptureDataChangePayload_Type_Vectors.Vector);



   type Neo4jCaptureDataChangeRelationshipPayload_Type is
     record
       After : Swagger.Object;
       Before : Swagger.UString;
       P_End : .Models.Neo4jCaptureDataChangeRelationshipPayloadEnd_Type;
       Id : Swagger.UString;
       Label : Swagger.UString;
       Start : .Models.Neo4jCaptureDataChangeRelationshipPayloadEnd_Type;
       P_Type : Swagger.UString;
     end record;


   package Neo4jCaptureDataChangeRelationshipPayload_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.Neo4jCaptureDataChangeRelationshipPayload_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.Neo4jCaptureDataChangeRelationshipPayload_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Neo4jCaptureDataChangeRelationshipPayload_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.Neo4jCaptureDataChangeRelationshipPayload_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out Neo4jCaptureDataChangeRelationshipPayload_Type_Vectors.Vector);



   type Neo4jCaptureDataChangeSchema_Type is
     record
       Constraints : .Models.AnyType_Type;
       Properties : .Models.AnyType_Type;
     end record;


   package Neo4jCaptureDataChangeSchema_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.Neo4jCaptureDataChangeSchema_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.Neo4jCaptureDataChangeSchema_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Neo4jCaptureDataChangeSchema_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.Neo4jCaptureDataChangeSchema_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out Neo4jCaptureDataChangeSchema_Type_Vectors.Vector);



   type GraphNodeAllOfData_Type is
     record
       Headers : Swagger.Object;
       Message_Key : Swagger.UString;
       Meta : .Models.Neo4jCaptureDataChangeMeta_Type;
       Offset : Integer;
       Partition : Integer;
       Source_Type : Swagger.UString;
       Timestamp : Swagger.Datetime;
       Topic : Swagger.UString;
       Schema : .Models.Neo4jCaptureDataChangeSchema_Type;
       Payload : .Models.Neo4jCaptureDataChangeNodePayload_Type;
     end record;


   package GraphNodeAllOfData_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.GraphNodeAllOfData_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.GraphNodeAllOfData_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in GraphNodeAllOfData_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.GraphNodeAllOfData_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out GraphNodeAllOfData_Type_Vectors.Vector);



   type GraphNode_Type is
     record
       Id : Swagger.UString;
       Source : Swagger.UString;
       Specversion : Swagger.UString;
       P_Type : Swagger.UString;
       Datacontenttype : Swagger.Nullable_UString;
       Dataschema : Swagger.Nullable_UString;
       Subject : Swagger.Nullable_UString;
       Time : Swagger.Nullable_Date;
       Data : .Models.GraphNodeAllOfData_Type;
       Data_Base_64 : Swagger.Nullable_UString;
     end record;


   package GraphNode_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.GraphNode_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.GraphNode_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in GraphNode_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.GraphNode_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out GraphNode_Type_Vectors.Vector);



   type Neo4jCaptureDataChange_Type is
     record
       Headers : .Models.AnyType_Type;
       Message_Key : Swagger.UString;
       Meta : .Models.Neo4jCaptureDataChangeMeta_Type;
       Offset : Integer;
       Partition : Integer;
       Source_Type : Swagger.UString;
       Timestamp : Swagger.Datetime;
       Topic : Swagger.UString;
       Schema : .Models.Neo4jCaptureDataChangeSchema_Type;
       Payload : .Models.Neo4jCaptureDataChangePayload_Type;
     end record;


   package Neo4jCaptureDataChange_Type_Vectors is
      new Ada.Containers.Vectors (Index_Type   => Positive,
                                  Element_Type => .Models.Neo4jCaptureDataChange_Type);

   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in .Models.Neo4jCaptureDataChange_Type);
   procedure Serialize (Into  : in out Swagger.Streams.Output_Stream'Class;
                        Name  : in String;
                        Value : in Neo4jCaptureDataChange_Type_Vectors.Vector);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : out .Models.Neo4jCaptureDataChange_Type);
   procedure Deserialize (From  : in Swagger.Value_Type;
                          Name  : in String;
                          Value : in out Neo4jCaptureDataChange_Type_Vectors.Vector);


end .Models;
