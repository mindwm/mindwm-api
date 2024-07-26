# ClipboardEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifies the event. | 
**Source** | **string** |  | 
**Specversion** | **string** | The version of the CloudEvents specification which the event uses. | 
**Type** | **string** |  | [default to "Clipboard"]
**Datacontenttype** | Pointer to **string** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] 
**Dataschema** | Pointer to **string** | Identifies the schema that data adheres to. | [optional] 
**Subject** | Pointer to **string** |  | [optional] [default to "Clipboard"]
**Time** | Pointer to **time.Time** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] 
**Data** | Pointer to [**Clipboard**](Clipboard.md) |  | [optional] 
**DataBase64** | Pointer to **string** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 
**Knativebrokerttl** | Pointer to **string** | knative broker ttl, workaround for https://github.com/knative-extensions/eventing-natss/issues/518 | [optional] [default to "255"]

## Methods

### NewClipboardEvent

`func NewClipboardEvent(id string, source string, specversion string, type_ string, ) *ClipboardEvent`

NewClipboardEvent instantiates a new ClipboardEvent object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewClipboardEventWithDefaults

`func NewClipboardEventWithDefaults() *ClipboardEvent`

NewClipboardEventWithDefaults instantiates a new ClipboardEvent object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ClipboardEvent) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ClipboardEvent) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ClipboardEvent) SetId(v string)`

SetId sets Id field to given value.


### GetSource

`func (o *ClipboardEvent) GetSource() string`

GetSource returns the Source field if non-nil, zero value otherwise.

### GetSourceOk

`func (o *ClipboardEvent) GetSourceOk() (*string, bool)`

GetSourceOk returns a tuple with the Source field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSource

`func (o *ClipboardEvent) SetSource(v string)`

SetSource sets Source field to given value.


### GetSpecversion

`func (o *ClipboardEvent) GetSpecversion() string`

GetSpecversion returns the Specversion field if non-nil, zero value otherwise.

### GetSpecversionOk

`func (o *ClipboardEvent) GetSpecversionOk() (*string, bool)`

GetSpecversionOk returns a tuple with the Specversion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpecversion

`func (o *ClipboardEvent) SetSpecversion(v string)`

SetSpecversion sets Specversion field to given value.


### GetType

`func (o *ClipboardEvent) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ClipboardEvent) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ClipboardEvent) SetType(v string)`

SetType sets Type field to given value.


### GetDatacontenttype

`func (o *ClipboardEvent) GetDatacontenttype() string`

GetDatacontenttype returns the Datacontenttype field if non-nil, zero value otherwise.

### GetDatacontenttypeOk

`func (o *ClipboardEvent) GetDatacontenttypeOk() (*string, bool)`

GetDatacontenttypeOk returns a tuple with the Datacontenttype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatacontenttype

`func (o *ClipboardEvent) SetDatacontenttype(v string)`

SetDatacontenttype sets Datacontenttype field to given value.

### HasDatacontenttype

`func (o *ClipboardEvent) HasDatacontenttype() bool`

HasDatacontenttype returns a boolean if a field has been set.

### GetDataschema

`func (o *ClipboardEvent) GetDataschema() string`

GetDataschema returns the Dataschema field if non-nil, zero value otherwise.

### GetDataschemaOk

`func (o *ClipboardEvent) GetDataschemaOk() (*string, bool)`

GetDataschemaOk returns a tuple with the Dataschema field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataschema

`func (o *ClipboardEvent) SetDataschema(v string)`

SetDataschema sets Dataschema field to given value.

### HasDataschema

`func (o *ClipboardEvent) HasDataschema() bool`

HasDataschema returns a boolean if a field has been set.

### GetSubject

`func (o *ClipboardEvent) GetSubject() string`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *ClipboardEvent) GetSubjectOk() (*string, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *ClipboardEvent) SetSubject(v string)`

SetSubject sets Subject field to given value.

### HasSubject

`func (o *ClipboardEvent) HasSubject() bool`

HasSubject returns a boolean if a field has been set.

### GetTime

`func (o *ClipboardEvent) GetTime() time.Time`

GetTime returns the Time field if non-nil, zero value otherwise.

### GetTimeOk

`func (o *ClipboardEvent) GetTimeOk() (*time.Time, bool)`

GetTimeOk returns a tuple with the Time field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTime

`func (o *ClipboardEvent) SetTime(v time.Time)`

SetTime sets Time field to given value.

### HasTime

`func (o *ClipboardEvent) HasTime() bool`

HasTime returns a boolean if a field has been set.

### GetData

`func (o *ClipboardEvent) GetData() Clipboard`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *ClipboardEvent) GetDataOk() (*Clipboard, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *ClipboardEvent) SetData(v Clipboard)`

SetData sets Data field to given value.

### HasData

`func (o *ClipboardEvent) HasData() bool`

HasData returns a boolean if a field has been set.

### GetDataBase64

`func (o *ClipboardEvent) GetDataBase64() string`

GetDataBase64 returns the DataBase64 field if non-nil, zero value otherwise.

### GetDataBase64Ok

`func (o *ClipboardEvent) GetDataBase64Ok() (*string, bool)`

GetDataBase64Ok returns a tuple with the DataBase64 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataBase64

`func (o *ClipboardEvent) SetDataBase64(v string)`

SetDataBase64 sets DataBase64 field to given value.

### HasDataBase64

`func (o *ClipboardEvent) HasDataBase64() bool`

HasDataBase64 returns a boolean if a field has been set.

### GetKnativebrokerttl

`func (o *ClipboardEvent) GetKnativebrokerttl() string`

GetKnativebrokerttl returns the Knativebrokerttl field if non-nil, zero value otherwise.

### GetKnativebrokerttlOk

`func (o *ClipboardEvent) GetKnativebrokerttlOk() (*string, bool)`

GetKnativebrokerttlOk returns a tuple with the Knativebrokerttl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKnativebrokerttl

`func (o *ClipboardEvent) SetKnativebrokerttl(v string)`

SetKnativebrokerttl sets Knativebrokerttl field to given value.

### HasKnativebrokerttl

`func (o *ClipboardEvent) HasKnativebrokerttl() bool`

HasKnativebrokerttl returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


