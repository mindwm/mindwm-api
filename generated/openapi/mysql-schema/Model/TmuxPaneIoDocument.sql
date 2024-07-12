--
-- Mindwm API.
-- Prepared SQL queries for 'TmuxPaneIoDocument' definition.
--


--
-- SELECT template for table `TmuxPaneIoDocument`
--
SELECT `input`, `output`, `ps1` FROM `TmuxPaneIoDocument` WHERE 1;

--
-- INSERT template for table `TmuxPaneIoDocument`
--
INSERT INTO `TmuxPaneIoDocument`(`input`, `output`, `ps1`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TmuxPaneIoDocument`
--
UPDATE `TmuxPaneIoDocument` SET `input` = ?, `output` = ?, `ps1` = ? WHERE 1;

--
-- DELETE template for table `TmuxPaneIoDocument`
--
DELETE FROM `TmuxPaneIoDocument` WHERE 0;

