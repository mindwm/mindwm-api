namespace MindWM.Model

open System
open System.Collections.Generic
open MindWM.Model.AnyType
open System.Collections.Generic

module Neo4jCaptureDataChangeSchema =

  //#region Neo4jCaptureDataChangeSchema


  type Neo4jCaptureDataChange_schema = {
    Constraints : IDictionary<string, AnyType>;
    Properties : IDictionary<string, AnyType>;
  }
  //#endregion
