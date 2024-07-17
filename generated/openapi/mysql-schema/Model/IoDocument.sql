--
-- Mindwm API.
-- Prepared SQL queries for 'IoDocument' definition.
--


--
-- SELECT template for table `IoDocument`
--
SELECT `id`, `source`, `specversion`, `type`, `datacontenttype`, `dataschema`, `subject`, `time`, `data`, `data_base64` FROM `IoDocument` WHERE 1;

--
-- INSERT template for table `IoDocument`
--
INSERT INTO `IoDocument`(`id`, `source`, `specversion`, `type`, `datacontenttype`, `dataschema`, `subject`, `time`, `data`, `data_base64`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `IoDocument`
--
UPDATE `IoDocument` SET `id` = ?, `source` = ?, `specversion` = ?, `type` = ?, `datacontenttype` = ?, `dataschema` = ?, `subject` = ?, `time` = ?, `data` = ?, `data_base64` = ? WHERE 1;

--
-- DELETE template for table `IoDocument`
--
DELETE FROM `IoDocument` WHERE 0;

