namespace MindwWM.Model

open System
open System.Collections.Generic
open MindwWM.Model.AnyType
open System.Collections.Generic

module Neo4jCaptureDataChangeRelationshipPayloadEnd =

  //#region Neo4jCaptureDataChangeRelationshipPayloadEnd


  type Neo4jCaptureDataChangeRelationshipPayload_end = {
    Id : string;
    Ids : IDictionary<string, AnyType>;
    Labels : string[];
  }
  //#endregion
