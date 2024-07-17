# MindWM::IoDocument


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | Identifies the event. | [Min. length: 1] 
**source** | **character** |  | 
**specversion** | **character** | The version of the CloudEvents specification which the event uses. | [Min. length: 1] 
**type** | **character** |  | [default to &quot;IoDocument&quot;] 
**datacontenttype** | **character** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] [Min. length: 1] 
**dataschema** | **character** | Identifies the schema that data adheres to. | [optional] [Min. length: 1] 
**subject** | **character** |  | [optional] [default to &quot;IoDocument&quot;] 
**time** | **character** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] [Min. length: 1] 
**data** | [**TmuxPaneIoDocument**](TmuxPaneIoDocument.md) |  | [optional] 
**data_base64** | **character** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 


