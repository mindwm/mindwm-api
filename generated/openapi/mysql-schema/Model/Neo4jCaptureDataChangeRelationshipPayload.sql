--
-- Mindwm API.
-- Prepared SQL queries for 'Neo4jCaptureDataChangeRelationshipPayload' definition.
--


--
-- SELECT template for table `Neo4jCaptureDataChangeRelationshipPayload`
--
SELECT `after`, `before`, `end`, `id`, `label`, `start`, `type` FROM `Neo4jCaptureDataChangeRelationshipPayload` WHERE 1;

--
-- INSERT template for table `Neo4jCaptureDataChangeRelationshipPayload`
--
INSERT INTO `Neo4jCaptureDataChangeRelationshipPayload`(`after`, `before`, `end`, `id`, `label`, `start`, `type`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Neo4jCaptureDataChangeRelationshipPayload`
--
UPDATE `Neo4jCaptureDataChangeRelationshipPayload` SET `after` = ?, `before` = ?, `end` = ?, `id` = ?, `label` = ?, `start` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `Neo4jCaptureDataChangeRelationshipPayload`
--
DELETE FROM `Neo4jCaptureDataChangeRelationshipPayload` WHERE 0;

