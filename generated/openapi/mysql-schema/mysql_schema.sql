/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `Clipboard` generated from model 'Clipboard'
--

CREATE TABLE IF NOT EXISTS `Clipboard` (
  `type` TEXT DEFAULT NULL,
  `source` TEXT DEFAULT NULL,
  `data` TEXT DEFAULT NULL,
  `id` TEXT NOT NULL COMMENT 'Identifies the event.',
  `specversion` TEXT NOT NULL COMMENT 'The version of the CloudEvents specification which the event uses.',
  `datacontenttype` TEXT DEFAULT NULL COMMENT 'Content type of the data value. Must adhere to RFC 2046 format.',
  `dataschema` TEXT DEFAULT NULL COMMENT 'Identifies the schema that data adheres to.',
  `subject` TEXT DEFAULT NULL,
  `time` DATETIME DEFAULT NULL COMMENT 'Timestamp of when the occurrence happened. Must adhere to RFC 3339.',
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
  `data` TEXT DEFAULT NULL,
  `data_base64` TEXT DEFAULT NULL COMMENT 'Base64 encoded event payload. Must adhere to RFC4648.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='CloudEvents Specification JSON Schema';

--
-- Table structure for table `IoDocument` generated from model 'IoDocument'
--

CREATE TABLE IF NOT EXISTS `IoDocument` (
  `type` TEXT DEFAULT NULL,
  `source` TEXT DEFAULT NULL,
  `data` TEXT DEFAULT NULL,
  `id` TEXT NOT NULL COMMENT 'Identifies the event.',
  `specversion` TEXT NOT NULL COMMENT 'The version of the CloudEvents specification which the event uses.',
  `datacontenttype` TEXT DEFAULT NULL COMMENT 'Content type of the data value. Must adhere to RFC 2046 format.',
  `dataschema` TEXT DEFAULT NULL COMMENT 'Identifies the schema that data adheres to.',
  `subject` TEXT DEFAULT NULL COMMENT 'Describes the subject of the event in the context of the event producer (identified by source).',
  `time` DATETIME DEFAULT NULL COMMENT 'Timestamp of when the occurrence happened. Must adhere to RFC 3339.',
  `data_base64` TEXT DEFAULT NULL COMMENT 'Base64 encoded event payload. Must adhere to RFC4648.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `TmuxPaneIoDocument` generated from model 'TmuxPaneIoDocument'
--

CREATE TABLE IF NOT EXISTS `TmuxPaneIoDocument` (
  `input` TEXT NOT NULL COMMENT 'User input',
  `output` TEXT NOT NULL COMMENT 'Command output (mix of stdout &amp; stderr)',
  `ps1` TEXT NOT NULL COMMENT 'ps1 (prompt) AFTER the input and output'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


