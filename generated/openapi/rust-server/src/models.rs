#![allow(unused_qualifications)]

use validator::Validate;

use crate::models;
#[cfg(any(feature = "client", feature = "server"))]
use crate::header;

#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct Clipboard {
    /// Identifies the event.
    #[serde(rename = "id")]
    #[validate(
            length(min = 1),
        )]
    pub id: String,

    #[serde(rename = "source")]
    #[validate(
           regex = "RE_CLIPBOARD_SOURCE",
        )]
    pub source: String,

    /// The version of the CloudEvents specification which the event uses.
    #[serde(rename = "specversion")]
    #[validate(
            length(min = 1),
        )]
    pub specversion: String,

    #[serde(rename = "type")]
    pub r#type: String,

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

    #[serde(rename = "subject")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub subject: Option<String>,

    /// Timestamp of when the occurrence happened. Must adhere to RFC 3339.
    #[serde(rename = "time")]
    #[validate(
            length(min = 1),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub time: Option<chrono::DateTime::<chrono::Utc>>,

    #[serde(rename = "data")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data: Option<models::ClipboardPayload>,

    /// Base64 encoded event payload. Must adhere to RFC4648.
    #[serde(rename = "data_base64")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data_base64: Option<String>,

}

lazy_static::lazy_static! {
    static ref RE_CLIPBOARD_SOURCE: regex::Regex = regex::Regex::new(r"^mindwm\\\\.[a-zA-Z0-9_]{1,32}\\\\.[a-zA-Z0-9-]{1,63}\\.clipboard$").unwrap();
}

impl Clipboard {
    #[allow(clippy::new_without_default)]
    pub fn new(id: String, source: String, specversion: String, r#type: String, ) -> Clipboard {
        Clipboard {
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

/// Converts the Clipboard value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for Clipboard {
    fn to_string(&self) -> String {
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

            // Skipping data in query parameter serialization


            self.data_base64.as_ref().map(|data_base64| {
                [
                    "data_base64".to_string(),
                    data_base64.to_string(),
                ].join(",")
            }),

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
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
            pub id: Vec<String>,
            pub source: Vec<String>,
            pub specversion: Vec<String>,
            pub r#type: Vec<String>,
            pub datacontenttype: Vec<String>,
            pub dataschema: Vec<String>,
            pub subject: Vec<String>,
            pub time: Vec<chrono::DateTime::<chrono::Utc>>,
            pub data: Vec<models::ClipboardPayload>,
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
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "source" => intermediate_rep.source.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "specversion" => intermediate_rep.specversion.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "type" => intermediate_rep.r#type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "datacontenttype" => intermediate_rep.datacontenttype.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "dataschema" => intermediate_rep.dataschema.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "subject" => intermediate_rep.subject.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "time" => intermediate_rep.time.push(<chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "data" => intermediate_rep.data.push(<models::ClipboardPayload as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
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
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in Clipboard".to_string())?,
            source: intermediate_rep.source.into_iter().next().ok_or_else(|| "source missing in Clipboard".to_string())?,
            specversion: intermediate_rep.specversion.into_iter().next().ok_or_else(|| "specversion missing in Clipboard".to_string())?,
            r#type: intermediate_rep.r#type.into_iter().next().ok_or_else(|| "type missing in Clipboard".to_string())?,
            datacontenttype: intermediate_rep.datacontenttype.into_iter().next(),
            dataschema: intermediate_rep.dataschema.into_iter().next(),
            subject: intermediate_rep.subject.into_iter().next(),
            time: intermediate_rep.time.into_iter().next(),
            data: intermediate_rep.data.into_iter().next(),
            data_base64: intermediate_rep.data_base64.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Clipboard> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Clipboard>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Clipboard>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Clipboard - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Clipboard> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
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
    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "type")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub r#type: Option<String>,

    #[serde(rename = "context")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub context: Option<models::ClipboardPayloadContext>,

}


impl ClipboardPayload {
    #[allow(clippy::new_without_default)]
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
impl std::string::ToString for ClipboardPayload {
    fn to_string(&self) -> String {
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

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
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

// Methods for converting between header::IntoHeaderValue<ClipboardPayload> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<ClipboardPayload>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<ClipboardPayload>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for ClipboardPayload - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<ClipboardPayload> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
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
    #[allow(clippy::new_without_default)]
    pub fn new() -> ClipboardPayloadContext {
        ClipboardPayloadContext {
            window: None,
        }
    }
}

/// Converts the ClipboardPayloadContext value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for ClipboardPayloadContext {
    fn to_string(&self) -> String {
        let params: Vec<Option<String>> = vec![

            self.window.as_ref().map(|window| {
                [
                    "window".to_string(),
                    window.to_string(),
                ].join(",")
            }),

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
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

// Methods for converting between header::IntoHeaderValue<ClipboardPayloadContext> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<ClipboardPayloadContext>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<ClipboardPayloadContext>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for ClipboardPayloadContext - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<ClipboardPayloadContext> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
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

    /// The event payload.
    #[serde(rename = "data")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data: Option<serde_json::Value>,

    /// Base64 encoded event payload. Must adhere to RFC4648.
    #[serde(rename = "data_base64")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data_base64: Option<String>,

}


impl CloudEvent {
    #[allow(clippy::new_without_default)]
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
impl std::string::ToString for CloudEvent {
    fn to_string(&self) -> String {
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

            // Skipping data in query parameter serialization


            self.data_base64.as_ref().map(|data_base64| {
                [
                    "data_base64".to_string(),
                    data_base64.to_string(),
                ].join(",")
            }),

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
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
            pub data: Vec<serde_json::Value>,
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
                    #[allow(clippy::redundant_clone)]
                    "datacontenttype" => intermediate_rep.datacontenttype.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "dataschema" => intermediate_rep.dataschema.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "subject" => intermediate_rep.subject.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "time" => intermediate_rep.time.push(<chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "data" => intermediate_rep.data.push(<serde_json::Value as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "data_base64" => intermediate_rep.data_base64.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
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
            datacontenttype: intermediate_rep.datacontenttype.into_iter().next(),
            dataschema: intermediate_rep.dataschema.into_iter().next(),
            subject: intermediate_rep.subject.into_iter().next(),
            time: intermediate_rep.time.into_iter().next(),
            data: intermediate_rep.data.into_iter().next(),
            data_base64: intermediate_rep.data_base64.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<CloudEvent> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<CloudEvent>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<CloudEvent>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for CloudEvent - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<CloudEvent> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
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


#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct GraphNode {
    /// Identifies the event.
    #[serde(rename = "id")]
    #[validate(
            length(min = 1),
        )]
    pub id: String,

    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "source")]
    pub source: String,

    /// The version of the CloudEvents specification which the event uses.
    #[serde(rename = "specversion")]
    #[validate(
            length(min = 1),
        )]
    pub specversion: String,

    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "type")]
    pub r#type: String,

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

    #[serde(rename = "data")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data: Option<models::GraphNodeAllOfData>,

    /// Base64 encoded event payload. Must adhere to RFC4648.
    #[serde(rename = "data_base64")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data_base64: Option<String>,

}


impl GraphNode {
    #[allow(clippy::new_without_default)]
    pub fn new(id: String, source: String, specversion: String, r#type: String, ) -> GraphNode {
        GraphNode {
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

/// Converts the GraphNode value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for GraphNode {
    fn to_string(&self) -> String {
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

            // Skipping data in query parameter serialization


            self.data_base64.as_ref().map(|data_base64| {
                [
                    "data_base64".to_string(),
                    data_base64.to_string(),
                ].join(",")
            }),

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a GraphNode value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for GraphNode {
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
            pub data: Vec<models::GraphNodeAllOfData>,
            pub data_base64: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing GraphNode".to_string())
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
                    #[allow(clippy::redundant_clone)]
                    "datacontenttype" => intermediate_rep.datacontenttype.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "dataschema" => intermediate_rep.dataschema.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "subject" => intermediate_rep.subject.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "time" => intermediate_rep.time.push(<chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "data" => intermediate_rep.data.push(<models::GraphNodeAllOfData as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "data_base64" => intermediate_rep.data_base64.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing GraphNode".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(GraphNode {
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in GraphNode".to_string())?,
            source: intermediate_rep.source.into_iter().next().ok_or_else(|| "source missing in GraphNode".to_string())?,
            specversion: intermediate_rep.specversion.into_iter().next().ok_or_else(|| "specversion missing in GraphNode".to_string())?,
            r#type: intermediate_rep.r#type.into_iter().next().ok_or_else(|| "type missing in GraphNode".to_string())?,
            datacontenttype: intermediate_rep.datacontenttype.into_iter().next(),
            dataschema: intermediate_rep.dataschema.into_iter().next(),
            subject: intermediate_rep.subject.into_iter().next(),
            time: intermediate_rep.time.into_iter().next(),
            data: intermediate_rep.data.into_iter().next(),
            data_base64: intermediate_rep.data_base64.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<GraphNode> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<GraphNode>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<GraphNode>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for GraphNode - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<GraphNode> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <GraphNode as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into GraphNode - {}",
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
pub struct GraphNodeAllOfData {
    #[serde(rename = "headers")]
    pub headers: serde_json::Value,

    #[serde(rename = "message_key")]
    pub message_key: String,

    #[serde(rename = "meta")]
    pub meta: models::Neo4jCaptureDataChangeMeta,

    #[serde(rename = "offset")]
    pub offset: i32,

    #[serde(rename = "partition")]
    pub partition: i32,

    #[serde(rename = "source_type")]
    pub source_type: String,

    #[serde(rename = "timestamp")]
    pub timestamp: chrono::DateTime::<chrono::Utc>,

    #[serde(rename = "topic")]
    pub topic: String,

    #[serde(rename = "schema")]
    pub schema: models::Neo4jCaptureDataChangeSchema,

    #[serde(rename = "payload")]
    pub payload: models::Neo4jCaptureDataChangeNodePayload,

}


impl GraphNodeAllOfData {
    #[allow(clippy::new_without_default)]
    pub fn new(headers: serde_json::Value, message_key: String, meta: models::Neo4jCaptureDataChangeMeta, offset: i32, partition: i32, source_type: String, timestamp: chrono::DateTime::<chrono::Utc>, topic: String, schema: models::Neo4jCaptureDataChangeSchema, payload: models::Neo4jCaptureDataChangeNodePayload, ) -> GraphNodeAllOfData {
        GraphNodeAllOfData {
            headers,
            message_key,
            meta,
            offset,
            partition,
            source_type,
            timestamp,
            topic,
            schema,
            payload,
        }
    }
}

/// Converts the GraphNodeAllOfData value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for GraphNodeAllOfData {
    fn to_string(&self) -> String {
        let params: Vec<Option<String>> = vec![
            // Skipping headers in query parameter serialization


            Some("message_key".to_string()),
            Some(self.message_key.to_string()),

            // Skipping meta in query parameter serialization


            Some("offset".to_string()),
            Some(self.offset.to_string()),


            Some("partition".to_string()),
            Some(self.partition.to_string()),


            Some("source_type".to_string()),
            Some(self.source_type.to_string()),

            // Skipping timestamp in query parameter serialization


            Some("topic".to_string()),
            Some(self.topic.to_string()),

            // Skipping schema in query parameter serialization

            // Skipping payload in query parameter serialization

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a GraphNodeAllOfData value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for GraphNodeAllOfData {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub headers: Vec<serde_json::Value>,
            pub message_key: Vec<String>,
            pub meta: Vec<models::Neo4jCaptureDataChangeMeta>,
            pub offset: Vec<i32>,
            pub partition: Vec<i32>,
            pub source_type: Vec<String>,
            pub timestamp: Vec<chrono::DateTime::<chrono::Utc>>,
            pub topic: Vec<String>,
            pub schema: Vec<models::Neo4jCaptureDataChangeSchema>,
            pub payload: Vec<models::Neo4jCaptureDataChangeNodePayload>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing GraphNodeAllOfData".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "headers" => intermediate_rep.headers.push(<serde_json::Value as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "message_key" => intermediate_rep.message_key.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "meta" => intermediate_rep.meta.push(<models::Neo4jCaptureDataChangeMeta as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "offset" => intermediate_rep.offset.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "partition" => intermediate_rep.partition.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "source_type" => intermediate_rep.source_type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "timestamp" => intermediate_rep.timestamp.push(<chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "topic" => intermediate_rep.topic.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "schema" => intermediate_rep.schema.push(<models::Neo4jCaptureDataChangeSchema as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "payload" => intermediate_rep.payload.push(<models::Neo4jCaptureDataChangeNodePayload as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing GraphNodeAllOfData".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(GraphNodeAllOfData {
            headers: intermediate_rep.headers.into_iter().next().ok_or_else(|| "headers missing in GraphNodeAllOfData".to_string())?,
            message_key: intermediate_rep.message_key.into_iter().next().ok_or_else(|| "message_key missing in GraphNodeAllOfData".to_string())?,
            meta: intermediate_rep.meta.into_iter().next().ok_or_else(|| "meta missing in GraphNodeAllOfData".to_string())?,
            offset: intermediate_rep.offset.into_iter().next().ok_or_else(|| "offset missing in GraphNodeAllOfData".to_string())?,
            partition: intermediate_rep.partition.into_iter().next().ok_or_else(|| "partition missing in GraphNodeAllOfData".to_string())?,
            source_type: intermediate_rep.source_type.into_iter().next().ok_or_else(|| "source_type missing in GraphNodeAllOfData".to_string())?,
            timestamp: intermediate_rep.timestamp.into_iter().next().ok_or_else(|| "timestamp missing in GraphNodeAllOfData".to_string())?,
            topic: intermediate_rep.topic.into_iter().next().ok_or_else(|| "topic missing in GraphNodeAllOfData".to_string())?,
            schema: intermediate_rep.schema.into_iter().next().ok_or_else(|| "schema missing in GraphNodeAllOfData".to_string())?,
            payload: intermediate_rep.payload.into_iter().next().ok_or_else(|| "payload missing in GraphNodeAllOfData".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<GraphNodeAllOfData> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<GraphNodeAllOfData>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<GraphNodeAllOfData>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for GraphNodeAllOfData - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<GraphNodeAllOfData> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <GraphNodeAllOfData as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into GraphNodeAllOfData - {}",
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
pub struct GraphRelationship {
    /// Identifies the event.
    #[serde(rename = "id")]
    #[validate(
            length(min = 1),
        )]
    pub id: String,

    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "source")]
    pub source: String,

    /// The version of the CloudEvents specification which the event uses.
    #[serde(rename = "specversion")]
    #[validate(
            length(min = 1),
        )]
    pub specversion: String,

    // Note: inline enums are not fully supported by openapi-generator
    #[serde(rename = "type")]
    pub r#type: String,

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

    #[serde(rename = "data")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data: Option<models::GraphRelationshipAllOfData>,

    /// Base64 encoded event payload. Must adhere to RFC4648.
    #[serde(rename = "data_base64")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data_base64: Option<String>,

}


impl GraphRelationship {
    #[allow(clippy::new_without_default)]
    pub fn new(id: String, source: String, specversion: String, r#type: String, ) -> GraphRelationship {
        GraphRelationship {
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

/// Converts the GraphRelationship value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for GraphRelationship {
    fn to_string(&self) -> String {
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

            // Skipping data in query parameter serialization


            self.data_base64.as_ref().map(|data_base64| {
                [
                    "data_base64".to_string(),
                    data_base64.to_string(),
                ].join(",")
            }),

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a GraphRelationship value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for GraphRelationship {
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
            pub data: Vec<models::GraphRelationshipAllOfData>,
            pub data_base64: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing GraphRelationship".to_string())
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
                    #[allow(clippy::redundant_clone)]
                    "datacontenttype" => intermediate_rep.datacontenttype.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "dataschema" => intermediate_rep.dataschema.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "subject" => intermediate_rep.subject.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "time" => intermediate_rep.time.push(<chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "data" => intermediate_rep.data.push(<models::GraphRelationshipAllOfData as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "data_base64" => intermediate_rep.data_base64.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing GraphRelationship".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(GraphRelationship {
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in GraphRelationship".to_string())?,
            source: intermediate_rep.source.into_iter().next().ok_or_else(|| "source missing in GraphRelationship".to_string())?,
            specversion: intermediate_rep.specversion.into_iter().next().ok_or_else(|| "specversion missing in GraphRelationship".to_string())?,
            r#type: intermediate_rep.r#type.into_iter().next().ok_or_else(|| "type missing in GraphRelationship".to_string())?,
            datacontenttype: intermediate_rep.datacontenttype.into_iter().next(),
            dataschema: intermediate_rep.dataschema.into_iter().next(),
            subject: intermediate_rep.subject.into_iter().next(),
            time: intermediate_rep.time.into_iter().next(),
            data: intermediate_rep.data.into_iter().next(),
            data_base64: intermediate_rep.data_base64.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<GraphRelationship> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<GraphRelationship>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<GraphRelationship>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for GraphRelationship - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<GraphRelationship> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <GraphRelationship as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into GraphRelationship - {}",
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
pub struct GraphRelationshipAllOfData {
    #[serde(rename = "headers")]
    pub headers: serde_json::Value,

    #[serde(rename = "message_key")]
    pub message_key: String,

    #[serde(rename = "meta")]
    pub meta: models::Neo4jCaptureDataChangeMeta,

    #[serde(rename = "offset")]
    pub offset: i32,

    #[serde(rename = "partition")]
    pub partition: i32,

    #[serde(rename = "source_type")]
    pub source_type: String,

    #[serde(rename = "timestamp")]
    pub timestamp: chrono::DateTime::<chrono::Utc>,

    #[serde(rename = "topic")]
    pub topic: String,

    #[serde(rename = "schema")]
    pub schema: models::Neo4jCaptureDataChangeSchema,

    #[serde(rename = "payload")]
    pub payload: models::Neo4jCaptureDataChangeRelationshipPayload,

}


impl GraphRelationshipAllOfData {
    #[allow(clippy::new_without_default)]
    pub fn new(headers: serde_json::Value, message_key: String, meta: models::Neo4jCaptureDataChangeMeta, offset: i32, partition: i32, source_type: String, timestamp: chrono::DateTime::<chrono::Utc>, topic: String, schema: models::Neo4jCaptureDataChangeSchema, payload: models::Neo4jCaptureDataChangeRelationshipPayload, ) -> GraphRelationshipAllOfData {
        GraphRelationshipAllOfData {
            headers,
            message_key,
            meta,
            offset,
            partition,
            source_type,
            timestamp,
            topic,
            schema,
            payload,
        }
    }
}

/// Converts the GraphRelationshipAllOfData value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for GraphRelationshipAllOfData {
    fn to_string(&self) -> String {
        let params: Vec<Option<String>> = vec![
            // Skipping headers in query parameter serialization


            Some("message_key".to_string()),
            Some(self.message_key.to_string()),

            // Skipping meta in query parameter serialization


            Some("offset".to_string()),
            Some(self.offset.to_string()),


            Some("partition".to_string()),
            Some(self.partition.to_string()),


            Some("source_type".to_string()),
            Some(self.source_type.to_string()),

            // Skipping timestamp in query parameter serialization


            Some("topic".to_string()),
            Some(self.topic.to_string()),

            // Skipping schema in query parameter serialization

            // Skipping payload in query parameter serialization

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a GraphRelationshipAllOfData value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for GraphRelationshipAllOfData {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub headers: Vec<serde_json::Value>,
            pub message_key: Vec<String>,
            pub meta: Vec<models::Neo4jCaptureDataChangeMeta>,
            pub offset: Vec<i32>,
            pub partition: Vec<i32>,
            pub source_type: Vec<String>,
            pub timestamp: Vec<chrono::DateTime::<chrono::Utc>>,
            pub topic: Vec<String>,
            pub schema: Vec<models::Neo4jCaptureDataChangeSchema>,
            pub payload: Vec<models::Neo4jCaptureDataChangeRelationshipPayload>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing GraphRelationshipAllOfData".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "headers" => intermediate_rep.headers.push(<serde_json::Value as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "message_key" => intermediate_rep.message_key.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "meta" => intermediate_rep.meta.push(<models::Neo4jCaptureDataChangeMeta as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "offset" => intermediate_rep.offset.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "partition" => intermediate_rep.partition.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "source_type" => intermediate_rep.source_type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "timestamp" => intermediate_rep.timestamp.push(<chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "topic" => intermediate_rep.topic.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "schema" => intermediate_rep.schema.push(<models::Neo4jCaptureDataChangeSchema as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "payload" => intermediate_rep.payload.push(<models::Neo4jCaptureDataChangeRelationshipPayload as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing GraphRelationshipAllOfData".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(GraphRelationshipAllOfData {
            headers: intermediate_rep.headers.into_iter().next().ok_or_else(|| "headers missing in GraphRelationshipAllOfData".to_string())?,
            message_key: intermediate_rep.message_key.into_iter().next().ok_or_else(|| "message_key missing in GraphRelationshipAllOfData".to_string())?,
            meta: intermediate_rep.meta.into_iter().next().ok_or_else(|| "meta missing in GraphRelationshipAllOfData".to_string())?,
            offset: intermediate_rep.offset.into_iter().next().ok_or_else(|| "offset missing in GraphRelationshipAllOfData".to_string())?,
            partition: intermediate_rep.partition.into_iter().next().ok_or_else(|| "partition missing in GraphRelationshipAllOfData".to_string())?,
            source_type: intermediate_rep.source_type.into_iter().next().ok_or_else(|| "source_type missing in GraphRelationshipAllOfData".to_string())?,
            timestamp: intermediate_rep.timestamp.into_iter().next().ok_or_else(|| "timestamp missing in GraphRelationshipAllOfData".to_string())?,
            topic: intermediate_rep.topic.into_iter().next().ok_or_else(|| "topic missing in GraphRelationshipAllOfData".to_string())?,
            schema: intermediate_rep.schema.into_iter().next().ok_or_else(|| "schema missing in GraphRelationshipAllOfData".to_string())?,
            payload: intermediate_rep.payload.into_iter().next().ok_or_else(|| "payload missing in GraphRelationshipAllOfData".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<GraphRelationshipAllOfData> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<GraphRelationshipAllOfData>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<GraphRelationshipAllOfData>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for GraphRelationshipAllOfData - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<GraphRelationshipAllOfData> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <GraphRelationshipAllOfData as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into GraphRelationshipAllOfData - {}",
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
pub struct IoDocument {
    /// Identifies the event.
    #[serde(rename = "id")]
    #[validate(
            length(min = 1),
        )]
    pub id: String,

    #[serde(rename = "source")]
    pub source: String,

    /// The version of the CloudEvents specification which the event uses.
    #[serde(rename = "specversion")]
    #[validate(
            length(min = 1),
        )]
    pub specversion: String,

    #[serde(rename = "type")]
    pub r#type: String,

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

    #[serde(rename = "subject")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub subject: Option<String>,

    /// Timestamp of when the occurrence happened. Must adhere to RFC 3339.
    #[serde(rename = "time")]
    #[validate(
            length(min = 1),
        )]
    #[serde(skip_serializing_if="Option::is_none")]
    pub time: Option<chrono::DateTime::<chrono::Utc>>,

    #[serde(rename = "data")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data: Option<models::TmuxPaneIoDocument>,

    /// Base64 encoded event payload. Must adhere to RFC4648.
    #[serde(rename = "data_base64")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub data_base64: Option<String>,

}


impl IoDocument {
    #[allow(clippy::new_without_default)]
    pub fn new(id: String, source: String, specversion: String, ) -> IoDocument {
        IoDocument {
            id,
            source,
            specversion,
            r#type: "IoDocument".to_string(),
            datacontenttype: None,
            dataschema: None,
            subject: Some("IoDocument".to_string()),
            time: None,
            data: None,
            data_base64: None,
        }
    }
}

/// Converts the IoDocument value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for IoDocument {
    fn to_string(&self) -> String {
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

            // Skipping data in query parameter serialization


            self.data_base64.as_ref().map(|data_base64| {
                [
                    "data_base64".to_string(),
                    data_base64.to_string(),
                ].join(",")
            }),

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
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
            pub id: Vec<String>,
            pub source: Vec<String>,
            pub specversion: Vec<String>,
            pub r#type: Vec<String>,
            pub datacontenttype: Vec<String>,
            pub dataschema: Vec<String>,
            pub subject: Vec<String>,
            pub time: Vec<chrono::DateTime::<chrono::Utc>>,
            pub data: Vec<models::TmuxPaneIoDocument>,
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
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "source" => intermediate_rep.source.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "specversion" => intermediate_rep.specversion.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "type" => intermediate_rep.r#type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "datacontenttype" => intermediate_rep.datacontenttype.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "dataschema" => intermediate_rep.dataschema.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "subject" => intermediate_rep.subject.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "time" => intermediate_rep.time.push(<chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "data" => intermediate_rep.data.push(<models::TmuxPaneIoDocument as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
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
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in IoDocument".to_string())?,
            source: intermediate_rep.source.into_iter().next().ok_or_else(|| "source missing in IoDocument".to_string())?,
            specversion: intermediate_rep.specversion.into_iter().next().ok_or_else(|| "specversion missing in IoDocument".to_string())?,
            r#type: intermediate_rep.r#type.into_iter().next().ok_or_else(|| "type missing in IoDocument".to_string())?,
            datacontenttype: intermediate_rep.datacontenttype.into_iter().next(),
            dataschema: intermediate_rep.dataschema.into_iter().next(),
            subject: intermediate_rep.subject.into_iter().next(),
            time: intermediate_rep.time.into_iter().next(),
            data: intermediate_rep.data.into_iter().next(),
            data_base64: intermediate_rep.data_base64.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<IoDocument> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<IoDocument>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<IoDocument>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for IoDocument - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<IoDocument> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
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
pub struct Neo4jCaptureDataChange {
    #[serde(rename = "headers")]
    pub headers: std::collections::HashMap<String, serde_json::Value>,

    #[serde(rename = "message_key")]
    pub message_key: String,

    #[serde(rename = "meta")]
    pub meta: models::Neo4jCaptureDataChangeMeta,

    #[serde(rename = "offset")]
    pub offset: i32,

    #[serde(rename = "partition")]
    pub partition: i32,

    #[serde(rename = "source_type")]
    pub source_type: String,

    #[serde(rename = "timestamp")]
    pub timestamp: chrono::DateTime::<chrono::Utc>,

    #[serde(rename = "topic")]
    pub topic: String,

    #[serde(rename = "schema")]
    pub schema: models::Neo4jCaptureDataChangeSchema,

    #[serde(rename = "payload")]
    pub payload: models::Neo4jCaptureDataChangePayload,

}


impl Neo4jCaptureDataChange {
    #[allow(clippy::new_without_default)]
    pub fn new(headers: std::collections::HashMap<String, serde_json::Value>, message_key: String, meta: models::Neo4jCaptureDataChangeMeta, offset: i32, partition: i32, source_type: String, timestamp: chrono::DateTime::<chrono::Utc>, topic: String, schema: models::Neo4jCaptureDataChangeSchema, payload: models::Neo4jCaptureDataChangePayload, ) -> Neo4jCaptureDataChange {
        Neo4jCaptureDataChange {
            headers,
            message_key,
            meta,
            offset,
            partition,
            source_type,
            timestamp,
            topic,
            schema,
            payload,
        }
    }
}

/// Converts the Neo4jCaptureDataChange value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for Neo4jCaptureDataChange {
    fn to_string(&self) -> String {
        let params: Vec<Option<String>> = vec![
            // Skipping headers in query parameter serialization
            // Skipping headers in query parameter serialization


            Some("message_key".to_string()),
            Some(self.message_key.to_string()),

            // Skipping meta in query parameter serialization


            Some("offset".to_string()),
            Some(self.offset.to_string()),


            Some("partition".to_string()),
            Some(self.partition.to_string()),


            Some("source_type".to_string()),
            Some(self.source_type.to_string()),

            // Skipping timestamp in query parameter serialization


            Some("topic".to_string()),
            Some(self.topic.to_string()),

            // Skipping schema in query parameter serialization

            // Skipping payload in query parameter serialization

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Neo4jCaptureDataChange value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Neo4jCaptureDataChange {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub headers: Vec<std::collections::HashMap<String, serde_json::Value>>,
            pub message_key: Vec<String>,
            pub meta: Vec<models::Neo4jCaptureDataChangeMeta>,
            pub offset: Vec<i32>,
            pub partition: Vec<i32>,
            pub source_type: Vec<String>,
            pub timestamp: Vec<chrono::DateTime::<chrono::Utc>>,
            pub topic: Vec<String>,
            pub schema: Vec<models::Neo4jCaptureDataChangeSchema>,
            pub payload: Vec<models::Neo4jCaptureDataChangePayload>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Neo4jCaptureDataChange".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    "headers" => return std::result::Result::Err("Parsing a container in this style is not supported in Neo4jCaptureDataChange".to_string()),
                    #[allow(clippy::redundant_clone)]
                    "message_key" => intermediate_rep.message_key.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "meta" => intermediate_rep.meta.push(<models::Neo4jCaptureDataChangeMeta as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "offset" => intermediate_rep.offset.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "partition" => intermediate_rep.partition.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "source_type" => intermediate_rep.source_type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "timestamp" => intermediate_rep.timestamp.push(<chrono::DateTime::<chrono::Utc> as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "topic" => intermediate_rep.topic.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "schema" => intermediate_rep.schema.push(<models::Neo4jCaptureDataChangeSchema as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "payload" => intermediate_rep.payload.push(<models::Neo4jCaptureDataChangePayload as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing Neo4jCaptureDataChange".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Neo4jCaptureDataChange {
            headers: intermediate_rep.headers.into_iter().next().ok_or_else(|| "headers missing in Neo4jCaptureDataChange".to_string())?,
            message_key: intermediate_rep.message_key.into_iter().next().ok_or_else(|| "message_key missing in Neo4jCaptureDataChange".to_string())?,
            meta: intermediate_rep.meta.into_iter().next().ok_or_else(|| "meta missing in Neo4jCaptureDataChange".to_string())?,
            offset: intermediate_rep.offset.into_iter().next().ok_or_else(|| "offset missing in Neo4jCaptureDataChange".to_string())?,
            partition: intermediate_rep.partition.into_iter().next().ok_or_else(|| "partition missing in Neo4jCaptureDataChange".to_string())?,
            source_type: intermediate_rep.source_type.into_iter().next().ok_or_else(|| "source_type missing in Neo4jCaptureDataChange".to_string())?,
            timestamp: intermediate_rep.timestamp.into_iter().next().ok_or_else(|| "timestamp missing in Neo4jCaptureDataChange".to_string())?,
            topic: intermediate_rep.topic.into_iter().next().ok_or_else(|| "topic missing in Neo4jCaptureDataChange".to_string())?,
            schema: intermediate_rep.schema.into_iter().next().ok_or_else(|| "schema missing in Neo4jCaptureDataChange".to_string())?,
            payload: intermediate_rep.payload.into_iter().next().ok_or_else(|| "payload missing in Neo4jCaptureDataChange".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Neo4jCaptureDataChange> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Neo4jCaptureDataChange>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Neo4jCaptureDataChange>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Neo4jCaptureDataChange - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Neo4jCaptureDataChange> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Neo4jCaptureDataChange as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Neo4jCaptureDataChange - {}",
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
pub struct Neo4jCaptureDataChangeMeta {
    #[serde(rename = "operation")]
    pub operation: String,

    #[serde(rename = "source")]
    pub source: models::Neo4jCaptureDataChangeMetaSource,

    #[serde(rename = "timestamp")]
    pub timestamp: i32,

    #[serde(rename = "txEventId")]
    pub tx_event_id: i32,

    #[serde(rename = "txEventsCount")]
    pub tx_events_count: i32,

    #[serde(rename = "txId")]
    pub tx_id: i32,

    #[serde(rename = "username")]
    pub username: String,

}


impl Neo4jCaptureDataChangeMeta {
    #[allow(clippy::new_without_default)]
    pub fn new(operation: String, source: models::Neo4jCaptureDataChangeMetaSource, timestamp: i32, tx_event_id: i32, tx_events_count: i32, tx_id: i32, username: String, ) -> Neo4jCaptureDataChangeMeta {
        Neo4jCaptureDataChangeMeta {
            operation,
            source,
            timestamp,
            tx_event_id,
            tx_events_count,
            tx_id,
            username,
        }
    }
}

/// Converts the Neo4jCaptureDataChangeMeta value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for Neo4jCaptureDataChangeMeta {
    fn to_string(&self) -> String {
        let params: Vec<Option<String>> = vec![

            Some("operation".to_string()),
            Some(self.operation.to_string()),

            // Skipping source in query parameter serialization


            Some("timestamp".to_string()),
            Some(self.timestamp.to_string()),


            Some("txEventId".to_string()),
            Some(self.tx_event_id.to_string()),


            Some("txEventsCount".to_string()),
            Some(self.tx_events_count.to_string()),


            Some("txId".to_string()),
            Some(self.tx_id.to_string()),


            Some("username".to_string()),
            Some(self.username.to_string()),

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Neo4jCaptureDataChangeMeta value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Neo4jCaptureDataChangeMeta {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub operation: Vec<String>,
            pub source: Vec<models::Neo4jCaptureDataChangeMetaSource>,
            pub timestamp: Vec<i32>,
            pub tx_event_id: Vec<i32>,
            pub tx_events_count: Vec<i32>,
            pub tx_id: Vec<i32>,
            pub username: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Neo4jCaptureDataChangeMeta".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "operation" => intermediate_rep.operation.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "source" => intermediate_rep.source.push(<models::Neo4jCaptureDataChangeMetaSource as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "timestamp" => intermediate_rep.timestamp.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "txEventId" => intermediate_rep.tx_event_id.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "txEventsCount" => intermediate_rep.tx_events_count.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "txId" => intermediate_rep.tx_id.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "username" => intermediate_rep.username.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing Neo4jCaptureDataChangeMeta".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Neo4jCaptureDataChangeMeta {
            operation: intermediate_rep.operation.into_iter().next().ok_or_else(|| "operation missing in Neo4jCaptureDataChangeMeta".to_string())?,
            source: intermediate_rep.source.into_iter().next().ok_or_else(|| "source missing in Neo4jCaptureDataChangeMeta".to_string())?,
            timestamp: intermediate_rep.timestamp.into_iter().next().ok_or_else(|| "timestamp missing in Neo4jCaptureDataChangeMeta".to_string())?,
            tx_event_id: intermediate_rep.tx_event_id.into_iter().next().ok_or_else(|| "txEventId missing in Neo4jCaptureDataChangeMeta".to_string())?,
            tx_events_count: intermediate_rep.tx_events_count.into_iter().next().ok_or_else(|| "txEventsCount missing in Neo4jCaptureDataChangeMeta".to_string())?,
            tx_id: intermediate_rep.tx_id.into_iter().next().ok_or_else(|| "txId missing in Neo4jCaptureDataChangeMeta".to_string())?,
            username: intermediate_rep.username.into_iter().next().ok_or_else(|| "username missing in Neo4jCaptureDataChangeMeta".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Neo4jCaptureDataChangeMeta> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Neo4jCaptureDataChangeMeta>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Neo4jCaptureDataChangeMeta>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Neo4jCaptureDataChangeMeta - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Neo4jCaptureDataChangeMeta> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Neo4jCaptureDataChangeMeta as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Neo4jCaptureDataChangeMeta - {}",
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
pub struct Neo4jCaptureDataChangeMetaSource {
    #[serde(rename = "hostname")]
    pub hostname: String,

}


impl Neo4jCaptureDataChangeMetaSource {
    #[allow(clippy::new_without_default)]
    pub fn new(hostname: String, ) -> Neo4jCaptureDataChangeMetaSource {
        Neo4jCaptureDataChangeMetaSource {
            hostname,
        }
    }
}

/// Converts the Neo4jCaptureDataChangeMetaSource value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for Neo4jCaptureDataChangeMetaSource {
    fn to_string(&self) -> String {
        let params: Vec<Option<String>> = vec![

            Some("hostname".to_string()),
            Some(self.hostname.to_string()),

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Neo4jCaptureDataChangeMetaSource value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Neo4jCaptureDataChangeMetaSource {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub hostname: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Neo4jCaptureDataChangeMetaSource".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "hostname" => intermediate_rep.hostname.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing Neo4jCaptureDataChangeMetaSource".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Neo4jCaptureDataChangeMetaSource {
            hostname: intermediate_rep.hostname.into_iter().next().ok_or_else(|| "hostname missing in Neo4jCaptureDataChangeMetaSource".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Neo4jCaptureDataChangeMetaSource> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Neo4jCaptureDataChangeMetaSource>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Neo4jCaptureDataChangeMetaSource>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Neo4jCaptureDataChangeMetaSource - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Neo4jCaptureDataChangeMetaSource> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Neo4jCaptureDataChangeMetaSource as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Neo4jCaptureDataChangeMetaSource - {}",
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
pub struct Neo4jCaptureDataChangeNodePayload {
    #[serde(rename = "after")]
    pub after: models::Neo4jCaptureDataChangeNodePayloadAfter,

    #[serde(rename = "before")]
    pub before: String,

    #[serde(rename = "id")]
    pub id: String,

    #[serde(rename = "type")]
    pub r#type: String,

}


impl Neo4jCaptureDataChangeNodePayload {
    #[allow(clippy::new_without_default)]
    pub fn new(after: models::Neo4jCaptureDataChangeNodePayloadAfter, before: String, id: String, r#type: String, ) -> Neo4jCaptureDataChangeNodePayload {
        Neo4jCaptureDataChangeNodePayload {
            after,
            before,
            id,
            r#type,
        }
    }
}

/// Converts the Neo4jCaptureDataChangeNodePayload value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for Neo4jCaptureDataChangeNodePayload {
    fn to_string(&self) -> String {
        let params: Vec<Option<String>> = vec![
            // Skipping after in query parameter serialization


            Some("before".to_string()),
            Some(self.before.to_string()),


            Some("id".to_string()),
            Some(self.id.to_string()),


            Some("type".to_string()),
            Some(self.r#type.to_string()),

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Neo4jCaptureDataChangeNodePayload value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Neo4jCaptureDataChangeNodePayload {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub after: Vec<models::Neo4jCaptureDataChangeNodePayloadAfter>,
            pub before: Vec<String>,
            pub id: Vec<String>,
            pub r#type: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Neo4jCaptureDataChangeNodePayload".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "after" => intermediate_rep.after.push(<models::Neo4jCaptureDataChangeNodePayloadAfter as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "before" => intermediate_rep.before.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "type" => intermediate_rep.r#type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing Neo4jCaptureDataChangeNodePayload".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Neo4jCaptureDataChangeNodePayload {
            after: intermediate_rep.after.into_iter().next().ok_or_else(|| "after missing in Neo4jCaptureDataChangeNodePayload".to_string())?,
            before: intermediate_rep.before.into_iter().next().ok_or_else(|| "before missing in Neo4jCaptureDataChangeNodePayload".to_string())?,
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in Neo4jCaptureDataChangeNodePayload".to_string())?,
            r#type: intermediate_rep.r#type.into_iter().next().ok_or_else(|| "type missing in Neo4jCaptureDataChangeNodePayload".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Neo4jCaptureDataChangeNodePayload> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Neo4jCaptureDataChangeNodePayload>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Neo4jCaptureDataChangeNodePayload>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Neo4jCaptureDataChangeNodePayload - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Neo4jCaptureDataChangeNodePayload> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Neo4jCaptureDataChangeNodePayload as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Neo4jCaptureDataChangeNodePayload - {}",
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
pub struct Neo4jCaptureDataChangeNodePayloadAfter {
    #[serde(rename = "labels")]
    pub labels: Vec<String>,

    #[serde(rename = "properties")]
    pub properties: std::collections::HashMap<String, serde_json::Value>,

}


impl Neo4jCaptureDataChangeNodePayloadAfter {
    #[allow(clippy::new_without_default)]
    pub fn new(labels: Vec<String>, properties: std::collections::HashMap<String, serde_json::Value>, ) -> Neo4jCaptureDataChangeNodePayloadAfter {
        Neo4jCaptureDataChangeNodePayloadAfter {
            labels,
            properties,
        }
    }
}

/// Converts the Neo4jCaptureDataChangeNodePayloadAfter value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for Neo4jCaptureDataChangeNodePayloadAfter {
    fn to_string(&self) -> String {
        let params: Vec<Option<String>> = vec![

            Some("labels".to_string()),
            Some(self.labels.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(",")),

            // Skipping properties in query parameter serialization
            // Skipping properties in query parameter serialization

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Neo4jCaptureDataChangeNodePayloadAfter value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Neo4jCaptureDataChangeNodePayloadAfter {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub labels: Vec<Vec<String>>,
            pub properties: Vec<std::collections::HashMap<String, serde_json::Value>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Neo4jCaptureDataChangeNodePayloadAfter".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    "labels" => return std::result::Result::Err("Parsing a container in this style is not supported in Neo4jCaptureDataChangeNodePayloadAfter".to_string()),
                    "properties" => return std::result::Result::Err("Parsing a container in this style is not supported in Neo4jCaptureDataChangeNodePayloadAfter".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing Neo4jCaptureDataChangeNodePayloadAfter".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Neo4jCaptureDataChangeNodePayloadAfter {
            labels: intermediate_rep.labels.into_iter().next().ok_or_else(|| "labels missing in Neo4jCaptureDataChangeNodePayloadAfter".to_string())?,
            properties: intermediate_rep.properties.into_iter().next().ok_or_else(|| "properties missing in Neo4jCaptureDataChangeNodePayloadAfter".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Neo4jCaptureDataChangeNodePayloadAfter> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Neo4jCaptureDataChangeNodePayloadAfter>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Neo4jCaptureDataChangeNodePayloadAfter>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Neo4jCaptureDataChangeNodePayloadAfter - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Neo4jCaptureDataChangeNodePayloadAfter> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Neo4jCaptureDataChangeNodePayloadAfter as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Neo4jCaptureDataChangeNodePayloadAfter - {}",
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
pub struct Neo4jCaptureDataChangePayload {
    #[serde(rename = "after")]
    pub after: serde_json::Value,

    #[serde(rename = "before")]
    pub before: String,

    #[serde(rename = "id")]
    pub id: String,

    #[serde(rename = "type")]
    pub r#type: String,

    #[serde(rename = "end")]
    pub end: models::Neo4jCaptureDataChangeRelationshipPayloadEnd,

    #[serde(rename = "label")]
    pub label: String,

    #[serde(rename = "start")]
    pub start: models::Neo4jCaptureDataChangeRelationshipPayloadEnd,

}


impl Neo4jCaptureDataChangePayload {
    #[allow(clippy::new_without_default)]
    pub fn new(after: serde_json::Value, before: String, id: String, r#type: String, end: models::Neo4jCaptureDataChangeRelationshipPayloadEnd, label: String, start: models::Neo4jCaptureDataChangeRelationshipPayloadEnd, ) -> Neo4jCaptureDataChangePayload {
        Neo4jCaptureDataChangePayload {
            after,
            before,
            id,
            r#type,
            end,
            label,
            start,
        }
    }
}

/// Converts the Neo4jCaptureDataChangePayload value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for Neo4jCaptureDataChangePayload {
    fn to_string(&self) -> String {
        let params: Vec<Option<String>> = vec![
            // Skipping after in query parameter serialization


            Some("before".to_string()),
            Some(self.before.to_string()),


            Some("id".to_string()),
            Some(self.id.to_string()),


            Some("type".to_string()),
            Some(self.r#type.to_string()),

            // Skipping end in query parameter serialization


            Some("label".to_string()),
            Some(self.label.to_string()),

            // Skipping start in query parameter serialization

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Neo4jCaptureDataChangePayload value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Neo4jCaptureDataChangePayload {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub after: Vec<serde_json::Value>,
            pub before: Vec<String>,
            pub id: Vec<String>,
            pub r#type: Vec<String>,
            pub end: Vec<models::Neo4jCaptureDataChangeRelationshipPayloadEnd>,
            pub label: Vec<String>,
            pub start: Vec<models::Neo4jCaptureDataChangeRelationshipPayloadEnd>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Neo4jCaptureDataChangePayload".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "after" => intermediate_rep.after.push(<serde_json::Value as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "before" => intermediate_rep.before.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "type" => intermediate_rep.r#type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "end" => intermediate_rep.end.push(<models::Neo4jCaptureDataChangeRelationshipPayloadEnd as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "label" => intermediate_rep.label.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "start" => intermediate_rep.start.push(<models::Neo4jCaptureDataChangeRelationshipPayloadEnd as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing Neo4jCaptureDataChangePayload".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Neo4jCaptureDataChangePayload {
            after: intermediate_rep.after.into_iter().next().ok_or_else(|| "after missing in Neo4jCaptureDataChangePayload".to_string())?,
            before: intermediate_rep.before.into_iter().next().ok_or_else(|| "before missing in Neo4jCaptureDataChangePayload".to_string())?,
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in Neo4jCaptureDataChangePayload".to_string())?,
            r#type: intermediate_rep.r#type.into_iter().next().ok_or_else(|| "type missing in Neo4jCaptureDataChangePayload".to_string())?,
            end: intermediate_rep.end.into_iter().next().ok_or_else(|| "end missing in Neo4jCaptureDataChangePayload".to_string())?,
            label: intermediate_rep.label.into_iter().next().ok_or_else(|| "label missing in Neo4jCaptureDataChangePayload".to_string())?,
            start: intermediate_rep.start.into_iter().next().ok_or_else(|| "start missing in Neo4jCaptureDataChangePayload".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Neo4jCaptureDataChangePayload> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Neo4jCaptureDataChangePayload>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Neo4jCaptureDataChangePayload>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Neo4jCaptureDataChangePayload - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Neo4jCaptureDataChangePayload> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Neo4jCaptureDataChangePayload as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Neo4jCaptureDataChangePayload - {}",
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
pub struct Neo4jCaptureDataChangeRelationshipPayload {
    #[serde(rename = "after")]
    pub after: serde_json::Value,

    #[serde(rename = "before")]
    pub before: String,

    #[serde(rename = "end")]
    pub end: models::Neo4jCaptureDataChangeRelationshipPayloadEnd,

    #[serde(rename = "id")]
    pub id: String,

    #[serde(rename = "label")]
    pub label: String,

    #[serde(rename = "start")]
    pub start: models::Neo4jCaptureDataChangeRelationshipPayloadEnd,

    #[serde(rename = "type")]
    pub r#type: String,

}


impl Neo4jCaptureDataChangeRelationshipPayload {
    #[allow(clippy::new_without_default)]
    pub fn new(after: serde_json::Value, before: String, end: models::Neo4jCaptureDataChangeRelationshipPayloadEnd, id: String, label: String, start: models::Neo4jCaptureDataChangeRelationshipPayloadEnd, r#type: String, ) -> Neo4jCaptureDataChangeRelationshipPayload {
        Neo4jCaptureDataChangeRelationshipPayload {
            after,
            before,
            end,
            id,
            label,
            start,
            r#type,
        }
    }
}

/// Converts the Neo4jCaptureDataChangeRelationshipPayload value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for Neo4jCaptureDataChangeRelationshipPayload {
    fn to_string(&self) -> String {
        let params: Vec<Option<String>> = vec![
            // Skipping after in query parameter serialization


            Some("before".to_string()),
            Some(self.before.to_string()),

            // Skipping end in query parameter serialization


            Some("id".to_string()),
            Some(self.id.to_string()),


            Some("label".to_string()),
            Some(self.label.to_string()),

            // Skipping start in query parameter serialization


            Some("type".to_string()),
            Some(self.r#type.to_string()),

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Neo4jCaptureDataChangeRelationshipPayload value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Neo4jCaptureDataChangeRelationshipPayload {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub after: Vec<serde_json::Value>,
            pub before: Vec<String>,
            pub end: Vec<models::Neo4jCaptureDataChangeRelationshipPayloadEnd>,
            pub id: Vec<String>,
            pub label: Vec<String>,
            pub start: Vec<models::Neo4jCaptureDataChangeRelationshipPayloadEnd>,
            pub r#type: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Neo4jCaptureDataChangeRelationshipPayload".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "after" => intermediate_rep.after.push(<serde_json::Value as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "before" => intermediate_rep.before.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "end" => intermediate_rep.end.push(<models::Neo4jCaptureDataChangeRelationshipPayloadEnd as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "label" => intermediate_rep.label.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "start" => intermediate_rep.start.push(<models::Neo4jCaptureDataChangeRelationshipPayloadEnd as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "type" => intermediate_rep.r#type.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing Neo4jCaptureDataChangeRelationshipPayload".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Neo4jCaptureDataChangeRelationshipPayload {
            after: intermediate_rep.after.into_iter().next().ok_or_else(|| "after missing in Neo4jCaptureDataChangeRelationshipPayload".to_string())?,
            before: intermediate_rep.before.into_iter().next().ok_or_else(|| "before missing in Neo4jCaptureDataChangeRelationshipPayload".to_string())?,
            end: intermediate_rep.end.into_iter().next().ok_or_else(|| "end missing in Neo4jCaptureDataChangeRelationshipPayload".to_string())?,
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in Neo4jCaptureDataChangeRelationshipPayload".to_string())?,
            label: intermediate_rep.label.into_iter().next().ok_or_else(|| "label missing in Neo4jCaptureDataChangeRelationshipPayload".to_string())?,
            start: intermediate_rep.start.into_iter().next().ok_or_else(|| "start missing in Neo4jCaptureDataChangeRelationshipPayload".to_string())?,
            r#type: intermediate_rep.r#type.into_iter().next().ok_or_else(|| "type missing in Neo4jCaptureDataChangeRelationshipPayload".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Neo4jCaptureDataChangeRelationshipPayload> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Neo4jCaptureDataChangeRelationshipPayload>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Neo4jCaptureDataChangeRelationshipPayload>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Neo4jCaptureDataChangeRelationshipPayload - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Neo4jCaptureDataChangeRelationshipPayload> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Neo4jCaptureDataChangeRelationshipPayload as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Neo4jCaptureDataChangeRelationshipPayload - {}",
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
pub struct Neo4jCaptureDataChangeRelationshipPayloadEnd {
    #[serde(rename = "id")]
    pub id: String,

    #[serde(rename = "ids")]
    pub ids: std::collections::HashMap<String, serde_json::Value>,

    #[serde(rename = "labels")]
    pub labels: Vec<String>,

}


impl Neo4jCaptureDataChangeRelationshipPayloadEnd {
    #[allow(clippy::new_without_default)]
    pub fn new(id: String, ids: std::collections::HashMap<String, serde_json::Value>, labels: Vec<String>, ) -> Neo4jCaptureDataChangeRelationshipPayloadEnd {
        Neo4jCaptureDataChangeRelationshipPayloadEnd {
            id,
            ids,
            labels,
        }
    }
}

/// Converts the Neo4jCaptureDataChangeRelationshipPayloadEnd value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for Neo4jCaptureDataChangeRelationshipPayloadEnd {
    fn to_string(&self) -> String {
        let params: Vec<Option<String>> = vec![

            Some("id".to_string()),
            Some(self.id.to_string()),

            // Skipping ids in query parameter serialization
            // Skipping ids in query parameter serialization


            Some("labels".to_string()),
            Some(self.labels.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(",")),

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Neo4jCaptureDataChangeRelationshipPayloadEnd value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Neo4jCaptureDataChangeRelationshipPayloadEnd {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub id: Vec<String>,
            pub ids: Vec<std::collections::HashMap<String, serde_json::Value>>,
            pub labels: Vec<Vec<String>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Neo4jCaptureDataChangeRelationshipPayloadEnd".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "id" => intermediate_rep.id.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    "ids" => return std::result::Result::Err("Parsing a container in this style is not supported in Neo4jCaptureDataChangeRelationshipPayloadEnd".to_string()),
                    "labels" => return std::result::Result::Err("Parsing a container in this style is not supported in Neo4jCaptureDataChangeRelationshipPayloadEnd".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing Neo4jCaptureDataChangeRelationshipPayloadEnd".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Neo4jCaptureDataChangeRelationshipPayloadEnd {
            id: intermediate_rep.id.into_iter().next().ok_or_else(|| "id missing in Neo4jCaptureDataChangeRelationshipPayloadEnd".to_string())?,
            ids: intermediate_rep.ids.into_iter().next().ok_or_else(|| "ids missing in Neo4jCaptureDataChangeRelationshipPayloadEnd".to_string())?,
            labels: intermediate_rep.labels.into_iter().next().ok_or_else(|| "labels missing in Neo4jCaptureDataChangeRelationshipPayloadEnd".to_string())?,
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Neo4jCaptureDataChangeRelationshipPayloadEnd> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Neo4jCaptureDataChangeRelationshipPayloadEnd>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Neo4jCaptureDataChangeRelationshipPayloadEnd>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Neo4jCaptureDataChangeRelationshipPayloadEnd - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Neo4jCaptureDataChangeRelationshipPayloadEnd> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Neo4jCaptureDataChangeRelationshipPayloadEnd as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Neo4jCaptureDataChangeRelationshipPayloadEnd - {}",
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
pub struct Neo4jCaptureDataChangeSchema {
    #[serde(rename = "constraints")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub constraints: Option<std::collections::HashMap<String, serde_json::Value>>,

    #[serde(rename = "properties")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub properties: Option<std::collections::HashMap<String, serde_json::Value>>,

}


impl Neo4jCaptureDataChangeSchema {
    #[allow(clippy::new_without_default)]
    pub fn new() -> Neo4jCaptureDataChangeSchema {
        Neo4jCaptureDataChangeSchema {
            constraints: None,
            properties: None,
        }
    }
}

/// Converts the Neo4jCaptureDataChangeSchema value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for Neo4jCaptureDataChangeSchema {
    fn to_string(&self) -> String {
        let params: Vec<Option<String>> = vec![
            // Skipping constraints in query parameter serialization
            // Skipping constraints in query parameter serialization

            // Skipping properties in query parameter serialization
            // Skipping properties in query parameter serialization

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Neo4jCaptureDataChangeSchema value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Neo4jCaptureDataChangeSchema {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub constraints: Vec<std::collections::HashMap<String, serde_json::Value>>,
            pub properties: Vec<std::collections::HashMap<String, serde_json::Value>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Neo4jCaptureDataChangeSchema".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    "constraints" => return std::result::Result::Err("Parsing a container in this style is not supported in Neo4jCaptureDataChangeSchema".to_string()),
                    "properties" => return std::result::Result::Err("Parsing a container in this style is not supported in Neo4jCaptureDataChangeSchema".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing Neo4jCaptureDataChangeSchema".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Neo4jCaptureDataChangeSchema {
            constraints: intermediate_rep.constraints.into_iter().next(),
            properties: intermediate_rep.properties.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Neo4jCaptureDataChangeSchema> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<Neo4jCaptureDataChangeSchema>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Neo4jCaptureDataChangeSchema>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Neo4jCaptureDataChangeSchema - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<Neo4jCaptureDataChangeSchema> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Neo4jCaptureDataChangeSchema as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Neo4jCaptureDataChangeSchema - {}",
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
            length(min = 0),
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
    #[allow(clippy::new_without_default)]
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
impl std::string::ToString for TmuxPaneIoDocument {
    fn to_string(&self) -> String {
        let params: Vec<Option<String>> = vec![

            Some("input".to_string()),
            Some(self.input.to_string()),


            Some("output".to_string()),
            Some(self.output.to_string()),


            Some("ps1".to_string()),
            Some(self.ps1.to_string()),

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
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

// Methods for converting between header::IntoHeaderValue<TmuxPaneIoDocument> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<TmuxPaneIoDocument>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<TmuxPaneIoDocument>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for TmuxPaneIoDocument - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<TmuxPaneIoDocument> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
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

