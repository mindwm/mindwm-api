<?php
/**
 * IoDocument
 */
namespace app\Models;

/**
 * IoDocument
 */
class IoDocument {

    /** @var string $type */
    public $type = "";

    /** @var string $source */
    public $source = "";

    /** @var \app\Models\TmuxPaneIoDocument $data */
    public $data;

    /** @var string $id Identifies the event.*/
    public $id = "";

    /** @var string $specversion The version of the CloudEvents specification which the event uses.*/
    public $specversion = "";

    /** @var string $datacontenttype Content type of the data value. Must adhere to RFC 2046 format.*/
    public $datacontenttype = "";

    /** @var string $dataschema Identifies the schema that data adheres to.*/
    public $dataschema = "";

    /** @var string $subject Describes the subject of the event in the context of the event producer (identified by source).*/
    public $subject = "";

    /** @var \DateTime $time Timestamp of when the occurrence happened. Must adhere to RFC 3339.*/
    public $time;

    /** @var string $dataBase64 Base64 encoded event payload. Must adhere to RFC4648.*/
    public $dataBase64 = "";

}
