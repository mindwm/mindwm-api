<?php
/**
 * Neo4jCaptureDataChangeNodePayload
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
 * Class representing the Neo4jCaptureDataChangeNodePayload model.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */

class Neo4jCaptureDataChangeNodePayload  implements \JsonSerializable
{
        /**
     * @var Neo4jCaptureDataChangeNodePayloadAfter
     * @SerializedName("after")
     * @Assert\NotNull()
     * @Assert\Valid()
     * @Assert\Type("\OpenAPIServer\Model\Neo4jCaptureDataChangeNodePayloadAfter")
     * @Type("\OpenAPIServer\Model\Neo4jCaptureDataChangeNodePayloadAfter")
     */
    public Neo4jCaptureDataChangeNodePayloadAfter $after;

    /**
     * @var string
     * @SerializedName("before")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    public string $before;

    /**
     * @var string
     * @SerializedName("id")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    public string $id;

    /**
     * @var string
     * @SerializedName("type")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     */
    public string $type;

    /**
     * Constructor
     *
     * @param Neo4jCaptureDataChangeNodePayloadAfter $after
     * @param string $before
     * @param string $id
     * @param string $type
     */
    public function __construct(Neo4jCaptureDataChangeNodePayloadAfter $after, string $before, string $id, string $type)
    {
        $this->after = $after;
        $this->before = $before;
        $this->id = $id;
        $this->type = $type;
    }

    public static function fromArray(array $data): self
    {
        return new self(
            isset($data['after']) ? Neo4jCaptureDataChangeNodePayloadAfter::fromArray($data['after']) : null, 
            $data['before'] ?? null, 
            $data['id'] ?? null, 
            $data['type'] ?? null, 
        );
    }

    public function jsonSerialize(): mixed {
        return [
            'after' => $this->after, 
            'before' => $this->before, 
            'id' => $this->id, 
            'type' => $this->type, 
        ];
    }
}

