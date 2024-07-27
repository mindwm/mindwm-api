# Neo4jChangeDataCaptureNodePayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**After** | [**Neo4jChangeDataCaptureNodePayloadAfter**](Neo4jChangeDataCaptureNodePayloadAfter.md) |  | 
**Before** | **string** |  | 
**Id** | **string** |  | 
**Type** | **string** |  | 

## Methods

### NewNeo4jChangeDataCaptureNodePayload

`func NewNeo4jChangeDataCaptureNodePayload(after Neo4jChangeDataCaptureNodePayloadAfter, before string, id string, type_ string, ) *Neo4jChangeDataCaptureNodePayload`

NewNeo4jChangeDataCaptureNodePayload instantiates a new Neo4jChangeDataCaptureNodePayload object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewNeo4jChangeDataCaptureNodePayloadWithDefaults

`func NewNeo4jChangeDataCaptureNodePayloadWithDefaults() *Neo4jChangeDataCaptureNodePayload`

NewNeo4jChangeDataCaptureNodePayloadWithDefaults instantiates a new Neo4jChangeDataCaptureNodePayload object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAfter

`func (o *Neo4jChangeDataCaptureNodePayload) GetAfter() Neo4jChangeDataCaptureNodePayloadAfter`

GetAfter returns the After field if non-nil, zero value otherwise.

### GetAfterOk

`func (o *Neo4jChangeDataCaptureNodePayload) GetAfterOk() (*Neo4jChangeDataCaptureNodePayloadAfter, bool)`

GetAfterOk returns a tuple with the After field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAfter

`func (o *Neo4jChangeDataCaptureNodePayload) SetAfter(v Neo4jChangeDataCaptureNodePayloadAfter)`

SetAfter sets After field to given value.


### GetBefore

`func (o *Neo4jChangeDataCaptureNodePayload) GetBefore() string`

GetBefore returns the Before field if non-nil, zero value otherwise.

### GetBeforeOk

`func (o *Neo4jChangeDataCaptureNodePayload) GetBeforeOk() (*string, bool)`

GetBeforeOk returns a tuple with the Before field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBefore

`func (o *Neo4jChangeDataCaptureNodePayload) SetBefore(v string)`

SetBefore sets Before field to given value.


### GetId

`func (o *Neo4jChangeDataCaptureNodePayload) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Neo4jChangeDataCaptureNodePayload) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Neo4jChangeDataCaptureNodePayload) SetId(v string)`

SetId sets Id field to given value.


### GetType

`func (o *Neo4jChangeDataCaptureNodePayload) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *Neo4jChangeDataCaptureNodePayload) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *Neo4jChangeDataCaptureNodePayload) SetType(v string)`

SetType sets Type field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


