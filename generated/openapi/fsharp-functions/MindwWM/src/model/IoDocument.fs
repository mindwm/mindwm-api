namespace MindwWM.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open MindwWM.Model.AnyType
open MindwWM.Model.TmuxPaneIoDocument
open System.Collections.Generic

module IoDocument =

  //#region IoDocument

  [<CLIMutable>]
  type IoDocument = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "source")>]
    Source : string;
    [<JsonProperty(PropertyName = "data")>]
    Data : TmuxPaneIoDocument;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "specversion")>]
    Specversion : string;
    [<JsonProperty(PropertyName = "datacontenttype")>]
    Datacontenttype : string;
    [<JsonProperty(PropertyName = "dataschema")>]
    Dataschema : string;
    [<JsonProperty(PropertyName = "subject")>]
    Subject : string;
    [<JsonProperty(PropertyName = "time")>]
    Time : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "data_base64")>]
    DataBase64 : string;
  }

  //#endregion
