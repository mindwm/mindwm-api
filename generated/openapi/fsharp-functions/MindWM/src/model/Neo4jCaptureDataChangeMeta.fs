namespace MindWM.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open MindWM.Model.Neo4jCaptureDataChangeMetaSource

module Neo4jCaptureDataChangeMeta =

  //#region Neo4jCaptureDataChangeMeta

  [<CLIMutable>]
  type Neo4jCaptureDataChangeMeta = {
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "source")>]
    Source : Neo4jCaptureDataChangeMetaSource;
    [<JsonProperty(PropertyName = "timestamp")>]
    Timestamp : int;
    [<JsonProperty(PropertyName = "txEventId")>]
    TxEventId : int;
    [<JsonProperty(PropertyName = "txEventsCount")>]
    TxEventsCount : int;
    [<JsonProperty(PropertyName = "txId")>]
    TxId : int;
    [<JsonProperty(PropertyName = "username")>]
    Username : string;
  }

  //#endregion
