--
-- Mindwm API.
-- Prepared SQL queries for 'GraphRelationship_allOf_data' definition.
--


--
-- SELECT template for table `GraphRelationship_allOf_data`
--
SELECT `headers`, `message_key`, `meta`, `offset`, `partition`, `source_type`, `timestamp`, `topic`, `schema`, `payload` FROM `GraphRelationship_allOf_data` WHERE 1;

--
-- INSERT template for table `GraphRelationship_allOf_data`
--
INSERT INTO `GraphRelationship_allOf_data`(`headers`, `message_key`, `meta`, `offset`, `partition`, `source_type`, `timestamp`, `topic`, `schema`, `payload`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GraphRelationship_allOf_data`
--
UPDATE `GraphRelationship_allOf_data` SET `headers` = ?, `message_key` = ?, `meta` = ?, `offset` = ?, `partition` = ?, `source_type` = ?, `timestamp` = ?, `topic` = ?, `schema` = ?, `payload` = ? WHERE 1;

--
-- DELETE template for table `GraphRelationship_allOf_data`
--
DELETE FROM `GraphRelationship_allOf_data` WHERE 0;

