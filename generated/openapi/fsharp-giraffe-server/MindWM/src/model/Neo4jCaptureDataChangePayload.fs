namespace MindWM.Model

open System
open System.Collections.Generic
open MindWM.Model.Neo4jCaptureDataChangeNodePayload
open MindWM.Model.Neo4jCaptureDataChangeRelationshipPayload
open MindWM.Model.Neo4jCaptureDataChangeRelationshipPayloadEnd

module Neo4jCaptureDataChangePayload =

  //#region Neo4jCaptureDataChangePayload


  type Neo4jCaptureDataChange_payload = {
    After : obj;
    Before : string;
    Id : string;
    Type : string;
    End : Neo4jCaptureDataChangeRelationshipPayloadEnd;
    Label : string;
    Start : Neo4jCaptureDataChangeRelationshipPayloadEnd;
  }
  //#endregion
