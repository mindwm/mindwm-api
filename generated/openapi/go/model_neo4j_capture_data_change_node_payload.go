/*
Mindwm API

This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

API version: 0.1.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package MindwWM

import (
	"encoding/json"
	"bytes"
	"fmt"
)

// checks if the Neo4jCaptureDataChangeNodePayload type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Neo4jCaptureDataChangeNodePayload{}

// Neo4jCaptureDataChangeNodePayload struct for Neo4jCaptureDataChangeNodePayload
type Neo4jCaptureDataChangeNodePayload struct {
	After Neo4jCaptureDataChangeNodePayloadAfter `json:"after"`
	Before string `json:"before"`
	Id string `json:"id"`
	Type string `json:"type"`
}

type _Neo4jCaptureDataChangeNodePayload Neo4jCaptureDataChangeNodePayload

// NewNeo4jCaptureDataChangeNodePayload instantiates a new Neo4jCaptureDataChangeNodePayload object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewNeo4jCaptureDataChangeNodePayload(after Neo4jCaptureDataChangeNodePayloadAfter, before string, id string, type_ string) *Neo4jCaptureDataChangeNodePayload {
	this := Neo4jCaptureDataChangeNodePayload{}
	this.After = after
	this.Before = before
	this.Id = id
	this.Type = type_
	return &this
}

// NewNeo4jCaptureDataChangeNodePayloadWithDefaults instantiates a new Neo4jCaptureDataChangeNodePayload object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewNeo4jCaptureDataChangeNodePayloadWithDefaults() *Neo4jCaptureDataChangeNodePayload {
	this := Neo4jCaptureDataChangeNodePayload{}
	return &this
}

// GetAfter returns the After field value
func (o *Neo4jCaptureDataChangeNodePayload) GetAfter() Neo4jCaptureDataChangeNodePayloadAfter {
	if o == nil {
		var ret Neo4jCaptureDataChangeNodePayloadAfter
		return ret
	}

	return o.After
}

// GetAfterOk returns a tuple with the After field value
// and a boolean to check if the value has been set.
func (o *Neo4jCaptureDataChangeNodePayload) GetAfterOk() (*Neo4jCaptureDataChangeNodePayloadAfter, bool) {
	if o == nil {
		return nil, false
	}
	return &o.After, true
}

// SetAfter sets field value
func (o *Neo4jCaptureDataChangeNodePayload) SetAfter(v Neo4jCaptureDataChangeNodePayloadAfter) {
	o.After = v
}

// GetBefore returns the Before field value
func (o *Neo4jCaptureDataChangeNodePayload) GetBefore() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Before
}

// GetBeforeOk returns a tuple with the Before field value
// and a boolean to check if the value has been set.
func (o *Neo4jCaptureDataChangeNodePayload) GetBeforeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Before, true
}

// SetBefore sets field value
func (o *Neo4jCaptureDataChangeNodePayload) SetBefore(v string) {
	o.Before = v
}

// GetId returns the Id field value
func (o *Neo4jCaptureDataChangeNodePayload) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *Neo4jCaptureDataChangeNodePayload) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *Neo4jCaptureDataChangeNodePayload) SetId(v string) {
	o.Id = v
}

// GetType returns the Type field value
func (o *Neo4jCaptureDataChangeNodePayload) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *Neo4jCaptureDataChangeNodePayload) GetTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *Neo4jCaptureDataChangeNodePayload) SetType(v string) {
	o.Type = v
}

func (o Neo4jCaptureDataChangeNodePayload) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Neo4jCaptureDataChangeNodePayload) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["after"] = o.After
	toSerialize["before"] = o.Before
	toSerialize["id"] = o.Id
	toSerialize["type"] = o.Type
	return toSerialize, nil
}

func (o *Neo4jCaptureDataChangeNodePayload) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"after",
		"before",
		"id",
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

	varNeo4jCaptureDataChangeNodePayload := _Neo4jCaptureDataChangeNodePayload{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varNeo4jCaptureDataChangeNodePayload)

	if err != nil {
		return err
	}

	*o = Neo4jCaptureDataChangeNodePayload(varNeo4jCaptureDataChangeNodePayload)

	return err
}

type NullableNeo4jCaptureDataChangeNodePayload struct {
	value *Neo4jCaptureDataChangeNodePayload
	isSet bool
}

func (v NullableNeo4jCaptureDataChangeNodePayload) Get() *Neo4jCaptureDataChangeNodePayload {
	return v.value
}

func (v *NullableNeo4jCaptureDataChangeNodePayload) Set(val *Neo4jCaptureDataChangeNodePayload) {
	v.value = val
	v.isSet = true
}

func (v NullableNeo4jCaptureDataChangeNodePayload) IsSet() bool {
	return v.isSet
}

func (v *NullableNeo4jCaptureDataChangeNodePayload) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableNeo4jCaptureDataChangeNodePayload(val *Neo4jCaptureDataChangeNodePayload) *NullableNeo4jCaptureDataChangeNodePayload {
	return &NullableNeo4jCaptureDataChangeNodePayload{value: val, isSet: true}
}

func (v NullableNeo4jCaptureDataChangeNodePayload) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableNeo4jCaptureDataChangeNodePayload) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

