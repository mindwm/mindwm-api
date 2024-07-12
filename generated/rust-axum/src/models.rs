#![allow(unused_qualifications)]

use http::HeaderValue;
use validator::Validate;

#[cfg(feature = "server")]
use crate::header;
use crate::{models, types::*};






#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct Clipboard {
    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub r#type: Option<String>,

    #[serde(rename = "source")]
    #[validate(
            regex(path = *RE_CLIPBOARD_SOURCE),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub source: Option<String>,

    #[serde(rename = "data")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data: Option<models::ClipboardPayload>,

/// Identifies the event.
    #[serde(rename = "id")]
    #[validate(
            length(min = 1),
        )]
    pub id: String,

/// The version of the CloudEvents specification which the event uses.
    #[serde(rename = "specversion")]
    #[validate(
            length(min = 1),
        )]
    pub specversion: String,

/// Content type of the data value. Must adhere to RFC 2046 format.
    #[serde(rename = "datacontenttype")]
    #[validate(
            length(min = 1),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub datacontenttype: Option<String>,

/// Identifies the schema that data adheres to.
    #[serde(rename = "dataschema")]
    #[validate(
            length(min = 1),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub dataschema: Option<String>,

/// Describes the subject of the event in the context of the event producer (identified by source).
    #[serde(rename = "subject")]
    #[validate(
            length(min = 1),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub subject: Option<String>,

/// Timestamp of when the occurrence happened. Must adhere to RFC 3339.
    #[serde(rename = "time")]
    #[validate(
            length(min = 1),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub time: Option<chrono::DateTime::<chrono::Utc>>,

/// Base64 encoded event payload. Must adhere to RFC4648.
    #[serde(rename = "data_base64")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data_base64: Option<String>,

}

lazy_static::lazy_static! {
    static ref RE_CLIPBOARD_SOURCE: regex::Regex = regex::Regex::new(r"[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?&lt;!-)$").unwrap();
}

impl Clipboard {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(id: String, specversion: String, ) -> Clipboard {
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

/// Converts the Clipboard value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for Clipboard {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.r#type.as_ref().map(|r#type| {
                [
                    "type".to_string(),
                    r#type.to_string(),
                ].join(",")
            }),


            self.source.as_ref().map(|source| {
                [
                    "source".to_string(),
                    source.to_string(),
                ].join(",")
            }),

            // Skipping data in query parameter serialization


            Some("id".to_string()),
            Some(self.id.to_string()),


            Some("specversion".to_string()),
            Some(self.specversion.to_string()),


            self.datacontenttype.as_ref().map(|datacontenttype| {
                [
                    "datacontenttype".to_string(),
                    datacontenttype.to_string(),
                ].join(",")
            }),


            self.dataschema.as_ref().map(|dataschema| {
                [
                    "dataschema".to_string(),
                    dataschema.to_string(),
                ].join(",")
            }),


            self.subject.as_ref().map(|subject| {
                [
                    "subject".to_string(),
                    subject.to_string(),
                ].join(",")
            }),

            // Skipping time in query parameter serialization


            self.data_base64.as_ref().map(|data_base64| {
                [
                    "data_base64".to_string(),
                    data_base64.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Clipboard value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Clipboard {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub r#type: Vec<String>,
            pub source: Vec<String>,
            pub data: Vec<models::ClipboardPayload>,
            pub id: Vec<String>,
            pub specversion: Vec<String>,
            pub datacontenttype: Vec<String>,
            pub dataschema: Vec<String>,
            pub subject: Vec<String>,
            pub time: Vec<chrono::DateTime::<chrono::Utc>>,
            pub data_base64: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Clipboard".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "type" => intermediate_rep.r#type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "source" => intermediate_rep.source.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "data" => intermediate_rep.data.push(<models::ClipboardPayload as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "specversion" => intermediate_rep.specversion.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "datacontenttype" => intermediate_rep.datacontenttype.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "dataschema" => intermediate_rep.dataschema.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "subject" => intermediate_rep.subject.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "time" => intermediate_rep.time.push(<chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "data_base64" => intermediate_rep.data_base64.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing Clipboard".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Clipboard {
            r#type: intermediate_rep.r#type.into_iter().next(),
            source: intermediate_rep.source.into_iter().next(),
            data: intermediate_rep.data.into_iter().next(),
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in Clipboard".to_string())?,
            specversion: intermediate_rep.specversion.into_iter().next().ok_or_else(|| "specversion missing in Clipboard".to_string())?,
            datacontenttype: intermediate_rep.datacontenttype.into_iter().next(),
            dataschema: intermediate_rep.dataschema.into_iter().next(),
            subject: intermediate_rep.subject.into_iter().next(),
            time: intermediate_rep.time.into_iter().next(),
            data_base64: intermediate_rep.data_base64.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Clipboard> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<Clipboard>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Clipboard>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Clipboard - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<Clipboard> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Clipboard as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Clipboard - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct ClipboardPayload {
/// Starting position of clipboard selection [x,y]
    #[serde(rename = "start")]
    #[validate(
            length(min = 2, max = 2),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub start: Option<Vec<i32>>,

/// Ending position of clipboard selection [x,y]
    #[serde(rename = "stop")]
    #[validate(
            length(min = 2, max = 2),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub stop: Option<Vec<i32>>,

/// Clipboard data
    #[serde(rename = "data")]
    #[validate(
            length(min = 1),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data: Option<String>,

/// Clipboard type
/// Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub r#type: Option<String>,

    #[serde(rename = "context")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub context: Option<models::ClipboardPayloadContext>,

}


impl ClipboardPayload {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> ClipboardPayload {
        ClipboardPayload {
            start: None,
            stop: None,
            data: None,
            r#type: None,
            context: None,
        }
    }
}

/// Converts the ClipboardPayload value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for ClipboardPayload {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.start.as_ref().map(|start| {
                [
                    "start".to_string(),
                    start.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(","),
                ].join(",")
            }),


            self.stop.as_ref().map(|stop| {
                [
                    "stop".to_string(),
                    stop.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(","),
                ].join(",")
            }),


            self.data.as_ref().map(|data| {
                [
                    "data".to_string(),
                    data.to_string(),
                ].join(",")
            }),


            self.r#type.as_ref().map(|r#type| {
                [
                    "type".to_string(),
                    r#type.to_string(),
                ].join(",")
            }),

            // Skipping context in query parameter serialization

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a ClipboardPayload value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for ClipboardPayload {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub start: Vec<Vec<i32>>,
            pub stop: Vec<Vec<i32>>,
            pub data: Vec<String>,
            pub r#type: Vec<String>,
            pub context: Vec<models::ClipboardPayloadContext>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing ClipboardPayload".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    "start" => return std::result::Result::Err("Parsing a container in this style is not supported in ClipboardPayload".to_string()),
                    "stop" => return std::result::Result::Err("Parsing a container in this style is not supported in ClipboardPayload".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "data" => intermediate_rep.data.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "type" => intermediate_rep.r#type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "context" => intermediate_rep.context.push(<models::ClipboardPayloadContext as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing ClipboardPayload".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(ClipboardPayload {
            start: intermediate_rep.start.into_iter().next(),
            stop: intermediate_rep.stop.into_iter().next(),
            data: intermediate_rep.data.into_iter().next(),
            r#type: intermediate_rep.r#type.into_iter().next(),
            context: intermediate_rep.context.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<ClipboardPayload> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<ClipboardPayload>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<ClipboardPayload>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for ClipboardPayload - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<ClipboardPayload> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <ClipboardPayload as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into ClipboardPayload - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}




/// Selection context



#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct ClipboardPayloadContext {
/// window id
    #[serde(rename = "window")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub window: Option<String>,

}


impl ClipboardPayloadContext {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> ClipboardPayloadContext {
        ClipboardPayloadContext {
            window: None,
        }
    }
}

/// Converts the ClipboardPayloadContext value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for ClipboardPayloadContext {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.window.as_ref().map(|window| {
                [
                    "window".to_string(),
                    window.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a ClipboardPayloadContext value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for ClipboardPayloadContext {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub window: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing ClipboardPayloadContext".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "window" => intermediate_rep.window.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing ClipboardPayloadContext".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(ClipboardPayloadContext {
            window: intermediate_rep.window.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<ClipboardPayloadContext> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<ClipboardPayloadContext>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<ClipboardPayloadContext>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for ClipboardPayloadContext - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<ClipboardPayloadContext> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <ClipboardPayloadContext as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into ClipboardPayloadContext - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}




/// CloudEvents Specification JSON Schema



#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct CloudEvent {
/// Identifies the event.
    #[serde(rename = "id")]
    #[validate(
            length(min = 1),
        )]
    pub id: String,

/// Identifies the context in which an event happened.
    #[serde(rename = "source")]
    #[validate(
            length(min = 1),
        )]
    pub source: String,

/// The version of the CloudEvents specification which the event uses.
    #[serde(rename = "specversion")]
    #[validate(
            length(min = 1),
        )]
    pub specversion: String,

/// Describes the type of event related to the originating occurrence.
    #[serde(rename = "type")]
    #[validate(
            length(min = 1),
        )]
    pub r#type: String,

/// Content type of the data value. Must adhere to RFC 2046 format.
    #[serde(rename = "datacontenttype")]
    #[validate(
            length(min = 1),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub datacontenttype: Option<Nullable<String>>,

/// Identifies the schema that data adheres to.
    #[serde(rename = "dataschema")]
    #[validate(
            length(min = 1),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub dataschema: Option<Nullable<String>>,

/// Describes the subject of the event in the context of the event producer (identified by source).
    #[serde(rename = "subject")]
    #[validate(
            length(min = 1),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub subject: Option<Nullable<String>>,

/// Timestamp of when the occurrence happened. Must adhere to RFC 3339.
    #[serde(rename = "time")]
    #[validate(
            length(min = 1),
        )]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub time: Option<Nullable<chrono::DateTime::<chrono::Utc>>>,

    #[serde(rename = "data")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data: Option<Nullable<models::CloudEventData>>,

/// Base64 encoded event payload. Must adhere to RFC4648.
    #[serde(rename = "data_base64")]
    #[serde(deserialize_with = "deserialize_optional_nullable")]
    #[serde(default = "default_optional_nullable")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data_base64: Option<Nullable<String>>,

}


impl CloudEvent {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(id: String, source: String, specversion: String, r#type: String, ) -> CloudEvent {
        CloudEvent {
            id,
            source,
            specversion,
            r#type,
            datacontenttype: None,
            dataschema: None,
            subject: None,
            time: None,
            data: None,
            data_base64: None,
        }
    }
}

/// Converts the CloudEvent value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for CloudEvent {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("id".to_string()),
            Some(self.id.to_string()),


            Some("source".to_string()),
            Some(self.source.to_string()),


            Some("specversion".to_string()),
            Some(self.specversion.to_string()),


            Some("type".to_string()),
            Some(self.r#type.to_string()),


            self.datacontenttype.as_ref().map(|datacontenttype| {
                [
                    "datacontenttype".to_string(),
                    datacontenttype.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.dataschema.as_ref().map(|dataschema| {
                [
                    "dataschema".to_string(),
                    dataschema.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),


            self.subject.as_ref().map(|subject| {
                [
                    "subject".to_string(),
                    subject.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),

            // Skipping time in query parameter serialization

            // Skipping data in query parameter serialization


            self.data_base64.as_ref().map(|data_base64| {
                [
                    "data_base64".to_string(),
                    data_base64.as_ref().map_or("null".to_string(), |x| x.to_string()),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CloudEvent value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CloudEvent {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub id: Vec<String>,
            pub source: Vec<String>,
            pub specversion: Vec<String>,
            pub r#type: Vec<String>,
            pub datacontenttype: Vec<String>,
            pub dataschema: Vec<String>,
            pub subject: Vec<String>,
            pub time: Vec<chrono::DateTime::<chrono::Utc>>,
            pub data: Vec<models::CloudEventData>,
            pub data_base64: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing CloudEvent".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "source" => intermediate_rep.source.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "specversion" => intermediate_rep.specversion.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "type" => intermediate_rep.r#type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "datacontenttype" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CloudEvent".to_string()),
                    "dataschema" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CloudEvent".to_string()),
                    "subject" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CloudEvent".to_string()),
                    "time" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CloudEvent".to_string()),
                    "data" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CloudEvent".to_string()),
                    "data_base64" => return std::result::Result::Err("Parsing a nullable type in this style is not supported in CloudEvent".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing CloudEvent".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(CloudEvent {
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in CloudEvent".to_string())?,
            source: intermediate_rep.source.into_iter().next().ok_or_else(|| "source missing in CloudEvent".to_string())?,
            specversion: intermediate_rep.specversion.into_iter().next().ok_or_else(|| "specversion missing in CloudEvent".to_string())?,
            r#type: intermediate_rep.r#type.into_iter().next().ok_or_else(|| "type missing in CloudEvent".to_string())?,
            datacontenttype: std::result::Result::Err("Nullable types not supported in CloudEvent".to_string())?,
            dataschema: std::result::Result::Err("Nullable types not supported in CloudEvent".to_string())?,
            subject: std::result::Result::Err("Nullable types not supported in CloudEvent".to_string())?,
            time: std::result::Result::Err("Nullable types not supported in CloudEvent".to_string())?,
            data: std::result::Result::Err("Nullable types not supported in CloudEvent".to_string())?,
            data_base64: std::result::Result::Err("Nullable types not supported in CloudEvent".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CloudEvent> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<CloudEvent>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CloudEvent>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CloudEvent - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<CloudEvent> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <CloudEvent as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into CloudEvent - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}




/// The event payload.

/// Any of:
/// - String
/// - bool
/// - f64
#[derive(Debug, Clone, serde::Serialize, serde::Deserialize)]
pub struct CloudEventData(Box<serde_json::value::RawValue>);

impl validator::Validate for CloudEventData
{
    fn validate(&self) -> std::result::Result<(), validator::ValidationErrors> {
        std::result::Result::Ok(())
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a CloudEventData value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for CloudEventData {
    type Err = serde_json::Error;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        serde_json::from_str(s)
    }
}

impl PartialEq for CloudEventData {
    fn eq(&self, other: &Self) -> bool {
        self.0.get() == other.0.get()
    }
}









#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct IoDocument {
    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub r#type: Option<String>,

    #[serde(rename = "source")]
    #[validate(
            regex(path = *RE_IODOCUMENT_SOURCE),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub source: Option<String>,

    #[serde(rename = "data")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data: Option<models::TmuxPaneIoDocument>,

/// Identifies the event.
    #[serde(rename = "id")]
    #[validate(
            length(min = 1),
        )]
    pub id: String,

/// The version of the CloudEvents specification which the event uses.
    #[serde(rename = "specversion")]
    #[validate(
            length(min = 1),
        )]
    pub specversion: String,

/// Content type of the data value. Must adhere to RFC 2046 format.
    #[serde(rename = "datacontenttype")]
    #[validate(
            length(min = 1),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub datacontenttype: Option<String>,

/// Identifies the schema that data adheres to.
    #[serde(rename = "dataschema")]
    #[validate(
            length(min = 1),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub dataschema: Option<String>,

/// Describes the subject of the event in the context of the event producer (identified by source).
    #[serde(rename = "subject")]
    #[validate(
            length(min = 1),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub subject: Option<String>,

/// Timestamp of when the occurrence happened. Must adhere to RFC 3339.
    #[serde(rename = "time")]
    #[validate(
            length(min = 1),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub time: Option<chrono::DateTime::<chrono::Utc>>,

/// Base64 encoded event payload. Must adhere to RFC4648.
    #[serde(rename = "data_base64")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data_base64: Option<String>,

}

lazy_static::lazy_static! {
    static ref RE_IODOCUMENT_SOURCE: regex::Regex = regex::Regex::new(r"[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?&lt;!-)\\\\.tmux\\\\.[A-Za-z0-9+/]*&#x3D;{0,2}\\.[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}\\\\.[0-9]+?\\\\.[0-9]+?\\\\.tiodocument$").unwrap();
}

impl IoDocument {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(id: String, specversion: String, ) -> IoDocument {
        IoDocument {
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

/// Converts the IoDocument value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for IoDocument {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.r#type.as_ref().map(|r#type| {
                [
                    "type".to_string(),
                    r#type.to_string(),
                ].join(",")
            }),


            self.source.as_ref().map(|source| {
                [
                    "source".to_string(),
                    source.to_string(),
                ].join(",")
            }),

            // Skipping data in query parameter serialization


            Some("id".to_string()),
            Some(self.id.to_string()),


            Some("specversion".to_string()),
            Some(self.specversion.to_string()),


            self.datacontenttype.as_ref().map(|datacontenttype| {
                [
                    "datacontenttype".to_string(),
                    datacontenttype.to_string(),
                ].join(",")
            }),


            self.dataschema.as_ref().map(|dataschema| {
                [
                    "dataschema".to_string(),
                    dataschema.to_string(),
                ].join(",")
            }),


            self.subject.as_ref().map(|subject| {
                [
                    "subject".to_string(),
                    subject.to_string(),
                ].join(",")
            }),

            // Skipping time in query parameter serialization


            self.data_base64.as_ref().map(|data_base64| {
                [
                    "data_base64".to_string(),
                    data_base64.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a IoDocument value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for IoDocument {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub r#type: Vec<String>,
            pub source: Vec<String>,
            pub data: Vec<models::TmuxPaneIoDocument>,
            pub id: Vec<String>,
            pub specversion: Vec<String>,
            pub datacontenttype: Vec<String>,
            pub dataschema: Vec<String>,
            pub subject: Vec<String>,
            pub time: Vec<chrono::DateTime::<chrono::Utc>>,
            pub data_base64: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing IoDocument".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "type" => intermediate_rep.r#type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "source" => intermediate_rep.source.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "data" => intermediate_rep.data.push(<models::TmuxPaneIoDocument as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "specversion" => intermediate_rep.specversion.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "datacontenttype" => intermediate_rep.datacontenttype.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "dataschema" => intermediate_rep.dataschema.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "subject" => intermediate_rep.subject.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "time" => intermediate_rep.time.push(<chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "data_base64" => intermediate_rep.data_base64.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing IoDocument".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(IoDocument {
            r#type: intermediate_rep.r#type.into_iter().next(),
            source: intermediate_rep.source.into_iter().next(),
            data: intermediate_rep.data.into_iter().next(),
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in IoDocument".to_string())?,
            specversion: intermediate_rep.specversion.into_iter().next().ok_or_else(|| "specversion missing in IoDocument".to_string())?,
            datacontenttype: intermediate_rep.datacontenttype.into_iter().next(),
            dataschema: intermediate_rep.dataschema.into_iter().next(),
            subject: intermediate_rep.subject.into_iter().next(),
            time: intermediate_rep.time.into_iter().next(),
            data_base64: intermediate_rep.data_base64.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<IoDocument> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<IoDocument>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<IoDocument>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for IoDocument - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<IoDocument> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <IoDocument as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into IoDocument - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct TmuxPaneIoDocument {
/// User input
    #[serde(rename = "input")]
    #[validate(
            length(min = 1),
        )]
    pub input: String,

/// Command output (mix of stdout & stderr)
    #[serde(rename = "output")]
    #[validate(
        )]
    pub output: String,

/// ps1 (prompt) AFTER the input and output
    #[serde(rename = "ps1")]
    #[validate(
            length(min = 1),
        )]
    pub ps1: String,

}


impl TmuxPaneIoDocument {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new(input: String, output: String, ps1: String, ) -> TmuxPaneIoDocument {
        TmuxPaneIoDocument {
            input,
            output,
            ps1,
        }
    }
}

/// Converts the TmuxPaneIoDocument value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for TmuxPaneIoDocument {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            Some("input".to_string()),
            Some(self.input.to_string()),


            Some("output".to_string()),
            Some(self.output.to_string()),


            Some("ps1".to_string()),
            Some(self.ps1.to_string()),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a TmuxPaneIoDocument value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for TmuxPaneIoDocument {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub input: Vec<String>,
            pub output: Vec<String>,
            pub ps1: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing TmuxPaneIoDocument".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "input" => intermediate_rep.input.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "output" => intermediate_rep.output.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "ps1" => intermediate_rep.ps1.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing TmuxPaneIoDocument".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(TmuxPaneIoDocument {
            input: intermediate_rep.input.into_iter().next().ok_or_else(|| "input missing in TmuxPaneIoDocument".to_string())?,
            output: intermediate_rep.output.into_iter().next().ok_or_else(|| "output missing in TmuxPaneIoDocument".to_string())?,
            ps1: intermediate_rep.ps1.into_iter().next().ok_or_else(|| "ps1 missing in TmuxPaneIoDocument".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<TmuxPaneIoDocument> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<TmuxPaneIoDocument>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<TmuxPaneIoDocument>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for TmuxPaneIoDocument - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<TmuxPaneIoDocument> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <TmuxPaneIoDocument as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into TmuxPaneIoDocument - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}



