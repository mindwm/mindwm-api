# OpenapiClient::Neo4jChangeDataCapturePayload

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'openapi_client'

OpenapiClient::Neo4jChangeDataCapturePayload.openapi_one_of
# =>
# [
#   :'Neo4jChangeDataCaptureNodePayload',
#   :'Neo4jChangeDataCaptureRelationshipPayload'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'openapi_client'

OpenapiClient::Neo4jChangeDataCapturePayload.build(data)
# => #<Neo4jChangeDataCaptureNodePayload:0x00007fdd4aab02a0>

OpenapiClient::Neo4jChangeDataCapturePayload.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `Neo4jChangeDataCaptureNodePayload`
- `Neo4jChangeDataCaptureRelationshipPayload`
- `nil` (if no type matches)

