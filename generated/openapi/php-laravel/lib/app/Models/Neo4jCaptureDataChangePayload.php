<?php
/**
 * Neo4jCaptureDataChangePayload
 */
namespace app\Models;

/**
 * Neo4jCaptureDataChangePayload
 */
class Neo4jCaptureDataChangePayload {

    /** @var object $after */
    public $after;

    /** @var string $before */
    public $before = "";

    /** @var string $id */
    public $id = "";

    /** @var string $type */
    public $type = "";

    /** @var \app\Models\Neo4jCaptureDataChangeRelationshipPayloadEnd $end */
    public $end;

    /** @var string $label */
    public $label = "";

    /** @var \app\Models\Neo4jCaptureDataChangeRelationshipPayloadEnd $start */
    public $start;

}
