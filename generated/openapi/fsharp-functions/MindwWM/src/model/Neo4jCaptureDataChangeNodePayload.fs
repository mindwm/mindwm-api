namespace MindwWM.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open MindwWM.Model.Neo4jCaptureDataChangeNodePayloadAfter

module Neo4jCaptureDataChangeNodePayload =

  //#region Neo4jCaptureDataChangeNodePayload

  [<CLIMutable>]
  type Neo4jCaptureDataChangeNodePayload = {
    [<JsonProperty(PropertyName = "after")>]
    After : Neo4jCaptureDataChangeNodePayloadAfter;
    [<JsonProperty(PropertyName = "before")>]
    Before : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
