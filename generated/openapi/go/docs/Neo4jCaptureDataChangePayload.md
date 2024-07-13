# Neo4jCaptureDataChangePayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**After** | **map[string]interface{}** |  | 
**Before** | **string** |  | 
**Id** | **string** |  | 
**Type** | **string** |  | 
**End** | [**Neo4jCaptureDataChangeRelationshipPayloadEnd**](Neo4jCaptureDataChangeRelationshipPayloadEnd.md) |  | 
**Label** | **string** |  | 
**Start** | [**Neo4jCaptureDataChangeRelationshipPayloadEnd**](Neo4jCaptureDataChangeRelationshipPayloadEnd.md) |  | 

## Methods

### NewNeo4jCaptureDataChangePayload

`func NewNeo4jCaptureDataChangePayload(after map[string]interface{}, before string, id string, type_ string, end Neo4jCaptureDataChangeRelationshipPayloadEnd, label string, start Neo4jCaptureDataChangeRelationshipPayloadEnd, ) *Neo4jCaptureDataChangePayload`

NewNeo4jCaptureDataChangePayload instantiates a new Neo4jCaptureDataChangePayload object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewNeo4jCaptureDataChangePayloadWithDefaults

`func NewNeo4jCaptureDataChangePayloadWithDefaults() *Neo4jCaptureDataChangePayload`

NewNeo4jCaptureDataChangePayloadWithDefaults instantiates a new Neo4jCaptureDataChangePayload object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAfter

`func (o *Neo4jCaptureDataChangePayload) GetAfter() map[string]interface{}`

GetAfter returns the After field if non-nil, zero value otherwise.

### GetAfterOk

`func (o *Neo4jCaptureDataChangePayload) GetAfterOk() (*map[string]interface{}, bool)`

GetAfterOk returns a tuple with the After field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAfter

`func (o *Neo4jCaptureDataChangePayload) SetAfter(v map[string]interface{})`

SetAfter sets After field to given value.


### GetBefore

`func (o *Neo4jCaptureDataChangePayload) GetBefore() string`

GetBefore returns the Before field if non-nil, zero value otherwise.

### GetBeforeOk

`func (o *Neo4jCaptureDataChangePayload) GetBeforeOk() (*string, bool)`

GetBeforeOk returns a tuple with the Before field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBefore

`func (o *Neo4jCaptureDataChangePayload) SetBefore(v string)`

SetBefore sets Before field to given value.


### GetId

`func (o *Neo4jCaptureDataChangePayload) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Neo4jCaptureDataChangePayload) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Neo4jCaptureDataChangePayload) SetId(v string)`

SetId sets Id field to given value.


### GetType

`func (o *Neo4jCaptureDataChangePayload) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *Neo4jCaptureDataChangePayload) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *Neo4jCaptureDataChangePayload) SetType(v string)`

SetType sets Type field to given value.


### GetEnd

`func (o *Neo4jCaptureDataChangePayload) GetEnd() Neo4jCaptureDataChangeRelationshipPayloadEnd`

GetEnd returns the End field if non-nil, zero value otherwise.

### GetEndOk

`func (o *Neo4jCaptureDataChangePayload) GetEndOk() (*Neo4jCaptureDataChangeRelationshipPayloadEnd, bool)`

GetEndOk returns a tuple with the End field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnd

`func (o *Neo4jCaptureDataChangePayload) SetEnd(v Neo4jCaptureDataChangeRelationshipPayloadEnd)`

SetEnd sets End field to given value.


### GetLabel

`func (o *Neo4jCaptureDataChangePayload) GetLabel() string`

GetLabel returns the Label field if non-nil, zero value otherwise.

### GetLabelOk

`func (o *Neo4jCaptureDataChangePayload) GetLabelOk() (*string, bool)`

GetLabelOk returns a tuple with the Label field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabel

`func (o *Neo4jCaptureDataChangePayload) SetLabel(v string)`

SetLabel sets Label field to given value.


### GetStart

`func (o *Neo4jCaptureDataChangePayload) GetStart() Neo4jCaptureDataChangeRelationshipPayloadEnd`

GetStart returns the Start field if non-nil, zero value otherwise.

### GetStartOk

`func (o *Neo4jCaptureDataChangePayload) GetStartOk() (*Neo4jCaptureDataChangeRelationshipPayloadEnd, bool)`

GetStartOk returns a tuple with the Start field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStart

`func (o *Neo4jCaptureDataChangePayload) SetStart(v Neo4jCaptureDataChangeRelationshipPayloadEnd)`

SetStart sets Start field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


