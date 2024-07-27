=begin
#Mindwm API

#This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

The version of the OpenAPI document: 0.1.0

Generated by: https://openapi-generator.tech
Generator version: 7.7.0

=end

require 'date'
require 'time'

module OpenapiClient
  class Neo4jChangeDataCaptureMeta
    attr_accessor :operation

    attr_accessor :source

    attr_accessor :timestamp

    attr_accessor :tx_event_id

    attr_accessor :tx_events_count

    attr_accessor :tx_id

    attr_accessor :username

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'operation' => :'operation',
        :'source' => :'source',
        :'timestamp' => :'timestamp',
        :'tx_event_id' => :'txEventId',
        :'tx_events_count' => :'txEventsCount',
        :'tx_id' => :'txId',
        :'username' => :'username'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'operation' => :'String',
        :'source' => :'Neo4jChangeDataCaptureMetaSource',
        :'timestamp' => :'Integer',
        :'tx_event_id' => :'Integer',
        :'tx_events_count' => :'Integer',
        :'tx_id' => :'Integer',
        :'username' => :'String'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OpenapiClient::Neo4jChangeDataCaptureMeta` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OpenapiClient::Neo4jChangeDataCaptureMeta`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'operation')
        self.operation = attributes[:'operation']
      else
        self.operation = nil
      end

      if attributes.key?(:'source')
        self.source = attributes[:'source']
      else
        self.source = nil
      end

      if attributes.key?(:'timestamp')
        self.timestamp = attributes[:'timestamp']
      else
        self.timestamp = nil
      end

      if attributes.key?(:'tx_event_id')
        self.tx_event_id = attributes[:'tx_event_id']
      else
        self.tx_event_id = nil
      end

      if attributes.key?(:'tx_events_count')
        self.tx_events_count = attributes[:'tx_events_count']
      else
        self.tx_events_count = nil
      end

      if attributes.key?(:'tx_id')
        self.tx_id = attributes[:'tx_id']
      else
        self.tx_id = nil
      end

      if attributes.key?(:'username')
        self.username = attributes[:'username']
      else
        self.username = nil
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @operation.nil?
        invalid_properties.push('invalid value for "operation", operation cannot be nil.')
      end

      if @source.nil?
        invalid_properties.push('invalid value for "source", source cannot be nil.')
      end

      if @timestamp.nil?
        invalid_properties.push('invalid value for "timestamp", timestamp cannot be nil.')
      end

      if @tx_event_id.nil?
        invalid_properties.push('invalid value for "tx_event_id", tx_event_id cannot be nil.')
      end

      if @tx_events_count.nil?
        invalid_properties.push('invalid value for "tx_events_count", tx_events_count cannot be nil.')
      end

      if @tx_id.nil?
        invalid_properties.push('invalid value for "tx_id", tx_id cannot be nil.')
      end

      if @username.nil?
        invalid_properties.push('invalid value for "username", username cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @operation.nil?
      return false if @source.nil?
      return false if @timestamp.nil?
      return false if @tx_event_id.nil?
      return false if @tx_events_count.nil?
      return false if @tx_id.nil?
      return false if @username.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          operation == o.operation &&
          source == o.source &&
          timestamp == o.timestamp &&
          tx_event_id == o.tx_event_id &&
          tx_events_count == o.tx_events_count &&
          tx_id == o.tx_id &&
          username == o.username
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [operation, source, timestamp, tx_event_id, tx_events_count, tx_id, username].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      attributes = attributes.transform_keys(&:to_sym)
      transformed_hash = {}
      openapi_types.each_pair do |key, type|
        if attributes.key?(attribute_map[key]) && attributes[attribute_map[key]].nil?
          transformed_hash["#{key}"] = nil
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[attribute_map[key]].is_a?(Array)
            transformed_hash["#{key}"] = attributes[attribute_map[key]].map { |v| _deserialize($1, v) }
          end
        elsif !attributes[attribute_map[key]].nil?
          transformed_hash["#{key}"] = _deserialize(type, attributes[attribute_map[key]])
        end
      end
      new(transformed_hash)
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def self._deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = OpenapiClient.const_get(type)
        klass.respond_to?(:openapi_any_of) || klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
