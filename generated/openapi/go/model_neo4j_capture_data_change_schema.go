/*
Mindwm API

This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

API version: 0.1.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package MindWM

import (
	"encoding/json"
)

// checks if the Neo4jCaptureDataChangeSchema type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Neo4jCaptureDataChangeSchema{}

// Neo4jCaptureDataChangeSchema struct for Neo4jCaptureDataChangeSchema
type Neo4jCaptureDataChangeSchema struct {
	Constraints map[string]interface{} `json:"constraints,omitempty"`
	Properties map[string]interface{} `json:"properties,omitempty"`
}

// NewNeo4jCaptureDataChangeSchema instantiates a new Neo4jCaptureDataChangeSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewNeo4jCaptureDataChangeSchema() *Neo4jCaptureDataChangeSchema {
	this := Neo4jCaptureDataChangeSchema{}
	return &this
}

// NewNeo4jCaptureDataChangeSchemaWithDefaults instantiates a new Neo4jCaptureDataChangeSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewNeo4jCaptureDataChangeSchemaWithDefaults() *Neo4jCaptureDataChangeSchema {
	this := Neo4jCaptureDataChangeSchema{}
	return &this
}

// GetConstraints returns the Constraints field value if set, zero value otherwise.
func (o *Neo4jCaptureDataChangeSchema) GetConstraints() map[string]interface{} {
	if o == nil || IsNil(o.Constraints) {
		var ret map[string]interface{}
		return ret
	}
	return o.Constraints
}

// GetConstraintsOk returns a tuple with the Constraints field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Neo4jCaptureDataChangeSchema) GetConstraintsOk() (map[string]interface{}, bool) {
	if o == nil || IsNil(o.Constraints) {
		return map[string]interface{}{}, false
	}
	return o.Constraints, true
}

// HasConstraints returns a boolean if a field has been set.
func (o *Neo4jCaptureDataChangeSchema) HasConstraints() bool {
	if o != nil && !IsNil(o.Constraints) {
		return true
	}

	return false
}

// SetConstraints gets a reference to the given map[string]interface{} and assigns it to the Constraints field.
func (o *Neo4jCaptureDataChangeSchema) SetConstraints(v map[string]interface{}) {
	o.Constraints = v
}

// GetProperties returns the Properties field value if set, zero value otherwise.
func (o *Neo4jCaptureDataChangeSchema) GetProperties() map[string]interface{} {
	if o == nil || IsNil(o.Properties) {
		var ret map[string]interface{}
		return ret
	}
	return o.Properties
}

// GetPropertiesOk returns a tuple with the Properties field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Neo4jCaptureDataChangeSchema) GetPropertiesOk() (map[string]interface{}, bool) {
	if o == nil || IsNil(o.Properties) {
		return map[string]interface{}{}, false
	}
	return o.Properties, true
}

// HasProperties returns a boolean if a field has been set.
func (o *Neo4jCaptureDataChangeSchema) HasProperties() bool {
	if o != nil && !IsNil(o.Properties) {
		return true
	}

	return false
}

// SetProperties gets a reference to the given map[string]interface{} and assigns it to the Properties field.
func (o *Neo4jCaptureDataChangeSchema) SetProperties(v map[string]interface{}) {
	o.Properties = v
}

func (o Neo4jCaptureDataChangeSchema) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Neo4jCaptureDataChangeSchema) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Constraints) {
		toSerialize["constraints"] = o.Constraints
	}
	if !IsNil(o.Properties) {
		toSerialize["properties"] = o.Properties
	}
	return toSerialize, nil
}

type NullableNeo4jCaptureDataChangeSchema struct {
	value *Neo4jCaptureDataChangeSchema
	isSet bool
}

func (v NullableNeo4jCaptureDataChangeSchema) Get() *Neo4jCaptureDataChangeSchema {
	return v.value
}

func (v *NullableNeo4jCaptureDataChangeSchema) Set(val *Neo4jCaptureDataChangeSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableNeo4jCaptureDataChangeSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableNeo4jCaptureDataChangeSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableNeo4jCaptureDataChangeSchema(val *Neo4jCaptureDataChangeSchema) *NullableNeo4jCaptureDataChangeSchema {
	return &NullableNeo4jCaptureDataChangeSchema{value: val, isSet: true}
}

func (v NullableNeo4jCaptureDataChangeSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableNeo4jCaptureDataChangeSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


