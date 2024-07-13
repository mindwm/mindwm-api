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

// checks if the Neo4jCaptureDataChangeRelationshipPayloadEnd type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Neo4jCaptureDataChangeRelationshipPayloadEnd{}

// Neo4jCaptureDataChangeRelationshipPayloadEnd struct for Neo4jCaptureDataChangeRelationshipPayloadEnd
type Neo4jCaptureDataChangeRelationshipPayloadEnd struct {
	Id string `json:"id"`
	Ids map[string]interface{} `json:"ids"`
	Labels []string `json:"labels"`
}

type _Neo4jCaptureDataChangeRelationshipPayloadEnd Neo4jCaptureDataChangeRelationshipPayloadEnd

// NewNeo4jCaptureDataChangeRelationshipPayloadEnd instantiates a new Neo4jCaptureDataChangeRelationshipPayloadEnd object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewNeo4jCaptureDataChangeRelationshipPayloadEnd(id string, ids map[string]interface{}, labels []string) *Neo4jCaptureDataChangeRelationshipPayloadEnd {
	this := Neo4jCaptureDataChangeRelationshipPayloadEnd{}
	this.Id = id
	this.Ids = ids
	this.Labels = labels
	return &this
}

// NewNeo4jCaptureDataChangeRelationshipPayloadEndWithDefaults instantiates a new Neo4jCaptureDataChangeRelationshipPayloadEnd object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewNeo4jCaptureDataChangeRelationshipPayloadEndWithDefaults() *Neo4jCaptureDataChangeRelationshipPayloadEnd {
	this := Neo4jCaptureDataChangeRelationshipPayloadEnd{}
	return &this
}

// GetId returns the Id field value
func (o *Neo4jCaptureDataChangeRelationshipPayloadEnd) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *Neo4jCaptureDataChangeRelationshipPayloadEnd) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *Neo4jCaptureDataChangeRelationshipPayloadEnd) SetId(v string) {
	o.Id = v
}

// GetIds returns the Ids field value
func (o *Neo4jCaptureDataChangeRelationshipPayloadEnd) GetIds() map[string]interface{} {
	if o == nil {
		var ret map[string]interface{}
		return ret
	}

	return o.Ids
}

// GetIdsOk returns a tuple with the Ids field value
// and a boolean to check if the value has been set.
func (o *Neo4jCaptureDataChangeRelationshipPayloadEnd) GetIdsOk() (map[string]interface{}, bool) {
	if o == nil {
		return map[string]interface{}{}, false
	}
	return o.Ids, true
}

// SetIds sets field value
func (o *Neo4jCaptureDataChangeRelationshipPayloadEnd) SetIds(v map[string]interface{}) {
	o.Ids = v
}

// GetLabels returns the Labels field value
func (o *Neo4jCaptureDataChangeRelationshipPayloadEnd) GetLabels() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.Labels
}

// GetLabelsOk returns a tuple with the Labels field value
// and a boolean to check if the value has been set.
func (o *Neo4jCaptureDataChangeRelationshipPayloadEnd) GetLabelsOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Labels, true
}

// SetLabels sets field value
func (o *Neo4jCaptureDataChangeRelationshipPayloadEnd) SetLabels(v []string) {
	o.Labels = v
}

func (o Neo4jCaptureDataChangeRelationshipPayloadEnd) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Neo4jCaptureDataChangeRelationshipPayloadEnd) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["id"] = o.Id
	toSerialize["ids"] = o.Ids
	toSerialize["labels"] = o.Labels
	return toSerialize, nil
}

func (o *Neo4jCaptureDataChangeRelationshipPayloadEnd) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"id",
		"ids",
		"labels",
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

	varNeo4jCaptureDataChangeRelationshipPayloadEnd := _Neo4jCaptureDataChangeRelationshipPayloadEnd{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varNeo4jCaptureDataChangeRelationshipPayloadEnd)

	if err != nil {
		return err
	}

	*o = Neo4jCaptureDataChangeRelationshipPayloadEnd(varNeo4jCaptureDataChangeRelationshipPayloadEnd)

	return err
}

type NullableNeo4jCaptureDataChangeRelationshipPayloadEnd struct {
	value *Neo4jCaptureDataChangeRelationshipPayloadEnd
	isSet bool
}

func (v NullableNeo4jCaptureDataChangeRelationshipPayloadEnd) Get() *Neo4jCaptureDataChangeRelationshipPayloadEnd {
	return v.value
}

func (v *NullableNeo4jCaptureDataChangeRelationshipPayloadEnd) Set(val *Neo4jCaptureDataChangeRelationshipPayloadEnd) {
	v.value = val
	v.isSet = true
}

func (v NullableNeo4jCaptureDataChangeRelationshipPayloadEnd) IsSet() bool {
	return v.isSet
}

func (v *NullableNeo4jCaptureDataChangeRelationshipPayloadEnd) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableNeo4jCaptureDataChangeRelationshipPayloadEnd(val *Neo4jCaptureDataChangeRelationshipPayloadEnd) *NullableNeo4jCaptureDataChangeRelationshipPayloadEnd {
	return &NullableNeo4jCaptureDataChangeRelationshipPayloadEnd{value: val, isSet: true}
}

func (v NullableNeo4jCaptureDataChangeRelationshipPayloadEnd) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableNeo4jCaptureDataChangeRelationshipPayloadEnd) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


