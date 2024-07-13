<?php
/**
 * Neo4jCaptureDataChangeRelationshipPayload
 */
namespace app\Models;

/**
 * Neo4jCaptureDataChangeRelationshipPayload
 */
class Neo4jCaptureDataChangeRelationshipPayload {

    /** @var object $after */
    public $after;

    /** @var string $before */
    public $before = "";

    /** @var \app\Models\Neo4jCaptureDataChangeRelationshipPayloadEnd $end */
    public $end;

    /** @var string $id */
    public $id = "";

    /** @var string $label */
    public $label = "";

    /** @var \app\Models\Neo4jCaptureDataChangeRelationshipPayloadEnd $start */
    public $start;

    /** @var string $type */
    public $type = "";

}
