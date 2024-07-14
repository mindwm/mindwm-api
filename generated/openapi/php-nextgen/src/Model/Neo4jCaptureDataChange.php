<?php
/**
 * Neo4jCaptureDataChange
 *
 * PHP version 8.1
 *
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * The version of the OpenAPI document: 0.1.0
 * @generated Generated by: https://openapi-generator.tech
 * Generator version: 7.7.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use ArrayAccess;
use JsonSerializable;
use InvalidArgumentException;
use ReturnTypeWillChange;
use OpenAPI\Client\ObjectSerializer;

/**
 * Neo4jCaptureDataChange Class Doc Comment
 *
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements ArrayAccess<string, mixed>
 */
class Neo4jCaptureDataChange implements ModelInterface, ArrayAccess, JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static string $openAPIModelName = 'Neo4jCaptureDataChange';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var array<string, string>
      */
    protected static array $openAPITypes = [
        'headers' => 'array<string,mixed>',
        'message_key' => 'string',
        'meta' => '\OpenAPI\Client\Model\Neo4jCaptureDataChangeMeta',
        'offset' => 'int',
        'partition' => 'int',
        'source_type' => 'string',
        'timestamp' => '\DateTime',
        'topic' => 'string',
        'schema' => '\OpenAPI\Client\Model\Neo4jCaptureDataChangeSchema',
        'payload' => '\OpenAPI\Client\Model\Neo4jCaptureDataChangePayload'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var array<string, string|null>
      */
    protected static array $openAPIFormats = [
        'headers' => null,
        'message_key' => null,
        'meta' => null,
        'offset' => null,
        'partition' => null,
        'source_type' => null,
        'timestamp' => 'date-time',
        'topic' => null,
        'schema' => null,
        'payload' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var array<string, bool>
      */
    protected static array $openAPINullables = [
        'headers' => false,
        'message_key' => false,
        'meta' => false,
        'offset' => false,
        'partition' => false,
        'source_type' => false,
        'timestamp' => false,
        'topic' => false,
        'schema' => false,
        'payload' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var array<string, bool>
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array<string, string>
     */
    public static function openAPITypes(): array
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array<string, string>
     */
    public static function openAPIFormats(): array
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array<string, bool>
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return array<string, bool>
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param array<string, bool> $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var array<string, string>
     */
    protected static array $attributeMap = [
        'headers' => 'headers',
        'message_key' => 'message_key',
        'meta' => 'meta',
        'offset' => 'offset',
        'partition' => 'partition',
        'source_type' => 'source_type',
        'timestamp' => 'timestamp',
        'topic' => 'topic',
        'schema' => 'schema',
        'payload' => 'payload'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var array<string, string>
     */
    protected static array $setters = [
        'headers' => 'setHeaders',
        'message_key' => 'setMessageKey',
        'meta' => 'setMeta',
        'offset' => 'setOffset',
        'partition' => 'setPartition',
        'source_type' => 'setSourceType',
        'timestamp' => 'setTimestamp',
        'topic' => 'setTopic',
        'schema' => 'setSchema',
        'payload' => 'setPayload'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var array<string, string>
     */
    protected static array $getters = [
        'headers' => 'getHeaders',
        'message_key' => 'getMessageKey',
        'meta' => 'getMeta',
        'offset' => 'getOffset',
        'partition' => 'getPartition',
        'source_type' => 'getSourceType',
        'timestamp' => 'getTimestamp',
        'topic' => 'getTopic',
        'schema' => 'getSchema',
        'payload' => 'getPayload'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array<string, string>
     */
    public static function attributeMap(): array
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array<string, string>
     */
    public static function setters(): array
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array<string, string>
     */
    public static function getters(): array
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName(): string
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var array
     */
    protected array $container = [];

    /**
     * Constructor
     *
     * @param array $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('headers', $data ?? [], null);
        $this->setIfExists('message_key', $data ?? [], null);
        $this->setIfExists('meta', $data ?? [], null);
        $this->setIfExists('offset', $data ?? [], null);
        $this->setIfExists('partition', $data ?? [], null);
        $this->setIfExists('source_type', $data ?? [], null);
        $this->setIfExists('timestamp', $data ?? [], null);
        $this->setIfExists('topic', $data ?? [], null);
        $this->setIfExists('schema', $data ?? [], null);
        $this->setIfExists('payload', $data ?? [], null);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, mixed $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return string[] invalid properties with reasons
     */
    public function listInvalidProperties(): array
    {
        $invalidProperties = [];

        if ($this->container['headers'] === null) {
            $invalidProperties[] = "'headers' can't be null";
        }
        if ($this->container['message_key'] === null) {
            $invalidProperties[] = "'message_key' can't be null";
        }
        if ($this->container['meta'] === null) {
            $invalidProperties[] = "'meta' can't be null";
        }
        if ($this->container['offset'] === null) {
            $invalidProperties[] = "'offset' can't be null";
        }
        if ($this->container['partition'] === null) {
            $invalidProperties[] = "'partition' can't be null";
        }
        if ($this->container['source_type'] === null) {
            $invalidProperties[] = "'source_type' can't be null";
        }
        if ($this->container['timestamp'] === null) {
            $invalidProperties[] = "'timestamp' can't be null";
        }
        if ($this->container['topic'] === null) {
            $invalidProperties[] = "'topic' can't be null";
        }
        if ($this->container['schema'] === null) {
            $invalidProperties[] = "'schema' can't be null";
        }
        if ($this->container['payload'] === null) {
            $invalidProperties[] = "'payload' can't be null";
        }
        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid(): bool
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets headers
     *
     * @return array<string,mixed>
     */
    public function getHeaders(): array
    {
        return $this->container['headers'];
    }

    /**
     * Sets headers
     *
     * @param array<string,mixed> $headers headers
     *
     * @return $this
     */
    public function setHeaders(array $headers): static
    {
        if (is_null($headers)) {
            throw new InvalidArgumentException('non-nullable headers cannot be null');
        }
        $this->container['headers'] = $headers;

        return $this;
    }

    /**
     * Gets message_key
     *
     * @return string
     */
    public function getMessageKey(): string
    {
        return $this->container['message_key'];
    }

    /**
     * Sets message_key
     *
     * @param string $message_key message_key
     *
     * @return $this
     */
    public function setMessageKey(string $message_key): static
    {
        if (is_null($message_key)) {
            throw new InvalidArgumentException('non-nullable message_key cannot be null');
        }
        $this->container['message_key'] = $message_key;

        return $this;
    }

    /**
     * Gets meta
     *
     * @return \OpenAPI\Client\Model\Neo4jCaptureDataChangeMeta
     */
    public function getMeta(): \OpenAPI\Client\Model\Neo4jCaptureDataChangeMeta
    {
        return $this->container['meta'];
    }

    /**
     * Sets meta
     *
     * @param \OpenAPI\Client\Model\Neo4jCaptureDataChangeMeta $meta meta
     *
     * @return $this
     */
    public function setMeta(\OpenAPI\Client\Model\Neo4jCaptureDataChangeMeta $meta): static
    {
        if (is_null($meta)) {
            throw new InvalidArgumentException('non-nullable meta cannot be null');
        }
        $this->container['meta'] = $meta;

        return $this;
    }

    /**
     * Gets offset
     *
     * @return int
     */
    public function getOffset(): int
    {
        return $this->container['offset'];
    }

    /**
     * Sets offset
     *
     * @param int $offset offset
     *
     * @return $this
     */
    public function setOffset(int $offset): static
    {
        if (is_null($offset)) {
            throw new InvalidArgumentException('non-nullable offset cannot be null');
        }
        $this->container['offset'] = $offset;

        return $this;
    }

    /**
     * Gets partition
     *
     * @return int
     */
    public function getPartition(): int
    {
        return $this->container['partition'];
    }

    /**
     * Sets partition
     *
     * @param int $partition partition
     *
     * @return $this
     */
    public function setPartition(int $partition): static
    {
        if (is_null($partition)) {
            throw new InvalidArgumentException('non-nullable partition cannot be null');
        }
        $this->container['partition'] = $partition;

        return $this;
    }

    /**
     * Gets source_type
     *
     * @return string
     */
    public function getSourceType(): string
    {
        return $this->container['source_type'];
    }

    /**
     * Sets source_type
     *
     * @param string $source_type source_type
     *
     * @return $this
     */
    public function setSourceType(string $source_type): static
    {
        if (is_null($source_type)) {
            throw new InvalidArgumentException('non-nullable source_type cannot be null');
        }
        $this->container['source_type'] = $source_type;

        return $this;
    }

    /**
     * Gets timestamp
     *
     * @return \DateTime
     */
    public function getTimestamp(): \DateTime
    {
        return $this->container['timestamp'];
    }

    /**
     * Sets timestamp
     *
     * @param \DateTime $timestamp timestamp
     *
     * @return $this
     */
    public function setTimestamp(\DateTime $timestamp): static
    {
        if (is_null($timestamp)) {
            throw new InvalidArgumentException('non-nullable timestamp cannot be null');
        }
        $this->container['timestamp'] = $timestamp;

        return $this;
    }

    /**
     * Gets topic
     *
     * @return string
     */
    public function getTopic(): string
    {
        return $this->container['topic'];
    }

    /**
     * Sets topic
     *
     * @param string $topic topic
     *
     * @return $this
     */
    public function setTopic(string $topic): static
    {
        if (is_null($topic)) {
            throw new InvalidArgumentException('non-nullable topic cannot be null');
        }
        $this->container['topic'] = $topic;

        return $this;
    }

    /**
     * Gets schema
     *
     * @return \OpenAPI\Client\Model\Neo4jCaptureDataChangeSchema
     */
    public function getSchema(): \OpenAPI\Client\Model\Neo4jCaptureDataChangeSchema
    {
        return $this->container['schema'];
    }

    /**
     * Sets schema
     *
     * @param \OpenAPI\Client\Model\Neo4jCaptureDataChangeSchema $schema schema
     *
     * @return $this
     */
    public function setSchema(\OpenAPI\Client\Model\Neo4jCaptureDataChangeSchema $schema): static
    {
        if (is_null($schema)) {
            throw new InvalidArgumentException('non-nullable schema cannot be null');
        }
        $this->container['schema'] = $schema;

        return $this;
    }

    /**
     * Gets payload
     *
     * @return \OpenAPI\Client\Model\Neo4jCaptureDataChangePayload
     */
    public function getPayload(): \OpenAPI\Client\Model\Neo4jCaptureDataChangePayload
    {
        return $this->container['payload'];
    }

    /**
     * Sets payload
     *
     * @param \OpenAPI\Client\Model\Neo4jCaptureDataChangePayload $payload payload
     *
     * @return $this
     */
    public function setPayload(\OpenAPI\Client\Model\Neo4jCaptureDataChangePayload $payload): static
    {
        if (is_null($payload)) {
            throw new InvalidArgumentException('non-nullable payload cannot be null');
        }
        $this->container['payload'] = $payload;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists(mixed $offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[ReturnTypeWillChange]
    public function offsetGet(mixed $offset): mixed
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet(mixed $offset, mixed $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset(mixed $offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[ReturnTypeWillChange]
    public function jsonSerialize(): mixed
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString(): string
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue(): string
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}

