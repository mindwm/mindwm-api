<?php
/**
 * TmuxPaneIoDocument
 */
namespace app\Models;

/**
 * TmuxPaneIoDocument
 */
class TmuxPaneIoDocument {

    /** @var string $input User input*/
    public $input = "";

    /** @var string $output Command output (mix of stdout &amp; stderr)*/
    public $output = "";

    /** @var string $ps1 ps1 (prompt) AFTER the input and output*/
    public $ps1 = "";

}
