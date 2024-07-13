# GraphRelationshipAllOfData

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
**Payload** | [**Neo4jCaptureDataChangeRelationshipPayload**](Neo4jCaptureDataChangeRelationshipPayload.md) |  | 

## Methods

### NewGraphRelationshipAllOfData

`func NewGraphRelationshipAllOfData(headers map[string]interface{}, messageKey string, meta Neo4jCaptureDataChangeMeta, offset int32, partition int32, sourceType string, timestamp time.Time, topic string, schema Neo4jCaptureDataChangeSchema, payload Neo4jCaptureDataChangeRelationshipPayload, ) *GraphRelationshipAllOfData`

NewGraphRelationshipAllOfData instantiates a new GraphRelationshipAllOfData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGraphRelationshipAllOfDataWithDefaults

`func NewGraphRelationshipAllOfDataWithDefaults() *GraphRelationshipAllOfData`

NewGraphRelationshipAllOfDataWithDefaults instantiates a new GraphRelationshipAllOfData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHeaders

`func (o *GraphRelationshipAllOfData) GetHeaders() map[string]interface{}`

GetHeaders returns the Headers field if non-nil, zero value otherwise.

### GetHeadersOk

`func (o *GraphRelationshipAllOfData) GetHeadersOk() (*map[string]interface{}, bool)`

GetHeadersOk returns a tuple with the Headers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeaders

`func (o *GraphRelationshipAllOfData) SetHeaders(v map[string]interface{})`

SetHeaders sets Headers field to given value.


### GetMessageKey

`func (o *GraphRelationshipAllOfData) GetMessageKey() string`

GetMessageKey returns the MessageKey field if non-nil, zero value otherwise.

### GetMessageKeyOk

`func (o *GraphRelationshipAllOfData) GetMessageKeyOk() (*string, bool)`

GetMessageKeyOk returns a tuple with the MessageKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageKey

`func (o *GraphRelationshipAllOfData) SetMessageKey(v string)`

SetMessageKey sets MessageKey field to given value.


### GetMeta

`func (o *GraphRelationshipAllOfData) GetMeta() Neo4jCaptureDataChangeMeta`

GetMeta returns the Meta field if non-nil, zero value otherwise.

### GetMetaOk

`func (o *GraphRelationshipAllOfData) GetMetaOk() (*Neo4jCaptureDataChangeMeta, bool)`

GetMetaOk returns a tuple with the Meta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMeta

`func (o *GraphRelationshipAllOfData) SetMeta(v Neo4jCaptureDataChangeMeta)`

SetMeta sets Meta field to given value.


### GetOffset

`func (o *GraphRelationshipAllOfData) GetOffset() int32`

GetOffset returns the Offset field if non-nil, zero value otherwise.

### GetOffsetOk

`func (o *GraphRelationshipAllOfData) GetOffsetOk() (*int32, bool)`

GetOffsetOk returns a tuple with the Offset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffset

`func (o *GraphRelationshipAllOfData) SetOffset(v int32)`

SetOffset sets Offset field to given value.


### GetPartition

`func (o *GraphRelationshipAllOfData) GetPartition() int32`

GetPartition returns the Partition field if non-nil, zero value otherwise.

### GetPartitionOk

`func (o *GraphRelationshipAllOfData) GetPartitionOk() (*int32, bool)`

GetPartitionOk returns a tuple with the Partition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartition

`func (o *GraphRelationshipAllOfData) SetPartition(v int32)`

SetPartition sets Partition field to given value.


### GetSourceType

`func (o *GraphRelationshipAllOfData) GetSourceType() string`

GetSourceType returns the SourceType field if non-nil, zero value otherwise.

### GetSourceTypeOk

`func (o *GraphRelationshipAllOfData) GetSourceTypeOk() (*string, bool)`

GetSourceTypeOk returns a tuple with the SourceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceType

`func (o *GraphRelationshipAllOfData) SetSourceType(v string)`

SetSourceType sets SourceType field to given value.


### GetTimestamp

`func (o *GraphRelationshipAllOfData) GetTimestamp() time.Time`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *GraphRelationshipAllOfData) GetTimestampOk() (*time.Time, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *GraphRelationshipAllOfData) SetTimestamp(v time.Time)`

SetTimestamp sets Timestamp field to given value.


### GetTopic

`func (o *GraphRelationshipAllOfData) GetTopic() string`

GetTopic returns the Topic field if non-nil, zero value otherwise.

### GetTopicOk

`func (o *GraphRelationshipAllOfData) GetTopicOk() (*string, bool)`

GetTopicOk returns a tuple with the Topic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopic

`func (o *GraphRelationshipAllOfData) SetTopic(v string)`

SetTopic sets Topic field to given value.


### GetSchema

`func (o *GraphRelationshipAllOfData) GetSchema() Neo4jCaptureDataChangeSchema`

GetSchema returns the Schema field if non-nil, zero value otherwise.

### GetSchemaOk

`func (o *GraphRelationshipAllOfData) GetSchemaOk() (*Neo4jCaptureDataChangeSchema, bool)`

GetSchemaOk returns a tuple with the Schema field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSchema

`func (o *GraphRelationshipAllOfData) SetSchema(v Neo4jCaptureDataChangeSchema)`

SetSchema sets Schema field to given value.


### GetPayload

`func (o *GraphRelationshipAllOfData) GetPayload() Neo4jCaptureDataChangeRelationshipPayload`

GetPayload returns the Payload field if non-nil, zero value otherwise.

### GetPayloadOk

`func (o *GraphRelationshipAllOfData) GetPayloadOk() (*Neo4jCaptureDataChangeRelationshipPayload, bool)`

GetPayloadOk returns a tuple with the Payload field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayload

`func (o *GraphRelationshipAllOfData) SetPayload(v Neo4jCaptureDataChangeRelationshipPayload)`

SetPayload sets Payload field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


