--
-- Mindwm API.
-- Prepared SQL queries for 'Neo4jCaptureDataChange_schema' definition.
--


--
-- SELECT template for table `Neo4jCaptureDataChange_schema`
--
SELECT `constraints`, `properties` FROM `Neo4jCaptureDataChange_schema` WHERE 1;

--
-- INSERT template for table `Neo4jCaptureDataChange_schema`
--
INSERT INTO `Neo4jCaptureDataChange_schema`(`constraints`, `properties`) VALUES (?, ?);

--
-- UPDATE template for table `Neo4jCaptureDataChange_schema`
--
UPDATE `Neo4jCaptureDataChange_schema` SET `constraints` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `Neo4jCaptureDataChange_schema`
--
DELETE FROM `Neo4jCaptureDataChange_schema` WHERE 0;

