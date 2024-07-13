namespace MindwWM.Model

open System
open System.Collections.Generic
open MindwWM.Model.Neo4jCaptureDataChangeRelationshipPayloadEnd

module Neo4jCaptureDataChangeRelationshipPayload =

  //#region Neo4jCaptureDataChangeRelationshipPayload


  type Neo4jCaptureDataChangeRelationshipPayload = {
    After : obj;
    Before : string;
    End : Neo4jCaptureDataChangeRelationshipPayloadEnd;
    Id : string;
    Label : string;
    Start : Neo4jCaptureDataChangeRelationshipPayloadEnd;
    Type : string;
  }
  //#endregion
