/*
Mindwm API

This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

API version: 0.1.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package MindwWM

import (
	"encoding/json"
	"time"
	"fmt"
)

// checks if the Clipboard type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Clipboard{}

// Clipboard struct for Clipboard
type Clipboard struct {
	Type *string `json:"type,omitempty"`
	Source *string `json:"source,omitempty" validate:"regexp=[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)$"`
	Data *ClipboardPayload `json:"data,omitempty"`
	// Identifies the event.
	Id string `json:"id"`
	// The version of the CloudEvents specification which the event uses.
	Specversion string `json:"specversion"`
	// Content type of the data value. Must adhere to RFC 2046 format.
	Datacontenttype *string `json:"datacontenttype,omitempty"`
	// Identifies the schema that data adheres to.
	Dataschema *string `json:"dataschema,omitempty"`
	// Describes the subject of the event in the context of the event producer (identified by source).
	Subject *string `json:"subject,omitempty"`
	// Timestamp of when the occurrence happened. Must adhere to RFC 3339.
	Time *time.Time `json:"time,omitempty"`
	// Base64 encoded event payload. Must adhere to RFC4648.
	DataBase64 *string `json:"data_base64,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _Clipboard Clipboard

// NewClipboard instantiates a new Clipboard object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewClipboard(id string, source string, specversion string, type_ string) *Clipboard {
	this := Clipboard{}
	this.Id = id
	this.Source = source
	this.Specversion = specversion
	this.Type = type_
	return &this
}

// NewClipboardWithDefaults instantiates a new Clipboard object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewClipboardWithDefaults() *Clipboard {
	this := Clipboard{}
	return &this
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *Clipboard) GetType() string {
	if o == nil || IsNil(o.Type) {
		var ret string
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Clipboard) GetTypeOk() (*string, bool) {
	if o == nil || IsNil(o.Type) {
		return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *Clipboard) HasType() bool {
	if o != nil && !IsNil(o.Type) {
		return true
	}

	return false
}

// SetType gets a reference to the given string and assigns it to the Type field.
func (o *Clipboard) SetType(v string) {
	o.Type = &v
}

// GetSource returns the Source field value if set, zero value otherwise.
func (o *Clipboard) GetSource() string {
	if o == nil || IsNil(o.Source) {
		var ret string
		return ret
	}
	return *o.Source
}

// GetSourceOk returns a tuple with the Source field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Clipboard) GetSourceOk() (*string, bool) {
	if o == nil || IsNil(o.Source) {
		return nil, false
	}
	return o.Source, true
}

// HasSource returns a boolean if a field has been set.
func (o *Clipboard) HasSource() bool {
	if o != nil && !IsNil(o.Source) {
		return true
	}

	return false
}

// SetSource gets a reference to the given string and assigns it to the Source field.
func (o *Clipboard) SetSource(v string) {
	o.Source = &v
}

// GetData returns the Data field value if set, zero value otherwise.
func (o *Clipboard) GetData() ClipboardPayload {
	if o == nil || IsNil(o.Data) {
		var ret ClipboardPayload
		return ret
	}
	return *o.Data
}

// GetDataOk returns a tuple with the Data field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Clipboard) GetDataOk() (*ClipboardPayload, bool) {
	if o == nil || IsNil(o.Data) {
		return nil, false
	}
	return o.Data, true
}

// HasData returns a boolean if a field has been set.
func (o *Clipboard) HasData() bool {
	if o != nil && !IsNil(o.Data) {
		return true
	}

	return false
}

// SetData gets a reference to the given ClipboardPayload and assigns it to the Data field.
func (o *Clipboard) SetData(v ClipboardPayload) {
	o.Data = &v
}

// GetId returns the Id field value
func (o *Clipboard) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *Clipboard) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *Clipboard) SetId(v string) {
	o.Id = v
}

// GetSpecversion returns the Specversion field value
func (o *Clipboard) GetSpecversion() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Specversion
}

// GetSpecversionOk returns a tuple with the Specversion field value
// and a boolean to check if the value has been set.
func (o *Clipboard) GetSpecversionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Specversion, true
}

// SetSpecversion sets field value
func (o *Clipboard) SetSpecversion(v string) {
	o.Specversion = v
}

// GetDatacontenttype returns the Datacontenttype field value if set, zero value otherwise.
func (o *Clipboard) GetDatacontenttype() string {
	if o == nil || IsNil(o.Datacontenttype) {
		var ret string
		return ret
	}
	return *o.Datacontenttype
}

// GetDatacontenttypeOk returns a tuple with the Datacontenttype field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Clipboard) GetDatacontenttypeOk() (*string, bool) {
	if o == nil || IsNil(o.Datacontenttype) {
		return nil, false
	}
	return o.Datacontenttype, true
}

// HasDatacontenttype returns a boolean if a field has been set.
func (o *Clipboard) HasDatacontenttype() bool {
	if o != nil && !IsNil(o.Datacontenttype) {
		return true
	}

	return false
}

// SetDatacontenttype gets a reference to the given string and assigns it to the Datacontenttype field.
func (o *Clipboard) SetDatacontenttype(v string) {
	o.Datacontenttype = &v
}

// GetDataschema returns the Dataschema field value if set, zero value otherwise.
func (o *Clipboard) GetDataschema() string {
	if o == nil || IsNil(o.Dataschema) {
		var ret string
		return ret
	}
	return *o.Dataschema
}

// GetDataschemaOk returns a tuple with the Dataschema field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Clipboard) GetDataschemaOk() (*string, bool) {
	if o == nil || IsNil(o.Dataschema) {
		return nil, false
	}
	return o.Dataschema, true
}

// HasDataschema returns a boolean if a field has been set.
func (o *Clipboard) HasDataschema() bool {
	if o != nil && !IsNil(o.Dataschema) {
		return true
	}

	return false
}

// SetDataschema gets a reference to the given string and assigns it to the Dataschema field.
func (o *Clipboard) SetDataschema(v string) {
	o.Dataschema = &v
}

// GetSubject returns the Subject field value if set, zero value otherwise.
func (o *Clipboard) GetSubject() string {
	if o == nil || IsNil(o.Subject) {
		var ret string
		return ret
	}
	return *o.Subject
}

// GetSubjectOk returns a tuple with the Subject field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Clipboard) GetSubjectOk() (*string, bool) {
	if o == nil || IsNil(o.Subject) {
		return nil, false
	}
	return o.Subject, true
}

// HasSubject returns a boolean if a field has been set.
func (o *Clipboard) HasSubject() bool {
	if o != nil && !IsNil(o.Subject) {
		return true
	}

	return false
}

// SetSubject gets a reference to the given string and assigns it to the Subject field.
func (o *Clipboard) SetSubject(v string) {
	o.Subject = &v
}

// GetTime returns the Time field value if set, zero value otherwise.
func (o *Clipboard) GetTime() time.Time {
	if o == nil || IsNil(o.Time) {
		var ret time.Time
		return ret
	}
	return *o.Time
}

// GetTimeOk returns a tuple with the Time field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Clipboard) GetTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.Time) {
		return nil, false
	}
	return o.Time, true
}

// HasTime returns a boolean if a field has been set.
func (o *Clipboard) HasTime() bool {
	if o != nil && !IsNil(o.Time) {
		return true
	}

	return false
}

// SetTime gets a reference to the given time.Time and assigns it to the Time field.
func (o *Clipboard) SetTime(v time.Time) {
	o.Time = &v
}

// GetDataBase64 returns the DataBase64 field value if set, zero value otherwise.
func (o *Clipboard) GetDataBase64() string {
	if o == nil || IsNil(o.DataBase64) {
		var ret string
		return ret
	}
	return *o.DataBase64
}

// GetDataBase64Ok returns a tuple with the DataBase64 field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Clipboard) GetDataBase64Ok() (*string, bool) {
	if o == nil || IsNil(o.DataBase64) {
		return nil, false
	}
	return o.DataBase64, true
}

// HasDataBase64 returns a boolean if a field has been set.
func (o *Clipboard) HasDataBase64() bool {
	if o != nil && !IsNil(o.DataBase64) {
		return true
	}

	return false
}

// SetDataBase64 gets a reference to the given string and assigns it to the DataBase64 field.
func (o *Clipboard) SetDataBase64(v string) {
	o.DataBase64 = &v
}

func (o Clipboard) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Clipboard) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Type) {
		toSerialize["type"] = o.Type
	}
	if !IsNil(o.Source) {
		toSerialize["source"] = o.Source
	}
	if !IsNil(o.Data) {
		toSerialize["data"] = o.Data
	}
	toSerialize["id"] = o.Id
	toSerialize["specversion"] = o.Specversion
	if !IsNil(o.Datacontenttype) {
		toSerialize["datacontenttype"] = o.Datacontenttype
	}
	if !IsNil(o.Dataschema) {
		toSerialize["dataschema"] = o.Dataschema
	}
	if !IsNil(o.Subject) {
		toSerialize["subject"] = o.Subject
	}
	if !IsNil(o.Time) {
		toSerialize["time"] = o.Time
	}
	if !IsNil(o.DataBase64) {
		toSerialize["data_base64"] = o.DataBase64
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *Clipboard) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"id",
		"source",
		"specversion",
		"type",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varClipboard := _Clipboard{}

	err = json.Unmarshal(data, &varClipboard)

	if err != nil {
		return err
	}

	*o = Clipboard(varClipboard)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "type")
		delete(additionalProperties, "source")
		delete(additionalProperties, "data")
		delete(additionalProperties, "id")
		delete(additionalProperties, "specversion")
		delete(additionalProperties, "datacontenttype")
		delete(additionalProperties, "dataschema")
		delete(additionalProperties, "subject")
		delete(additionalProperties, "time")
		delete(additionalProperties, "data_base64")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableClipboard struct {
	value *Clipboard
	isSet bool
}

func (v NullableClipboard) Get() *Clipboard {
	return v.value
}

func (v *NullableClipboard) Set(val *Clipboard) {
	v.value = val
	v.isSet = true
}

func (v NullableClipboard) IsSet() bool {
	return v.isSet
}

func (v *NullableClipboard) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableClipboard(val *Clipboard) *NullableClipboard {
	return &NullableClipboard{value: val, isSet: true}
}

func (v NullableClipboard) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableClipboard) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


