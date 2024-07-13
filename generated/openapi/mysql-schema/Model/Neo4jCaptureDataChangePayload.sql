--
-- Mindwm API.
-- Prepared SQL queries for 'Neo4jCaptureDataChange_payload' definition.
--


--
-- SELECT template for table `Neo4jCaptureDataChange_payload`
--
SELECT `after`, `before`, `id`, `type`, `end`, `label`, `start` FROM `Neo4jCaptureDataChange_payload` WHERE 1;

--
-- INSERT template for table `Neo4jCaptureDataChange_payload`
--
INSERT INTO `Neo4jCaptureDataChange_payload`(`after`, `before`, `id`, `type`, `end`, `label`, `start`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Neo4jCaptureDataChange_payload`
--
UPDATE `Neo4jCaptureDataChange_payload` SET `after` = ?, `before` = ?, `id` = ?, `type` = ?, `end` = ?, `label` = ?, `start` = ? WHERE 1;

--
-- DELETE template for table `Neo4jCaptureDataChange_payload`
--
DELETE FROM `Neo4jCaptureDataChange_payload` WHERE 0;

