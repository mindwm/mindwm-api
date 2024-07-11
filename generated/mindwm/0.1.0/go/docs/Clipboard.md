# Clipboard

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to **string** |  | [optional] 
**Source** | Pointer to **string** |  | [optional] 
**Data** | Pointer to [**ClipboardPayload**](ClipboardPayload.md) |  | [optional] 
**Id** | **string** | Identifies the event. | 
**Specversion** | **string** | The version of the CloudEvents specification which the event uses. | 
**Datacontenttype** | Pointer to **string** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] 
**Dataschema** | Pointer to **string** | Identifies the schema that data adheres to. | [optional] 
**Subject** | Pointer to **string** | Describes the subject of the event in the context of the event producer (identified by source). | [optional] 
**Time** | Pointer to **time.Time** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] 
**DataBase64** | Pointer to **string** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 

## Methods

### NewClipboard

`func NewClipboard(id string, specversion string, ) *Clipboard`

NewClipboard instantiates a new Clipboard object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewClipboardWithDefaults

`func NewClipboardWithDefaults() *Clipboard`

NewClipboardWithDefaults instantiates a new Clipboard object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *Clipboard) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *Clipboard) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *Clipboard) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *Clipboard) HasType() bool`

HasType returns a boolean if a field has been set.

### GetSource

`func (o *Clipboard) GetSource() string`

GetSource returns the Source field if non-nil, zero value otherwise.

### GetSourceOk

`func (o *Clipboard) GetSourceOk() (*string, bool)`

GetSourceOk returns a tuple with the Source field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSource

`func (o *Clipboard) SetSource(v string)`

SetSource sets Source field to given value.

### HasSource

`func (o *Clipboard) HasSource() bool`

HasSource returns a boolean if a field has been set.

### GetData

`func (o *Clipboard) GetData() ClipboardPayload`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *Clipboard) GetDataOk() (*ClipboardPayload, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *Clipboard) SetData(v ClipboardPayload)`

SetData sets Data field to given value.

### HasData

`func (o *Clipboard) HasData() bool`

HasData returns a boolean if a field has been set.

### GetId

`func (o *Clipboard) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Clipboard) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Clipboard) SetId(v string)`

SetId sets Id field to given value.


### GetSpecversion

`func (o *Clipboard) GetSpecversion() string`

GetSpecversion returns the Specversion field if non-nil, zero value otherwise.

### GetSpecversionOk

`func (o *Clipboard) GetSpecversionOk() (*string, bool)`

GetSpecversionOk returns a tuple with the Specversion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpecversion

`func (o *Clipboard) SetSpecversion(v string)`

SetSpecversion sets Specversion field to given value.


### GetDatacontenttype

`func (o *Clipboard) GetDatacontenttype() string`

GetDatacontenttype returns the Datacontenttype field if non-nil, zero value otherwise.

### GetDatacontenttypeOk

`func (o *Clipboard) GetDatacontenttypeOk() (*string, bool)`

GetDatacontenttypeOk returns a tuple with the Datacontenttype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatacontenttype

`func (o *Clipboard) SetDatacontenttype(v string)`

SetDatacontenttype sets Datacontenttype field to given value.

### HasDatacontenttype

`func (o *Clipboard) HasDatacontenttype() bool`

HasDatacontenttype returns a boolean if a field has been set.

### GetDataschema

`func (o *Clipboard) GetDataschema() string`

GetDataschema returns the Dataschema field if non-nil, zero value otherwise.

### GetDataschemaOk

`func (o *Clipboard) GetDataschemaOk() (*string, bool)`

GetDataschemaOk returns a tuple with the Dataschema field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataschema

`func (o *Clipboard) SetDataschema(v string)`

SetDataschema sets Dataschema field to given value.

### HasDataschema

`func (o *Clipboard) HasDataschema() bool`

HasDataschema returns a boolean if a field has been set.

### GetSubject

`func (o *Clipboard) GetSubject() string`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *Clipboard) GetSubjectOk() (*string, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *Clipboard) SetSubject(v string)`

SetSubject sets Subject field to given value.

### HasSubject

`func (o *Clipboard) HasSubject() bool`

HasSubject returns a boolean if a field has been set.

### GetTime

`func (o *Clipboard) GetTime() time.Time`

GetTime returns the Time field if non-nil, zero value otherwise.

### GetTimeOk

`func (o *Clipboard) GetTimeOk() (*time.Time, bool)`

GetTimeOk returns a tuple with the Time field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTime

`func (o *Clipboard) SetTime(v time.Time)`

SetTime sets Time field to given value.

### HasTime

`func (o *Clipboard) HasTime() bool`

HasTime returns a boolean if a field has been set.

### GetDataBase64

`func (o *Clipboard) GetDataBase64() string`

GetDataBase64 returns the DataBase64 field if non-nil, zero value otherwise.

### GetDataBase64Ok

`func (o *Clipboard) GetDataBase64Ok() (*string, bool)`

GetDataBase64Ok returns a tuple with the DataBase64 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataBase64

`func (o *Clipboard) SetDataBase64(v string)`

SetDataBase64 sets DataBase64 field to given value.

### HasDataBase64

`func (o *Clipboard) HasDataBase64() bool`

HasDataBase64 returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


