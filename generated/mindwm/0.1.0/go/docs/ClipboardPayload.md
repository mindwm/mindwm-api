# ClipboardPayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Start** | Pointer to **[]int32** | Starting position of clipboard selection [x,y] | [optional] 
**Stop** | Pointer to **[]int32** | Ending position of clipboard selection [x,y] | [optional] 
**Data** | Pointer to **string** | Clipboard data | [optional] 
**Type** | Pointer to **string** | Clipboard type | [optional] 
**Context** | Pointer to [**ClipboardPayloadContext**](ClipboardPayloadContext.md) |  | [optional] 

## Methods

### NewClipboardPayload

`func NewClipboardPayload() *ClipboardPayload`

NewClipboardPayload instantiates a new ClipboardPayload object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewClipboardPayloadWithDefaults

`func NewClipboardPayloadWithDefaults() *ClipboardPayload`

NewClipboardPayloadWithDefaults instantiates a new ClipboardPayload object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStart

`func (o *ClipboardPayload) GetStart() []int32`

GetStart returns the Start field if non-nil, zero value otherwise.

### GetStartOk

`func (o *ClipboardPayload) GetStartOk() (*[]int32, bool)`

GetStartOk returns a tuple with the Start field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStart

`func (o *ClipboardPayload) SetStart(v []int32)`

SetStart sets Start field to given value.

### HasStart

`func (o *ClipboardPayload) HasStart() bool`

HasStart returns a boolean if a field has been set.

### GetStop

`func (o *ClipboardPayload) GetStop() []int32`

GetStop returns the Stop field if non-nil, zero value otherwise.

### GetStopOk

`func (o *ClipboardPayload) GetStopOk() (*[]int32, bool)`

GetStopOk returns a tuple with the Stop field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStop

`func (o *ClipboardPayload) SetStop(v []int32)`

SetStop sets Stop field to given value.

### HasStop

`func (o *ClipboardPayload) HasStop() bool`

HasStop returns a boolean if a field has been set.

### GetData

`func (o *ClipboardPayload) GetData() string`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ClipboardPayload) GetDataOk() (*string, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ClipboardPayload) SetData(v string)`

SetData sets Data field to given value.

### HasData

`func (o *ClipboardPayload) HasData() bool`

HasData returns a boolean if a field has been set.

### GetType

`func (o *ClipboardPayload) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ClipboardPayload) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ClipboardPayload) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *ClipboardPayload) HasType() bool`

HasType returns a boolean if a field has been set.

### GetContext

`func (o *ClipboardPayload) GetContext() ClipboardPayloadContext`

GetContext returns the Context field if non-nil, zero value otherwise.

### GetContextOk

`func (o *ClipboardPayload) GetContextOk() (*ClipboardPayloadContext, bool)`

GetContextOk returns a tuple with the Context field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContext

`func (o *ClipboardPayload) SetContext(v ClipboardPayloadContext)`

SetContext sets Context field to given value.

### HasContext

`func (o *ClipboardPayload) HasContext() bool`

HasContext returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


