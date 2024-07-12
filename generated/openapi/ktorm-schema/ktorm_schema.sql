

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
  `data` long,
  `data_base64` text /*Base64 encoded event payload. Must adhere to RFC4648.*/
);  /*CloudEvents Specification JSON Schema*/


-- --------------------------------------------------------------------------
-- Table structure for table `IoDocument` generated from model 'ioDocument'
--

CREATE TABLE IF NOT EXISTS `IoDocument` (
  `id` text NOT NULL PRIMARY KEY /*Identifies the event.*/,
  `source` text NOT NULL /*Identifies the context in which an event happened.*/,
  `specversion` text NOT NULL /*The version of the CloudEvents specification which the event uses.*/,
  `type` text NOT NULL /*Describes the type of event related to the originating occurrence.*/,
  `datacontenttype` text /*Content type of the data value. Must adhere to RFC 2046 format.*/,
  `dataschema` text /*Identifies the schema that data adheres to.*/,
  `subject` text /*Describes the subject of the event in the context of the event producer (identified by source).*/,
  `time` datetime /*Timestamp of when the occurrence happened. Must adhere to RFC 3339.*/,
  `data` long,
  `data_base64` text /*Base64 encoded event payload. Must adhere to RFC4648.*/
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
