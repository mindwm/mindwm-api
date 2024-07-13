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
	"bytes"
	"fmt"
)

// checks if the GraphNodeAllOfData type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &GraphNodeAllOfData{}

// GraphNodeAllOfData struct for GraphNodeAllOfData
type GraphNodeAllOfData struct {
	Headers map[string]interface{} `json:"headers"`
	MessageKey string `json:"message_key"`
	Meta Neo4jCaptureDataChangeMeta `json:"meta"`
	Offset int32 `json:"offset"`
	Partition int32 `json:"partition"`
	SourceType string `json:"source_type"`
	Timestamp time.Time `json:"timestamp"`
	Topic string `json:"topic"`
	Schema Neo4jCaptureDataChangeSchema `json:"schema"`
	Payload Neo4jCaptureDataChangeNodePayload `json:"payload"`
}

type _GraphNodeAllOfData GraphNodeAllOfData

// NewGraphNodeAllOfData instantiates a new GraphNodeAllOfData object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewGraphNodeAllOfData(headers map[string]interface{}, messageKey string, meta Neo4jCaptureDataChangeMeta, offset int32, partition int32, sourceType string, timestamp time.Time, topic string, schema Neo4jCaptureDataChangeSchema, payload Neo4jCaptureDataChangeNodePayload) *GraphNodeAllOfData {
	this := GraphNodeAllOfData{}
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

// NewGraphNodeAllOfDataWithDefaults instantiates a new GraphNodeAllOfData object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewGraphNodeAllOfDataWithDefaults() *GraphNodeAllOfData {
	this := GraphNodeAllOfData{}
	return &this
}

// GetHeaders returns the Headers field value
func (o *GraphNodeAllOfData) GetHeaders() map[string]interface{} {
	if o == nil {
		var ret map[string]interface{}
		return ret
	}

	return o.Headers
}

// GetHeadersOk returns a tuple with the Headers field value
// and a boolean to check if the value has been set.
func (o *GraphNodeAllOfData) GetHeadersOk() (map[string]interface{}, bool) {
	if o == nil {
		return map[string]interface{}{}, false
	}
	return o.Headers, true
}

// SetHeaders sets field value
func (o *GraphNodeAllOfData) SetHeaders(v map[string]interface{}) {
	o.Headers = v
}

// GetMessageKey returns the MessageKey field value
func (o *GraphNodeAllOfData) GetMessageKey() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.MessageKey
}

// GetMessageKeyOk returns a tuple with the MessageKey field value
// and a boolean to check if the value has been set.
func (o *GraphNodeAllOfData) GetMessageKeyOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.MessageKey, true
}

// SetMessageKey sets field value
func (o *GraphNodeAllOfData) SetMessageKey(v string) {
	o.MessageKey = v
}

// GetMeta returns the Meta field value
func (o *GraphNodeAllOfData) GetMeta() Neo4jCaptureDataChangeMeta {
	if o == nil {
		var ret Neo4jCaptureDataChangeMeta
		return ret
	}

	return o.Meta
}

// GetMetaOk returns a tuple with the Meta field value
// and a boolean to check if the value has been set.
func (o *GraphNodeAllOfData) GetMetaOk() (*Neo4jCaptureDataChangeMeta, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Meta, true
}

// SetMeta sets field value
func (o *GraphNodeAllOfData) SetMeta(v Neo4jCaptureDataChangeMeta) {
	o.Meta = v
}

// GetOffset returns the Offset field value
func (o *GraphNodeAllOfData) GetOffset() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Offset
}

// GetOffsetOk returns a tuple with the Offset field value
// and a boolean to check if the value has been set.
func (o *GraphNodeAllOfData) GetOffsetOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Offset, true
}

// SetOffset sets field value
func (o *GraphNodeAllOfData) SetOffset(v int32) {
	o.Offset = v
}

// GetPartition returns the Partition field value
func (o *GraphNodeAllOfData) GetPartition() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Partition
}

// GetPartitionOk returns a tuple with the Partition field value
// and a boolean to check if the value has been set.
func (o *GraphNodeAllOfData) GetPartitionOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Partition, true
}

// SetPartition sets field value
func (o *GraphNodeAllOfData) SetPartition(v int32) {
	o.Partition = v
}

// GetSourceType returns the SourceType field value
func (o *GraphNodeAllOfData) GetSourceType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.SourceType
}

// GetSourceTypeOk returns a tuple with the SourceType field value
// and a boolean to check if the value has been set.
func (o *GraphNodeAllOfData) GetSourceTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SourceType, true
}

// SetSourceType sets field value
func (o *GraphNodeAllOfData) SetSourceType(v string) {
	o.SourceType = v
}

// GetTimestamp returns the Timestamp field value
func (o *GraphNodeAllOfData) GetTimestamp() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.Timestamp
}

// GetTimestampOk returns a tuple with the Timestamp field value
// and a boolean to check if the value has been set.
func (o *GraphNodeAllOfData) GetTimestampOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Timestamp, true
}

// SetTimestamp sets field value
func (o *GraphNodeAllOfData) SetTimestamp(v time.Time) {
	o.Timestamp = v
}

// GetTopic returns the Topic field value
func (o *GraphNodeAllOfData) GetTopic() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Topic
}

// GetTopicOk returns a tuple with the Topic field value
// and a boolean to check if the value has been set.
func (o *GraphNodeAllOfData) GetTopicOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Topic, true
}

// SetTopic sets field value
func (o *GraphNodeAllOfData) SetTopic(v string) {
	o.Topic = v
}

// GetSchema returns the Schema field value
func (o *GraphNodeAllOfData) GetSchema() Neo4jCaptureDataChangeSchema {
	if o == nil {
		var ret Neo4jCaptureDataChangeSchema
		return ret
	}

	return o.Schema
}

// GetSchemaOk returns a tuple with the Schema field value
// and a boolean to check if the value has been set.
func (o *GraphNodeAllOfData) GetSchemaOk() (*Neo4jCaptureDataChangeSchema, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Schema, true
}

// SetSchema sets field value
func (o *GraphNodeAllOfData) SetSchema(v Neo4jCaptureDataChangeSchema) {
	o.Schema = v
}

// GetPayload returns the Payload field value
func (o *GraphNodeAllOfData) GetPayload() Neo4jCaptureDataChangeNodePayload {
	if o == nil {
		var ret Neo4jCaptureDataChangeNodePayload
		return ret
	}

	return o.Payload
}

// GetPayloadOk returns a tuple with the Payload field value
// and a boolean to check if the value has been set.
func (o *GraphNodeAllOfData) GetPayloadOk() (*Neo4jCaptureDataChangeNodePayload, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Payload, true
}

// SetPayload sets field value
func (o *GraphNodeAllOfData) SetPayload(v Neo4jCaptureDataChangeNodePayload) {
	o.Payload = v
}

func (o GraphNodeAllOfData) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o GraphNodeAllOfData) ToMap() (map[string]interface{}, error) {
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

func (o *GraphNodeAllOfData) UnmarshalJSON(data []byte) (err error) {
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

	varGraphNodeAllOfData := _GraphNodeAllOfData{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varGraphNodeAllOfData)

	if err != nil {
		return err
	}

	*o = GraphNodeAllOfData(varGraphNodeAllOfData)

	return err
}

type NullableGraphNodeAllOfData struct {
	value *GraphNodeAllOfData
	isSet bool
}

func (v NullableGraphNodeAllOfData) Get() *GraphNodeAllOfData {
	return v.value
}

func (v *NullableGraphNodeAllOfData) Set(val *GraphNodeAllOfData) {
	v.value = val
	v.isSet = true
}

func (v NullableGraphNodeAllOfData) IsSet() bool {
	return v.isSet
}

func (v *NullableGraphNodeAllOfData) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableGraphNodeAllOfData(val *GraphNodeAllOfData) *NullableGraphNodeAllOfData {
	return &NullableGraphNodeAllOfData{value: val, isSet: true}
}

func (v NullableGraphNodeAllOfData) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableGraphNodeAllOfData) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


