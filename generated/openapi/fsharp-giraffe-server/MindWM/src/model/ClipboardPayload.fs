namespace MindWM.Model

open System
open System.Collections.Generic
open MindWM.Model.ClipboardPayloadContext

module ClipboardPayload =

  //#region ClipboardPayload

  //#region enums
  type TypeEnum = PrimaryEnum of string  |  SecondaryEnum of string  |  ClipboardEnum of string  
  //#endregion

  type ClipboardPayload = {
    Start : int[];
    Stop : int[];
    Data : string;
    Type : TypeEnum;
    Context : ClipboardPayloadContext;
  }
  //#endregion
