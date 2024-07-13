# Neo4jCaptureDataChangeMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operation** | **string** |  | 
**Source** | [**Neo4jCaptureDataChangeMetaSource**](Neo4jCaptureDataChangeMetaSource.md) |  | 
**Timestamp** | **int32** |  | 
**TxEventId** | **int32** |  | 
**TxEventsCount** | **int32** |  | 
**TxId** | **int32** |  | 
**Username** | **string** |  | 

## Methods

### NewNeo4jCaptureDataChangeMeta

`func NewNeo4jCaptureDataChangeMeta(operation string, source Neo4jCaptureDataChangeMetaSource, timestamp int32, txEventId int32, txEventsCount int32, txId int32, username string, ) *Neo4jCaptureDataChangeMeta`

NewNeo4jCaptureDataChangeMeta instantiates a new Neo4jCaptureDataChangeMeta object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewNeo4jCaptureDataChangeMetaWithDefaults

`func NewNeo4jCaptureDataChangeMetaWithDefaults() *Neo4jCaptureDataChangeMeta`

NewNeo4jCaptureDataChangeMetaWithDefaults instantiates a new Neo4jCaptureDataChangeMeta object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOperation

`func (o *Neo4jCaptureDataChangeMeta) GetOperation() string`

GetOperation returns the Operation field if non-nil, zero value otherwise.

### GetOperationOk

`func (o *Neo4jCaptureDataChangeMeta) GetOperationOk() (*string, bool)`

GetOperationOk returns a tuple with the Operation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperation

`func (o *Neo4jCaptureDataChangeMeta) SetOperation(v string)`

SetOperation sets Operation field to given value.


### GetSource

`func (o *Neo4jCaptureDataChangeMeta) GetSource() Neo4jCaptureDataChangeMetaSource`

GetSource returns the Source field if non-nil, zero value otherwise.

### GetSourceOk

`func (o *Neo4jCaptureDataChangeMeta) GetSourceOk() (*Neo4jCaptureDataChangeMetaSource, bool)`

GetSourceOk returns a tuple with the Source field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSource

`func (o *Neo4jCaptureDataChangeMeta) SetSource(v Neo4jCaptureDataChangeMetaSource)`

SetSource sets Source field to given value.


### GetTimestamp

`func (o *Neo4jCaptureDataChangeMeta) GetTimestamp() int32`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *Neo4jCaptureDataChangeMeta) GetTimestampOk() (*int32, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *Neo4jCaptureDataChangeMeta) SetTimestamp(v int32)`

SetTimestamp sets Timestamp field to given value.


### GetTxEventId

`func (o *Neo4jCaptureDataChangeMeta) GetTxEventId() int32`

GetTxEventId returns the TxEventId field if non-nil, zero value otherwise.

### GetTxEventIdOk

`func (o *Neo4jCaptureDataChangeMeta) GetTxEventIdOk() (*int32, bool)`

GetTxEventIdOk returns a tuple with the TxEventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTxEventId

`func (o *Neo4jCaptureDataChangeMeta) SetTxEventId(v int32)`

SetTxEventId sets TxEventId field to given value.


### GetTxEventsCount

`func (o *Neo4jCaptureDataChangeMeta) GetTxEventsCount() int32`

GetTxEventsCount returns the TxEventsCount field if non-nil, zero value otherwise.

### GetTxEventsCountOk

`func (o *Neo4jCaptureDataChangeMeta) GetTxEventsCountOk() (*int32, bool)`

GetTxEventsCountOk returns a tuple with the TxEventsCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTxEventsCount

`func (o *Neo4jCaptureDataChangeMeta) SetTxEventsCount(v int32)`

SetTxEventsCount sets TxEventsCount field to given value.


### GetTxId

`func (o *Neo4jCaptureDataChangeMeta) GetTxId() int32`

GetTxId returns the TxId field if non-nil, zero value otherwise.

### GetTxIdOk

`func (o *Neo4jCaptureDataChangeMeta) GetTxIdOk() (*int32, bool)`

GetTxIdOk returns a tuple with the TxId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTxId

`func (o *Neo4jCaptureDataChangeMeta) SetTxId(v int32)`

SetTxId sets TxId field to given value.


### GetUsername

`func (o *Neo4jCaptureDataChangeMeta) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *Neo4jCaptureDataChangeMeta) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *Neo4jCaptureDataChangeMeta) SetUsername(v string)`

SetUsername sets Username field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


