# Neo4jCaptureDataChange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Headers** | **map[string]interface{}** |  | 
**MessageKey** | **string** |  | 
**Meta** | [**Neo4jCaptureDataChangeMeta**](Neo4jCaptureDataChangeMeta.md) |  | 
**Offset** | **int32** |  | 
**Partition** | **int32** |  | 
**SourceType** | **string** |  | 
**Timestamp** | **time.Time** |  | 
**Topic** | **string** |  | 
**Schema** | [**Neo4jCaptureDataChangeSchema**](Neo4jCaptureDataChangeSchema.md) |  | 
**Payload** | [**Neo4jCaptureDataChangePayload**](Neo4jCaptureDataChangePayload.md) |  | 

## Methods

### NewNeo4jCaptureDataChange

`func NewNeo4jCaptureDataChange(headers map[string]interface{}, messageKey string, meta Neo4jCaptureDataChangeMeta, offset int32, partition int32, sourceType string, timestamp time.Time, topic string, schema Neo4jCaptureDataChangeSchema, payload Neo4jCaptureDataChangePayload, ) *Neo4jCaptureDataChange`

NewNeo4jCaptureDataChange instantiates a new Neo4jCaptureDataChange object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewNeo4jCaptureDataChangeWithDefaults

`func NewNeo4jCaptureDataChangeWithDefaults() *Neo4jCaptureDataChange`

NewNeo4jCaptureDataChangeWithDefaults instantiates a new Neo4jCaptureDataChange object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHeaders

`func (o *Neo4jCaptureDataChange) GetHeaders() map[string]interface{}`

GetHeaders returns the Headers field if non-nil, zero value otherwise.

### GetHeadersOk

`func (o *Neo4jCaptureDataChange) GetHeadersOk() (*map[string]interface{}, bool)`

GetHeadersOk returns a tuple with the Headers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeaders

`func (o *Neo4jCaptureDataChange) SetHeaders(v map[string]interface{})`

SetHeaders sets Headers field to given value.


### GetMessageKey

`func (o *Neo4jCaptureDataChange) GetMessageKey() string`

GetMessageKey returns the MessageKey field if non-nil, zero value otherwise.

### GetMessageKeyOk

`func (o *Neo4jCaptureDataChange) GetMessageKeyOk() (*string, bool)`

GetMessageKeyOk returns a tuple with the MessageKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageKey

`func (o *Neo4jCaptureDataChange) SetMessageKey(v string)`

SetMessageKey sets MessageKey field to given value.


### GetMeta

`func (o *Neo4jCaptureDataChange) GetMeta() Neo4jCaptureDataChangeMeta`

GetMeta returns the Meta field if non-nil, zero value otherwise.

### GetMetaOk

`func (o *Neo4jCaptureDataChange) GetMetaOk() (*Neo4jCaptureDataChangeMeta, bool)`

GetMetaOk returns a tuple with the Meta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMeta

`func (o *Neo4jCaptureDataChange) SetMeta(v Neo4jCaptureDataChangeMeta)`

SetMeta sets Meta field to given value.


### GetOffset

`func (o *Neo4jCaptureDataChange) GetOffset() int32`

GetOffset returns the Offset field if non-nil, zero value otherwise.

### GetOffsetOk

`func (o *Neo4jCaptureDataChange) GetOffsetOk() (*int32, bool)`

GetOffsetOk returns a tuple with the Offset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffset

`func (o *Neo4jCaptureDataChange) SetOffset(v int32)`

SetOffset sets Offset field to given value.


### GetPartition

`func (o *Neo4jCaptureDataChange) GetPartition() int32`

GetPartition returns the Partition field if non-nil, zero value otherwise.

### GetPartitionOk

`func (o *Neo4jCaptureDataChange) GetPartitionOk() (*int32, bool)`

GetPartitionOk returns a tuple with the Partition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartition

`func (o *Neo4jCaptureDataChange) SetPartition(v int32)`

SetPartition sets Partition field to given value.


### GetSourceType

`func (o *Neo4jCaptureDataChange) GetSourceType() string`

GetSourceType returns the SourceType field if non-nil, zero value otherwise.

### GetSourceTypeOk

`func (o *Neo4jCaptureDataChange) GetSourceTypeOk() (*string, bool)`

GetSourceTypeOk returns a tuple with the SourceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceType

`func (o *Neo4jCaptureDataChange) SetSourceType(v string)`

SetSourceType sets SourceType field to given value.


### GetTimestamp

`func (o *Neo4jCaptureDataChange) GetTimestamp() time.Time`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *Neo4jCaptureDataChange) GetTimestampOk() (*time.Time, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *Neo4jCaptureDataChange) SetTimestamp(v time.Time)`

SetTimestamp sets Timestamp field to given value.


### GetTopic

`func (o *Neo4jCaptureDataChange) GetTopic() string`

GetTopic returns the Topic field if non-nil, zero value otherwise.

### GetTopicOk

`func (o *Neo4jCaptureDataChange) GetTopicOk() (*string, bool)`

GetTopicOk returns a tuple with the Topic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopic

`func (o *Neo4jCaptureDataChange) SetTopic(v string)`

SetTopic sets Topic field to given value.


### GetSchema

`func (o *Neo4jCaptureDataChange) GetSchema() Neo4jCaptureDataChangeSchema`

GetSchema returns the Schema field if non-nil, zero value otherwise.

### GetSchemaOk

`func (o *Neo4jCaptureDataChange) GetSchemaOk() (*Neo4jCaptureDataChangeSchema, bool)`

GetSchemaOk returns a tuple with the Schema field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSchema

`func (o *Neo4jCaptureDataChange) SetSchema(v Neo4jCaptureDataChangeSchema)`

SetSchema sets Schema field to given value.


### GetPayload

`func (o *Neo4jCaptureDataChange) GetPayload() Neo4jCaptureDataChangePayload`

GetPayload returns the Payload field if non-nil, zero value otherwise.

### GetPayloadOk

`func (o *Neo4jCaptureDataChange) GetPayloadOk() (*Neo4jCaptureDataChangePayload, bool)`

GetPayloadOk returns a tuple with the Payload field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayload

`func (o *Neo4jCaptureDataChange) SetPayload(v Neo4jCaptureDataChangePayload)`

SetPayload sets Payload field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


