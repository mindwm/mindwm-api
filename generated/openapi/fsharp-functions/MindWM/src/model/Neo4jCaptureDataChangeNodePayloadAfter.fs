namespace MindWM.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open MindWM.Model.AnyType
open System.Collections.Generic

module Neo4jCaptureDataChangeNodePayloadAfter =

  //#region Neo4jCaptureDataChangeNodePayloadAfter

  [<CLIMutable>]
  type Neo4jCaptureDataChangeNodePayloadAfter = {
    [<JsonProperty(PropertyName = "labels")>]
    Labels : string[];
    [<JsonProperty(PropertyName = "properties")>]
    Properties : IDictionary<string, AnyType>;
  }

  //#endregion
