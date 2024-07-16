namespace MindWM.Model

open System
open System.Collections.Generic
open MindWM.Model.Neo4jCaptureDataChangeMeta
open MindWM.Model.Neo4jCaptureDataChangeNodePayload
open MindWM.Model.Neo4jCaptureDataChangeSchema

module GraphNodeAllOfData =

  //#region GraphNodeAllOfData


  type GraphNode_allOf_data = {
    Headers : obj;
    MessageKey : string;
    Meta : Neo4jCaptureDataChangeMeta;
    Offset : int;
    Partition : int;
    SourceType : string;
    Timestamp : DateTime;
    Topic : string;
    Schema : Neo4jCaptureDataChangeSchema;
    Payload : Neo4jCaptureDataChangeNodePayload;
  }
  //#endregion
