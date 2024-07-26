# TouchEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifies the event. | 
**Source** | **string** |  | 
**Specversion** | **string** | The version of the CloudEvents specification which the event uses. | 
**Type** | **string** |  | [default to "touch"]
**Datacontenttype** | Pointer to **string** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] 
**Dataschema** | Pointer to **string** | Identifies the schema that data adheres to. | [optional] 
**Subject** | Pointer to **string** |  | [optional] [default to "node"]
**Time** | Pointer to **time.Time** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] 
**Data** | Pointer to [**Touch**](Touch.md) |  | [optional] 
**DataBase64** | Pointer to **string** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 

## Methods

### NewTouchEvent

`func NewTouchEvent(id string, source string, specversion string, type_ string, ) *TouchEvent`

NewTouchEvent instantiates a new TouchEvent object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTouchEventWithDefaults

`func NewTouchEventWithDefaults() *TouchEvent`

NewTouchEventWithDefaults instantiates a new TouchEvent object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *TouchEvent) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *TouchEvent) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *TouchEvent) SetId(v string)`

SetId sets Id field to given value.


### GetSource

`func (o *TouchEvent) GetSource() string`

GetSource returns the Source field if non-nil, zero value otherwise.

### GetSourceOk

`func (o *TouchEvent) GetSourceOk() (*string, bool)`

GetSourceOk returns a tuple with the Source field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSource

`func (o *TouchEvent) SetSource(v string)`

SetSource sets Source field to given value.


### GetSpecversion

`func (o *TouchEvent) GetSpecversion() string`

GetSpecversion returns the Specversion field if non-nil, zero value otherwise.

### GetSpecversionOk

`func (o *TouchEvent) GetSpecversionOk() (*string, bool)`

GetSpecversionOk returns a tuple with the Specversion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpecversion

`func (o *TouchEvent) SetSpecversion(v string)`

SetSpecversion sets Specversion field to given value.


### GetType

`func (o *TouchEvent) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *TouchEvent) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *TouchEvent) SetType(v string)`

SetType sets Type field to given value.


### GetDatacontenttype

`func (o *TouchEvent) GetDatacontenttype() string`

GetDatacontenttype returns the Datacontenttype field if non-nil, zero value otherwise.

### GetDatacontenttypeOk

`func (o *TouchEvent) GetDatacontenttypeOk() (*string, bool)`

GetDatacontenttypeOk returns a tuple with the Datacontenttype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatacontenttype

`func (o *TouchEvent) SetDatacontenttype(v string)`

SetDatacontenttype sets Datacontenttype field to given value.

### HasDatacontenttype

`func (o *TouchEvent) HasDatacontenttype() bool`

HasDatacontenttype returns a boolean if a field has been set.

### GetDataschema

`func (o *TouchEvent) GetDataschema() string`

GetDataschema returns the Dataschema field if non-nil, zero value otherwise.

### GetDataschemaOk

`func (o *TouchEvent) GetDataschemaOk() (*string, bool)`

GetDataschemaOk returns a tuple with the Dataschema field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataschema

`func (o *TouchEvent) SetDataschema(v string)`

SetDataschema sets Dataschema field to given value.

### HasDataschema

`func (o *TouchEvent) HasDataschema() bool`

HasDataschema returns a boolean if a field has been set.

### GetSubject

`func (o *TouchEvent) GetSubject() string`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *TouchEvent) GetSubjectOk() (*string, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *TouchEvent) SetSubject(v string)`

SetSubject sets Subject field to given value.

### HasSubject

`func (o *TouchEvent) HasSubject() bool`

HasSubject returns a boolean if a field has been set.

### GetTime

`func (o *TouchEvent) GetTime() time.Time`

GetTime returns the Time field if non-nil, zero value otherwise.

### GetTimeOk

`func (o *TouchEvent) GetTimeOk() (*time.Time, bool)`

GetTimeOk returns a tuple with the Time field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTime

`func (o *TouchEvent) SetTime(v time.Time)`

SetTime sets Time field to given value.

### HasTime

`func (o *TouchEvent) HasTime() bool`

HasTime returns a boolean if a field has been set.

### GetData

`func (o *TouchEvent) GetData() Touch`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *TouchEvent) GetDataOk() (*Touch, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *TouchEvent) SetData(v Touch)`

SetData sets Data field to given value.

### HasData

`func (o *TouchEvent) HasData() bool`

HasData returns a boolean if a field has been set.

### GetDataBase64

`func (o *TouchEvent) GetDataBase64() string`

GetDataBase64 returns the DataBase64 field if non-nil, zero value otherwise.

### GetDataBase64Ok

`func (o *TouchEvent) GetDataBase64Ok() (*string, bool)`

GetDataBase64Ok returns a tuple with the DataBase64 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataBase64

`func (o *TouchEvent) SetDataBase64(v string)`

SetDataBase64 sets DataBase64 field to given value.

### HasDataBase64

`func (o *TouchEvent) HasDataBase64() bool`

HasDataBase64 returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


