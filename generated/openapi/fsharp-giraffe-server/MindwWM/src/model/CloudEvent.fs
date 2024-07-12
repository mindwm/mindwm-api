namespace MindwWM.Model

open System
open System.Collections.Generic
open MindwWM.Model.CloudEventData
open MindwWM.Model.string option

module CloudEvent =

  //#region CloudEvent


  type CloudEvent = {
    Id : string;
    Source : string;
    Specversion : string;
    Type : string;
    Datacontenttype : string option;
    Dataschema : string option;
    Subject : string option;
    Time : Nullable<DateTime>;
    Data : CloudEventData;
    DataBase64 : string option;
  }
  //#endregion
