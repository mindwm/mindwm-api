--
-- Mindwm API.
-- Prepared SQL queries for 'Neo4jCaptureDataChange_meta_source' definition.
--


--
-- SELECT template for table `Neo4jCaptureDataChange_meta_source`
--
SELECT `hostname` FROM `Neo4jCaptureDataChange_meta_source` WHERE 1;

--
-- INSERT template for table `Neo4jCaptureDataChange_meta_source`
--
INSERT INTO `Neo4jCaptureDataChange_meta_source`(`hostname`) VALUES (?);

--
-- UPDATE template for table `Neo4jCaptureDataChange_meta_source`
--
UPDATE `Neo4jCaptureDataChange_meta_source` SET `hostname` = ? WHERE 1;

--
-- DELETE template for table `Neo4jCaptureDataChange_meta_source`
--
DELETE FROM `Neo4jCaptureDataChange_meta_source` WHERE 0;

