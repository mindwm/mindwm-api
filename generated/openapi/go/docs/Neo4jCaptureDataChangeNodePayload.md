# Neo4jCaptureDataChangeNodePayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**After** | [**Neo4jCaptureDataChangeNodePayloadAfter**](Neo4jCaptureDataChangeNodePayloadAfter.md) |  | 
**Before** | **string** |  | 
**Id** | **string** |  | 
**Type** | **string** |  | 

## Methods

### NewNeo4jCaptureDataChangeNodePayload

`func NewNeo4jCaptureDataChangeNodePayload(after Neo4jCaptureDataChangeNodePayloadAfter, before string, id string, type_ string, ) *Neo4jCaptureDataChangeNodePayload`

NewNeo4jCaptureDataChangeNodePayload instantiates a new Neo4jCaptureDataChangeNodePayload object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewNeo4jCaptureDataChangeNodePayloadWithDefaults

`func NewNeo4jCaptureDataChangeNodePayloadWithDefaults() *Neo4jCaptureDataChangeNodePayload`

NewNeo4jCaptureDataChangeNodePayloadWithDefaults instantiates a new Neo4jCaptureDataChangeNodePayload object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAfter

`func (o *Neo4jCaptureDataChangeNodePayload) GetAfter() Neo4jCaptureDataChangeNodePayloadAfter`

GetAfter returns the After field if non-nil, zero value otherwise.

### GetAfterOk

`func (o *Neo4jCaptureDataChangeNodePayload) GetAfterOk() (*Neo4jCaptureDataChangeNodePayloadAfter, bool)`

GetAfterOk returns a tuple with the After field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAfter

`func (o *Neo4jCaptureDataChangeNodePayload) SetAfter(v Neo4jCaptureDataChangeNodePayloadAfter)`

SetAfter sets After field to given value.


### GetBefore

`func (o *Neo4jCaptureDataChangeNodePayload) GetBefore() string`

GetBefore returns the Before field if non-nil, zero value otherwise.

### GetBeforeOk

`func (o *Neo4jCaptureDataChangeNodePayload) GetBeforeOk() (*string, bool)`

GetBeforeOk returns a tuple with the Before field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBefore

`func (o *Neo4jCaptureDataChangeNodePayload) SetBefore(v string)`

SetBefore sets Before field to given value.


### GetId

`func (o *Neo4jCaptureDataChangeNodePayload) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Neo4jCaptureDataChangeNodePayload) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Neo4jCaptureDataChangeNodePayload) SetId(v string)`

SetId sets Id field to given value.


### GetType

`func (o *Neo4jCaptureDataChangeNodePayload) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *Neo4jCaptureDataChangeNodePayload) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *Neo4jCaptureDataChangeNodePayload) SetType(v string)`

SetType sets Type field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


