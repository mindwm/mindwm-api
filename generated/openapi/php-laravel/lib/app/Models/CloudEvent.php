<?php
/**
 * CloudEvent
 */
namespace app\Models;

/**
 * CloudEvent
 * @description CloudEvents Specification JSON Schema
 */
class CloudEvent {

    /** @var string $id Identifies the event.*/
    public $id = "";

    /** @var string $source Identifies the context in which an event happened.*/
    public $source = "";

    /** @var string $specversion The version of the CloudEvents specification which the event uses.*/
    public $specversion = "";

    /** @var string $type Describes the type of event related to the originating occurrence.*/
    public $type = "";

    /** @var string|null $datacontenttype Content type of the data value. Must adhere to RFC 2046 format.*/
    public $datacontenttype = null;

    /** @var string|null $dataschema Identifies the schema that data adheres to.*/
    public $dataschema = null;

    /** @var string|null $subject Describes the subject of the event in the context of the event producer (identified by source).*/
    public $subject = null;

    /** @var \DateTime|null $time Timestamp of when the occurrence happened. Must adhere to RFC 3339.*/
    public $time = null;

    /** @var \app\Models\CloudEventData|null $data */
    public $data = null;

    /** @var string|null $dataBase64 Base64 encoded event payload. Must adhere to RFC4648.*/
    public $dataBase64 = null;

}
