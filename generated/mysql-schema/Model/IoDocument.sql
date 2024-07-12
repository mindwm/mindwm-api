--
-- Mindwm API.
-- Prepared SQL queries for 'IoDocument' definition.
--


--
-- SELECT template for table `IoDocument`
--
SELECT `type`, `source`, `data`, `id`, `specversion`, `datacontenttype`, `dataschema`, `subject`, `time`, `data_base64` FROM `IoDocument` WHERE 1;

--
-- INSERT template for table `IoDocument`
--
INSERT INTO `IoDocument`(`type`, `source`, `data`, `id`, `specversion`, `datacontenttype`, `dataschema`, `subject`, `time`, `data_base64`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `IoDocument`
--
UPDATE `IoDocument` SET `type` = ?, `source` = ?, `data` = ?, `id` = ?, `specversion` = ?, `datacontenttype` = ?, `dataschema` = ?, `subject` = ?, `time` = ?, `data_base64` = ? WHERE 1;

--
-- DELETE template for table `IoDocument`
--
DELETE FROM `IoDocument` WHERE 0;

