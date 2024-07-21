

-- --------------------------------------------------------------------------
-- Table structure for table `Clipboard` generated from model 'clipboard'
--

CREATE TABLE IF NOT EXISTS `Clipboard` (
  `id` text NOT NULL PRIMARY KEY /*Identifies the event.*/,
  `source` text NOT NULL,
  `specversion` text NOT NULL /*The version of the CloudEvents specification which the event uses.*/,
  `type` text NOT NULL,
  `datacontenttype` text /*Content type of the data value. Must adhere to RFC 2046 format.*/,
  `dataschema` text /*Identifies the schema that data adheres to.*/,
  `subject` text,
  `time` datetime /*Timestamp of when the occurrence happened. Must adhere to RFC 3339.*/,
  `data` long,
  `data_base64` text /*Base64 encoded event payload. Must adhere to RFC4648.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ClipboardPayload` generated from model 'clipboardPayload'
--

CREATE TABLE IF NOT EXISTS `ClipboardPayload` (
  `data` text /*Clipboard data*/,
  `type` text /*Clipboard type*/,
  `context` long
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ClipboardPayloadStart` generated from model 'ClipboardPayloadStart'

CREATE TABLE IF NOT EXISTS `ClipboardPayloadStart` (
  `clipboardPayload` long NOT NULL
  `start` int NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ClipboardPayloadStop` generated from model 'ClipboardPayloadStop'

CREATE TABLE IF NOT EXISTS `ClipboardPayloadStop` (
  `clipboardPayload` long NOT NULL
  `stop` int NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `ClipboardPayload_context` generated from model 'clipboardPayloadContext'
-- Selection context
--

CREATE TABLE IF NOT EXISTS `ClipboardPayload_context` (
  `window` text /*window id*/
);  /*Selection context*/


-- --------------------------------------------------------------------------
-- Table structure for table `CloudEvent` generated from model 'cloudEvent'
-- CloudEvents Specification JSON Schema
--

CREATE TABLE IF NOT EXISTS `CloudEvent` (
  `id` text NOT NULL PRIMARY KEY /*Identifies the event.*/,
  `source` text NOT NULL /*Identifies the context in which an event happened.*/,
  `specversion` text NOT NULL /*The version of the CloudEvents specification which the event uses.*/,
  `type` text NOT NULL /*Describes the type of event related to the originating occurrence.*/,
  `datacontenttype` text /*Content type of the data value. Must adhere to RFC 2046 format.*/,
  `dataschema` text /*Identifies the schema that data adheres to.*/,
  `subject` text /*Describes the subject of the event in the context of the event producer (identified by source).*/,
  `time` datetime /*Timestamp of when the occurrence happened. Must adhere to RFC 3339.*/,
  `data` blob /*The event payload.*/,
  `data_base64` text /*Base64 encoded event payload. Must adhere to RFC4648.*/
);  /*CloudEvents Specification JSON Schema*/


-- --------------------------------------------------------------------------
-- Table structure for table `GraphNode` generated from model 'graphNode'
--

CREATE TABLE IF NOT EXISTS `GraphNode` (
  `id` text NOT NULL PRIMARY KEY /*Identifies the event.*/,
  `source` text NOT NULL,
  `specversion` text NOT NULL /*The version of the CloudEvents specification which the event uses.*/,
  `type` text NOT NULL,
  `datacontenttype` text /*Content type of the data value. Must adhere to RFC 2046 format.*/,
  `dataschema` text /*Identifies the schema that data adheres to.*/,
  `subject` text /*Describes the subject of the event in the context of the event producer (identified by source).*/,
  `time` datetime /*Timestamp of when the occurrence happened. Must adhere to RFC 3339.*/,
  `data` long,
  `data_base64` text /*Base64 encoded event payload. Must adhere to RFC4648.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GraphNode_allOf_data` generated from model 'graphNodeAllOfData'
--

CREATE TABLE IF NOT EXISTS `GraphNode_allOf_data` (
  `headers` blob NOT NULL,
  `message_key` text NOT NULL,
  `meta` long NOT NULL,
  `offset` int NOT NULL,
  `partition` int NOT NULL,
  `source_type` text NOT NULL,
  `timestamp` datetime NOT NULL,
  `topic` text NOT NULL,
  `schema` long NOT NULL,
  `payload` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GraphRelationship` generated from model 'graphRelationship'
--

CREATE TABLE IF NOT EXISTS `GraphRelationship` (
  `id` text NOT NULL PRIMARY KEY /*Identifies the event.*/,
  `source` text NOT NULL,
  `specversion` text NOT NULL /*The version of the CloudEvents specification which the event uses.*/,
  `type` text NOT NULL,
  `datacontenttype` text /*Content type of the data value. Must adhere to RFC 2046 format.*/,
  `dataschema` text /*Identifies the schema that data adheres to.*/,
  `subject` text /*Describes the subject of the event in the context of the event producer (identified by source).*/,
  `time` datetime /*Timestamp of when the occurrence happened. Must adhere to RFC 3339.*/,
  `data` long,
  `data_base64` text /*Base64 encoded event payload. Must adhere to RFC4648.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `GraphRelationship_allOf_data` generated from model 'graphRelationshipAllOfData'
--

CREATE TABLE IF NOT EXISTS `GraphRelationship_allOf_data` (
  `headers` blob NOT NULL,
  `message_key` text NOT NULL,
  `meta` long NOT NULL,
  `offset` int NOT NULL,
  `partition` int NOT NULL,
  `source_type` text NOT NULL,
  `timestamp` datetime NOT NULL,
  `topic` text NOT NULL,
  `schema` long NOT NULL,
  `payload` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `IoDocument` generated from model 'ioDocument'
--

CREATE TABLE IF NOT EXISTS `IoDocument` (
  `id` text NOT NULL PRIMARY KEY /*Identifies the event.*/,
  `source` text NOT NULL,
  `specversion` text NOT NULL /*The version of the CloudEvents specification which the event uses.*/,
  `type` text NOT NULL,
  `datacontenttype` text /*Content type of the data value. Must adhere to RFC 2046 format.*/,
  `dataschema` text /*Identifies the schema that data adheres to.*/,
  `subject` text,
  `time` datetime /*Timestamp of when the occurrence happened. Must adhere to RFC 3339.*/,
  `data` long,
  `data_base64` text /*Base64 encoded event payload. Must adhere to RFC4648.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Neo4jCaptureDataChange` generated from model 'neo4jCaptureDataChange'
--

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChange` (
  `headers` blob NOT NULL,
  `message_key` text NOT NULL,
  `meta` long NOT NULL,
  `offset` int NOT NULL,
  `partition` int NOT NULL,
  `source_type` text NOT NULL,
  `timestamp` datetime NOT NULL,
  `topic` text NOT NULL,
  `schema` long NOT NULL,
  `payload` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Neo4jCaptureDataChange_meta` generated from model 'neo4jCaptureDataChangeMeta'
--

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChange_meta` (
  `operation` text NOT NULL,
  `source` long NOT NULL,
  `timestamp` int NOT NULL,
  `txEventId` int NOT NULL,
  `txEventsCount` int NOT NULL,
  `txId` int NOT NULL,
  `username` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Neo4jCaptureDataChange_meta_source` generated from model 'neo4jCaptureDataChangeMetaSource'
--

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChange_meta_source` (
  `hostname` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Neo4jCaptureDataChangeNodePayload` generated from model 'neo4jCaptureDataChangeNodePayload'
--

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChangeNodePayload` (
  `after` long NOT NULL,
  `before` text NOT NULL,
  `id` text NOT NULL PRIMARY KEY,
  `type` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Neo4jCaptureDataChangeNodePayload_after` generated from model 'neo4jCaptureDataChangeNodePayloadAfter'
--

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChangeNodePayload_after` (
  `properties` blob NOT NULL
); 

-- --------------------------------------------------------------------------
-- Table structure for table `Neo4jCaptureDataChangeNodePayloadAfterLabels` generated from model 'Neo4jCaptureDataChangeNodePayloadAfterLabels'

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChangeNodePayloadAfterLabels` (
  `neo4jCaptureDataChangeNodePayloadAfter` long NOT NULL
  `labels` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `Neo4jCaptureDataChange_payload` generated from model 'neo4jCaptureDataChangePayload'
--

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChange_payload` (
  `after` blob NOT NULL,
  `before` text NOT NULL,
  `id` text NOT NULL PRIMARY KEY,
  `type` text NOT NULL,
  `end` long NOT NULL,
  `label` text NOT NULL,
  `start` long NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Neo4jCaptureDataChangeRelationshipPayload` generated from model 'neo4jCaptureDataChangeRelationshipPayload'
--

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChangeRelationshipPayload` (
  `after` blob NOT NULL,
  `before` text NOT NULL,
  `end` long NOT NULL,
  `id` text NOT NULL PRIMARY KEY,
  `label` text NOT NULL,
  `start` long NOT NULL,
  `type` text NOT NULL
); 


-- --------------------------------------------------------------------------
-- Table structure for table `Neo4jCaptureDataChangeRelationshipPayload_end` generated from model 'neo4jCaptureDataChangeRelationshipPayloadEnd'
--

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChangeRelationshipPayload_end` (
  `id` text NOT NULL PRIMARY KEY,
  `ids` blob NOT NULL,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `Neo4jCaptureDataChangeRelationshipPayloadEndLabels` generated from model 'Neo4jCaptureDataChangeRelationshipPayloadEndLabels'

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChangeRelationshipPayloadEndLabels` (
  `neo4jCaptureDataChangeRelationshipPayloadEnd` long NOT NULL
  `labels` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `Neo4jCaptureDataChange_schema` generated from model 'neo4jCaptureDataChangeSchema'
--

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChange_schema` (
  `constraints` blob,
  `properties` blob
); 


-- --------------------------------------------------------------------------
-- Table structure for table `TmuxPaneIoDocument` generated from model 'tmuxPaneIoDocument'
--

CREATE TABLE IF NOT EXISTS `TmuxPaneIoDocument` (
  `input` text NOT NULL /*User input*/,
  `output` text NOT NULL /*Command output (mix of stdout &amp; stderr)*/,
  `ps1` text NOT NULL /*ps1 (prompt) AFTER the input and output*/
); 



--
-- Table structure for table `_db_version`
--
CREATE TABLE IF NOT EXISTS `_db_version` (
  `version`    LONG    DEFAULT 1
);
