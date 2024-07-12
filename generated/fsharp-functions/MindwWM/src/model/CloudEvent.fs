namespace MindwWM.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open MindwWM.Model.CloudEventData
open MindwWM.Model.string option

module CloudEvent =

  //#region CloudEvent

  [<CLIMutable>]
  type CloudEvent = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "source")>]
    Source : string;
    [<JsonProperty(PropertyName = "specversion")>]
    Specversion : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "datacontenttype")>]
    Datacontenttype : string option;
    [<JsonProperty(PropertyName = "dataschema")>]
    Dataschema : string option;
    [<JsonProperty(PropertyName = "subject")>]
    Subject : string option;
    [<JsonProperty(PropertyName = "time")>]
    Time : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "data")>]
    Data : CloudEventData;
    [<JsonProperty(PropertyName = "data_base64")>]
    DataBase64 : string option;
  }

  //#endregion
