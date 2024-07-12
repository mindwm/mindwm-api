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


end .Models;
