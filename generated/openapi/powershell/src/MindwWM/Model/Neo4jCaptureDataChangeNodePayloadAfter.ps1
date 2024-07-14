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

.PARAMETER Labels
No description available.
.PARAMETER Properties
No description available.
.OUTPUTS

Neo4jCaptureDataChangeNodePayloadAfter<PSCustomObject>
#>

function Initialize-Neo4jCaptureDataChangeNodePayloadAfter {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String[]]
        ${Labels},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Collections.Hashtable]
        ${Properties}
    )

    Process {
        'Creating PSCustomObject: MindwWM => Neo4jCaptureDataChangeNodePayloadAfter' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $Labels) {
            throw "invalid value for 'Labels', 'Labels' cannot be null."
        }

        if ($null -eq $Properties) {
            throw "invalid value for 'Properties', 'Properties' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "labels" = ${Labels}
            "properties" = ${Properties}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to Neo4jCaptureDataChangeNodePayloadAfter<PSCustomObject>

.DESCRIPTION

Convert from JSON to Neo4jCaptureDataChangeNodePayloadAfter<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

Neo4jCaptureDataChangeNodePayloadAfter<PSCustomObject>
#>
function ConvertFrom-JsonToNeo4jCaptureDataChangeNodePayloadAfter {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: MindwWM => Neo4jCaptureDataChangeNodePayloadAfter' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in Neo4jCaptureDataChangeNodePayloadAfter
        $AllProperties = ("labels", "properties")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'labels' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "labels"))) {
            throw "Error! JSON cannot be serialized due to the required property 'labels' missing."
        } else {
            $Labels = $JsonParameters.PSobject.Properties["labels"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "properties"))) {
            throw "Error! JSON cannot be serialized due to the required property 'properties' missing."
        } else {
            $Properties = $JsonParameters.PSobject.Properties["properties"].value
        }

        $PSO = [PSCustomObject]@{
            "labels" = ${Labels}
            "properties" = ${Properties}
        }

        return $PSO
    }

}
