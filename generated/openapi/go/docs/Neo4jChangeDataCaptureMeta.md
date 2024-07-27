# Neo4jChangeDataCaptureMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**Source** | [**Neo4jChangeDataCaptureMetaSource**](Neo4jChangeDataCaptureMetaSource.md) |  | 
**Timestamp** | **int32** |  | 
**TxEventId** | **int32** |  | 
**TxEventsCount** | **int32** |  | 
**TxId** | **int32** |  | 
**Username** | **string** |  | 

## Methods

### NewNeo4jChangeDataCaptureMeta

`func NewNeo4jChangeDataCaptureMeta(operation string, source Neo4jChangeDataCaptureMetaSource, timestamp int32, txEventId int32, txEventsCount int32, txId int32, username string, ) *Neo4jChangeDataCaptureMeta`

NewNeo4jChangeDataCaptureMeta instantiates a new Neo4jChangeDataCaptureMeta object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewNeo4jChangeDataCaptureMetaWithDefaults

`func NewNeo4jChangeDataCaptureMetaWithDefaults() *Neo4jChangeDataCaptureMeta`

NewNeo4jChangeDataCaptureMetaWithDefaults instantiates a new Neo4jChangeDataCaptureMeta object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *Neo4jChangeDataCaptureMeta) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *Neo4jChangeDataCaptureMeta) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *Neo4jChangeDataCaptureMeta) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetSource

`func (o *Neo4jChangeDataCaptureMeta) GetSource() Neo4jChangeDataCaptureMetaSource`

GetSource returns the Source field if non-nil, zero value otherwise.

### GetSourceOk

`func (o *Neo4jChangeDataCaptureMeta) GetSourceOk() (*Neo4jChangeDataCaptureMetaSource, bool)`

GetSourceOk returns a tuple with the Source field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSource

`func (o *Neo4jChangeDataCaptureMeta) SetSource(v Neo4jChangeDataCaptureMetaSource)`

SetSource sets Source field to given value.


### GetTimestamp

`func (o *Neo4jChangeDataCaptureMeta) GetTimestamp() int32`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *Neo4jChangeDataCaptureMeta) GetTimestampOk() (*int32, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *Neo4jChangeDataCaptureMeta) SetTimestamp(v int32)`

SetTimestamp sets Timestamp field to given value.


### GetTxEventId

`func (o *Neo4jChangeDataCaptureMeta) GetTxEventId() int32`

GetTxEventId returns the TxEventId field if non-nil, zero value otherwise.

### GetTxEventIdOk

`func (o *Neo4jChangeDataCaptureMeta) GetTxEventIdOk() (*int32, bool)`

GetTxEventIdOk returns a tuple with the TxEventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTxEventId

`func (o *Neo4jChangeDataCaptureMeta) SetTxEventId(v int32)`

SetTxEventId sets TxEventId field to given value.


### GetTxEventsCount

`func (o *Neo4jChangeDataCaptureMeta) GetTxEventsCount() int32`

GetTxEventsCount returns the TxEventsCount field if non-nil, zero value otherwise.

### GetTxEventsCountOk

`func (o *Neo4jChangeDataCaptureMeta) GetTxEventsCountOk() (*int32, bool)`

GetTxEventsCountOk returns a tuple with the TxEventsCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTxEventsCount

`func (o *Neo4jChangeDataCaptureMeta) SetTxEventsCount(v int32)`

SetTxEventsCount sets TxEventsCount field to given value.


### GetTxId

`func (o *Neo4jChangeDataCaptureMeta) GetTxId() int32`

GetTxId returns the TxId field if non-nil, zero value otherwise.

### GetTxIdOk

`func (o *Neo4jChangeDataCaptureMeta) GetTxIdOk() (*int32, bool)`

GetTxIdOk returns a tuple with the TxId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTxId

`func (o *Neo4jChangeDataCaptureMeta) SetTxId(v int32)`

SetTxId sets TxId field to given value.


### GetUsername

`func (o *Neo4jChangeDataCaptureMeta) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *Neo4jChangeDataCaptureMeta) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *Neo4jChangeDataCaptureMeta) SetUsername(v string)`

SetUsername sets Username field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


