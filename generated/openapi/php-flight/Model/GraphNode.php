<?php
/**
 * GraphNode
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPIServer\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */


namespace OpenAPIServer\Model;

/**
 * Class representing the GraphNode model.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class GraphNode  implements \JsonSerializable
{
        /**
     * Identifies the event.
     *
     * @var string
     * @SerializedName("id")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Length(
     *   min = 1
     * )
     */
    public string $id;

    /**
     * @var GraphNodeAllOfSource
     * @SerializedName("source")
     * @Assert\NotNull()
     * @Assert\Valid()
        * @Accessor(getter="getSerializedSource")
        * @Type("string")
     */
    public GraphNodeAllOfSource $source;

    /**
     * The version of the CloudEvents specification which the event uses.
     *
     * @var string
     * @SerializedName("specversion")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Length(
     *   min = 1
     * )
     */
    public string $specversion;

    /**
     * @var GraphNodeAllOfType
     * @SerializedName("type")
     * @Assert\NotNull()
     * @Assert\Valid()
        * @Accessor(getter="getSerializedType")
        * @Type("string")
     */
    public GraphNodeAllOfType $type;

    /**
     * Content type of the data value. Must adhere to RFC 2046 format.
     *
     * @var string|null
     * @SerializedName("datacontenttype")
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Length(
     *   min = 1
     * )
     */
    public ?string $datacontenttype;

    /**
     * Identifies the schema that data adheres to.
     *
     * @var string|null
     * @SerializedName("dataschema")
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Length(
     *   min = 1
     * )
     */
    public ?string $dataschema;

    /**
     * Describes the subject of the event in the context of the event producer (identified by source).
     *
     * @var string|null
     * @SerializedName("subject")
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Length(
     *   min = 1
     * )
     */
    public ?string $subject;

    /**
     * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
     *
     * @var \DateTime|null
     * @SerializedName("time")
     * @Assert\Type("\DateTime"))
     * @Type("DateTime")
     * @Assert\Length(
     *   min = 1
     * )
     */
    public ?\DateTime $time;

    /**
     * @var GraphNodeAllOfData|null
     * @SerializedName("data")
     * @Assert\Type("\OpenAPIServer\Model\GraphNodeAllOfData")
     * @Type("\OpenAPIServer\Model\GraphNodeAllOfData")
     */
    public ?GraphNodeAllOfData $data;

    /**
     * Base64 encoded event payload. Must adhere to RFC4648.
     *
     * @var string|null
     * @SerializedName("data_base64")
     * @Assert\Type("string")
     * @Type("string")
     */
    public ?string $dataBase64;

    /**
     * Constructor
     *
     * @param string $id
     * @param GraphNodeAllOfSource $source
     * @param string $specversion
     * @param GraphNodeAllOfType $type
     * @param string|null $datacontenttype
     * @param string|null $dataschema
     * @param string|null $subject
     * @param \DateTime|null $time
     * @param GraphNodeAllOfData|null $data
     * @param string|null $dataBase64
     */
    public function __construct(string $id, GraphNodeAllOfSource $source, string $specversion, GraphNodeAllOfType $type, ?string $datacontenttype, ?string $dataschema, ?string $subject, ?\DateTime $time, ?GraphNodeAllOfData $data, ?string $dataBase64)
    {
        $this->id = $id;
        $this->source = $source;
        $this->specversion = $specversion;
        $this->type = $type;
        $this->datacontenttype = $datacontenttype;
        $this->dataschema = $dataschema;
        $this->subject = $subject;
        $this->time = $time;
        $this->data = $data;
        $this->dataBase64 = $dataBase64;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            $data['id'] ?? null, 
            isset($data['source']) ? GraphNodeAllOfSource::tryFrom($data['source']) : null, 
            $data['specversion'] ?? null, 
            isset($data['type']) ? GraphNodeAllOfType::tryFrom($data['type']) : null, 
            $data['datacontenttype'] ?? null, 
            $data['dataschema'] ?? null, 
            $data['subject'] ?? null, 
            isset($data['time']) ? new \DateTime($data['time']) : null, 
            isset($data['data']) ? GraphNodeAllOfData::fromArray($data['data']) : null, 
            $data['data_base64'] ?? null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'id' => $this->id, 
            'source' => $this->source, 
            'specversion' => $this->specversion, 
            'type' => $this->type, 
            'datacontenttype' => $this->datacontenttype, 
            'dataschema' => $this->dataschema, 
            'subject' => $this->subject, 
            'time' => $this->time?->format('c'), 
            'data' => $this->data, 
            'data_base64' => $this->dataBase64, 
        ];
    }
}


