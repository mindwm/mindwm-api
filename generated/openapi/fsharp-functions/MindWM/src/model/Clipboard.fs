namespace MindWM.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open MindWM.Model.AnyType
open MindWM.Model.ClipboardPayload
open System.Collections.Generic

module Clipboard =

  //#region Clipboard

  [<CLIMutable>]
  type Clipboard = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "source")>]
    Source : string;
    [<JsonProperty(PropertyName = "specversion")>]
    Specversion : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "datacontenttype")>]
    Datacontenttype : string;
    [<JsonProperty(PropertyName = "dataschema")>]
    Dataschema : string;
    [<JsonProperty(PropertyName = "subject")>]
    Subject : string;
    [<JsonProperty(PropertyName = "time")>]
    Time : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "data")>]
    Data : ClipboardPayload;
    [<JsonProperty(PropertyName = "data_base64")>]
    DataBase64 : string;
  }

  //#endregion
