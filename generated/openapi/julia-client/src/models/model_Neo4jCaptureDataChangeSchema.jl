# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""Neo4jCaptureDataChange_schema

    Neo4jCaptureDataChangeSchema(;
        constraints=nothing,
        properties=nothing,
    )

    - constraints::Dict{String, Any}
    - properties::Dict{String, Any}
"""
Base.@kwdef mutable struct Neo4jCaptureDataChangeSchema <: OpenAPI.APIModel
    constraints::Union{Nothing, Dict{String, Any}} = nothing
    properties::Union{Nothing, Dict{String, Any}} = nothing

    function Neo4jCaptureDataChangeSchema(constraints, properties, )
        OpenAPI.validate_property(Neo4jCaptureDataChangeSchema, Symbol("constraints"), constraints)
        OpenAPI.validate_property(Neo4jCaptureDataChangeSchema, Symbol("properties"), properties)
        return new(constraints, properties, )
    end
end # type Neo4jCaptureDataChangeSchema

const _property_types_Neo4jCaptureDataChangeSchema = Dict{Symbol,String}(Symbol("constraints")=>"Dict{String, Any}", Symbol("properties")=>"Dict{String, Any}", )
OpenAPI.property_type(::Type{ Neo4jCaptureDataChangeSchema }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_Neo4jCaptureDataChangeSchema[name]))}

function check_required(o::Neo4jCaptureDataChangeSchema)
    true
end

function OpenAPI.validate_property(::Type{ Neo4jCaptureDataChangeSchema }, name::Symbol, val)
end