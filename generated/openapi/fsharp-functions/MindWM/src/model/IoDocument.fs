namespace MindWM.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open MindWM.Model.AnyType
open MindWM.Model.TmuxPaneIoDocument
open System.Collections.Generic

module IoDocument =

  //#region IoDocument

  [<CLIMutable>]
  type IoDocument = {
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
    Data : TmuxPaneIoDocument;
    [<JsonProperty(PropertyName = "data_base64")>]
    DataBase64 : string;
  }

  //#endregion
