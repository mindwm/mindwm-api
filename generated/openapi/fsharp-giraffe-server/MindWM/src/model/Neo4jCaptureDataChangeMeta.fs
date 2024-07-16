namespace MindWM.Model

open System
open System.Collections.Generic
open MindWM.Model.Neo4jCaptureDataChangeMetaSource

module Neo4jCaptureDataChangeMeta =

  //#region Neo4jCaptureDataChangeMeta


  type Neo4jCaptureDataChange_meta = {
    Operation : string;
    Source : Neo4jCaptureDataChangeMetaSource;
    Timestamp : int;
    TxEventId : int;
    TxEventsCount : int;
    TxId : int;
    Username : string;
  }
  //#endregion
