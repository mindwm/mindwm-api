# CloudEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifies the event. | 
**Source** | **string** | Identifies the context in which an event happened. | 
**Specversion** | **string** | The version of the CloudEvents specification which the event uses. | 
**Type** | **string** | Describes the type of event related to the originating occurrence. | 
**Datacontenttype** | Pointer to **NullableString** | Content type of the data value. Must adhere to RFC 2046 format. | [optional] 
**Dataschema** | Pointer to **NullableString** | Identifies the schema that data adheres to. | [optional] 
**Subject** | Pointer to **NullableString** | Describes the subject of the event in the context of the event producer (identified by source). | [optional] 
**Time** | Pointer to **NullableTime** | Timestamp of when the occurrence happened. Must adhere to RFC 3339. | [optional] 
**Data** | Pointer to [**NullableCloudEventData**](CloudEventData.md) |  | [optional] 
**DataBase64** | Pointer to **NullableString** | Base64 encoded event payload. Must adhere to RFC4648. | [optional] 

## Methods

### NewCloudEvent

`func NewCloudEvent(id string, source string, specversion string, type_ string, ) *CloudEvent`

NewCloudEvent instantiates a new CloudEvent object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCloudEventWithDefaults

`func NewCloudEventWithDefaults() *CloudEvent`

NewCloudEventWithDefaults instantiates a new CloudEvent object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CloudEvent) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CloudEvent) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CloudEvent) SetId(v string)`

SetId sets Id field to given value.


### GetSource

`func (o *CloudEvent) GetSource() string`

GetSource returns the Source field if non-nil, zero value otherwise.

### GetSourceOk

`func (o *CloudEvent) GetSourceOk() (*string, bool)`

GetSourceOk returns a tuple with the Source field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSource

`func (o *CloudEvent) SetSource(v string)`

SetSource sets Source field to given value.


### GetSpecversion

`func (o *CloudEvent) GetSpecversion() string`

GetSpecversion returns the Specversion field if non-nil, zero value otherwise.

### GetSpecversionOk

`func (o *CloudEvent) GetSpecversionOk() (*string, bool)`

GetSpecversionOk returns a tuple with the Specversion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpecversion

`func (o *CloudEvent) SetSpecversion(v string)`

SetSpecversion sets Specversion field to given value.


### GetType

`func (o *CloudEvent) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CloudEvent) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CloudEvent) SetType(v string)`

SetType sets Type field to given value.


### GetDatacontenttype

`func (o *CloudEvent) GetDatacontenttype() string`

GetDatacontenttype returns the Datacontenttype field if non-nil, zero value otherwise.

### GetDatacontenttypeOk

`func (o *CloudEvent) GetDatacontenttypeOk() (*string, bool)`

GetDatacontenttypeOk returns a tuple with the Datacontenttype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatacontenttype

`func (o *CloudEvent) SetDatacontenttype(v string)`

SetDatacontenttype sets Datacontenttype field to given value.

### HasDatacontenttype

`func (o *CloudEvent) HasDatacontenttype() bool`

HasDatacontenttype returns a boolean if a field has been set.

### SetDatacontenttypeNil

`func (o *CloudEvent) SetDatacontenttypeNil(b bool)`

 SetDatacontenttypeNil sets the value for Datacontenttype to be an explicit nil

### UnsetDatacontenttype
`func (o *CloudEvent) UnsetDatacontenttype()`

UnsetDatacontenttype ensures that no value is present for Datacontenttype, not even an explicit nil
### GetDataschema

`func (o *CloudEvent) GetDataschema() string`

GetDataschema returns the Dataschema field if non-nil, zero value otherwise.

### GetDataschemaOk

`func (o *CloudEvent) GetDataschemaOk() (*string, bool)`

GetDataschemaOk returns a tuple with the Dataschema field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataschema

`func (o *CloudEvent) SetDataschema(v string)`

SetDataschema sets Dataschema field to given value.

### HasDataschema

`func (o *CloudEvent) HasDataschema() bool`

HasDataschema returns a boolean if a field has been set.

### SetDataschemaNil

`func (o *CloudEvent) SetDataschemaNil(b bool)`

 SetDataschemaNil sets the value for Dataschema to be an explicit nil

### UnsetDataschema
`func (o *CloudEvent) UnsetDataschema()`

UnsetDataschema ensures that no value is present for Dataschema, not even an explicit nil
### GetSubject

`func (o *CloudEvent) GetSubject() string`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *CloudEvent) GetSubjectOk() (*string, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *CloudEvent) SetSubject(v string)`

SetSubject sets Subject field to given value.

### HasSubject

`func (o *CloudEvent) HasSubject() bool`

HasSubject returns a boolean if a field has been set.

### SetSubjectNil

`func (o *CloudEvent) SetSubjectNil(b bool)`

 SetSubjectNil sets the value for Subject to be an explicit nil

### UnsetSubject
`func (o *CloudEvent) UnsetSubject()`

UnsetSubject ensures that no value is present for Subject, not even an explicit nil
### GetTime

`func (o *CloudEvent) GetTime() time.Time`

GetTime returns the Time field if non-nil, zero value otherwise.

### GetTimeOk

`func (o *CloudEvent) GetTimeOk() (*time.Time, bool)`

GetTimeOk returns a tuple with the Time field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTime

`func (o *CloudEvent) SetTime(v time.Time)`

SetTime sets Time field to given value.

### HasTime

`func (o *CloudEvent) HasTime() bool`

HasTime returns a boolean if a field has been set.

### SetTimeNil

`func (o *CloudEvent) SetTimeNil(b bool)`

 SetTimeNil sets the value for Time to be an explicit nil

### UnsetTime
`func (o *CloudEvent) UnsetTime()`

UnsetTime ensures that no value is present for Time, not even an explicit nil
### GetData

`func (o *CloudEvent) GetData() CloudEventData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *CloudEvent) GetDataOk() (*CloudEventData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *CloudEvent) SetData(v CloudEventData)`

SetData sets Data field to given value.

### HasData

`func (o *CloudEvent) HasData() bool`

HasData returns a boolean if a field has been set.

### SetDataNil

`func (o *CloudEvent) SetDataNil(b bool)`

 SetDataNil sets the value for Data to be an explicit nil

### UnsetData
`func (o *CloudEvent) UnsetData()`

UnsetData ensures that no value is present for Data, not even an explicit nil
### GetDataBase64

`func (o *CloudEvent) GetDataBase64() string`

GetDataBase64 returns the DataBase64 field if non-nil, zero value otherwise.

### GetDataBase64Ok

`func (o *CloudEvent) GetDataBase64Ok() (*string, bool)`

GetDataBase64Ok returns a tuple with the DataBase64 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataBase64

`func (o *CloudEvent) SetDataBase64(v string)`

SetDataBase64 sets DataBase64 field to given value.

### HasDataBase64

`func (o *CloudEvent) HasDataBase64() bool`

HasDataBase64 returns a boolean if a field has been set.

### SetDataBase64Nil

`func (o *CloudEvent) SetDataBase64Nil(b bool)`

 SetDataBase64Nil sets the value for DataBase64 to be an explicit nil

### UnsetDataBase64
`func (o *CloudEvent) UnsetDataBase64()`

UnsetDataBase64 ensures that no value is present for DataBase64, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

