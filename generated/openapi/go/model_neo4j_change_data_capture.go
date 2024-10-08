/*
Mindwm API

This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

API version: 0.1.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package MindWM

import (
	"encoding/json"
	"time"
	"bytes"
	"fmt"
)

// checks if the Neo4jChangeDataCapture type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Neo4jChangeDataCapture{}

// Neo4jChangeDataCapture struct for Neo4jChangeDataCapture
type Neo4jChangeDataCapture struct {
	Headers map[string]interface{} `json:"headers"`
	MessageKey string `json:"message_key"`
	Meta Neo4jChangeDataCaptureMeta `json:"meta"`
	Offset int32 `json:"offset"`
	Partition int32 `json:"partition"`
	SourceType string `json:"source_type"`
	Timestamp time.Time `json:"timestamp"`
	Topic string `json:"topic"`
	Schema Neo4jChangeDataCaptureSchema `json:"schema"`
	Payload Neo4jChangeDataCapturePayload `json:"payload"`
}

type _Neo4jChangeDataCapture Neo4jChangeDataCapture

// NewNeo4jChangeDataCapture instantiates a new Neo4jChangeDataCapture object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewNeo4jChangeDataCapture(headers map[string]interface{}, messageKey string, meta Neo4jChangeDataCaptureMeta, offset int32, partition int32, sourceType string, timestamp time.Time, topic string, schema Neo4jChangeDataCaptureSchema, payload Neo4jChangeDataCapturePayload) *Neo4jChangeDataCapture {
	this := Neo4jChangeDataCapture{}
	this.Headers = headers
	this.MessageKey = messageKey
	this.Meta = meta
	this.Offset = offset
	this.Partition = partition
	this.SourceType = sourceType
	this.Timestamp = timestamp
	this.Topic = topic
	this.Schema = schema
	this.Payload = payload
	return &this
}

// NewNeo4jChangeDataCaptureWithDefaults instantiates a new Neo4jChangeDataCapture object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewNeo4jChangeDataCaptureWithDefaults() *Neo4jChangeDataCapture {
	this := Neo4jChangeDataCapture{}
	return &this
}

// GetHeaders returns the Headers field value
func (o *Neo4jChangeDataCapture) GetHeaders() map[string]interface{} {
	if o == nil {
		var ret map[string]interface{}
		return ret
	}

	return o.Headers
}

// GetHeadersOk returns a tuple with the Headers field value
// and a boolean to check if the value has been set.
func (o *Neo4jChangeDataCapture) GetHeadersOk() (map[string]interface{}, bool) {
	if o == nil {
		return map[string]interface{}{}, false
	}
	return o.Headers, true
}

// SetHeaders sets field value
func (o *Neo4jChangeDataCapture) SetHeaders(v map[string]interface{}) {
	o.Headers = v
}

// GetMessageKey returns the MessageKey field value
func (o *Neo4jChangeDataCapture) GetMessageKey() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.MessageKey
}

// GetMessageKeyOk returns a tuple with the MessageKey field value
// and a boolean to check if the value has been set.
func (o *Neo4jChangeDataCapture) GetMessageKeyOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.MessageKey, true
}

// SetMessageKey sets field value
func (o *Neo4jChangeDataCapture) SetMessageKey(v string) {
	o.MessageKey = v
}

// GetMeta returns the Meta field value
func (o *Neo4jChangeDataCapture) GetMeta() Neo4jChangeDataCaptureMeta {
	if o == nil {
		var ret Neo4jChangeDataCaptureMeta
		return ret
	}

	return o.Meta
}

// GetMetaOk returns a tuple with the Meta field value
// and a boolean to check if the value has been set.
func (o *Neo4jChangeDataCapture) GetMetaOk() (*Neo4jChangeDataCaptureMeta, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Meta, true
}

// SetMeta sets field value
func (o *Neo4jChangeDataCapture) SetMeta(v Neo4jChangeDataCaptureMeta) {
	o.Meta = v
}

// GetOffset returns the Offset field value
func (o *Neo4jChangeDataCapture) GetOffset() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Offset
}

// GetOffsetOk returns a tuple with the Offset field value
// and a boolean to check if the value has been set.
func (o *Neo4jChangeDataCapture) GetOffsetOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Offset, true
}

// SetOffset sets field value
func (o *Neo4jChangeDataCapture) SetOffset(v int32) {
	o.Offset = v
}

// GetPartition returns the Partition field value
func (o *Neo4jChangeDataCapture) GetPartition() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Partition
}

// GetPartitionOk returns a tuple with the Partition field value
// and a boolean to check if the value has been set.
func (o *Neo4jChangeDataCapture) GetPartitionOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Partition, true
}

// SetPartition sets field value
func (o *Neo4jChangeDataCapture) SetPartition(v int32) {
	o.Partition = v
}

// GetSourceType returns the SourceType field value
func (o *Neo4jChangeDataCapture) GetSourceType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.SourceType
}

// GetSourceTypeOk returns a tuple with the SourceType field value
// and a boolean to check if the value has been set.
func (o *Neo4jChangeDataCapture) GetSourceTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SourceType, true
}

// SetSourceType sets field value
func (o *Neo4jChangeDataCapture) SetSourceType(v string) {
	o.SourceType = v
}

// GetTimestamp returns the Timestamp field value
func (o *Neo4jChangeDataCapture) GetTimestamp() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.Timestamp
}

// GetTimestampOk returns a tuple with the Timestamp field value
// and a boolean to check if the value has been set.
func (o *Neo4jChangeDataCapture) GetTimestampOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Timestamp, true
}

// SetTimestamp sets field value
func (o *Neo4jChangeDataCapture) SetTimestamp(v time.Time) {
	o.Timestamp = v
}

// GetTopic returns the Topic field value
func (o *Neo4jChangeDataCapture) GetTopic() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Topic
}

// GetTopicOk returns a tuple with the Topic field value
// and a boolean to check if the value has been set.
func (o *Neo4jChangeDataCapture) GetTopicOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Topic, true
}

// SetTopic sets field value
func (o *Neo4jChangeDataCapture) SetTopic(v string) {
	o.Topic = v
}

// GetSchema returns the Schema field value
func (o *Neo4jChangeDataCapture) GetSchema() Neo4jChangeDataCaptureSchema {
	if o == nil {
		var ret Neo4jChangeDataCaptureSchema
		return ret
	}

	return o.Schema
}

// GetSchemaOk returns a tuple with the Schema field value
// and a boolean to check if the value has been set.
func (o *Neo4jChangeDataCapture) GetSchemaOk() (*Neo4jChangeDataCaptureSchema, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Schema, true
}

// SetSchema sets field value
func (o *Neo4jChangeDataCapture) SetSchema(v Neo4jChangeDataCaptureSchema) {
	o.Schema = v
}

// GetPayload returns the Payload field value
func (o *Neo4jChangeDataCapture) GetPayload() Neo4jChangeDataCapturePayload {
	if o == nil {
		var ret Neo4jChangeDataCapturePayload
		return ret
	}

	return o.Payload
}

// GetPayloadOk returns a tuple with the Payload field value
// and a boolean to check if the value has been set.
func (o *Neo4jChangeDataCapture) GetPayloadOk() (*Neo4jChangeDataCapturePayload, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Payload, true
}

// SetPayload sets field value
func (o *Neo4jChangeDataCapture) SetPayload(v Neo4jChangeDataCapturePayload) {
	o.Payload = v
}

func (o Neo4jChangeDataCapture) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Neo4jChangeDataCapture) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["headers"] = o.Headers
	toSerialize["message_key"] = o.MessageKey
	toSerialize["meta"] = o.Meta
	toSerialize["offset"] = o.Offset
	toSerialize["partition"] = o.Partition
	toSerialize["source_type"] = o.SourceType
	toSerialize["timestamp"] = o.Timestamp
	toSerialize["topic"] = o.Topic
	toSerialize["schema"] = o.Schema
	toSerialize["payload"] = o.Payload
	return toSerialize, nil
}

func (o *Neo4jChangeDataCapture) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"headers",
		"message_key",
		"meta",
		"offset",
		"partition",
		"source_type",
		"timestamp",
		"topic",
		"schema",
		"payload",
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

	varNeo4jChangeDataCapture := _Neo4jChangeDataCapture{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varNeo4jChangeDataCapture)

	if err != nil {
		return err
	}

	*o = Neo4jChangeDataCapture(varNeo4jChangeDataCapture)

	return err
}

type NullableNeo4jChangeDataCapture struct {
	value *Neo4jChangeDataCapture
	isSet bool
}

func (v NullableNeo4jChangeDataCapture) Get() *Neo4jChangeDataCapture {
	return v.value
}

func (v *NullableNeo4jChangeDataCapture) Set(val *Neo4jChangeDataCapture) {
	v.value = val
	v.isSet = true
}

func (v NullableNeo4jChangeDataCapture) IsSet() bool {
	return v.isSet
}

func (v *NullableNeo4jChangeDataCapture) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableNeo4jChangeDataCapture(val *Neo4jChangeDataCapture) *NullableNeo4jChangeDataCapture {
	return &NullableNeo4jChangeDataCapture{value: val, isSet: true}
}

func (v NullableNeo4jChangeDataCapture) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableNeo4jChangeDataCapture) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


