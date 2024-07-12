namespace MindwWM.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open MindwWM.Model.ClipboardPayloadContext

module ClipboardPayload =

  //#region ClipboardPayload

  [<CLIMutable>]
  type ClipboardPayload = {
    [<JsonProperty(PropertyName = "start")>]
    Start : int[];
    [<JsonProperty(PropertyName = "stop")>]
    Stop : int[];
    [<JsonProperty(PropertyName = "data")>]
    Data : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "context")>]
    Context : ClipboardPayloadContext;
  }

  //#endregion
