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

// checks if the Neo4jChangeDataCaptureRelationshipPayloadEnd type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Neo4jChangeDataCaptureRelationshipPayloadEnd{}

// Neo4jChangeDataCaptureRelationshipPayloadEnd struct for Neo4jChangeDataCaptureRelationshipPayloadEnd
type Neo4jChangeDataCaptureRelationshipPayloadEnd struct {
	Id string `json:"id"`
	Ids map[string]interface{} `json:"ids"`
	Labels []string `json:"labels"`
}

type _Neo4jChangeDataCaptureRelationshipPayloadEnd Neo4jChangeDataCaptureRelationshipPayloadEnd

// NewNeo4jChangeDataCaptureRelationshipPayloadEnd instantiates a new Neo4jChangeDataCaptureRelationshipPayloadEnd object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewNeo4jChangeDataCaptureRelationshipPayloadEnd(id string, ids map[string]interface{}, labels []string) *Neo4jChangeDataCaptureRelationshipPayloadEnd {
	this := Neo4jChangeDataCaptureRelationshipPayloadEnd{}
	this.Id = id
	this.Ids = ids
	this.Labels = labels
	return &this
}

// NewNeo4jChangeDataCaptureRelationshipPayloadEndWithDefaults instantiates a new Neo4jChangeDataCaptureRelationshipPayloadEnd object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewNeo4jChangeDataCaptureRelationshipPayloadEndWithDefaults() *Neo4jChangeDataCaptureRelationshipPayloadEnd {
	this := Neo4jChangeDataCaptureRelationshipPayloadEnd{}
	return &this
}

// GetId returns the Id field value
func (o *Neo4jChangeDataCaptureRelationshipPayloadEnd) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *Neo4jChangeDataCaptureRelationshipPayloadEnd) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *Neo4jChangeDataCaptureRelationshipPayloadEnd) SetId(v string) {
	o.Id = v
}

// GetIds returns the Ids field value
func (o *Neo4jChangeDataCaptureRelationshipPayloadEnd) GetIds() map[string]interface{} {
	if o == nil {
		var ret map[string]interface{}
		return ret
	}

	return o.Ids
}

// GetIdsOk returns a tuple with the Ids field value
// and a boolean to check if the value has been set.
func (o *Neo4jChangeDataCaptureRelationshipPayloadEnd) GetIdsOk() (map[string]interface{}, bool) {
	if o == nil {
		return map[string]interface{}{}, false
	}
	return o.Ids, true
}

// SetIds sets field value
func (o *Neo4jChangeDataCaptureRelationshipPayloadEnd) SetIds(v map[string]interface{}) {
	o.Ids = v
}

// GetLabels returns the Labels field value
func (o *Neo4jChangeDataCaptureRelationshipPayloadEnd) GetLabels() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.Labels
}

// GetLabelsOk returns a tuple with the Labels field value
// and a boolean to check if the value has been set.
func (o *Neo4jChangeDataCaptureRelationshipPayloadEnd) GetLabelsOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Labels, true
}

// SetLabels sets field value
func (o *Neo4jChangeDataCaptureRelationshipPayloadEnd) SetLabels(v []string) {
	o.Labels = v
}

func (o Neo4jChangeDataCaptureRelationshipPayloadEnd) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Neo4jChangeDataCaptureRelationshipPayloadEnd) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["id"] = o.Id
	toSerialize["ids"] = o.Ids
	toSerialize["labels"] = o.Labels
	return toSerialize, nil
}

func (o *Neo4jChangeDataCaptureRelationshipPayloadEnd) UnmarshalJSON(data []byte) (err error) {
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

	varNeo4jChangeDataCaptureRelationshipPayloadEnd := _Neo4jChangeDataCaptureRelationshipPayloadEnd{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varNeo4jChangeDataCaptureRelationshipPayloadEnd)

	if err != nil {
		return err
	}

	*o = Neo4jChangeDataCaptureRelationshipPayloadEnd(varNeo4jChangeDataCaptureRelationshipPayloadEnd)

	return err
}

type NullableNeo4jChangeDataCaptureRelationshipPayloadEnd struct {
	value *Neo4jChangeDataCaptureRelationshipPayloadEnd
	isSet bool
}

func (v NullableNeo4jChangeDataCaptureRelationshipPayloadEnd) Get() *Neo4jChangeDataCaptureRelationshipPayloadEnd {
	return v.value
}

func (v *NullableNeo4jChangeDataCaptureRelationshipPayloadEnd) Set(val *Neo4jChangeDataCaptureRelationshipPayloadEnd) {
	v.value = val
	v.isSet = true
}

func (v NullableNeo4jChangeDataCaptureRelationshipPayloadEnd) IsSet() bool {
	return v.isSet
}

func (v *NullableNeo4jChangeDataCaptureRelationshipPayloadEnd) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableNeo4jChangeDataCaptureRelationshipPayloadEnd(val *Neo4jChangeDataCaptureRelationshipPayloadEnd) *NullableNeo4jChangeDataCaptureRelationshipPayloadEnd {
	return &NullableNeo4jChangeDataCaptureRelationshipPayloadEnd{value: val, isSet: true}
}

func (v NullableNeo4jChangeDataCaptureRelationshipPayloadEnd) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableNeo4jChangeDataCaptureRelationshipPayloadEnd) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

