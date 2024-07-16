# MindwmAPI

This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

## Building

To install the required dependencies and to build the elixir project, run:

```console
mix local.hex --force
mix do deps.get, compile
```

## Installation

If [available in Hex][], the package can be installed by adding `mind_wm` to
your list of dependencies in `mix.exs`:

```elixir
def deps do
  [{:mind_wm, "~> 0.1.0"}]
end
```

Documentation can be generated with [ExDoc][] and published on [HexDocs][]. Once published, the docs can be found at
[https://hexdocs.pm/mind_wm][docs].

## Configuration

You can override the URL of your server (e.g. if you have a separate development and production server in your
configuration files).

```elixir
config :mind_wm, base_url: "https://mindwmw.io/v1"
```

Multiple clients for the same API with different URLs can be created passing different `base_url`s when calling
`MindwmAPI.Connection.new/1`:

```elixir
client = MindwmAPI.Connection.new(base_url: "https://mindwmw.io/v1")
```

[exdoc]: https://github.com/elixir-lang/ex_doc
[hexdocs]: https://hexdocs.pm
[available in hex]: https://hex.pm/docs/publish
[docs]: https://hexdocs.pm/mind_wm
