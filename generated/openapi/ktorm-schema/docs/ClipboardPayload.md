
# Table `ClipboardPayload`
(mapped from: ClipboardPayload)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**start** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Int&gt;** | Starting position of clipboard selection [x,y] |  [optional]
**stop** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Int&gt;** | Ending position of clipboard selection [x,y] |  [optional]
**data** | data | text |  | **kotlin.String** | Clipboard data |  [optional]
**type** | type | text |  | [**type**](#Type) | Clipboard type |  [optional]
**context** | context | long |  | [**ClipboardPayloadContext**](ClipboardPayloadContext.md) |  |  [optional] [foreignkey]


# **Table `ClipboardPayloadStart`**
(mapped from: ClipboardPayloadStart)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
clipboardPayload | clipboardPayload | long | | kotlin.Long | Primary Key | *one*
start | start | int | | kotlin.Int | Foreign Key | *many*



# **Table `ClipboardPayloadStop`**
(mapped from: ClipboardPayloadStop)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
clipboardPayload | clipboardPayload | long | | kotlin.Long | Primary Key | *one*
stop | stop | int | | kotlin.Int | Foreign Key | *many*






