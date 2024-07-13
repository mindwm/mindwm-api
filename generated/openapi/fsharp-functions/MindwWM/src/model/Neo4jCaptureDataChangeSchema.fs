namespace MindwWM.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open MindwWM.Model.AnyType
open System.Collections.Generic

module Neo4jCaptureDataChangeSchema =

  //#region Neo4jCaptureDataChangeSchema

  [<CLIMutable>]
  type Neo4jCaptureDataChangeSchema = {
    [<JsonProperty(PropertyName = "constraints")>]
    Constraints : IDictionary<string, AnyType>;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : IDictionary<string, AnyType>;
  }

  //#endregion
