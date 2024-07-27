# Neo4jChangeDataCapturePayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**After** | **map[string]interface{}** |  | 
**Before** | **string** |  | 
**Id** | **string** |  | 
**Type** | **string** |  | 
**End** | [**Neo4jChangeDataCaptureRelationshipPayloadEnd**](Neo4jChangeDataCaptureRelationshipPayloadEnd.md) |  | 
**Label** | **string** |  | 
**Start** | [**Neo4jChangeDataCaptureRelationshipPayloadEnd**](Neo4jChangeDataCaptureRelationshipPayloadEnd.md) |  | 

## Methods

### NewNeo4jChangeDataCapturePayload

`func NewNeo4jChangeDataCapturePayload(after map[string]interface{}, before string, id string, type_ string, end Neo4jChangeDataCaptureRelationshipPayloadEnd, label string, start Neo4jChangeDataCaptureRelationshipPayloadEnd, ) *Neo4jChangeDataCapturePayload`

NewNeo4jChangeDataCapturePayload instantiates a new Neo4jChangeDataCapturePayload object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewNeo4jChangeDataCapturePayloadWithDefaults

`func NewNeo4jChangeDataCapturePayloadWithDefaults() *Neo4jChangeDataCapturePayload`

NewNeo4jChangeDataCapturePayloadWithDefaults instantiates a new Neo4jChangeDataCapturePayload object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAfter

`func (o *Neo4jChangeDataCapturePayload) GetAfter() map[string]interface{}`

GetAfter returns the After field if non-nil, zero value otherwise.

### GetAfterOk

`func (o *Neo4jChangeDataCapturePayload) GetAfterOk() (*map[string]interface{}, bool)`

GetAfterOk returns a tuple with the After field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAfter

`func (o *Neo4jChangeDataCapturePayload) SetAfter(v map[string]interface{})`

SetAfter sets After field to given value.


### GetBefore

`func (o *Neo4jChangeDataCapturePayload) GetBefore() string`

GetBefore returns the Before field if non-nil, zero value otherwise.

### GetBeforeOk

`func (o *Neo4jChangeDataCapturePayload) GetBeforeOk() (*string, bool)`

GetBeforeOk returns a tuple with the Before field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBefore

`func (o *Neo4jChangeDataCapturePayload) SetBefore(v string)`

SetBefore sets Before field to given value.


### GetId

`func (o *Neo4jChangeDataCapturePayload) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Neo4jChangeDataCapturePayload) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Neo4jChangeDataCapturePayload) SetId(v string)`

SetId sets Id field to given value.


### GetType

`func (o *Neo4jChangeDataCapturePayload) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *Neo4jChangeDataCapturePayload) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *Neo4jChangeDataCapturePayload) SetType(v string)`

SetType sets Type field to given value.


### GetEnd

`func (o *Neo4jChangeDataCapturePayload) GetEnd() Neo4jChangeDataCaptureRelationshipPayloadEnd`

GetEnd returns the End field if non-nil, zero value otherwise.

### GetEndOk

`func (o *Neo4jChangeDataCapturePayload) GetEndOk() (*Neo4jChangeDataCaptureRelationshipPayloadEnd, bool)`

GetEndOk returns a tuple with the End field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnd

`func (o *Neo4jChangeDataCapturePayload) SetEnd(v Neo4jChangeDataCaptureRelationshipPayloadEnd)`

SetEnd sets End field to given value.


### GetLabel

`func (o *Neo4jChangeDataCapturePayload) GetLabel() string`

GetLabel returns the Label field if non-nil, zero value otherwise.

### GetLabelOk

`func (o *Neo4jChangeDataCapturePayload) GetLabelOk() (*string, bool)`

GetLabelOk returns a tuple with the Label field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabel

`func (o *Neo4jChangeDataCapturePayload) SetLabel(v string)`

SetLabel sets Label field to given value.


### GetStart

`func (o *Neo4jChangeDataCapturePayload) GetStart() Neo4jChangeDataCaptureRelationshipPayloadEnd`

GetStart returns the Start field if non-nil, zero value otherwise.

### GetStartOk

`func (o *Neo4jChangeDataCapturePayload) GetStartOk() (*Neo4jChangeDataCaptureRelationshipPayloadEnd, bool)`

GetStartOk returns a tuple with the Start field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStart

`func (o *Neo4jChangeDataCapturePayload) SetStart(v Neo4jChangeDataCaptureRelationshipPayloadEnd)`

SetStart sets Start field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


