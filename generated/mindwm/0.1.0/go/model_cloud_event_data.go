/*
Mindwm API

This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

API version: 0.1.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package mindwm

import (
	"encoding/json"
	"fmt"
)

// CloudEventData The event payload.
type CloudEventData struct {
	bool *bool
	float32 *float32
	string *string
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *CloudEventData) UnmarshalJSON(data []byte) error {
	var err error
	// this object is nullable so check if the payload is null or empty string
	if string(data) == "" || string(data) == "{}" {
		return nil
	}

	// try to unmarshal JSON data into bool
	err = json.Unmarshal(data, &dst.bool);
	if err == nil {
		jsonbool, _ := json.Marshal(dst.bool)
		if string(jsonbool) == "{}" { // empty struct
			dst.bool = nil
		} else {
			return nil // data stored in dst.bool, return on the first match
		}
	} else {
		dst.bool = nil
	}

	// try to unmarshal JSON data into float32
	err = json.Unmarshal(data, &dst.float32);
	if err == nil {
		jsonfloat32, _ := json.Marshal(dst.float32)
		if string(jsonfloat32) == "{}" { // empty struct
			dst.float32 = nil
		} else {
			return nil // data stored in dst.float32, return on the first match
		}
	} else {
		dst.float32 = nil
	}

	// try to unmarshal JSON data into string
	err = json.Unmarshal(data, &dst.string);
	if err == nil {
		jsonstring, _ := json.Marshal(dst.string)
		if string(jsonstring) == "{}" { // empty struct
			dst.string = nil
		} else {
			return nil // data stored in dst.string, return on the first match
		}
	} else {
		dst.string = nil
	}

	return fmt.Errorf("data failed to match schemas in anyOf(CloudEventData)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src *CloudEventData) MarshalJSON() ([]byte, error) {
	if src.bool != nil {
		return json.Marshal(&src.bool)
	}

	if src.float32 != nil {
		return json.Marshal(&src.float32)
	}

	if src.string != nil {
		return json.Marshal(&src.string)
	}

	return nil, nil // no data in anyOf schemas
}

type NullableCloudEventData struct {
	value *CloudEventData
	isSet bool
}

func (v NullableCloudEventData) Get() *CloudEventData {
	return v.value
}

func (v *NullableCloudEventData) Set(val *CloudEventData) {
	v.value = val
	v.isSet = true
}

func (v NullableCloudEventData) IsSet() bool {
	return v.isSet
}

func (v *NullableCloudEventData) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCloudEventData(val *CloudEventData) *NullableCloudEventData {
	return &NullableCloudEventData{value: val, isSet: true}
}

func (v NullableCloudEventData) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCloudEventData) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


