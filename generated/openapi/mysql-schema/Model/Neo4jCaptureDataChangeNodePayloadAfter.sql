--
-- Mindwm API.
-- Prepared SQL queries for 'Neo4jCaptureDataChangeNodePayload_after' definition.
--


--
-- SELECT template for table `Neo4jCaptureDataChangeNodePayload_after`
--
SELECT `labels`, `properties` FROM `Neo4jCaptureDataChangeNodePayload_after` WHERE 1;

--
-- INSERT template for table `Neo4jCaptureDataChangeNodePayload_after`
--
INSERT INTO `Neo4jCaptureDataChangeNodePayload_after`(`labels`, `properties`) VALUES (?, ?);

--
-- UPDATE template for table `Neo4jCaptureDataChangeNodePayload_after`
--
UPDATE `Neo4jCaptureDataChangeNodePayload_after` SET `labels` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `Neo4jCaptureDataChangeNodePayload_after`
--
DELETE FROM `Neo4jCaptureDataChangeNodePayload_after` WHERE 0;

