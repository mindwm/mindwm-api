namespace MindwWM.Model

open System
open System.Collections.Generic
open MindwWM.Model.Neo4jCaptureDataChangeMeta
open MindwWM.Model.Neo4jCaptureDataChangeRelationshipPayload
open MindwWM.Model.Neo4jCaptureDataChangeSchema

module GraphRelationshipAllOfData =

  //#region GraphRelationshipAllOfData


  type GraphRelationship_allOf_data = {
    Headers : obj;
    MessageKey : string;
    Meta : Neo4jCaptureDataChangeMeta;
    Offset : int;
    Partition : int;
    SourceType : string;
    Timestamp : DateTime;
    Topic : string;
    Schema : Neo4jCaptureDataChangeSchema;
    Payload : Neo4jCaptureDataChangeRelationshipPayload;
  }
  //#endregion
