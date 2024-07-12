<?php
/**
 * ClipboardPayload
 */
namespace app\Models;

/**
 * ClipboardPayload
 */
class ClipboardPayload {

    /** @var int[] $start Starting position of clipboard selection [x,y]*/
    public $start = [];

    /** @var int[] $stop Ending position of clipboard selection [x,y]*/
    public $stop = [];

    /** @var string $data Clipboard data*/
    public $data = "";

    /** @var string $type Clipboard type*/
    public $type = "";

    /** @var \app\Models\ClipboardPayloadContext $context */
    public $context;

}
