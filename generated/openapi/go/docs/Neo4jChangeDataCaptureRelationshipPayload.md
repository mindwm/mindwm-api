# Neo4jChangeDataCaptureRelationshipPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**After** | **map[string]interface{}** |  | 
**Before** | **string** |  | 
**End** | [**Neo4jChangeDataCaptureRelationshipPayloadEnd**](Neo4jChangeDataCaptureRelationshipPayloadEnd.md) |  | 
**Id** | **string** |  | 
**Label** | **string** |  | 
**Start** | [**Neo4jChangeDataCaptureRelationshipPayloadEnd**](Neo4jChangeDataCaptureRelationshipPayloadEnd.md) |  | 
**Type** | **string** |  | 

## Methods

### NewNeo4jChangeDataCaptureRelationshipPayload

`func NewNeo4jChangeDataCaptureRelationshipPayload(after map[string]interface{}, before string, end Neo4jChangeDataCaptureRelationshipPayloadEnd, id string, label string, start Neo4jChangeDataCaptureRelationshipPayloadEnd, type_ string, ) *Neo4jChangeDataCaptureRelationshipPayload`

NewNeo4jChangeDataCaptureRelationshipPayload instantiates a new Neo4jChangeDataCaptureRelationshipPayload object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewNeo4jChangeDataCaptureRelationshipPayloadWithDefaults

`func NewNeo4jChangeDataCaptureRelationshipPayloadWithDefaults() *Neo4jChangeDataCaptureRelationshipPayload`

NewNeo4jChangeDataCaptureRelationshipPayloadWithDefaults instantiates a new Neo4jChangeDataCaptureRelationshipPayload object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAfter

`func (o *Neo4jChangeDataCaptureRelationshipPayload) GetAfter() map[string]interface{}`

GetAfter returns the After field if non-nil, zero value otherwise.

### GetAfterOk

`func (o *Neo4jChangeDataCaptureRelationshipPayload) GetAfterOk() (*map[string]interface{}, bool)`

GetAfterOk returns a tuple with the After field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAfter

`func (o *Neo4jChangeDataCaptureRelationshipPayload) SetAfter(v map[string]interface{})`

SetAfter sets After field to given value.


### GetBefore

`func (o *Neo4jChangeDataCaptureRelationshipPayload) GetBefore() string`

GetBefore returns the Before field if non-nil, zero value otherwise.

### GetBeforeOk

`func (o *Neo4jChangeDataCaptureRelationshipPayload) GetBeforeOk() (*string, bool)`

GetBeforeOk returns a tuple with the Before field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBefore

`func (o *Neo4jChangeDataCaptureRelationshipPayload) SetBefore(v string)`

SetBefore sets Before field to given value.


### GetEnd

`func (o *Neo4jChangeDataCaptureRelationshipPayload) GetEnd() Neo4jChangeDataCaptureRelationshipPayloadEnd`

GetEnd returns the End field if non-nil, zero value otherwise.

### GetEndOk

`func (o *Neo4jChangeDataCaptureRelationshipPayload) GetEndOk() (*Neo4jChangeDataCaptureRelationshipPayloadEnd, bool)`

GetEndOk returns a tuple with the End field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnd

`func (o *Neo4jChangeDataCaptureRelationshipPayload) SetEnd(v Neo4jChangeDataCaptureRelationshipPayloadEnd)`

SetEnd sets End field to given value.


### GetId

`func (o *Neo4jChangeDataCaptureRelationshipPayload) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Neo4jChangeDataCaptureRelationshipPayload) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Neo4jChangeDataCaptureRelationshipPayload) SetId(v string)`

SetId sets Id field to given value.


### GetLabel

`func (o *Neo4jChangeDataCaptureRelationshipPayload) GetLabel() string`

GetLabel returns the Label field if non-nil, zero value otherwise.

### GetLabelOk

`func (o *Neo4jChangeDataCaptureRelationshipPayload) GetLabelOk() (*string, bool)`

GetLabelOk returns a tuple with the Label field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabel

`func (o *Neo4jChangeDataCaptureRelationshipPayload) SetLabel(v string)`

SetLabel sets Label field to given value.


### GetStart

`func (o *Neo4jChangeDataCaptureRelationshipPayload) GetStart() Neo4jChangeDataCaptureRelationshipPayloadEnd`

GetStart returns the Start field if non-nil, zero value otherwise.

### GetStartOk

`func (o *Neo4jChangeDataCaptureRelationshipPayload) GetStartOk() (*Neo4jChangeDataCaptureRelationshipPayloadEnd, bool)`

GetStartOk returns a tuple with the Start field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStart

`func (o *Neo4jChangeDataCaptureRelationshipPayload) SetStart(v Neo4jChangeDataCaptureRelationshipPayloadEnd)`

SetStart sets Start field to given value.


### GetType

`func (o *Neo4jChangeDataCaptureRelationshipPayload) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *Neo4jChangeDataCaptureRelationshipPayload) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *Neo4jChangeDataCaptureRelationshipPayload) SetType(v string)`

SetType sets Type field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


