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

// checks if the Neo4jCaptureDataChangeNodePayloadAfter type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Neo4jCaptureDataChangeNodePayloadAfter{}

// Neo4jCaptureDataChangeNodePayloadAfter struct for Neo4jCaptureDataChangeNodePayloadAfter
type Neo4jCaptureDataChangeNodePayloadAfter struct {
	Labels []string `json:"labels"`
	Properties map[string]interface{} `json:"properties"`
}

type _Neo4jCaptureDataChangeNodePayloadAfter Neo4jCaptureDataChangeNodePayloadAfter

// NewNeo4jCaptureDataChangeNodePayloadAfter instantiates a new Neo4jCaptureDataChangeNodePayloadAfter object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewNeo4jCaptureDataChangeNodePayloadAfter(labels []string, properties map[string]interface{}) *Neo4jCaptureDataChangeNodePayloadAfter {
	this := Neo4jCaptureDataChangeNodePayloadAfter{}
	this.Labels = labels
	this.Properties = properties
	return &this
}

// NewNeo4jCaptureDataChangeNodePayloadAfterWithDefaults instantiates a new Neo4jCaptureDataChangeNodePayloadAfter object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewNeo4jCaptureDataChangeNodePayloadAfterWithDefaults() *Neo4jCaptureDataChangeNodePayloadAfter {
	this := Neo4jCaptureDataChangeNodePayloadAfter{}
	return &this
}

// GetLabels returns the Labels field value
func (o *Neo4jCaptureDataChangeNodePayloadAfter) GetLabels() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.Labels
}

// GetLabelsOk returns a tuple with the Labels field value
// and a boolean to check if the value has been set.
func (o *Neo4jCaptureDataChangeNodePayloadAfter) GetLabelsOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Labels, true
}

// SetLabels sets field value
func (o *Neo4jCaptureDataChangeNodePayloadAfter) SetLabels(v []string) {
	o.Labels = v
}

// GetProperties returns the Properties field value
func (o *Neo4jCaptureDataChangeNodePayloadAfter) GetProperties() map[string]interface{} {
	if o == nil {
		var ret map[string]interface{}
		return ret
	}

	return o.Properties
}

// GetPropertiesOk returns a tuple with the Properties field value
// and a boolean to check if the value has been set.
func (o *Neo4jCaptureDataChangeNodePayloadAfter) GetPropertiesOk() (map[string]interface{}, bool) {
	if o == nil {
		return map[string]interface{}{}, false
	}
	return o.Properties, true
}

// SetProperties sets field value
func (o *Neo4jCaptureDataChangeNodePayloadAfter) SetProperties(v map[string]interface{}) {
	o.Properties = v
}

func (o Neo4jCaptureDataChangeNodePayloadAfter) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Neo4jCaptureDataChangeNodePayloadAfter) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["labels"] = o.Labels
	toSerialize["properties"] = o.Properties
	return toSerialize, nil
}

func (o *Neo4jCaptureDataChangeNodePayloadAfter) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"labels",
		"properties",
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

	varNeo4jCaptureDataChangeNodePayloadAfter := _Neo4jCaptureDataChangeNodePayloadAfter{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varNeo4jCaptureDataChangeNodePayloadAfter)

	if err != nil {
		return err
	}

	*o = Neo4jCaptureDataChangeNodePayloadAfter(varNeo4jCaptureDataChangeNodePayloadAfter)

	return err
}

type NullableNeo4jCaptureDataChangeNodePayloadAfter struct {
	value *Neo4jCaptureDataChangeNodePayloadAfter
	isSet bool
}

func (v NullableNeo4jCaptureDataChangeNodePayloadAfter) Get() *Neo4jCaptureDataChangeNodePayloadAfter {
	return v.value
}

func (v *NullableNeo4jCaptureDataChangeNodePayloadAfter) Set(val *Neo4jCaptureDataChangeNodePayloadAfter) {
	v.value = val
	v.isSet = true
}

func (v NullableNeo4jCaptureDataChangeNodePayloadAfter) IsSet() bool {
	return v.isSet
}

func (v *NullableNeo4jCaptureDataChangeNodePayloadAfter) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableNeo4jCaptureDataChangeNodePayloadAfter(val *Neo4jCaptureDataChangeNodePayloadAfter) *NullableNeo4jCaptureDataChangeNodePayloadAfter {
	return &NullableNeo4jCaptureDataChangeNodePayloadAfter{value: val, isSet: true}
}

func (v NullableNeo4jCaptureDataChangeNodePayloadAfter) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableNeo4jCaptureDataChangeNodePayloadAfter) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

