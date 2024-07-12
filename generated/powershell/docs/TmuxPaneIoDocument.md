# TmuxPaneIoDocument
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarInput** | **String** | User input | 
**Output** | **String** | Command output (mix of stdout &amp; stderr) | 
**Ps1** | **String** | ps1 (prompt) AFTER the input and output | 

## Examples

- Prepare the resource
```powershell
$TmuxPaneIoDocument = Initialize-MindwWMTmuxPaneIoDocument  -VarInput null `
 -Output null `
 -Ps1 null
```

- Convert the resource to JSON
```powershell
$TmuxPaneIoDocument | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

