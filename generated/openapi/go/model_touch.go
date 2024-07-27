/*
Mindwm API

This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

API version: 0.1.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package MindWM

import (
	"encoding/json"
	"bytes"
	"fmt"
)

// checks if the Touch type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Touch{}

// Touch struct for Touch
type Touch struct {
	Ids []float32 `json:"ids"`
}

type _Touch Touch

// NewTouch instantiates a new Touch object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTouch(ids []float32) *Touch {
	this := Touch{}
	this.Ids = ids
	return &this
}

// NewTouchWithDefaults instantiates a new Touch object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTouchWithDefaults() *Touch {
	this := Touch{}
	return &this
}

// GetIds returns the Ids field value
func (o *Touch) GetIds() []float32 {
	if o == nil {
		var ret []float32
		return ret
	}

	return o.Ids
}

// GetIdsOk returns a tuple with the Ids field value
// and a boolean to check if the value has been set.
func (o *Touch) GetIdsOk() ([]float32, bool) {
	if o == nil {
		return nil, false
	}
	return o.Ids, true
}

// SetIds sets field value
func (o *Touch) SetIds(v []float32) {
	o.Ids = v
}

func (o Touch) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Touch) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["ids"] = o.Ids
	return toSerialize, nil
}

func (o *Touch) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"ids",
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

	varTouch := _Touch{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varTouch)

	if err != nil {
		return err
	}

	*o = Touch(varTouch)

	return err
}

type NullableTouch struct {
	value *Touch
	isSet bool
}

func (v NullableTouch) Get() *Touch {
	return v.value
}

func (v *NullableTouch) Set(val *Touch) {
	v.value = val
	v.isSet = true
}

func (v NullableTouch) IsSet() bool {
	return v.isSet
}

func (v *NullableTouch) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTouch(val *Touch) *NullableTouch {
	return &NullableTouch{value: val, isSet: true}
}

func (v NullableTouch) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTouch) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

