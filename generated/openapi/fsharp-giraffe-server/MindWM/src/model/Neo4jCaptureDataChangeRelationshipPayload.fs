namespace MindWM.Model

open System
open System.Collections.Generic
open MindWM.Model.Neo4jCaptureDataChangeRelationshipPayloadEnd

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
