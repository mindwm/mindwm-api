# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""CloudEvent
CloudEvents Specification JSON Schema

    CloudEvent(;
        id=nothing,
        source=nothing,
        specversion=nothing,
        type=nothing,
        datacontenttype=nothing,
        dataschema=nothing,
        subject=nothing,
        time=nothing,
        data=nothing,
        data_base64=nothing,
    )

    - id::String : Identifies the event.
    - source::String : Identifies the context in which an event happened.
    - specversion::String : The version of the CloudEvents specification which the event uses.
    - type::String : Describes the type of event related to the originating occurrence.
    - datacontenttype::String : Content type of the data value. Must adhere to RFC 2046 format.
    - dataschema::String : Identifies the schema that data adheres to.
    - subject::String : Describes the subject of the event in the context of the event producer (identified by source).
    - time::ZonedDateTime : Timestamp of when the occurrence happened. Must adhere to RFC 3339.
    - data::CloudEventData
    - data_base64::String : Base64 encoded event payload. Must adhere to RFC4648.
"""
Base.@kwdef mutable struct CloudEvent <: OpenAPI.APIModel
    id::Union{Nothing, String} = nothing
    source::Union{Nothing, String} = nothing
    specversion::Union{Nothing, String} = nothing
    type::Union{Nothing, String} = nothing
    datacontenttype::Union{Nothing, String} = nothing
    dataschema::Union{Nothing, String} = nothing
    subject::Union{Nothing, String} = nothing
    time::Union{Nothing, ZonedDateTime} = nothing
    data = nothing # spec type: Union{ Nothing, CloudEventData }
    data_base64::Union{Nothing, String} = nothing

    function CloudEvent(id, source, specversion, type, datacontenttype, dataschema, subject, time, data, data_base64, )
        OpenAPI.validate_property(CloudEvent, Symbol("id"), id)
        OpenAPI.validate_property(CloudEvent, Symbol("source"), source)
        OpenAPI.validate_property(CloudEvent, Symbol("specversion"), specversion)
        OpenAPI.validate_property(CloudEvent, Symbol("type"), type)
        OpenAPI.validate_property(CloudEvent, Symbol("datacontenttype"), datacontenttype)
        OpenAPI.validate_property(CloudEvent, Symbol("dataschema"), dataschema)
        OpenAPI.validate_property(CloudEvent, Symbol("subject"), subject)
        OpenAPI.validate_property(CloudEvent, Symbol("time"), time)
        OpenAPI.validate_property(CloudEvent, Symbol("data"), data)
        OpenAPI.validate_property(CloudEvent, Symbol("data_base64"), data_base64)
        return new(id, source, specversion, type, datacontenttype, dataschema, subject, time, data, data_base64, )
    end
end # type CloudEvent

const _property_types_CloudEvent = Dict{Symbol,String}(Symbol("id")=>"String", Symbol("source")=>"String", Symbol("specversion")=>"String", Symbol("type")=>"String", Symbol("datacontenttype")=>"String", Symbol("dataschema")=>"String", Symbol("subject")=>"String", Symbol("time")=>"ZonedDateTime", Symbol("data")=>"CloudEventData", Symbol("data_base64")=>"String", )
OpenAPI.property_type(::Type{ CloudEvent }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_CloudEvent[name]))}

function check_required(o::CloudEvent)
    o.id === nothing && (return false)
    o.source === nothing && (return false)
    o.specversion === nothing && (return false)
    o.type === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ CloudEvent }, name::Symbol, val)
    if name === Symbol("id")
        OpenAPI.validate_param(name, "CloudEvent", :minLength, val, 1)
    end
    if name === Symbol("source")
        OpenAPI.validate_param(name, "CloudEvent", :format, val, "uri-reference")
    end
    if name === Symbol("source")
        OpenAPI.validate_param(name, "CloudEvent", :minLength, val, 1)
    end
    if name === Symbol("specversion")
        OpenAPI.validate_param(name, "CloudEvent", :minLength, val, 1)
    end
    if name === Symbol("type")
        OpenAPI.validate_param(name, "CloudEvent", :minLength, val, 1)
    end
    if name === Symbol("datacontenttype")
        OpenAPI.validate_param(name, "CloudEvent", :minLength, val, 1)
    end
    if name === Symbol("dataschema")
        OpenAPI.validate_param(name, "CloudEvent", :format, val, "uri")
    end
    if name === Symbol("dataschema")
        OpenAPI.validate_param(name, "CloudEvent", :minLength, val, 1)
    end
    if name === Symbol("subject")
        OpenAPI.validate_param(name, "CloudEvent", :minLength, val, 1)
    end
    if name === Symbol("time")
        OpenAPI.validate_param(name, "CloudEvent", :format, val, "date-time")
    end
    if name === Symbol("time")
        OpenAPI.validate_param(name, "CloudEvent", :minLength, val, 1)
    end
end
