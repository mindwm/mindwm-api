namespace MindwWM.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open MindwWM.Model.AnyType
open System.Collections.Generic

module Neo4jCaptureDataChangeRelationshipPayloadEnd =

  //#region Neo4jCaptureDataChangeRelationshipPayloadEnd

  [<CLIMutable>]
  type Neo4jCaptureDataChangeRelationshipPayloadEnd = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "ids")>]
    Ids : IDictionary<string, AnyType>;
    [<JsonProperty(PropertyName = "labels")>]
    Labels : string[];
  }

  //#endregion
