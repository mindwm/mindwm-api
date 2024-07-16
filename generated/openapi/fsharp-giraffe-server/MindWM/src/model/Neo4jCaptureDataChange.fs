namespace MindWM.Model

open System
open System.Collections.Generic
open MindWM.Model.AnyType
open MindWM.Model.Neo4jCaptureDataChangeMeta
open MindWM.Model.Neo4jCaptureDataChangePayload
open MindWM.Model.Neo4jCaptureDataChangeSchema
open System.Collections.Generic

module Neo4jCaptureDataChange =

  //#region Neo4jCaptureDataChange


  type Neo4jCaptureDataChange = {
    Headers : IDictionary<string, AnyType>;
    MessageKey : string;
    Meta : Neo4jCaptureDataChangeMeta;
    Offset : int;
    Partition : int;
    SourceType : string;
    Timestamp : DateTime;
    Topic : string;
    Schema : Neo4jCaptureDataChangeSchema;
    Payload : Neo4jCaptureDataChangePayload;
  }
  //#endregion
