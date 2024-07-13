--
-- Mindwm API.
-- Prepared SQL queries for 'Neo4jCaptureDataChangeRelationshipPayload_end' definition.
--


--
-- SELECT template for table `Neo4jCaptureDataChangeRelationshipPayload_end`
--
SELECT `id`, `ids`, `labels` FROM `Neo4jCaptureDataChangeRelationshipPayload_end` WHERE 1;

--
-- INSERT template for table `Neo4jCaptureDataChangeRelationshipPayload_end`
--
INSERT INTO `Neo4jCaptureDataChangeRelationshipPayload_end`(`id`, `ids`, `labels`) VALUES (?, ?, ?);

--
-- UPDATE template for table `Neo4jCaptureDataChangeRelationshipPayload_end`
--
UPDATE `Neo4jCaptureDataChangeRelationshipPayload_end` SET `id` = ?, `ids` = ?, `labels` = ? WHERE 1;

--
-- DELETE template for table `Neo4jCaptureDataChangeRelationshipPayload_end`
--
DELETE FROM `Neo4jCaptureDataChangeRelationshipPayload_end` WHERE 0;

