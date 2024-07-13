namespace MindwWM.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open MindwWM.Model.Neo4jCaptureDataChangeRelationshipPayloadEnd

module Neo4jCaptureDataChangeRelationshipPayload =

  //#region Neo4jCaptureDataChangeRelationshipPayload

  [<CLIMutable>]
  type Neo4jCaptureDataChangeRelationshipPayload = {
    [<JsonProperty(PropertyName = "after")>]
    After : obj;
    [<JsonProperty(PropertyName = "before")>]
    Before : string;
    [<JsonProperty(PropertyName = "end")>]
    End : Neo4jCaptureDataChangeRelationshipPayloadEnd;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "label")>]
    Label : string;
    [<JsonProperty(PropertyName = "start")>]
    Start : Neo4jCaptureDataChangeRelationshipPayloadEnd;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
