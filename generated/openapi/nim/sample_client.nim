#
# Mindwm API
# 
# This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
# The version of the OpenAPI document: 0.1.0
# 
# Generated by: https://openapi-generator.tech
#

import httpclient
import logging
import options

import MindWM

import config

let logger = newConsoleLogger()
addHandler(logger)

let client = newHttpClient()
client.headers["User-Agent"] = config.useragent
