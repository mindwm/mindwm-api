# NOTE: This file is auto generated by OpenAPI Generator 7.7.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule MindwmAPI.Model.Neo4jCaptureDataChangeNodePayload do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :after,
    :before,
    :id,
    :type
  ]

  @type t :: %__MODULE__{
    :after => MindwmAPI.Model.Neo4jCaptureDataChangeNodePayloadAfter.t,
    :before => String.t,
    :id => String.t,
    :type => String.t
  }

  alias MindwmAPI.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:after, :struct, MindwmAPI.Model.Neo4jCaptureDataChangeNodePayloadAfter)
  end
end

