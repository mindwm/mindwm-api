# NOTE: This file is auto generated by OpenAPI Generator 7.7.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule MindwmAPI.Model.GraphRelationship do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :id,
    :source,
    :specversion,
    :type,
    :datacontenttype,
    :dataschema,
    :subject,
    :time,
    :data,
    :data_base64
  ]

  @type t :: %__MODULE__{
    :id => String.t,
    :source => String.t,
    :specversion => String.t,
    :type => String.t,
    :datacontenttype => String.t | nil,
    :dataschema => String.t | nil,
    :subject => String.t | nil,
    :time => DateTime.t | nil,
    :data => MindwmAPI.Model.GraphRelationshipAllOfData.t | nil,
    :data_base64 => String.t | nil
  }

  alias MindwmAPI.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:time, :datetime, nil)
     |> Deserializer.deserialize(:data, :struct, MindwmAPI.Model.GraphRelationshipAllOfData)
  end
end

