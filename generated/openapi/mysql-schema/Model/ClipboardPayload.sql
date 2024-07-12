--
-- Mindwm API.
-- Prepared SQL queries for 'ClipboardPayload' definition.
--


--
-- SELECT template for table `ClipboardPayload`
--
SELECT `start`, `stop`, `data`, `type`, `context` FROM `ClipboardPayload` WHERE 1;

--
-- INSERT template for table `ClipboardPayload`
--
INSERT INTO `ClipboardPayload`(`start`, `stop`, `data`, `type`, `context`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `ClipboardPayload`
--
UPDATE `ClipboardPayload` SET `start` = ?, `stop` = ?, `data` = ?, `type` = ?, `context` = ? WHERE 1;

--
-- DELETE template for table `ClipboardPayload`
--
DELETE FROM `ClipboardPayload` WHERE 0;

