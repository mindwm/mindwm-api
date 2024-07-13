<?php
/**
 * Neo4jCaptureDataChange
 */
namespace app\Models;

/**
 * Neo4jCaptureDataChange
 */
class Neo4jCaptureDataChange {

    /** @var array<string,mixed> $headers */
    public $headers;

    /** @var string $messageKey */
    public $messageKey = "";

    /** @var \app\Models\Neo4jCaptureDataChangeMeta $meta */
    public $meta;

    /** @var int $offset */
    public $offset = 0;

    /** @var int $partition */
    public $partition = 0;

    /** @var string $sourceType */
    public $sourceType = "";

    /** @var \DateTime $timestamp */
    public $timestamp;

    /** @var string $topic */
    public $topic = "";

    /** @var \app\Models\Neo4jCaptureDataChangeSchema $schema */
    public $schema;

    /** @var \app\Models\Neo4jCaptureDataChangePayload $payload */
    public $payload;

}
