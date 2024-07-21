namespace MindWM.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

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
    Datacontenttype : string;
    [<JsonProperty(PropertyName = "dataschema")>]
    Dataschema : string;
    [<JsonProperty(PropertyName = "subject")>]
    Subject : string;
    [<JsonProperty(PropertyName = "time")>]
    Time : Nullable<DateTime>;
    [<JsonProperty(PropertyName = "data")>]
    Data : obj;
    [<JsonProperty(PropertyName = "data_base64")>]
    DataBase64 : string;
  }

  //#endregion
