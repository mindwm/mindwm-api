/*
Mindwm API

This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

API version: 0.1.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package MindwWM

import (
	"encoding/json"
	"fmt"
)

// checks if the TmuxPaneIoDocument type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &TmuxPaneIoDocument{}

// TmuxPaneIoDocument struct for TmuxPaneIoDocument
type TmuxPaneIoDocument struct {
	// User input
	Input string `json:"input"`
	// Command output (mix of stdout & stderr)
	Output string `json:"output"`
	// ps1 (prompt) AFTER the input and output
	Ps1 string `json:"ps1"`
	AdditionalProperties map[string]interface{}
}

type _TmuxPaneIoDocument TmuxPaneIoDocument

// NewTmuxPaneIoDocument instantiates a new TmuxPaneIoDocument object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewTmuxPaneIoDocument(input string, output string, ps1 string) *TmuxPaneIoDocument {
	this := TmuxPaneIoDocument{}
	this.Input = input
	this.Output = output
	this.Ps1 = ps1
	return &this
}

// NewTmuxPaneIoDocumentWithDefaults instantiates a new TmuxPaneIoDocument object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewTmuxPaneIoDocumentWithDefaults() *TmuxPaneIoDocument {
	this := TmuxPaneIoDocument{}
	return &this
}

// GetInput returns the Input field value
func (o *TmuxPaneIoDocument) GetInput() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Input
}

// GetInputOk returns a tuple with the Input field value
// and a boolean to check if the value has been set.
func (o *TmuxPaneIoDocument) GetInputOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Input, true
}

// SetInput sets field value
func (o *TmuxPaneIoDocument) SetInput(v string) {
	o.Input = v
}

// GetOutput returns the Output field value
func (o *TmuxPaneIoDocument) GetOutput() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Output
}

// GetOutputOk returns a tuple with the Output field value
// and a boolean to check if the value has been set.
func (o *TmuxPaneIoDocument) GetOutputOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Output, true
}

// SetOutput sets field value
func (o *TmuxPaneIoDocument) SetOutput(v string) {
	o.Output = v
}

// GetPs1 returns the Ps1 field value
func (o *TmuxPaneIoDocument) GetPs1() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Ps1
}

// GetPs1Ok returns a tuple with the Ps1 field value
// and a boolean to check if the value has been set.
func (o *TmuxPaneIoDocument) GetPs1Ok() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Ps1, true
}

// SetPs1 sets field value
func (o *TmuxPaneIoDocument) SetPs1(v string) {
	o.Ps1 = v
}

func (o TmuxPaneIoDocument) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o TmuxPaneIoDocument) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["input"] = o.Input
	toSerialize["output"] = o.Output
	toSerialize["ps1"] = o.Ps1

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *TmuxPaneIoDocument) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"input",
		"output",
		"ps1",
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

	varTmuxPaneIoDocument := _TmuxPaneIoDocument{}

	err = json.Unmarshal(data, &varTmuxPaneIoDocument)

	if err != nil {
		return err
	}

	*o = TmuxPaneIoDocument(varTmuxPaneIoDocument)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "input")
		delete(additionalProperties, "output")
		delete(additionalProperties, "ps1")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableTmuxPaneIoDocument struct {
	value *TmuxPaneIoDocument
	isSet bool
}

func (v NullableTmuxPaneIoDocument) Get() *TmuxPaneIoDocument {
	return v.value
}

func (v *NullableTmuxPaneIoDocument) Set(val *TmuxPaneIoDocument) {
	v.value = val
	v.isSet = true
}

func (v NullableTmuxPaneIoDocument) IsSet() bool {
	return v.isSet
}

func (v *NullableTmuxPaneIoDocument) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTmuxPaneIoDocument(val *TmuxPaneIoDocument) *NullableTmuxPaneIoDocument {
	return &NullableTmuxPaneIoDocument{value: val, isSet: true}
}

func (v NullableTmuxPaneIoDocument) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTmuxPaneIoDocument) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

