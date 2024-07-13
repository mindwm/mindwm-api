# OpenapiClient::Neo4jCaptureDataChangePayload

## Class instance methods

### `openapi_one_of`

Returns the list of classes defined in oneOf.

#### Example

```ruby
require 'openapi_client'

OpenapiClient::Neo4jCaptureDataChangePayload.openapi_one_of
# =>
# [
#   :'Neo4jCaptureDataChangeNodePayload',
#   :'Neo4jCaptureDataChangeRelationshipPayload'
# ]
```

### build

Find the appropriate object from the `openapi_one_of` list and casts the data into it.

#### Example

```ruby
require 'openapi_client'

OpenapiClient::Neo4jCaptureDataChangePayload.build(data)
# => #<Neo4jCaptureDataChangeNodePayload:0x00007fdd4aab02a0>

OpenapiClient::Neo4jCaptureDataChangePayload.build(data_that_doesnt_match)
# => nil
```

#### Parameters

| Name | Type | Description |
| ---- | ---- | ----------- |
| **data** | **Mixed** | data to be matched against the list of oneOf items |

#### Return type

- `Neo4jCaptureDataChangeNodePayload`
- `Neo4jCaptureDataChangeRelationshipPayload`
- `nil` (if no type matches)

