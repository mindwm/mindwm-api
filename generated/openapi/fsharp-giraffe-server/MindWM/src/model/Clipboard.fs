namespace MindWM.Model

open System
open System.Collections.Generic
open MindWM.Model.AnyType
open MindWM.Model.ClipboardPayload
open System.Collections.Generic

module Clipboard =

  //#region Clipboard


  type Clipboard = {
    Id : string;
    Source : string;
    Specversion : string;
    Type : string;
    Datacontenttype : string;
    Dataschema : string;
    Subject : string;
    Time : Nullable<DateTime>;
    Data : ClipboardPayload;
    DataBase64 : string;
  }
  //#endregion
