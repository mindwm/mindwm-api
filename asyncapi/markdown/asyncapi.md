# Mindwm API 0.1.0 documentation

* License: [Apache 2.0](https://www.apache.org/licenses/LICENSE-2.0)

Desktop event processing


## Table of Contents

* [Servers](#servers)
  * [asciinema](#asciinema-server)
  * [mindwm-client](#mindwm-client-server)
  * [nats](#nats-server)

## Servers

### `asciinema` Server

* URL: `unixsocket://${USER_HOSTNAME}/`
* Protocol: `unixsocket`

Asciinema

#### URL Variables

| Name | Description | Default value | Allowed values |
|---|---|---|---|
| USER_HOST | - | `localhost` | _Any_ |


### `mindwm-client` Server

* URL: `unixsocket://${USER_HOSTNAME}/`
* Protocol: `unixsocket`

Mindwm Client      


#### URL Variables

| Name | Description | Default value | Allowed values |
|---|---|---|---|
| USER_HOSTNAME | - | `localhost` | _Any_ |


### `nats` Server

* URL: `nats://${address}:${port}/`
* Protocol: `nats`

Nats Server


#### URL Variables

| Name | Description | Default value | Allowed values |
|---|---|---|---|
| address | - | _None_ | `10.20.30.211`, `nats.nats` |
| port | - | `4222` | `31101`, `4222` |


## Operations

