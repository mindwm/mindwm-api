--
-- Mindwm API.
-- Prepared SQL queries for 'GraphNode_allOf_data' definition.
--


--
-- SELECT template for table `GraphNode_allOf_data`
--
SELECT `headers`, `message_key`, `meta`, `offset`, `partition`, `source_type`, `timestamp`, `topic`, `schema`, `payload` FROM `GraphNode_allOf_data` WHERE 1;

--
-- INSERT template for table `GraphNode_allOf_data`
--
INSERT INTO `GraphNode_allOf_data`(`headers`, `message_key`, `meta`, `offset`, `partition`, `source_type`, `timestamp`, `topic`, `schema`, `payload`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GraphNode_allOf_data`
--
UPDATE `GraphNode_allOf_data` SET `headers` = ?, `message_key` = ?, `meta` = ?, `offset` = ?, `partition` = ?, `source_type` = ?, `timestamp` = ?, `topic` = ?, `schema` = ?, `payload` = ? WHERE 1;

--
-- DELETE template for table `GraphNode_allOf_data`
--
DELETE FROM `GraphNode_allOf_data` WHERE 0;

