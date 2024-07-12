# MindwWM::CloudEvent

CloudEvents Specification JSON Schema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | Identifies the event. | [Min. length: 1] 
**source** | **character** | Identifies the context in which an event happened. | [Min. length: 1] 
**specversion** | **character** | The version of the CloudEvents specification which the event uses. | [Min. length: 1] 
**type** | **character** | Describes the type of event related to the originating occurrence. | [Min. length: 1] 
**datacontenttype** | **character** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] [Min. length: 1] 
**dataschema** | **character** | Identifies the schema that data adheres to. | [optional] [Min. length: 1] 
**subject** | **character** | Describes the subject of the event in the context of the event producer (identified by source). | [optional] [Min. length: 1] 
**time** | **character** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] [Min. length: 1] 
**data** | [**CloudEventData**](CloudEvent_data.md) |  | [optional] 
**data_base64** | **character** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 


