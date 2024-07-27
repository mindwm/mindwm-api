# Neo4jChangeDataCapture

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Headers** | **map[string]interface{}** |  | 
**MessageKey** | **string** |  | 
**Meta** | [**Neo4jChangeDataCaptureMeta**](Neo4jChangeDataCaptureMeta.md) |  | 
**Offset** | **int32** |  | 
**Partition** | **int32** |  | 
**SourceType** | **string** |  | 
**Timestamp** | **time.Time** |  | 
**Topic** | **string** |  | 
**Schema** | [**Neo4jChangeDataCaptureSchema**](Neo4jChangeDataCaptureSchema.md) |  | 
**Payload** | [**Neo4jChangeDataCapturePayload**](Neo4jChangeDataCapturePayload.md) |  | 

## Methods

### NewNeo4jChangeDataCapture

`func NewNeo4jChangeDataCapture(headers map[string]interface{}, messageKey string, meta Neo4jChangeDataCaptureMeta, offset int32, partition int32, sourceType string, timestamp time.Time, topic string, schema Neo4jChangeDataCaptureSchema, payload Neo4jChangeDataCapturePayload, ) *Neo4jChangeDataCapture`

NewNeo4jChangeDataCapture instantiates a new Neo4jChangeDataCapture object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewNeo4jChangeDataCaptureWithDefaults

`func NewNeo4jChangeDataCaptureWithDefaults() *Neo4jChangeDataCapture`

NewNeo4jChangeDataCaptureWithDefaults instantiates a new Neo4jChangeDataCapture object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHeaders

`func (o *Neo4jChangeDataCapture) GetHeaders() map[string]interface{}`

GetHeaders returns the Headers field if non-nil, zero value otherwise.

### GetHeadersOk

`func (o *Neo4jChangeDataCapture) GetHeadersOk() (*map[string]interface{}, bool)`

GetHeadersOk returns a tuple with the Headers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeaders

`func (o *Neo4jChangeDataCapture) SetHeaders(v map[string]interface{})`

SetHeaders sets Headers field to given value.


### GetMessageKey

`func (o *Neo4jChangeDataCapture) GetMessageKey() string`

GetMessageKey returns the MessageKey field if non-nil, zero value otherwise.

### GetMessageKeyOk

`func (o *Neo4jChangeDataCapture) GetMessageKeyOk() (*string, bool)`

GetMessageKeyOk returns a tuple with the MessageKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageKey

`func (o *Neo4jChangeDataCapture) SetMessageKey(v string)`

SetMessageKey sets MessageKey field to given value.


### GetMeta

`func (o *Neo4jChangeDataCapture) GetMeta() Neo4jChangeDataCaptureMeta`

GetMeta returns the Meta field if non-nil, zero value otherwise.

### GetMetaOk

`func (o *Neo4jChangeDataCapture) GetMetaOk() (*Neo4jChangeDataCaptureMeta, bool)`

GetMetaOk returns a tuple with the Meta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMeta

`func (o *Neo4jChangeDataCapture) SetMeta(v Neo4jChangeDataCaptureMeta)`

SetMeta sets Meta field to given value.


### GetOffset

`func (o *Neo4jChangeDataCapture) GetOffset() int32`

GetOffset returns the Offset field if non-nil, zero value otherwise.

### GetOffsetOk

`func (o *Neo4jChangeDataCapture) GetOffsetOk() (*int32, bool)`

GetOffsetOk returns a tuple with the Offset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffset

`func (o *Neo4jChangeDataCapture) SetOffset(v int32)`

SetOffset sets Offset field to given value.


### GetPartition

`func (o *Neo4jChangeDataCapture) GetPartition() int32`

GetPartition returns the Partition field if non-nil, zero value otherwise.

### GetPartitionOk

`func (o *Neo4jChangeDataCapture) GetPartitionOk() (*int32, bool)`

GetPartitionOk returns a tuple with the Partition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartition

`func (o *Neo4jChangeDataCapture) SetPartition(v int32)`

SetPartition sets Partition field to given value.


### GetSourceType

`func (o *Neo4jChangeDataCapture) GetSourceType() string`

GetSourceType returns the SourceType field if non-nil, zero value otherwise.

### GetSourceTypeOk

`func (o *Neo4jChangeDataCapture) GetSourceTypeOk() (*string, bool)`

GetSourceTypeOk returns a tuple with the SourceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceType

`func (o *Neo4jChangeDataCapture) SetSourceType(v string)`

SetSourceType sets SourceType field to given value.


### GetTimestamp

`func (o *Neo4jChangeDataCapture) GetTimestamp() time.Time`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *Neo4jChangeDataCapture) GetTimestampOk() (*time.Time, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *Neo4jChangeDataCapture) SetTimestamp(v time.Time)`

SetTimestamp sets Timestamp field to given value.


### GetTopic

`func (o *Neo4jChangeDataCapture) GetTopic() string`

GetTopic returns the Topic field if non-nil, zero value otherwise.

### GetTopicOk

`func (o *Neo4jChangeDataCapture) GetTopicOk() (*string, bool)`

GetTopicOk returns a tuple with the Topic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopic

`func (o *Neo4jChangeDataCapture) SetTopic(v string)`

SetTopic sets Topic field to given value.


### GetSchema

`func (o *Neo4jChangeDataCapture) GetSchema() Neo4jChangeDataCaptureSchema`

GetSchema returns the Schema field if non-nil, zero value otherwise.

### GetSchemaOk

`func (o *Neo4jChangeDataCapture) GetSchemaOk() (*Neo4jChangeDataCaptureSchema, bool)`

GetSchemaOk returns a tuple with the Schema field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSchema

`func (o *Neo4jChangeDataCapture) SetSchema(v Neo4jChangeDataCaptureSchema)`

SetSchema sets Schema field to given value.


### GetPayload

`func (o *Neo4jChangeDataCapture) GetPayload() Neo4jChangeDataCapturePayload`

GetPayload returns the Payload field if non-nil, zero value otherwise.

### GetPayloadOk

`func (o *Neo4jChangeDataCapture) GetPayloadOk() (*Neo4jChangeDataCapturePayload, bool)`

GetPayloadOk returns a tuple with the Payload field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayload

`func (o *Neo4jChangeDataCapture) SetPayload(v Neo4jChangeDataCapturePayload)`

SetPayload sets Payload field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


