--
-- Mindwm API.
-- Prepared SQL queries for 'Neo4jCaptureDataChange' definition.
--


--
-- SELECT template for table `Neo4jCaptureDataChange`
--
SELECT `headers`, `message_key`, `meta`, `offset`, `partition`, `source_type`, `timestamp`, `topic`, `schema`, `payload` FROM `Neo4jCaptureDataChange` WHERE 1;

--
-- INSERT template for table `Neo4jCaptureDataChange`
--
INSERT INTO `Neo4jCaptureDataChange`(`headers`, `message_key`, `meta`, `offset`, `partition`, `source_type`, `timestamp`, `topic`, `schema`, `payload`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Neo4jCaptureDataChange`
--
UPDATE `Neo4jCaptureDataChange` SET `headers` = ?, `message_key` = ?, `meta` = ?, `offset` = ?, `partition` = ?, `source_type` = ?, `timestamp` = ?, `topic` = ?, `schema` = ?, `payload` = ? WHERE 1;

--
-- DELETE template for table `Neo4jCaptureDataChange`
--
DELETE FROM `Neo4jCaptureDataChange` WHERE 0;

