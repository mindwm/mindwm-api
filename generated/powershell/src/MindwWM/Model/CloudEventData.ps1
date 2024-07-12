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

The event payload.

.PARAMETER Json

JSON object

.OUTPUTS

CloudEventData<PSCustomObject>
#>
function ConvertFrom-JsonToCloudEventData {
    [CmdletBinding()]
    Param (
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        $match = 0
        $matchType = $null
        $matchInstance = $null

        # nullable check
        if ([string]::IsNullOrEmpty($Json) -or $Json -eq "{}") {
            return [PSCustomObject]@{
                "ActualType" = $null
                "ActualInstance" = $null
                "AnyOfSchemas" = @("Boolean", "Decimal", "String")
            }
        }

        if ($match -ne 0) { # no match yet
            # try to match Boolean defined in the anyOf schemas
            try {
                $matchInstance = ConvertFrom-JsonToBoolean $Json

                foreach($property in $matchInstance.PsObject.Properties) {
                    if ($null -ne $property.Value) {
                        $matchType = "Boolean"
                        $match++
                        break
                    }
                }
            } catch {
                # fail to match the schema defined in anyOf, proceed to the next one
                Write-Debug "Failed to match 'Boolean' defined in anyOf (CloudEventData). Proceeding to the next one if any."
            }
        }

        if ($match -ne 0) { # no match yet
            # try to match Decimal defined in the anyOf schemas
            try {
                $matchInstance = ConvertFrom-JsonToDecimal $Json

                foreach($property in $matchInstance.PsObject.Properties) {
                    if ($null -ne $property.Value) {
                        $matchType = "Decimal"
                        $match++
                        break
                    }
                }
            } catch {
                # fail to match the schema defined in anyOf, proceed to the next one
                Write-Debug "Failed to match 'Decimal' defined in anyOf (CloudEventData). Proceeding to the next one if any."
            }
        }

        if ($match -ne 0) { # no match yet
            # try to match String defined in the anyOf schemas
            try {
                $matchInstance = ConvertFrom-JsonToString $Json

                foreach($property in $matchInstance.PsObject.Properties) {
                    if ($null -ne $property.Value) {
                        $matchType = "String"
                        $match++
                        break
                    }
                }
            } catch {
                # fail to match the schema defined in anyOf, proceed to the next one
                Write-Debug "Failed to match 'String' defined in anyOf (CloudEventData). Proceeding to the next one if any."
            }
        }

        if ($match -eq 1) {
            return [PSCustomObject]@{
                "ActualType" = ${matchType}
                "ActualInstance" = ${matchInstance}
                "anyOfSchemas" = @("Boolean", "Decimal", "String")
            }
        } else {
            throw "Error! The JSON payload doesn't matches any type defined in anyOf schemas ([Boolean, Decimal, String]). JSON Payload: $($Json)"
        }
    }
}

