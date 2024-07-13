import file
version = "0.1.0"


api_title = "Mindwm API"
description = "This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads"

license = {
  name = "Apache 2.0"
  url = "https://www.apache.org/licenses/LICENSE-2.0"
  if file.read_env("GDSCRIPT_WORKAROUND"):
    identifier = "Apache-2.0"
}

asyncapi = {
  version = "3.0.0"
  title = api_title
  description = description
} 

openapi = {
  version = "3.1.0"
  title = api_title
  description = description
} 

