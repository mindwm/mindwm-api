--
-- Mindwm API.
-- Prepared SQL queries for 'GraphNode' definition.
--


--
-- SELECT template for table `GraphNode`
--
SELECT `id`, `source`, `specversion`, `type`, `datacontenttype`, `dataschema`, `subject`, `time`, `data`, `data_base64` FROM `GraphNode` WHERE 1;

--
-- INSERT template for table `GraphNode`
--
INSERT INTO `GraphNode`(`id`, `source`, `specversion`, `type`, `datacontenttype`, `dataschema`, `subject`, `time`, `data`, `data_base64`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `GraphNode`
--
UPDATE `GraphNode` SET `id` = ?, `source` = ?, `specversion` = ?, `type` = ?, `datacontenttype` = ?, `dataschema` = ?, `subject` = ?, `time` = ?, `data` = ?, `data_base64` = ? WHERE 1;

--
-- DELETE template for table `GraphNode`
--
DELETE FROM `GraphNode` WHERE 0;

