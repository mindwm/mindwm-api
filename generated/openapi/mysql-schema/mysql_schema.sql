/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `Clipboard` generated from model 'Clipboard'
--

CREATE TABLE IF NOT EXISTS `Clipboard` (
  `id` TEXT NOT NULL COMMENT 'Identifies the event.',
  `source` TEXT NOT NULL,
  `specversion` TEXT NOT NULL COMMENT 'The version of the CloudEvents specification which the event uses.',
  `type` TEXT NOT NULL,
  `datacontenttype` TEXT DEFAULT NULL COMMENT 'Content type of the data value. Must adhere to RFC 2046 format.',
  `dataschema` TEXT DEFAULT NULL COMMENT 'Identifies the schema that data adheres to.',
  `subject` TEXT DEFAULT NULL,
  `time` DATETIME DEFAULT NULL COMMENT 'Timestamp of when the occurrence happened. Must adhere to RFC 3339.',
  `data` TEXT DEFAULT NULL,
  `data_base64` TEXT DEFAULT NULL COMMENT 'Base64 encoded event payload. Must adhere to RFC4648.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ClipboardPayload` generated from model 'ClipboardPayload'
--

CREATE TABLE IF NOT EXISTS `ClipboardPayload` (
  `start` JSON DEFAULT NULL COMMENT 'Starting position of clipboard selection [x,y]',
  `stop` JSON DEFAULT NULL COMMENT 'Ending position of clipboard selection [x,y]',
  `data` TEXT DEFAULT NULL COMMENT 'Clipboard data',
  `type` ENUM('primary', 'secondary', 'clipboard') DEFAULT NULL COMMENT 'Clipboard type',
  `context` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ClipboardPayload_context` generated from model 'ClipboardPayloadUnderscorecontext'
-- Selection context
--

CREATE TABLE IF NOT EXISTS `ClipboardPayload_context` (
  `window` TEXT DEFAULT NULL COMMENT 'window id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='Selection context';

--
-- Table structure for table `CloudEvent` generated from model 'CloudEvent'
-- CloudEvents Specification JSON Schema
--

CREATE TABLE IF NOT EXISTS `CloudEvent` (
  `id` TEXT NOT NULL COMMENT 'Identifies the event.',
  `source` TEXT NOT NULL COMMENT 'Identifies the context in which an event happened.',
  `specversion` TEXT NOT NULL COMMENT 'The version of the CloudEvents specification which the event uses.',
  `type` TEXT NOT NULL COMMENT 'Describes the type of event related to the originating occurrence.',
  `datacontenttype` TEXT DEFAULT NULL COMMENT 'Content type of the data value. Must adhere to RFC 2046 format.',
  `dataschema` TEXT DEFAULT NULL COMMENT 'Identifies the schema that data adheres to.',
  `subject` TEXT DEFAULT NULL COMMENT 'Describes the subject of the event in the context of the event producer (identified by source).',
  `time` DATETIME DEFAULT NULL COMMENT 'Timestamp of when the occurrence happened. Must adhere to RFC 3339.',
  `data` JSON DEFAULT NULL COMMENT 'The event payload.',
  `data_base64` TEXT DEFAULT NULL COMMENT 'Base64 encoded event payload. Must adhere to RFC4648.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='CloudEvents Specification JSON Schema';

--
-- Table structure for table `GraphNode` generated from model 'GraphNode'
--

CREATE TABLE IF NOT EXISTS `GraphNode` (
  `id` TEXT NOT NULL COMMENT 'Identifies the event.',
  `source` ENUM('graph.node', 'graph.relationship') NOT NULL,
  `specversion` TEXT NOT NULL COMMENT 'The version of the CloudEvents specification which the event uses.',
  `type` ENUM('created', 'updated', 'deleted') NOT NULL,
  `datacontenttype` TEXT DEFAULT NULL COMMENT 'Content type of the data value. Must adhere to RFC 2046 format.',
  `dataschema` TEXT DEFAULT NULL COMMENT 'Identifies the schema that data adheres to.',
  `subject` TEXT DEFAULT NULL COMMENT 'Describes the subject of the event in the context of the event producer (identified by source).',
  `time` DATETIME DEFAULT NULL COMMENT 'Timestamp of when the occurrence happened. Must adhere to RFC 3339.',
  `data` TEXT DEFAULT NULL,
  `data_base64` TEXT DEFAULT NULL COMMENT 'Base64 encoded event payload. Must adhere to RFC4648.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GraphNode_allOf_data` generated from model 'GraphNodeUnderscoreallOfUnderscoredata'
--

CREATE TABLE IF NOT EXISTS `GraphNode_allOf_data` (
  `headers` JSON NOT NULL,
  `message_key` TEXT NOT NULL,
  `meta` TEXT NOT NULL,
  `offset` INT NOT NULL,
  `partition` INT NOT NULL,
  `source_type` TEXT NOT NULL,
  `timestamp` DATETIME NOT NULL,
  `topic` TEXT NOT NULL,
  `schema` TEXT NOT NULL,
  `payload` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GraphRelationship` generated from model 'GraphRelationship'
--

CREATE TABLE IF NOT EXISTS `GraphRelationship` (
  `id` TEXT NOT NULL COMMENT 'Identifies the event.',
  `source` ENUM('graph.relationship') NOT NULL,
  `specversion` TEXT NOT NULL COMMENT 'The version of the CloudEvents specification which the event uses.',
  `type` ENUM('created', 'updated', 'deleted') NOT NULL,
  `datacontenttype` TEXT DEFAULT NULL COMMENT 'Content type of the data value. Must adhere to RFC 2046 format.',
  `dataschema` TEXT DEFAULT NULL COMMENT 'Identifies the schema that data adheres to.',
  `subject` TEXT DEFAULT NULL COMMENT 'Describes the subject of the event in the context of the event producer (identified by source).',
  `time` DATETIME DEFAULT NULL COMMENT 'Timestamp of when the occurrence happened. Must adhere to RFC 3339.',
  `data` TEXT DEFAULT NULL,
  `data_base64` TEXT DEFAULT NULL COMMENT 'Base64 encoded event payload. Must adhere to RFC4648.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `GraphRelationship_allOf_data` generated from model 'GraphRelationshipUnderscoreallOfUnderscoredata'
--

CREATE TABLE IF NOT EXISTS `GraphRelationship_allOf_data` (
  `headers` JSON NOT NULL,
  `message_key` TEXT NOT NULL,
  `meta` TEXT NOT NULL,
  `offset` INT NOT NULL,
  `partition` INT NOT NULL,
  `source_type` TEXT NOT NULL,
  `timestamp` DATETIME NOT NULL,
  `topic` TEXT NOT NULL,
  `schema` TEXT NOT NULL,
  `payload` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `IoDocument` generated from model 'IoDocument'
--

CREATE TABLE IF NOT EXISTS `IoDocument` (
  `id` TEXT NOT NULL COMMENT 'Identifies the event.',
  `source` TEXT NOT NULL,
  `specversion` TEXT NOT NULL COMMENT 'The version of the CloudEvents specification which the event uses.',
  `type` TEXT NOT NULL,
  `datacontenttype` TEXT DEFAULT NULL COMMENT 'Content type of the data value. Must adhere to RFC 2046 format.',
  `dataschema` TEXT DEFAULT NULL COMMENT 'Identifies the schema that data adheres to.',
  `subject` TEXT,
  `time` DATETIME DEFAULT NULL COMMENT 'Timestamp of when the occurrence happened. Must adhere to RFC 3339.',
  `data` TEXT DEFAULT NULL,
  `data_base64` TEXT DEFAULT NULL COMMENT 'Base64 encoded event payload. Must adhere to RFC4648.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Neo4jCaptureDataChange` generated from model 'Neo4jCaptureDataChange'
--

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChange` (
  `headers` JSON NOT NULL,
  `message_key` TEXT NOT NULL,
  `meta` TEXT NOT NULL,
  `offset` INT NOT NULL,
  `partition` INT NOT NULL,
  `source_type` TEXT NOT NULL,
  `timestamp` DATETIME NOT NULL,
  `topic` TEXT NOT NULL,
  `schema` TEXT NOT NULL,
  `payload` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Neo4jCaptureDataChange_meta` generated from model 'Neo4jCaptureDataChangeUnderscoremeta'
--

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChange_meta` (
  `operation` TEXT NOT NULL,
  `source` TEXT NOT NULL,
  `timestamp` INT NOT NULL,
  `txEventId` INT NOT NULL,
  `txEventsCount` INT NOT NULL,
  `txId` INT NOT NULL,
  `username` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Neo4jCaptureDataChange_meta_source` generated from model 'Neo4jCaptureDataChangeUnderscoremetaUnderscoresource'
--

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChange_meta_source` (
  `hostname` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Neo4jCaptureDataChangeNodePayload` generated from model 'Neo4jCaptureDataChangeNodePayload'
--

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChangeNodePayload` (
  `after` TEXT NOT NULL,
  `before` TEXT NOT NULL,
  `id` TEXT NOT NULL,
  `type` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Neo4jCaptureDataChangeNodePayload_after` generated from model 'Neo4jCaptureDataChangeNodePayloadUnderscoreafter'
--

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChangeNodePayload_after` (
  `labels` JSON NOT NULL,
  `properties` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Neo4jCaptureDataChange_payload` generated from model 'Neo4jCaptureDataChangeUnderscorepayload'
--

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChange_payload` (
  `after` JSON NOT NULL,
  `before` TEXT NOT NULL,
  `id` TEXT NOT NULL,
  `type` TEXT NOT NULL,
  `end` TEXT NOT NULL,
  `label` TEXT NOT NULL,
  `start` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Neo4jCaptureDataChangeRelationshipPayload` generated from model 'Neo4jCaptureDataChangeRelationshipPayload'
--

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChangeRelationshipPayload` (
  `after` JSON NOT NULL,
  `before` TEXT NOT NULL,
  `end` TEXT NOT NULL,
  `id` TEXT NOT NULL,
  `label` TEXT NOT NULL,
  `start` TEXT NOT NULL,
  `type` TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Neo4jCaptureDataChangeRelationshipPayload_end` generated from model 'Neo4jCaptureDataChangeRelationshipPayloadUnderscoreend'
--

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChangeRelationshipPayload_end` (
  `id` TEXT NOT NULL,
  `ids` JSON NOT NULL,
  `labels` JSON NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Neo4jCaptureDataChange_schema` generated from model 'Neo4jCaptureDataChangeUnderscoreschema'
--

CREATE TABLE IF NOT EXISTS `Neo4jCaptureDataChange_schema` (
  `constraints` JSON DEFAULT NULL,
  `properties` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TmuxPaneIoDocument` generated from model 'TmuxPaneIoDocument'
--

CREATE TABLE IF NOT EXISTS `TmuxPaneIoDocument` (
  `input` TEXT NOT NULL COMMENT 'User input',
  `output` TEXT NOT NULL COMMENT 'Command output (mix of stdout &amp; stderr)',
  `ps1` TEXT NOT NULL COMMENT 'ps1 (prompt) AFTER the input and output'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


