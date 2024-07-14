<?php
/**
 * Neo4jCaptureDataChangeMetaSource
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
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

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the Neo4jCaptureDataChangeMetaSource model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class Neo4jCaptureDataChangeMetaSource 
{
        /**
     * @var string|null
     * @SerializedName("hostname")
     * @Type("string")
    */
    #[Assert\NotNull]
    #[Assert\Type("string")]
    protected ?string $hostname = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->hostname = array_key_exists('hostname', $data) ? $data['hostname'] : $this->hostname;
        }
    }

    /**
     * Gets hostname.
     *
     * @return string|null
     */
    public function getHostname(): ?string
    {
        return $this->hostname;
    }

    /**
    * Sets hostname.
    *
    * @param string|null $hostname
    *
    * @return $this
    */
    public function setHostname(?string $hostname): self
    {
        $this->hostname = $hostname;

        return $this;
    }



}

