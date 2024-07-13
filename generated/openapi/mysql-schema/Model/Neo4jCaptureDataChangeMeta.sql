--
-- Mindwm API.
-- Prepared SQL queries for 'Neo4jCaptureDataChange_meta' definition.
--


--
-- SELECT template for table `Neo4jCaptureDataChange_meta`
--
SELECT `operation`, `source`, `timestamp`, `txEventId`, `txEventsCount`, `txId`, `username` FROM `Neo4jCaptureDataChange_meta` WHERE 1;

--
-- INSERT template for table `Neo4jCaptureDataChange_meta`
--
INSERT INTO `Neo4jCaptureDataChange_meta`(`operation`, `source`, `timestamp`, `txEventId`, `txEventsCount`, `txId`, `username`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Neo4jCaptureDataChange_meta`
--
UPDATE `Neo4jCaptureDataChange_meta` SET `operation` = ?, `source` = ?, `timestamp` = ?, `txEventId` = ?, `txEventsCount` = ?, `txId` = ?, `username` = ? WHERE 1;

--
-- DELETE template for table `Neo4jCaptureDataChange_meta`
--
DELETE FROM `Neo4jCaptureDataChange_meta` WHERE 0;

