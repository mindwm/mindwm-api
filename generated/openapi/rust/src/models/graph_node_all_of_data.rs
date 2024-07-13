/*
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct GraphNodeAllOfData {
    #[serde(rename = "headers")]
    pub headers: serde_json::Value,
    #[serde(rename = "message_key")]
    pub message_key: String,
    #[serde(rename = "meta")]
    pub meta: Box<models::Neo4jCaptureDataChangeMeta>,
    #[serde(rename = "offset")]
    pub offset: i32,
    #[serde(rename = "partition")]
    pub partition: i32,
    #[serde(rename = "source_type")]
    pub source_type: String,
    #[serde(rename = "timestamp")]
    pub timestamp: String,
    #[serde(rename = "topic")]
    pub topic: String,
    #[serde(rename = "schema")]
    pub schema: Box<models::Neo4jCaptureDataChangeSchema>,
    #[serde(rename = "payload")]
    pub payload: Box<models::Neo4jCaptureDataChangeNodePayload>,
}

impl GraphNodeAllOfData {
    pub fn new(headers: serde_json::Value, message_key: String, meta: models::Neo4jCaptureDataChangeMeta, offset: i32, partition: i32, source_type: String, timestamp: String, topic: String, schema: models::Neo4jCaptureDataChangeSchema, payload: models::Neo4jCaptureDataChangeNodePayload) -> GraphNodeAllOfData {
        GraphNodeAllOfData {
            headers,
            message_key,
            meta: Box::new(meta),
            offset,
            partition,
            source_type,
            timestamp,
            topic,
            schema: Box::new(schema),
            payload: Box::new(payload),
        }
    }
}

