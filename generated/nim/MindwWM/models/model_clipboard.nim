#
# Mindwm API
# 
# This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
# The version of the OpenAPI document: 0.1.0
# 
# Generated by: https://openapi-generator.tech
#

import json
import tables

import model_any_type
import model_clipboard_payload

type Clipboard* = object
  ## 
  `type`*: string
  source*: string
  data*: ClipboardPayload
  id*: string ## Identifies the event.
  specversion*: string ## The version of the CloudEvents specification which the event uses.
  datacontenttype*: string ## Content type of the data value. Must adhere to RFC 2046 format.
  dataschema*: string ## Identifies the schema that data adheres to.
  subject*: string ## Describes the subject of the event in the context of the event producer (identified by source).
  time*: string ## Timestamp of when the occurrence happened. Must adhere to RFC 3339.
  dataBase64*: string ## Base64 encoded event payload. Must adhere to RFC4648.
