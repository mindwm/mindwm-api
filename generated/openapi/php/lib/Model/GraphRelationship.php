<?php
/**
 * GraphRelationship
 *
 * PHP version 7.4
 *
 * @category Class
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
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.7.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * GraphRelationship Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class GraphRelationship implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'GraphRelationship';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'id' => 'string',
        'source' => 'string',
        'specversion' => 'string',
        'type' => 'string',
        'datacontenttype' => 'string',
        'dataschema' => 'string',
        'subject' => 'string',
        'time' => '\DateTime',
        'data' => '\OpenAPI\Client\Model\GraphRelationshipAllOfData',
        'data_base64' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'id' => null,
        'source' => null,
        'specversion' => null,
        'type' => null,
        'datacontenttype' => null,
        'dataschema' => 'uri',
        'subject' => null,
        'time' => 'date-time',
        'data' => null,
        'data_base64' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'id' => false,
        'source' => false,
        'specversion' => false,
        'type' => false,
        'datacontenttype' => false,
        'dataschema' => false,
        'subject' => false,
        'time' => false,
        'data' => false,
        'data_base64' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
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
     * @var string[]
     */
    protected static $attributeMap = [
        'id' => 'id',
        'source' => 'source',
        'specversion' => 'specversion',
        'type' => 'type',
        'datacontenttype' => 'datacontenttype',
        'dataschema' => 'dataschema',
        'subject' => 'subject',
        'time' => 'time',
        'data' => 'data',
        'data_base64' => 'data_base64'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'id' => 'setId',
        'source' => 'setSource',
        'specversion' => 'setSpecversion',
        'type' => 'setType',
        'datacontenttype' => 'setDatacontenttype',
        'dataschema' => 'setDataschema',
        'subject' => 'setSubject',
        'time' => 'setTime',
        'data' => 'setData',
        'data_base64' => 'setDataBase64'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'id' => 'getId',
        'source' => 'getSource',
        'specversion' => 'getSpecversion',
        'type' => 'getType',
        'datacontenttype' => 'getDatacontenttype',
        'dataschema' => 'getDataschema',
        'subject' => 'getSubject',
        'time' => 'getTime',
        'data' => 'getData',
        'data_base64' => 'getDataBase64'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }

    public const SOURCE_GRAPH_RELATIONSHIP = 'graph.relationship';
    public const TYPE_CREATED = 'created';
    public const TYPE_UPDATED = 'updated';
    public const TYPE_DELETED = 'deleted';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getSourceAllowableValues()
    {
        return [
            self::SOURCE_GRAPH_RELATIONSHIP,
        ];
    }

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getTypeAllowableValues()
    {
        return [
            self::TYPE_CREATED,
            self::TYPE_UPDATED,
            self::TYPE_DELETED,
        ];
    }

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('source', $data ?? [], null);
        $this->setIfExists('specversion', $data ?? [], null);
        $this->setIfExists('type', $data ?? [], null);
        $this->setIfExists('datacontenttype', $data ?? [], null);
        $this->setIfExists('dataschema', $data ?? [], null);
        $this->setIfExists('subject', $data ?? [], null);
        $this->setIfExists('time', $data ?? [], null);
        $this->setIfExists('data', $data ?? [], null);
        $this->setIfExists('data_base64', $data ?? [], null);
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
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if ((mb_strlen($this->container['id']) < 1)) {
            $invalidProperties[] = "invalid value for 'id', the character length must be bigger than or equal to 1.";
        }

        if ($this->container['source'] === null) {
            $invalidProperties[] = "'source' can't be null";
        }
        $allowedValues = $this->getSourceAllowableValues();
        if (!is_null($this->container['source']) && !in_array($this->container['source'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'source', must be one of '%s'",
                $this->container['source'],
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['specversion'] === null) {
            $invalidProperties[] = "'specversion' can't be null";
        }
        if ((mb_strlen($this->container['specversion']) < 1)) {
            $invalidProperties[] = "invalid value for 'specversion', the character length must be bigger than or equal to 1.";
        }

        if ($this->container['type'] === null) {
            $invalidProperties[] = "'type' can't be null";
        }
        $allowedValues = $this->getTypeAllowableValues();
        if (!is_null($this->container['type']) && !in_array($this->container['type'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'type', must be one of '%s'",
                $this->container['type'],
                implode("', '", $allowedValues)
            );
        }

        if (!is_null($this->container['datacontenttype']) && (mb_strlen($this->container['datacontenttype']) < 1)) {
            $invalidProperties[] = "invalid value for 'datacontenttype', the character length must be bigger than or equal to 1.";
        }

        if (!is_null($this->container['dataschema']) && (mb_strlen($this->container['dataschema']) < 1)) {
            $invalidProperties[] = "invalid value for 'dataschema', the character length must be bigger than or equal to 1.";
        }

        if (!is_null($this->container['subject']) && (mb_strlen($this->container['subject']) < 1)) {
            $invalidProperties[] = "invalid value for 'subject', the character length must be bigger than or equal to 1.";
        }

        if (!is_null($this->container['time']) && (mb_strlen($this->container['time']) < 1)) {
            $invalidProperties[] = "invalid value for 'time', the character length must be bigger than or equal to 1.";
        }

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets id
     *
     * @return string
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param string $id Identifies the event.
     *
     * @return self
     */
    public function setId($id)
    {
        if (is_null($id)) {
            throw new \InvalidArgumentException('non-nullable id cannot be null');
        }

        if ((mb_strlen($id) < 1)) {
            throw new \InvalidArgumentException('invalid length for $id when calling GraphRelationship., must be bigger than or equal to 1.');
        }

        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets source
     *
     * @return string
     */
    public function getSource()
    {
        return $this->container['source'];
    }

    /**
     * Sets source
     *
     * @param string $source source
     *
     * @return self
     */
    public function setSource($source)
    {
        if (is_null($source)) {
            throw new \InvalidArgumentException('non-nullable source cannot be null');
        }
        $allowedValues = $this->getSourceAllowableValues();
        if (!in_array($source, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'source', must be one of '%s'",
                    $source,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['source'] = $source;

        return $this;
    }

    /**
     * Gets specversion
     *
     * @return string
     */
    public function getSpecversion()
    {
        return $this->container['specversion'];
    }

    /**
     * Sets specversion
     *
     * @param string $specversion The version of the CloudEvents specification which the event uses.
     *
     * @return self
     */
    public function setSpecversion($specversion)
    {
        if (is_null($specversion)) {
            throw new \InvalidArgumentException('non-nullable specversion cannot be null');
        }

        if ((mb_strlen($specversion) < 1)) {
            throw new \InvalidArgumentException('invalid length for $specversion when calling GraphRelationship., must be bigger than or equal to 1.');
        }

        $this->container['specversion'] = $specversion;

        return $this;
    }

    /**
     * Gets type
     *
     * @return string
     */
    public function getType()
    {
        return $this->container['type'];
    }

    /**
     * Sets type
     *
     * @param string $type type
     *
     * @return self
     */
    public function setType($type)
    {
        if (is_null($type)) {
            throw new \InvalidArgumentException('non-nullable type cannot be null');
        }
        $allowedValues = $this->getTypeAllowableValues();
        if (!in_array($type, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'type', must be one of '%s'",
                    $type,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['type'] = $type;

        return $this;
    }

    /**
     * Gets datacontenttype
     *
     * @return string|null
     */
    public function getDatacontenttype()
    {
        return $this->container['datacontenttype'];
    }

    /**
     * Sets datacontenttype
     *
     * @param string|null $datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
     *
     * @return self
     */
    public function setDatacontenttype($datacontenttype)
    {
        if (is_null($datacontenttype)) {
            throw new \InvalidArgumentException('non-nullable datacontenttype cannot be null');
        }

        if ((mb_strlen($datacontenttype) < 1)) {
            throw new \InvalidArgumentException('invalid length for $datacontenttype when calling GraphRelationship., must be bigger than or equal to 1.');
        }

        $this->container['datacontenttype'] = $datacontenttype;

        return $this;
    }

    /**
     * Gets dataschema
     *
     * @return string|null
     */
    public function getDataschema()
    {
        return $this->container['dataschema'];
    }

    /**
     * Sets dataschema
     *
     * @param string|null $dataschema Identifies the schema that data adheres to.
     *
     * @return self
     */
    public function setDataschema($dataschema)
    {
        if (is_null($dataschema)) {
            throw new \InvalidArgumentException('non-nullable dataschema cannot be null');
        }

        if ((mb_strlen($dataschema) < 1)) {
            throw new \InvalidArgumentException('invalid length for $dataschema when calling GraphRelationship., must be bigger than or equal to 1.');
        }

        $this->container['dataschema'] = $dataschema;

        return $this;
    }

    /**
     * Gets subject
     *
     * @return string|null
     */
    public function getSubject()
    {
        return $this->container['subject'];
    }

    /**
     * Sets subject
     *
     * @param string|null $subject Describes the subject of the event in the context of the event producer (identified by source).
     *
     * @return self
     */
    public function setSubject($subject)
    {
        if (is_null($subject)) {
            throw new \InvalidArgumentException('non-nullable subject cannot be null');
        }

        if ((mb_strlen($subject) < 1)) {
            throw new \InvalidArgumentException('invalid length for $subject when calling GraphRelationship., must be bigger than or equal to 1.');
        }

        $this->container['subject'] = $subject;

        return $this;
    }

    /**
     * Gets time
     *
     * @return \DateTime|null
     */
    public function getTime()
    {
        return $this->container['time'];
    }

    /**
     * Sets time
     *
     * @param \DateTime|null $time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
     *
     * @return self
     */
    public function setTime($time)
    {
        if (is_null($time)) {
            throw new \InvalidArgumentException('non-nullable time cannot be null');
        }

        if ((mb_strlen($time) < 1)) {
            throw new \InvalidArgumentException('invalid length for $time when calling GraphRelationship., must be bigger than or equal to 1.');
        }

        $this->container['time'] = $time;

        return $this;
    }

    /**
     * Gets data
     *
     * @return \OpenAPI\Client\Model\GraphRelationshipAllOfData|null
     */
    public function getData()
    {
        return $this->container['data'];
    }

    /**
     * Sets data
     *
     * @param \OpenAPI\Client\Model\GraphRelationshipAllOfData|null $data data
     *
     * @return self
     */
    public function setData($data)
    {
        if (is_null($data)) {
            throw new \InvalidArgumentException('non-nullable data cannot be null');
        }
        $this->container['data'] = $data;

        return $this;
    }

    /**
     * Gets data_base64
     *
     * @return string|null
     */
    public function getDataBase64()
    {
        return $this->container['data_base64'];
    }

    /**
     * Sets data_base64
     *
     * @param string|null $data_base64 Base64 encoded event payload. Must adhere to RFC4648.
     *
     * @return self
     */
    public function setDataBase64($data_base64)
    {
        if (is_null($data_base64)) {
            throw new \InvalidArgumentException('non-nullable data_base64 cannot be null');
        }
        $this->container['data_base64'] = $data_base64;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
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
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
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
    public function offsetSet($offset, $value): void
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
    public function offsetUnset($offset): void
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
    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
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
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


