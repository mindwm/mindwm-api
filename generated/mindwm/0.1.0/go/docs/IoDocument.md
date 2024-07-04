# IoDocument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UserInput** | Pointer to **string** | user input | [optional] 
**Output** | Pointer to **string** | command output (mix of stdout/stderr) | [optional] 
**Fullcmd** | Pointer to **string** | Full input command | [optional] 

## Methods

### NewIoDocument

`func NewIoDocument() *IoDocument`

NewIoDocument instantiates a new IoDocument object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIoDocumentWithDefaults

`func NewIoDocumentWithDefaults() *IoDocument`

NewIoDocumentWithDefaults instantiates a new IoDocument object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUserInput

`func (o *IoDocument) GetUserInput() string`

GetUserInput returns the UserInput field if non-nil, zero value otherwise.

### GetUserInputOk

`func (o *IoDocument) GetUserInputOk() (*string, bool)`

GetUserInputOk returns a tuple with the UserInput field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserInput

`func (o *IoDocument) SetUserInput(v string)`

SetUserInput sets UserInput field to given value.

### HasUserInput

`func (o *IoDocument) HasUserInput() bool`

HasUserInput returns a boolean if a field has been set.

### GetOutput

`func (o *IoDocument) GetOutput() string`

GetOutput returns the Output field if non-nil, zero value otherwise.

### GetOutputOk

`func (o *IoDocument) GetOutputOk() (*string, bool)`

GetOutputOk returns a tuple with the Output field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutput

`func (o *IoDocument) SetOutput(v string)`

SetOutput sets Output field to given value.

### HasOutput

`func (o *IoDocument) HasOutput() bool`

HasOutput returns a boolean if a field has been set.

### GetFullcmd

`func (o *IoDocument) GetFullcmd() string`

GetFullcmd returns the Fullcmd field if non-nil, zero value otherwise.

### GetFullcmdOk

`func (o *IoDocument) GetFullcmdOk() (*string, bool)`

GetFullcmdOk returns a tuple with the Fullcmd field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFullcmd

`func (o *IoDocument) SetFullcmd(v string)`

SetFullcmd sets Fullcmd field to given value.

### HasFullcmd

`func (o *IoDocument) HasFullcmd() bool`

HasFullcmd returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


