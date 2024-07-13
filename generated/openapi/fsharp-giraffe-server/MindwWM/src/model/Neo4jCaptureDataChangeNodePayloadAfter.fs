namespace MindwWM.Model

open System
open System.Collections.Generic
open MindwWM.Model.AnyType
open System.Collections.Generic

module Neo4jCaptureDataChangeNodePayloadAfter =

  //#region Neo4jCaptureDataChangeNodePayloadAfter


  type Neo4jCaptureDataChangeNodePayload_after = {
    Labels : string[];
    Properties : IDictionary<string, AnyType>;
  }
  //#endregion
