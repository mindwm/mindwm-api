# NOTE: This file is auto generated by OpenAPI Generator 7.7.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule MindwmAPI.Model.Neo4jCaptureDataChangeNodePayloadAfter do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :labels,
    :properties
  ]

  @type t :: %__MODULE__{
    :labels => [String.t],
    :properties => %{optional(String.t) => any()}
  }

  def decode(value) do
    value
  end
end

