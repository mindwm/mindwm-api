namespace MindWM.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open MindWM.Model.Neo4jCaptureDataChangeMeta
open MindWM.Model.Neo4jCaptureDataChangeNodePayload
open MindWM.Model.Neo4jCaptureDataChangeSchema

module GraphNodeAllOfData =

  //#region GraphNodeAllOfData

  [<CLIMutable>]
  type GraphNodeAllOfData = {
    [<JsonProperty(PropertyName = "headers")>]
    Headers : obj;
    [<JsonProperty(PropertyName = "message_key")>]
    MessageKey : string;
    [<JsonProperty(PropertyName = "meta")>]
    Meta : Neo4jCaptureDataChangeMeta;
    [<JsonProperty(PropertyName = "offset")>]
    Offset : int;
    [<JsonProperty(PropertyName = "partition")>]
    Partition : int;
    [<JsonProperty(PropertyName = "source_type")>]
    SourceType : string;
    [<JsonProperty(PropertyName = "timestamp")>]
    Timestamp : DateTime;
    [<JsonProperty(PropertyName = "topic")>]
    Topic : string;
    [<JsonProperty(PropertyName = "schema")>]
    Schema : Neo4jCaptureDataChangeSchema;
    [<JsonProperty(PropertyName = "payload")>]
    Payload : Neo4jCaptureDataChangeNodePayload;
  }

  //#endregion
