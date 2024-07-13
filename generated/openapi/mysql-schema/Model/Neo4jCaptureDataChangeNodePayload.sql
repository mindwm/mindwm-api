--
-- Mindwm API.
-- Prepared SQL queries for 'Neo4jCaptureDataChangeNodePayload' definition.
--


--
-- SELECT template for table `Neo4jCaptureDataChangeNodePayload`
--
SELECT `after`, `before`, `id`, `type` FROM `Neo4jCaptureDataChangeNodePayload` WHERE 1;

--
-- INSERT template for table `Neo4jCaptureDataChangeNodePayload`
--
INSERT INTO `Neo4jCaptureDataChangeNodePayload`(`after`, `before`, `id`, `type`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `Neo4jCaptureDataChangeNodePayload`
--
UPDATE `Neo4jCaptureDataChangeNodePayload` SET `after` = ?, `before` = ?, `id` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `Neo4jCaptureDataChangeNodePayload`
--
DELETE FROM `Neo4jCaptureDataChangeNodePayload` WHERE 0;

