# IoDocument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UserInput** | **string** | user input | 
**Output** | **string** | command output (mix of stdout/stderr) | 
**Fullcmd** | **string** | Full input command | 
**Ps1** | **string** | PS1 string AFTER the command output | 

## Methods

### NewIoDocument

`func NewIoDocument(userInput string, output string, fullcmd string, ps1 string, ) *IoDocument`

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


### GetPs1

`func (o *IoDocument) GetPs1() string`

GetPs1 returns the Ps1 field if non-nil, zero value otherwise.

### GetPs1Ok

`func (o *IoDocument) GetPs1Ok() (*string, bool)`

GetPs1Ok returns a tuple with the Ps1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPs1

`func (o *IoDocument) SetPs1(v string)`

SetPs1 sets Ps1 field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


