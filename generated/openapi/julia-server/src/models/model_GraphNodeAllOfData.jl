# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""GraphNode_allOf_data

    GraphNodeAllOfData(;
        headers=nothing,
        message_key=nothing,
        meta=nothing,
        offset=nothing,
        partition=nothing,
        source_type=nothing,
        timestamp=nothing,
        topic=nothing,
        schema=nothing,
        payload=nothing,
    )

    - headers::Any
    - message_key::String
    - meta::Neo4jCaptureDataChangeMeta
    - offset::Int64
    - partition::Int64
    - source_type::String
    - timestamp::ZonedDateTime
    - topic::String
    - schema::Neo4jCaptureDataChangeSchema
    - payload::Neo4jCaptureDataChangeNodePayload
"""
Base.@kwdef mutable struct GraphNodeAllOfData <: OpenAPI.APIModel
    headers::Union{Nothing, Any} = nothing
    message_key::Union{Nothing, String} = nothing
    meta = nothing # spec type: Union{ Nothing, Neo4jCaptureDataChangeMeta }
    offset::Union{Nothing, Int64} = nothing
    partition::Union{Nothing, Int64} = nothing
    source_type::Union{Nothing, String} = nothing
    timestamp::Union{Nothing, ZonedDateTime} = nothing
    topic::Union{Nothing, String} = nothing
    schema = nothing # spec type: Union{ Nothing, Neo4jCaptureDataChangeSchema }
    payload = nothing # spec type: Union{ Nothing, Neo4jCaptureDataChangeNodePayload }

    function GraphNodeAllOfData(headers, message_key, meta, offset, partition, source_type, timestamp, topic, schema, payload, )
        OpenAPI.validate_property(GraphNodeAllOfData, Symbol("headers"), headers)
        OpenAPI.validate_property(GraphNodeAllOfData, Symbol("message_key"), message_key)
        OpenAPI.validate_property(GraphNodeAllOfData, Symbol("meta"), meta)
        OpenAPI.validate_property(GraphNodeAllOfData, Symbol("offset"), offset)
        OpenAPI.validate_property(GraphNodeAllOfData, Symbol("partition"), partition)
        OpenAPI.validate_property(GraphNodeAllOfData, Symbol("source_type"), source_type)
        OpenAPI.validate_property(GraphNodeAllOfData, Symbol("timestamp"), timestamp)
        OpenAPI.validate_property(GraphNodeAllOfData, Symbol("topic"), topic)
        OpenAPI.validate_property(GraphNodeAllOfData, Symbol("schema"), schema)
        OpenAPI.validate_property(GraphNodeAllOfData, Symbol("payload"), payload)
        return new(headers, message_key, meta, offset, partition, source_type, timestamp, topic, schema, payload, )
    end
end # type GraphNodeAllOfData

const _property_types_GraphNodeAllOfData = Dict{Symbol,String}(Symbol("headers")=>"Any", Symbol("message_key")=>"String", Symbol("meta")=>"Neo4jCaptureDataChangeMeta", Symbol("offset")=>"Int64", Symbol("partition")=>"Int64", Symbol("source_type")=>"String", Symbol("timestamp")=>"ZonedDateTime", Symbol("topic")=>"String", Symbol("schema")=>"Neo4jCaptureDataChangeSchema", Symbol("payload")=>"Neo4jCaptureDataChangeNodePayload", )
OpenAPI.property_type(::Type{ GraphNodeAllOfData }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_GraphNodeAllOfData[name]))}

function check_required(o::GraphNodeAllOfData)
    o.headers === nothing && (return false)
    o.message_key === nothing && (return false)
    o.meta === nothing && (return false)
    o.offset === nothing && (return false)
    o.partition === nothing && (return false)
    o.source_type === nothing && (return false)
    o.timestamp === nothing && (return false)
    o.topic === nothing && (return false)
    o.schema === nothing && (return false)
    o.payload === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ GraphNodeAllOfData }, name::Symbol, val)
    if name === Symbol("timestamp")
        OpenAPI.validate_param(name, "GraphNodeAllOfData", :format, val, "date-time")
    end
end
