namespace MindwWM.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open MindwWM.Model.Neo4jCaptureDataChangeMeta
open MindwWM.Model.Neo4jCaptureDataChangeRelationshipPayload
open MindwWM.Model.Neo4jCaptureDataChangeSchema

module GraphRelationshipAllOfData =

  //#region GraphRelationshipAllOfData

  [<CLIMutable>]
  type GraphRelationshipAllOfData = {
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
    Payload : Neo4jCaptureDataChangeRelationshipPayload;
  }

  //#endregion
