# GraphNodeAllOfData

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
**Payload** | [**Neo4jCaptureDataChangeNodePayload**](Neo4jCaptureDataChangeNodePayload.md) |  | 

## Methods

### NewGraphNodeAllOfData

`func NewGraphNodeAllOfData(headers map[string]interface{}, messageKey string, meta Neo4jCaptureDataChangeMeta, offset int32, partition int32, sourceType string, timestamp time.Time, topic string, schema Neo4jCaptureDataChangeSchema, payload Neo4jCaptureDataChangeNodePayload, ) *GraphNodeAllOfData`

NewGraphNodeAllOfData instantiates a new GraphNodeAllOfData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGraphNodeAllOfDataWithDefaults

`func NewGraphNodeAllOfDataWithDefaults() *GraphNodeAllOfData`

NewGraphNodeAllOfDataWithDefaults instantiates a new GraphNodeAllOfData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHeaders

`func (o *GraphNodeAllOfData) GetHeaders() map[string]interface{}`

GetHeaders returns the Headers field if non-nil, zero value otherwise.

### GetHeadersOk

`func (o *GraphNodeAllOfData) GetHeadersOk() (*map[string]interface{}, bool)`

GetHeadersOk returns a tuple with the Headers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeaders

`func (o *GraphNodeAllOfData) SetHeaders(v map[string]interface{})`

SetHeaders sets Headers field to given value.


### GetMessageKey

`func (o *GraphNodeAllOfData) GetMessageKey() string`

GetMessageKey returns the MessageKey field if non-nil, zero value otherwise.

### GetMessageKeyOk

`func (o *GraphNodeAllOfData) GetMessageKeyOk() (*string, bool)`

GetMessageKeyOk returns a tuple with the MessageKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessageKey

`func (o *GraphNodeAllOfData) SetMessageKey(v string)`

SetMessageKey sets MessageKey field to given value.


### GetMeta

`func (o *GraphNodeAllOfData) GetMeta() Neo4jCaptureDataChangeMeta`

GetMeta returns the Meta field if non-nil, zero value otherwise.

### GetMetaOk

`func (o *GraphNodeAllOfData) GetMetaOk() (*Neo4jCaptureDataChangeMeta, bool)`

GetMetaOk returns a tuple with the Meta field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMeta

`func (o *GraphNodeAllOfData) SetMeta(v Neo4jCaptureDataChangeMeta)`

SetMeta sets Meta field to given value.


### GetOffset

`func (o *GraphNodeAllOfData) GetOffset() int32`

GetOffset returns the Offset field if non-nil, zero value otherwise.

### GetOffsetOk

`func (o *GraphNodeAllOfData) GetOffsetOk() (*int32, bool)`

GetOffsetOk returns a tuple with the Offset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOffset

`func (o *GraphNodeAllOfData) SetOffset(v int32)`

SetOffset sets Offset field to given value.


### GetPartition

`func (o *GraphNodeAllOfData) GetPartition() int32`

GetPartition returns the Partition field if non-nil, zero value otherwise.

### GetPartitionOk

`func (o *GraphNodeAllOfData) GetPartitionOk() (*int32, bool)`

GetPartitionOk returns a tuple with the Partition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPartition

`func (o *GraphNodeAllOfData) SetPartition(v int32)`

SetPartition sets Partition field to given value.


### GetSourceType

`func (o *GraphNodeAllOfData) GetSourceType() string`

GetSourceType returns the SourceType field if non-nil, zero value otherwise.

### GetSourceTypeOk

`func (o *GraphNodeAllOfData) GetSourceTypeOk() (*string, bool)`

GetSourceTypeOk returns a tuple with the SourceType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceType

`func (o *GraphNodeAllOfData) SetSourceType(v string)`

SetSourceType sets SourceType field to given value.


### GetTimestamp

`func (o *GraphNodeAllOfData) GetTimestamp() time.Time`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *GraphNodeAllOfData) GetTimestampOk() (*time.Time, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *GraphNodeAllOfData) SetTimestamp(v time.Time)`

SetTimestamp sets Timestamp field to given value.


### GetTopic

`func (o *GraphNodeAllOfData) GetTopic() string`

GetTopic returns the Topic field if non-nil, zero value otherwise.

### GetTopicOk

`func (o *GraphNodeAllOfData) GetTopicOk() (*string, bool)`

GetTopicOk returns a tuple with the Topic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopic

`func (o *GraphNodeAllOfData) SetTopic(v string)`

SetTopic sets Topic field to given value.


### GetSchema

`func (o *GraphNodeAllOfData) GetSchema() Neo4jCaptureDataChangeSchema`

GetSchema returns the Schema field if non-nil, zero value otherwise.

### GetSchemaOk

`func (o *GraphNodeAllOfData) GetSchemaOk() (*Neo4jCaptureDataChangeSchema, bool)`

GetSchemaOk returns a tuple with the Schema field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSchema

`func (o *GraphNodeAllOfData) SetSchema(v Neo4jCaptureDataChangeSchema)`

SetSchema sets Schema field to given value.


### GetPayload

`func (o *GraphNodeAllOfData) GetPayload() Neo4jCaptureDataChangeNodePayload`

GetPayload returns the Payload field if non-nil, zero value otherwise.

### GetPayloadOk

`func (o *GraphNodeAllOfData) GetPayloadOk() (*Neo4jCaptureDataChangeNodePayload, bool)`

GetPayloadOk returns a tuple with the Payload field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayload

`func (o *GraphNodeAllOfData) SetPayload(v Neo4jCaptureDataChangeNodePayload)`

SetPayload sets Payload field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


