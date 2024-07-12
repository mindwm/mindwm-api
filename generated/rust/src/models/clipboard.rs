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
pub struct Clipboard {
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<String>,
    #[serde(rename = "source", skip_serializing_if = "Option::is_none")]
    pub source: Option<String>,
    #[serde(rename = "data", skip_serializing_if = "Option::is_none")]
    pub data: Option<Box<models::ClipboardPayload>>,
    /// Identifies the event.
    #[serde(rename = "id")]
    pub id: String,
    /// The version of the CloudEvents specification which the event uses.
    #[serde(rename = "specversion")]
    pub specversion: String,
    /// Content type of the data value. Must adhere to RFC 2046 format.
    #[serde(rename = "datacontenttype", skip_serializing_if = "Option::is_none")]
    pub datacontenttype: Option<String>,
    /// Identifies the schema that data adheres to.
    #[serde(rename = "dataschema", skip_serializing_if = "Option::is_none")]
    pub dataschema: Option<String>,
    /// Describes the subject of the event in the context of the event producer (identified by source).
    #[serde(rename = "subject", skip_serializing_if = "Option::is_none")]
    pub subject: Option<String>,
    /// Timestamp of when the occurrence happened. Must adhere to RFC 3339.
    #[serde(rename = "time", skip_serializing_if = "Option::is_none")]
    pub time: Option<String>,
    /// Base64 encoded event payload. Must adhere to RFC4648.
    #[serde(rename = "data_base64", skip_serializing_if = "Option::is_none")]
    pub data_base64: Option<String>,
}

impl Clipboard {
    pub fn new(id: String, specversion: String) -> Clipboard {
        Clipboard {
            r#type: None,
            source: None,
            data: None,
            id,
            specversion,
            datacontenttype: None,
            dataschema: None,
            subject: None,
            time: None,
            data_base64: None,
        }
    }
}

