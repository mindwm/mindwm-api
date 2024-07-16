namespace MindWM.Model

open System
open System.Collections.Generic
open MindWM.Model.AnyType
open MindWM.Model.GraphNodeAllOfData
open System.Collections.Generic

module GraphNode =

  //#region GraphNode

  //#region enums
  type SourceEnum = NodeEnum of string  |  RelationshipEnum of string  
  //#endregion
  //#region enums
  type TypeEnum = CreatedEnum of string  |  UpdatedEnum of string  |  DeletedEnum of string  
  //#endregion

  type GraphNode = {
    Id : string;
    Source : SourceEnum;
    Specversion : string;
    Type : TypeEnum;
    Datacontenttype : string;
    Dataschema : string;
    Subject : string;
    Time : Nullable<DateTime>;
    Data : GraphNodeAllOfData;
    DataBase64 : string;
  }
  //#endregion
