namespace MindWM.Model

open System
open System.Collections.Generic
open MindWM.Model.AnyType
open MindWM.Model.TmuxPaneIoDocument
open System.Collections.Generic

module IoDocument =

  //#region IoDocument


  type IoDocument = {
    Id : string;
    Source : string;
    Specversion : string;
    Type : string;
    Datacontenttype : string;
    Dataschema : string;
    Subject : string;
    Time : Nullable<DateTime>;
    Data : TmuxPaneIoDocument;
    DataBase64 : string;
  }
  //#endregion
