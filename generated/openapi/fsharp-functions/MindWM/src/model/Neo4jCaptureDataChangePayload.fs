namespace MindWM.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open MindWM.Model.Neo4jCaptureDataChangeNodePayload
open MindWM.Model.Neo4jCaptureDataChangeRelationshipPayload
open MindWM.Model.Neo4jCaptureDataChangeRelationshipPayloadEnd

module Neo4jCaptureDataChangePayload =

  //#region Neo4jCaptureDataChangePayload

  [<CLIMutable>]
  type Neo4jCaptureDataChangePayload = {
    [<JsonProperty(PropertyName = "after")>]
    After : obj;
    [<JsonProperty(PropertyName = "before")>]
    Before : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "end")>]
    End : Neo4jCaptureDataChangeRelationshipPayloadEnd;
    [<JsonProperty(PropertyName = "label")>]
    Label : string;
    [<JsonProperty(PropertyName = "start")>]
    Start : Neo4jCaptureDataChangeRelationshipPayloadEnd;
  }

  //#endregion
