namespace MindwWM.Model

open System
open System.Collections.Generic
open MindwWM.Model.AnyType
open MindwWM.Model.CloudEventData
open MindwWM.Model.TmuxPaneIoDocument
open System.Collections.Generic

module IoDocument =

  //#region IoDocument


  type IoDocument = {
    Type : string;
    Source : string;
    Data : TmuxPaneIoDocument;
    Id : string;
    Specversion : string;
    Datacontenttype : string;
    Dataschema : string;
    Subject : string;
    Time : Nullable<DateTime>;
    DataBase64 : string;
  }
  //#endregion
