--
-- Mindwm API.
-- Prepared SQL queries for 'GraphRelationship' definition.
--


--
-- SELECT template for table `GraphRelationship`
--
SELECT `id`, `source`, `specversion`, `type`, `datacontenttype`, `dataschema`, `subject`, `time`, `data`, `data_base64` FROM `GraphRelationship` WHERE 1;

--
-- INSERT template for table `GraphRelationship`
--
INSERT INTO `GraphRelationship`(`id`, `source`, `specversion`, `type`, `datacontenttype`, `dataschema`, `subject`, `time`, `data`, `data_base64`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GraphRelationship`
--
UPDATE `GraphRelationship` SET `id` = ?, `source` = ?, `specversion` = ?, `type` = ?, `datacontenttype` = ?, `dataschema` = ?, `subject` = ?, `time` = ?, `data` = ?, `data_base64` = ? WHERE 1;

--
-- DELETE template for table `GraphRelationship`
--
DELETE FROM `GraphRelationship` WHERE 0;

