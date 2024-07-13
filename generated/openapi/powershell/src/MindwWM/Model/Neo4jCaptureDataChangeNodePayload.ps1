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

.PARAMETER After
No description available.
.PARAMETER Before
No description available.
.PARAMETER Id
No description available.
.PARAMETER Type
No description available.
.OUTPUTS

Neo4jCaptureDataChangeNodePayload<PSCustomObject>
#>

function Initialize-Neo4jCaptureDataChangeNodePayload {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [PSCustomObject]
        ${After},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Before},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Id},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Type}
    )

    Process {
        'Creating PSCustomObject: MindwWM => Neo4jCaptureDataChangeNodePayload' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        if ($null -eq $After) {
            throw "invalid value for 'After', 'After' cannot be null."
        }

        if ($null -eq $Before) {
            throw "invalid value for 'Before', 'Before' cannot be null."
        }

        if ($null -eq $Id) {
            throw "invalid value for 'Id', 'Id' cannot be null."
        }

        if ($null -eq $Type) {
            throw "invalid value for 'Type', 'Type' cannot be null."
        }


        $PSO = [PSCustomObject]@{
            "after" = ${After}
            "before" = ${Before}
            "id" = ${Id}
            "type" = ${Type}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to Neo4jCaptureDataChangeNodePayload<PSCustomObject>

.DESCRIPTION

Convert from JSON to Neo4jCaptureDataChangeNodePayload<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

Neo4jCaptureDataChangeNodePayload<PSCustomObject>
#>
function ConvertFrom-JsonToNeo4jCaptureDataChangeNodePayload {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: MindwWM => Neo4jCaptureDataChangeNodePayload' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in Neo4jCaptureDataChangeNodePayload
        $AllProperties = ("after", "before", "id", "type")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        If ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") { # empty json
            throw "Error! Empty JSON cannot be serialized due to the required property 'after' missing."
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "after"))) {
            throw "Error! JSON cannot be serialized due to the required property 'after' missing."
        } else {
            $After = $JsonParameters.PSobject.Properties["after"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "before"))) {
            throw "Error! JSON cannot be serialized due to the required property 'before' missing."
        } else {
            $Before = $JsonParameters.PSobject.Properties["before"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) {
            throw "Error! JSON cannot be serialized due to the required property 'id' missing."
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "type"))) {
            throw "Error! JSON cannot be serialized due to the required property 'type' missing."
        } else {
            $Type = $JsonParameters.PSobject.Properties["type"].value
        }

        $PSO = [PSCustomObject]@{
            "after" = ${After}
            "before" = ${Before}
            "id" = ${Id}
            "type" = ${Type}
        }

        return $PSO
    }

}

