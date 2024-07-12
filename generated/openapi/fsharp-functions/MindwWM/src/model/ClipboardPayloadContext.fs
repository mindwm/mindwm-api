namespace MindwWM.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ClipboardPayloadContext =

  //#region ClipboardPayloadContext

  [<CLIMutable>]
  type ClipboardPayloadContext = {
    [<JsonProperty(PropertyName = "window")>]
    Window : string;
  }

  //#endregion
