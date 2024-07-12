--
-- Mindwm API.
-- Prepared SQL queries for 'CloudEvent' definition.
--


--
-- SELECT template for table `CloudEvent`
--
SELECT `id`, `source`, `specversion`, `type`, `datacontenttype`, `dataschema`, `subject`, `time`, `data`, `data_base64` FROM `CloudEvent` WHERE 1;

--
-- INSERT template for table `CloudEvent`
--
INSERT INTO `CloudEvent`(`id`, `source`, `specversion`, `type`, `datacontenttype`, `dataschema`, `subject`, `time`, `data`, `data_base64`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CloudEvent`
--
UPDATE `CloudEvent` SET `id` = ?, `source` = ?, `specversion` = ?, `type` = ?, `datacontenttype` = ?, `dataschema` = ?, `subject` = ?, `time` = ?, `data` = ?, `data_base64` = ? WHERE 1;

--
-- DELETE template for table `CloudEvent`
--
DELETE FROM `CloudEvent` WHERE 0;

