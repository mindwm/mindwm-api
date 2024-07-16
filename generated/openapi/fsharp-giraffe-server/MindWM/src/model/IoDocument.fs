namespace MindWM.Model

open System
open System.Collections.Generic
open MindWM.Model.AnyType
open MindWM.Model.TmuxPaneIoDocument
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
