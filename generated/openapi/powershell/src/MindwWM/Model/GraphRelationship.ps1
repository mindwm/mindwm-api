#
# Mindwm API
# This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
# Version: 0.1.0
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER Id
Identifies the event.
.PARAMETER Source
No description available.
.PARAMETER Specversion
The version of the CloudEvents specification which the event uses.
.PARAMETER Type
No description available.
.PARAMETER Datacontenttype
Content type of the data value. Must adhere to RFC 2046 format.
.PARAMETER Dataschema
Identifies the schema that data adheres to.
.PARAMETER Subject
Describes the subject of the event in the context of the event producer (identified by source).
.PARAMETER Time
Timestamp of when the occurrence happened. Must adhere to RFC 3339.
.PARAMETER VarData
No description available.
.PARAMETER DataBase64
Base64 encoded event payload. Must adhere to RFC4648.
.OUTPUTS

GraphRelationship<PSCustomObject>
#>

function Initialize-GraphRelationship {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("graph.relationship")]
        [String]
        ${Source},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Specversion},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [ValidateSet("created", "updated", "deleted")]
        [String]
        ${Type},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Datacontenttype},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Dataschema},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Subject},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${Time},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${VarData},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${DataBase64}
    )

    Process {
        'Creating PSCustomObject: MindwWM => GraphRelationship' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Id) {
            throw "invalid value for 'Id', 'Id' cannot be null."
        }

        if ($Id.length -lt 1) {
            throw "invalid value for 'Id', the character length must be great than or equal to 1."
        }

        if ($null -eq $Source) {
            throw "invalid value for 'Source', 'Source' cannot be null."
        }

        if ($null -eq $Specversion) {
            throw "invalid value for 'Specversion', 'Specversion' cannot be null."
        }

        if ($Specversion.length -lt 1) {
            throw "invalid value for 'Specversion', the character length must be great than or equal to 1."
        }

        if ($null -eq $Type) {
            throw "invalid value for 'Type', 'Type' cannot be null."
        }

        if (!$Datacontenttype -and $Datacontenttype.length -lt 1) {
            throw "invalid value for 'Datacontenttype', the character length must be great than or equal to 1."
        }

        if (!$Dataschema -and $Dataschema.length -lt 1) {
            throw "invalid value for 'Dataschema', the character length must be great than or equal to 1."
        }

        if (!$Subject -and $Subject.length -lt 1) {
            throw "invalid value for 'Subject', the character length must be great than or equal to 1."
        }

        if (!$Time -and $Time.length -lt 1) {
            throw "invalid value for 'Time', the character length must be great than or equal to 1."
        }


        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "source" = ${Source}
            "specversion" = ${Specversion}
            "type" = ${Type}
            "datacontenttype" = ${Datacontenttype}
            "dataschema" = ${Dataschema}
            "subject" = ${Subject}
            "time" = ${Time}
            "data" = ${VarData}
            "data_base64" = ${DataBase64}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to GraphRelationship<PSCustomObject>

.DESCRIPTION

Convert from JSON to GraphRelationship<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

GraphRelationship<PSCustomObject>
#>
function ConvertFrom-JsonToGraphRelationship {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: MindwWM => GraphRelationship' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json
        $GraphRelationshipAdditionalProperties = @{}

        # check if Json contains properties not defined in GraphRelationship
        $AllProperties = ("id", "source", "specversion", "type", "datacontenttype", "dataschema", "subject", "time", "data", "data_base64")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            # store undefined properties in additionalProperties
            if (!($AllProperties.Contains($name))) {
                $GraphRelationshipAdditionalProperties[$name] = $JsonParameters.PSobject.Properties[$name].value
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'id' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) {
            throw "Error! JSON cannot be serialized due to the required property 'id' missing."
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "source"))) {
            throw "Error! JSON cannot be serialized due to the required property 'source' missing."
        } else {
            $Source = $JsonParameters.PSobject.Properties["source"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "specversion"))) {
            throw "Error! JSON cannot be serialized due to the required property 'specversion' missing."
        } else {
            $Specversion = $JsonParameters.PSobject.Properties["specversion"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "type"))) {
            throw "Error! JSON cannot be serialized due to the required property 'type' missing."
        } else {
            $Type = $JsonParameters.PSobject.Properties["type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "datacontenttype"))) { #optional property not found
            $Datacontenttype = $null
        } else {
            $Datacontenttype = $JsonParameters.PSobject.Properties["datacontenttype"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "dataschema"))) { #optional property not found
            $Dataschema = $null
        } else {
            $Dataschema = $JsonParameters.PSobject.Properties["dataschema"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "subject"))) { #optional property not found
            $Subject = $null
        } else {
            $Subject = $JsonParameters.PSobject.Properties["subject"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "time"))) { #optional property not found
            $Time = $null
        } else {
            $Time = $JsonParameters.PSobject.Properties["time"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "data"))) { #optional property not found
            $VarData = $null
        } else {
            $VarData = $JsonParameters.PSobject.Properties["data"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "data_base64"))) { #optional property not found
            $DataBase64 = $null
        } else {
            $DataBase64 = $JsonParameters.PSobject.Properties["data_base64"].value
        }

        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "source" = ${Source}
            "specversion" = ${Specversion}
            "type" = ${Type}
            "datacontenttype" = ${Datacontenttype}
            "dataschema" = ${Dataschema}
            "subject" = ${Subject}
            "time" = ${Time}
            "data" = ${VarData}
            "data_base64" = ${DataBase64}
            "AdditionalProperties" = $GraphRelationshipAdditionalProperties
        }

        return $PSO
    }

}
