<?php
/**
 * Neo4jCaptureDataChangeMeta
 */
namespace app\Models;

/**
 * Neo4jCaptureDataChangeMeta
 */
class Neo4jCaptureDataChangeMeta {

    /** @var string $operation */
    public $operation = "";

    /** @var \app\Models\Neo4jCaptureDataChangeMetaSource $source */
    public $source;

    /** @var int $timestamp */
    public $timestamp = 0;

    /** @var int $txEventId */
    public $txEventId = 0;

    /** @var int $txEventsCount */
    public $txEventsCount = 0;

    /** @var int $txId */
    public $txId = 0;

    /** @var string $username */
    public $username = "";

}
