# TmuxPaneIoDocument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Input** | **string** | User input | 
**Output** | **string** | Command output (mix of stdout &amp; stderr) | 
**Ps1** | **string** | ps1 (prompt) AFTER the input and output | 

## Methods

### NewTmuxPaneIoDocument

`func NewTmuxPaneIoDocument(input string, output string, ps1 string, ) *TmuxPaneIoDocument`

NewTmuxPaneIoDocument instantiates a new TmuxPaneIoDocument object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTmuxPaneIoDocumentWithDefaults

`func NewTmuxPaneIoDocumentWithDefaults() *TmuxPaneIoDocument`

NewTmuxPaneIoDocumentWithDefaults instantiates a new TmuxPaneIoDocument object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInput

`func (o *TmuxPaneIoDocument) GetInput() string`

GetInput returns the Input field if non-nil, zero value otherwise.

### GetInputOk

`func (o *TmuxPaneIoDocument) GetInputOk() (*string, bool)`

GetInputOk returns a tuple with the Input field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInput

`func (o *TmuxPaneIoDocument) SetInput(v string)`

SetInput sets Input field to given value.


### GetOutput

`func (o *TmuxPaneIoDocument) GetOutput() string`

GetOutput returns the Output field if non-nil, zero value otherwise.

### GetOutputOk

`func (o *TmuxPaneIoDocument) GetOutputOk() (*string, bool)`

GetOutputOk returns a tuple with the Output field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutput

`func (o *TmuxPaneIoDocument) SetOutput(v string)`

SetOutput sets Output field to given value.


### GetPs1

`func (o *TmuxPaneIoDocument) GetPs1() string`

GetPs1 returns the Ps1 field if non-nil, zero value otherwise.

### GetPs1Ok

`func (o *TmuxPaneIoDocument) GetPs1Ok() (*string, bool)`

GetPs1Ok returns a tuple with the Ps1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPs1

`func (o *TmuxPaneIoDocument) SetPs1(v string)`

SetPs1 sets Ps1 field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


