namespace MindWM.Model

open System
open System.Collections.Generic
open MindWM.Model.AnyType
open MindWM.Model.GraphRelationshipAllOfData
open System.Collections.Generic

module GraphRelationship =

  //#region GraphRelationship

  //#region enums
  type SourceEnum = GraphRelationshipEnum of string  
  //#endregion
  //#region enums
  type TypeEnum = CreatedEnum of string  |  UpdatedEnum of string  |  DeletedEnum of string  
  //#endregion

  type GraphRelationship = {
    Id : string;
    Source : SourceEnum;
    Specversion : string;
    Type : TypeEnum;
    Datacontenttype : string;
    Dataschema : string;
    Subject : string;
    Time : Nullable<DateTime>;
    Data : GraphRelationshipAllOfData;
    DataBase64 : string;
  }
  //#endregion
