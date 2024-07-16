namespace MindWM.Model

open System
open System.Collections.Generic
open MindWM.Model.Neo4jCaptureDataChangeNodePayloadAfter

module Neo4jCaptureDataChangeNodePayload =

  //#region Neo4jCaptureDataChangeNodePayload


  type Neo4jCaptureDataChangeNodePayload = {
    After : Neo4jCaptureDataChangeNodePayloadAfter;
    Before : string;
    Id : string;
    Type : string;
  }
  //#endregion
