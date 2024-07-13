# Neo4jCaptureDataChangeRelationshipPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**After** | **map[string]interface{}** |  | 
**Before** | **string** |  | 
**End** | [**Neo4jCaptureDataChangeRelationshipPayloadEnd**](Neo4jCaptureDataChangeRelationshipPayloadEnd.md) |  | 
**Id** | **string** |  | 
**Label** | **string** |  | 
**Start** | [**Neo4jCaptureDataChangeRelationshipPayloadEnd**](Neo4jCaptureDataChangeRelationshipPayloadEnd.md) |  | 
**Type** | **string** |  | 

## Methods

### NewNeo4jCaptureDataChangeRelationshipPayload

`func NewNeo4jCaptureDataChangeRelationshipPayload(after map[string]interface{}, before string, end Neo4jCaptureDataChangeRelationshipPayloadEnd, id string, label string, start Neo4jCaptureDataChangeRelationshipPayloadEnd, type_ string, ) *Neo4jCaptureDataChangeRelationshipPayload`

NewNeo4jCaptureDataChangeRelationshipPayload instantiates a new Neo4jCaptureDataChangeRelationshipPayload object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewNeo4jCaptureDataChangeRelationshipPayloadWithDefaults

`func NewNeo4jCaptureDataChangeRelationshipPayloadWithDefaults() *Neo4jCaptureDataChangeRelationshipPayload`

NewNeo4jCaptureDataChangeRelationshipPayloadWithDefaults instantiates a new Neo4jCaptureDataChangeRelationshipPayload object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAfter

`func (o *Neo4jCaptureDataChangeRelationshipPayload) GetAfter() map[string]interface{}`

GetAfter returns the After field if non-nil, zero value otherwise.

### GetAfterOk

`func (o *Neo4jCaptureDataChangeRelationshipPayload) GetAfterOk() (*map[string]interface{}, bool)`

GetAfterOk returns a tuple with the After field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAfter

`func (o *Neo4jCaptureDataChangeRelationshipPayload) SetAfter(v map[string]interface{})`

SetAfter sets After field to given value.


### GetBefore

`func (o *Neo4jCaptureDataChangeRelationshipPayload) GetBefore() string`

GetBefore returns the Before field if non-nil, zero value otherwise.

### GetBeforeOk

`func (o *Neo4jCaptureDataChangeRelationshipPayload) GetBeforeOk() (*string, bool)`

GetBeforeOk returns a tuple with the Before field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBefore

`func (o *Neo4jCaptureDataChangeRelationshipPayload) SetBefore(v string)`

SetBefore sets Before field to given value.


### GetEnd

`func (o *Neo4jCaptureDataChangeRelationshipPayload) GetEnd() Neo4jCaptureDataChangeRelationshipPayloadEnd`

GetEnd returns the End field if non-nil, zero value otherwise.

### GetEndOk

`func (o *Neo4jCaptureDataChangeRelationshipPayload) GetEndOk() (*Neo4jCaptureDataChangeRelationshipPayloadEnd, bool)`

GetEndOk returns a tuple with the End field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnd

`func (o *Neo4jCaptureDataChangeRelationshipPayload) SetEnd(v Neo4jCaptureDataChangeRelationshipPayloadEnd)`

SetEnd sets End field to given value.


### GetId

`func (o *Neo4jCaptureDataChangeRelationshipPayload) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Neo4jCaptureDataChangeRelationshipPayload) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Neo4jCaptureDataChangeRelationshipPayload) SetId(v string)`

SetId sets Id field to given value.


### GetLabel

`func (o *Neo4jCaptureDataChangeRelationshipPayload) GetLabel() string`

GetLabel returns the Label field if non-nil, zero value otherwise.

### GetLabelOk

`func (o *Neo4jCaptureDataChangeRelationshipPayload) GetLabelOk() (*string, bool)`

GetLabelOk returns a tuple with the Label field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabel

`func (o *Neo4jCaptureDataChangeRelationshipPayload) SetLabel(v string)`

SetLabel sets Label field to given value.


### GetStart

`func (o *Neo4jCaptureDataChangeRelationshipPayload) GetStart() Neo4jCaptureDataChangeRelationshipPayloadEnd`

GetStart returns the Start field if non-nil, zero value otherwise.

### GetStartOk

`func (o *Neo4jCaptureDataChangeRelationshipPayload) GetStartOk() (*Neo4jCaptureDataChangeRelationshipPayloadEnd, bool)`

GetStartOk returns a tuple with the Start field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStart

`func (o *Neo4jCaptureDataChangeRelationshipPayload) SetStart(v Neo4jCaptureDataChangeRelationshipPayloadEnd)`

SetStart sets Start field to given value.


### GetType

`func (o *Neo4jCaptureDataChangeRelationshipPayload) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *Neo4jCaptureDataChangeRelationshipPayload) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *Neo4jCaptureDataChangeRelationshipPayload) SetType(v string)`

SetType sets Type field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


