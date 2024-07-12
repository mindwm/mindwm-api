--
-- Mindwm API.
-- Prepared SQL queries for 'Clipboard' definition.
--


--
-- SELECT template for table `Clipboard`
--
SELECT `type`, `source`, `data`, `id`, `specversion`, `datacontenttype`, `dataschema`, `subject`, `time`, `data_base64` FROM `Clipboard` WHERE 1;

--
-- INSERT template for table `Clipboard`
--
INSERT INTO `Clipboard`(`type`, `source`, `data`, `id`, `specversion`, `datacontenttype`, `dataschema`, `subject`, `time`, `data_base64`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Clipboard`
--
UPDATE `Clipboard` SET `type` = ?, `source` = ?, `data` = ?, `id` = ?, `specversion` = ?, `datacontenttype` = ?, `dataschema` = ?, `subject` = ?, `time` = ?, `data_base64` = ? WHERE 1;

--
-- DELETE template for table `Clipboard`
--
DELETE FROM `Clipboard` WHERE 0;

