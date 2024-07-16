namespace MindWM.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open MindWM.Model.AnyType
open System.Collections.Generic

module TmuxPaneIoDocument =

  //#region TmuxPaneIoDocument

  [<CLIMutable>]
  type TmuxPaneIoDocument = {
    [<JsonProperty(PropertyName = "input")>]
    Input : string;
    [<JsonProperty(PropertyName = "output")>]
    Output : string;
    [<JsonProperty(PropertyName = "ps1")>]
    Ps1 : string;
  }

  //#endregion
