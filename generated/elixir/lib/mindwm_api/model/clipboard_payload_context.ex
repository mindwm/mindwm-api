# NOTE: This file is auto generated by OpenAPI Generator 7.7.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule MindwmAPI.Model.ClipboardPayloadContext do
  @moduledoc """
  Selection context
  """

  @derive Jason.Encoder
  defstruct [
    :window
  ]

  @type t :: %__MODULE__{
    :window => String.t | nil
  }

  def decode(value) do
    value
  end
end

