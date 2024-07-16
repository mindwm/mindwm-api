namespace MindWM.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Neo4jCaptureDataChangeMetaSource =

  //#region Neo4jCaptureDataChangeMetaSource

  [<CLIMutable>]
  type Neo4jCaptureDataChangeMetaSource = {
    [<JsonProperty(PropertyName = "hostname")>]
    Hostname : string;
  }

  //#endregion
