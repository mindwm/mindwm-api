namespace MindWM.Model

open System
open System.Collections.Generic
open MindWM.Model.AnyType
open MindWM.Model.ClipboardPayload
open System.Collections.Generic

module Clipboard =

  //#region Clipboard


  type Clipboard = {
    Type : string;
    Source : string;
    Data : ClipboardPayload;
    Id : string;
    Specversion : string;
    Datacontenttype : string;
    Dataschema : string;
    Subject : string;
    Time : Nullable<DateTime>;
    DataBase64 : string;
  }
  //#endregion
