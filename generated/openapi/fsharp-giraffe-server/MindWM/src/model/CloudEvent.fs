namespace MindWM.Model

open System
open System.Collections.Generic

module CloudEvent =

  //#region CloudEvent


  type CloudEvent = {
    Id : string;
    Source : string;
    Specversion : string;
    Type : string;
    Datacontenttype : string;
    Dataschema : string;
    Subject : string;
    Time : Nullable<DateTime>;
    Data : obj;
    DataBase64 : string;
  }
  //#endregion
