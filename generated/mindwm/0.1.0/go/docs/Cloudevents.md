# Cloudevents

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | 
**Source** | **string** |  | 
**Specversion** | **string** |  | 
**Type** | **string** |  | 
**Datacontenttype** | Pointer to **interface{}** |  | [optional] 
**Dataschema** | Pointer to **interface{}** |  | [optional] 
**Subject** | Pointer to **interface{}** |  | [optional] 
**Time** | Pointer to **interface{}** |  | [optional] 
**Data** | Pointer to **interface{}** |  | [optional] 
**DataBase64** | Pointer to **interface{}** |  | [optional] 

## Methods

### NewCloudevents

`func NewCloudevents(id string, source string, specversion string, type_ string, ) *Cloudevents`

NewCloudevents instantiates a new Cloudevents object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCloudeventsWithDefaults

`func NewCloudeventsWithDefaults() *Cloudevents`

NewCloudeventsWithDefaults instantiates a new Cloudevents object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Cloudevents) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Cloudevents) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Cloudevents) SetId(v string)`

SetId sets Id field to given value.


### GetSource

`func (o *Cloudevents) GetSource() string`

GetSource returns the Source field if non-nil, zero value otherwise.

### GetSourceOk

`func (o *Cloudevents) GetSourceOk() (*string, bool)`

GetSourceOk returns a tuple with the Source field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSource

`func (o *Cloudevents) SetSource(v string)`

SetSource sets Source field to given value.


### GetSpecversion

`func (o *Cloudevents) GetSpecversion() string`

GetSpecversion returns the Specversion field if non-nil, zero value otherwise.

### GetSpecversionOk

`func (o *Cloudevents) GetSpecversionOk() (*string, bool)`

GetSpecversionOk returns a tuple with the Specversion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpecversion

`func (o *Cloudevents) SetSpecversion(v string)`

SetSpecversion sets Specversion field to given value.


### GetType

`func (o *Cloudevents) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *Cloudevents) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *Cloudevents) SetType(v string)`

SetType sets Type field to given value.


### GetDatacontenttype

`func (o *Cloudevents) GetDatacontenttype() interface{}`

GetDatacontenttype returns the Datacontenttype field if non-nil, zero value otherwise.

### GetDatacontenttypeOk

`func (o *Cloudevents) GetDatacontenttypeOk() (*interface{}, bool)`

GetDatacontenttypeOk returns a tuple with the Datacontenttype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDatacontenttype

`func (o *Cloudevents) SetDatacontenttype(v interface{})`

SetDatacontenttype sets Datacontenttype field to given value.

### HasDatacontenttype

`func (o *Cloudevents) HasDatacontenttype() bool`

HasDatacontenttype returns a boolean if a field has been set.

### SetDatacontenttypeNil

`func (o *Cloudevents) SetDatacontenttypeNil(b bool)`

 SetDatacontenttypeNil sets the value for Datacontenttype to be an explicit nil

### UnsetDatacontenttype
`func (o *Cloudevents) UnsetDatacontenttype()`

UnsetDatacontenttype ensures that no value is present for Datacontenttype, not even an explicit nil
### GetDataschema

`func (o *Cloudevents) GetDataschema() interface{}`

GetDataschema returns the Dataschema field if non-nil, zero value otherwise.

### GetDataschemaOk

`func (o *Cloudevents) GetDataschemaOk() (*interface{}, bool)`

GetDataschemaOk returns a tuple with the Dataschema field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataschema

`func (o *Cloudevents) SetDataschema(v interface{})`

SetDataschema sets Dataschema field to given value.

### HasDataschema

`func (o *Cloudevents) HasDataschema() bool`

HasDataschema returns a boolean if a field has been set.

### SetDataschemaNil

`func (o *Cloudevents) SetDataschemaNil(b bool)`

 SetDataschemaNil sets the value for Dataschema to be an explicit nil

### UnsetDataschema
`func (o *Cloudevents) UnsetDataschema()`

UnsetDataschema ensures that no value is present for Dataschema, not even an explicit nil
### GetSubject

`func (o *Cloudevents) GetSubject() interface{}`

GetSubject returns the Subject field if non-nil, zero value otherwise.

### GetSubjectOk

`func (o *Cloudevents) GetSubjectOk() (*interface{}, bool)`

GetSubjectOk returns a tuple with the Subject field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSubject

`func (o *Cloudevents) SetSubject(v interface{})`

SetSubject sets Subject field to given value.

### HasSubject

`func (o *Cloudevents) HasSubject() bool`

HasSubject returns a boolean if a field has been set.

### SetSubjectNil

`func (o *Cloudevents) SetSubjectNil(b bool)`

 SetSubjectNil sets the value for Subject to be an explicit nil

### UnsetSubject
`func (o *Cloudevents) UnsetSubject()`

UnsetSubject ensures that no value is present for Subject, not even an explicit nil
### GetTime

`func (o *Cloudevents) GetTime() interface{}`

GetTime returns the Time field if non-nil, zero value otherwise.

### GetTimeOk

`func (o *Cloudevents) GetTimeOk() (*interface{}, bool)`

GetTimeOk returns a tuple with the Time field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTime

`func (o *Cloudevents) SetTime(v interface{})`

SetTime sets Time field to given value.

### HasTime

`func (o *Cloudevents) HasTime() bool`

HasTime returns a boolean if a field has been set.

### SetTimeNil

`func (o *Cloudevents) SetTimeNil(b bool)`

 SetTimeNil sets the value for Time to be an explicit nil

### UnsetTime
`func (o *Cloudevents) UnsetTime()`

UnsetTime ensures that no value is present for Time, not even an explicit nil
### GetData

`func (o *Cloudevents) GetData() interface{}`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *Cloudevents) GetDataOk() (*interface{}, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *Cloudevents) SetData(v interface{})`

SetData sets Data field to given value.

### HasData

`func (o *Cloudevents) HasData() bool`

HasData returns a boolean if a field has been set.

### SetDataNil

`func (o *Cloudevents) SetDataNil(b bool)`

 SetDataNil sets the value for Data to be an explicit nil

### UnsetData
`func (o *Cloudevents) UnsetData()`

UnsetData ensures that no value is present for Data, not even an explicit nil
### GetDataBase64

`func (o *Cloudevents) GetDataBase64() interface{}`

GetDataBase64 returns the DataBase64 field if non-nil, zero value otherwise.

### GetDataBase64Ok

`func (o *Cloudevents) GetDataBase64Ok() (*interface{}, bool)`

GetDataBase64Ok returns a tuple with the DataBase64 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDataBase64

`func (o *Cloudevents) SetDataBase64(v interface{})`

SetDataBase64 sets DataBase64 field to given value.

### HasDataBase64

`func (o *Cloudevents) HasDataBase64() bool`

HasDataBase64 returns a boolean if a field has been set.

### SetDataBase64Nil

`func (o *Cloudevents) SetDataBase64Nil(b bool)`

 SetDataBase64Nil sets the value for DataBase64 to be an explicit nil

### UnsetDataBase64
`func (o *Cloudevents) UnsetDataBase64()`

UnsetDataBase64 ensures that no value is present for DataBase64, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


