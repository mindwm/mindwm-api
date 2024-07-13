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
  class GraphNode
    # Identifies the event.
    attr_accessor :id

    attr_accessor :source

    # The version of the CloudEvents specification which the event uses.
    attr_accessor :specversion

    attr_accessor :type

    # Content type of the data value. Must adhere to RFC 2046 format.
    attr_accessor :datacontenttype

    # Identifies the schema that data adheres to.
    attr_accessor :dataschema

    # Describes the subject of the event in the context of the event producer (identified by source).
    attr_accessor :subject

    # Timestamp of when the occurrence happened. Must adhere to RFC 3339.
    attr_accessor :time

    attr_accessor :data

    # Base64 encoded event payload. Must adhere to RFC4648.
    attr_accessor :data_base64

    class EnumAttributeValidator
      attr_reader :datatype
      attr_reader :allowable_values

      def initialize(datatype, allowable_values)
        @allowable_values = allowable_values.map do |value|
          case datatype.to_s
          when /Integer/i
            value.to_i
          when /Float/i
            value.to_f
          else
            value
          end
        end
      end

      def valid?(value)
        !value || allowable_values.include?(value)
      end
    end

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'id' => :'id',
        :'source' => :'source',
        :'specversion' => :'specversion',
        :'type' => :'type',
        :'datacontenttype' => :'datacontenttype',
        :'dataschema' => :'dataschema',
        :'subject' => :'subject',
        :'time' => :'time',
        :'data' => :'data',
        :'data_base64' => :'data_base64'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'id' => :'String',
        :'source' => :'String',
        :'specversion' => :'String',
        :'type' => :'String',
        :'datacontenttype' => :'String',
        :'dataschema' => :'String',
        :'subject' => :'String',
        :'time' => :'Time',
        :'data' => :'GraphNodeAllOfData',
        :'data_base64' => :'String'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end

    # List of class defined in allOf (OpenAPI v3)
    def self.openapi_all_of
      [
      :'CloudEvent'
      ]
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OpenapiClient::GraphNode` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OpenapiClient::GraphNode`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'id')
        self.id = attributes[:'id']
      else
        self.id = nil
      end

      if attributes.key?(:'source')
        self.source = attributes[:'source']
      else
        self.source = nil
      end

      if attributes.key?(:'specversion')
        self.specversion = attributes[:'specversion']
      else
        self.specversion = nil
      end

      if attributes.key?(:'type')
        self.type = attributes[:'type']
      else
        self.type = nil
      end

      if attributes.key?(:'datacontenttype')
        self.datacontenttype = attributes[:'datacontenttype']
      end

      if attributes.key?(:'dataschema')
        self.dataschema = attributes[:'dataschema']
      end

      if attributes.key?(:'subject')
        self.subject = attributes[:'subject']
      end

      if attributes.key?(:'time')
        self.time = attributes[:'time']
      end

      if attributes.key?(:'data')
        self.data = attributes[:'data']
      end

      if attributes.key?(:'data_base64')
        self.data_base64 = attributes[:'data_base64']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @id.nil?
        invalid_properties.push('invalid value for "id", id cannot be nil.')
      end

      if @id.to_s.length < 1
        invalid_properties.push('invalid value for "id", the character length must be great than or equal to 1.')
      end

      if @source.nil?
        invalid_properties.push('invalid value for "source", source cannot be nil.')
      end

      if @specversion.nil?
        invalid_properties.push('invalid value for "specversion", specversion cannot be nil.')
      end

      if @specversion.to_s.length < 1
        invalid_properties.push('invalid value for "specversion", the character length must be great than or equal to 1.')
      end

      if @type.nil?
        invalid_properties.push('invalid value for "type", type cannot be nil.')
      end

      if !@datacontenttype.nil? && @datacontenttype.to_s.length < 1
        invalid_properties.push('invalid value for "datacontenttype", the character length must be great than or equal to 1.')
      end

      if !@dataschema.nil? && @dataschema.to_s.length < 1
        invalid_properties.push('invalid value for "dataschema", the character length must be great than or equal to 1.')
      end

      if !@subject.nil? && @subject.to_s.length < 1
        invalid_properties.push('invalid value for "subject", the character length must be great than or equal to 1.')
      end

      if !@time.nil? && @time.to_s.length < 1
        invalid_properties.push('invalid value for "time", the character length must be great than or equal to 1.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @id.nil?
      return false if @id.to_s.length < 1
      return false if @source.nil?
      source_validator = EnumAttributeValidator.new('String', ["graph.node"])
      return false unless source_validator.valid?(@source)
      return false if @specversion.nil?
      return false if @specversion.to_s.length < 1
      return false if @type.nil?
      type_validator = EnumAttributeValidator.new('String', ["created", "updated", "deleted"])
      return false unless type_validator.valid?(@type)
      return false if !@datacontenttype.nil? && @datacontenttype.to_s.length < 1
      return false if !@dataschema.nil? && @dataschema.to_s.length < 1
      return false if !@subject.nil? && @subject.to_s.length < 1
      return false if !@time.nil? && @time.to_s.length < 1
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] id Value to be assigned
    def id=(id)
      if id.nil?
        fail ArgumentError, 'id cannot be nil'
      end

      if id.to_s.length < 1
        fail ArgumentError, 'invalid value for "id", the character length must be great than or equal to 1.'
      end

      @id = id
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] source Object to be assigned
    def source=(source)
      validator = EnumAttributeValidator.new('String', ["graph.node"])
      unless validator.valid?(source)
        fail ArgumentError, "invalid value for \"source\", must be one of #{validator.allowable_values}."
      end
      @source = source
    end

    # Custom attribute writer method with validation
    # @param [Object] specversion Value to be assigned
    def specversion=(specversion)
      if specversion.nil?
        fail ArgumentError, 'specversion cannot be nil'
      end

      if specversion.to_s.length < 1
        fail ArgumentError, 'invalid value for "specversion", the character length must be great than or equal to 1.'
      end

      @specversion = specversion
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] type Object to be assigned
    def type=(type)
      validator = EnumAttributeValidator.new('String', ["created", "updated", "deleted"])
      unless validator.valid?(type)
        fail ArgumentError, "invalid value for \"type\", must be one of #{validator.allowable_values}."
      end
      @type = type
    end

    # Custom attribute writer method with validation
    # @param [Object] datacontenttype Value to be assigned
    def datacontenttype=(datacontenttype)
      if datacontenttype.nil?
        fail ArgumentError, 'datacontenttype cannot be nil'
      end

      if datacontenttype.to_s.length < 1
        fail ArgumentError, 'invalid value for "datacontenttype", the character length must be great than or equal to 1.'
      end

      @datacontenttype = datacontenttype
    end

    # Custom attribute writer method with validation
    # @param [Object] dataschema Value to be assigned
    def dataschema=(dataschema)
      if dataschema.nil?
        fail ArgumentError, 'dataschema cannot be nil'
      end

      if dataschema.to_s.length < 1
        fail ArgumentError, 'invalid value for "dataschema", the character length must be great than or equal to 1.'
      end

      @dataschema = dataschema
    end

    # Custom attribute writer method with validation
    # @param [Object] subject Value to be assigned
    def subject=(subject)
      if subject.nil?
        fail ArgumentError, 'subject cannot be nil'
      end

      if subject.to_s.length < 1
        fail ArgumentError, 'invalid value for "subject", the character length must be great than or equal to 1.'
      end

      @subject = subject
    end

    # Custom attribute writer method with validation
    # @param [Object] time Value to be assigned
    def time=(time)
      if time.nil?
        fail ArgumentError, 'time cannot be nil'
      end

      if time.to_s.length < 1
        fail ArgumentError, 'invalid value for "time", the character length must be great than or equal to 1.'
      end

      @time = time
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          id == o.id &&
          source == o.source &&
          specversion == o.specversion &&
          type == o.type &&
          datacontenttype == o.datacontenttype &&
          dataschema == o.dataschema &&
          subject == o.subject &&
          time == o.time &&
          data == o.data &&
          data_base64 == o.data_base64
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [id, source, specversion, type, datacontenttype, dataschema, subject, time, data, data_base64].hash
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
