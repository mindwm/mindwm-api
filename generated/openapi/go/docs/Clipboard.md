# Clipboard

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Context** | [**ClipboardContext**](ClipboardContext.md) |  | 
**ClipboardType** | **string** | Type of clipboard | 
**Content** | **string** | Clipboard content | 
**SelectionStart** | Pointer to [**Vector2int**](Vector2int.md) |  | [optional] 
**SelectionEnd** | Pointer to [**Vector2int**](Vector2int.md) |  | [optional] 

## Methods

### NewClipboard

`func NewClipboard(context ClipboardContext, clipboardType string, content string, ) *Clipboard`

NewClipboard instantiates a new Clipboard object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewClipboardWithDefaults

`func NewClipboardWithDefaults() *Clipboard`

NewClipboardWithDefaults instantiates a new Clipboard object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContext

`func (o *Clipboard) GetContext() ClipboardContext`

GetContext returns the Context field if non-nil, zero value otherwise.

### GetContextOk

`func (o *Clipboard) GetContextOk() (*ClipboardContext, bool)`

GetContextOk returns a tuple with the Context field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContext

`func (o *Clipboard) SetContext(v ClipboardContext)`

SetContext sets Context field to given value.


### GetClipboardType

`func (o *Clipboard) GetClipboardType() string`

GetClipboardType returns the ClipboardType field if non-nil, zero value otherwise.

### GetClipboardTypeOk

`func (o *Clipboard) GetClipboardTypeOk() (*string, bool)`

GetClipboardTypeOk returns a tuple with the ClipboardType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClipboardType

`func (o *Clipboard) SetClipboardType(v string)`

SetClipboardType sets ClipboardType field to given value.


### GetContent

`func (o *Clipboard) GetContent() string`

GetContent returns the Content field if non-nil, zero value otherwise.

### GetContentOk

`func (o *Clipboard) GetContentOk() (*string, bool)`

GetContentOk returns a tuple with the Content field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContent

`func (o *Clipboard) SetContent(v string)`

SetContent sets Content field to given value.


### GetSelectionStart

`func (o *Clipboard) GetSelectionStart() Vector2int`

GetSelectionStart returns the SelectionStart field if non-nil, zero value otherwise.

### GetSelectionStartOk

`func (o *Clipboard) GetSelectionStartOk() (*Vector2int, bool)`

GetSelectionStartOk returns a tuple with the SelectionStart field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSelectionStart

`func (o *Clipboard) SetSelectionStart(v Vector2int)`

SetSelectionStart sets SelectionStart field to given value.

### HasSelectionStart

`func (o *Clipboard) HasSelectionStart() bool`

HasSelectionStart returns a boolean if a field has been set.

### GetSelectionEnd

`func (o *Clipboard) GetSelectionEnd() Vector2int`

GetSelectionEnd returns the SelectionEnd field if non-nil, zero value otherwise.

### GetSelectionEndOk

`func (o *Clipboard) GetSelectionEndOk() (*Vector2int, bool)`

GetSelectionEndOk returns a tuple with the SelectionEnd field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSelectionEnd

`func (o *Clipboard) SetSelectionEnd(v Vector2int)`

SetSelectionEnd sets SelectionEnd field to given value.

### HasSelectionEnd

`func (o *Clipboard) HasSelectionEnd() bool`

HasSelectionEnd returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


