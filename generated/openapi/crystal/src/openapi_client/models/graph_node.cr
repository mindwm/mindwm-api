# #Mindwm API
#
##This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
#
#The version of the OpenAPI document: 0.1.0
#
#Generated by: https://openapi-generator.tech
#Generator version: 7.7.0
#

require "big"
require "json"
require "time"

module OpenAPIClient
  class GraphNode
    include JSON::Serializable

    # Required properties
    # Identifies the event.
    @[JSON::Field(key: "id", type: String, nillable: false, emit_null: false)]
    property id : String

    @[JSON::Field(key: "source", type: String, nillable: false, emit_null: false)]
    property source : String

    # The version of the CloudEvents specification which the event uses.
    @[JSON::Field(key: "specversion", type: String, nillable: false, emit_null: false)]
    property specversion : String

    @[JSON::Field(key: "type", type: String, nillable: false, emit_null: false)]
    property _type : String

    # Optional properties
    # Content type of the data value. Must adhere to RFC 2046 format.
    @[JSON::Field(key: "datacontenttype", type: String?, nillable: true, emit_null: false)]
    property datacontenttype : String?

    # Identifies the schema that data adheres to.
    @[JSON::Field(key: "dataschema", type: String?, nillable: true, emit_null: false)]
    property dataschema : String?

    # Describes the subject of the event in the context of the event producer (identified by source).
    @[JSON::Field(key: "subject", type: String?, nillable: true, emit_null: false)]
    property subject : String?

    # Timestamp of when the occurrence happened. Must adhere to RFC 3339.
    @[JSON::Field(key: "time", type: Time?, nillable: true, emit_null: false)]
    property time : Time?

    @[JSON::Field(key: "data", type: GraphNodeAllOfData?, nillable: true, emit_null: false)]
    property data : GraphNodeAllOfData?

    # Base64 encoded event payload. Must adhere to RFC4648.
    @[JSON::Field(key: "data_base64", type: String?, nillable: true, emit_null: false)]
    property data_base64 : String?

    class EnumAttributeValidator
      getter datatype : String
      getter allowable_values : Array(String)

      def initialize(datatype, allowable_values)
        @datatype = datatype
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
        !value || allowable_values.includes?(value)
      end
    end

    # List of class defined in allOf (OpenAPI v3)
    def self.openapi_all_of
      [
      :"CloudEvent"
      ]
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(@id : String, @source : String, @specversion : String, @_type : String, @datacontenttype : String?, @dataschema : String?, @subject : String?, @time : Time?, @data : GraphNodeAllOfData?, @data_base64 : String?)
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array(String).new
      if @id.to_s.size < 1
        invalid_properties.push("invalid value for \"id\", the character length must be great than or equal to 1.")
      end

      if @specversion.to_s.size < 1
        invalid_properties.push("invalid value for \"specversion\", the character length must be great than or equal to 1.")
      end

      if !@datacontenttype.nil? && @datacontenttype.to_s.size < 1
        invalid_properties.push("invalid value for \"datacontenttype\", the character length must be great than or equal to 1.")
      end

      if !@dataschema.nil? && @dataschema.to_s.size < 1
        invalid_properties.push("invalid value for \"dataschema\", the character length must be great than or equal to 1.")
      end

      if !@subject.nil? && @subject.to_s.size < 1
        invalid_properties.push("invalid value for \"subject\", the character length must be great than or equal to 1.")
      end

      if !@time.nil? && @time.to_s.size < 1
        invalid_properties.push("invalid value for \"time\", the character length must be great than or equal to 1.")
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @id.to_s.size < 1
      source_validator = EnumAttributeValidator.new("String", ["graph.node"])
      return false unless source_validator.valid?(@source)
      return false if @specversion.to_s.size < 1
      _type_validator = EnumAttributeValidator.new("String", ["created", "updated", "deleted"])
      return false unless _type_validator.valid?(@_type)
      return false if !@datacontenttype.nil? && @datacontenttype.to_s.size < 1
      return false if !@dataschema.nil? && @dataschema.to_s.size < 1
      return false if !@subject.nil? && @subject.to_s.size < 1
      return false if !@time.nil? && @time.to_s.size < 1
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] id Value to be assigned
    def id=(id)
      if id.to_s.size < 1
        raise ArgumentError.new("invalid value for \"id\", the character length must be great than or equal to 1.")
      end

      @id = id
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] source Object to be assigned
    def source=(source)
      validator = EnumAttributeValidator.new("String", ["graph.node"])
      unless validator.valid?(source)
        raise ArgumentError.new("invalid value for \"source\", must be one of #{validator.allowable_values}.")
      end
      @source = source
    end

    # Custom attribute writer method with validation
    # @param [Object] specversion Value to be assigned
    def specversion=(specversion)
      if specversion.to_s.size < 1
        raise ArgumentError.new("invalid value for \"specversion\", the character length must be great than or equal to 1.")
      end

      @specversion = specversion
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] _type Object to be assigned
    def _type=(_type)
      validator = EnumAttributeValidator.new("String", ["created", "updated", "deleted"])
      unless validator.valid?(_type)
        raise ArgumentError.new("invalid value for \"_type\", must be one of #{validator.allowable_values}.")
      end
      @_type = _type
    end

    # Custom attribute writer method with validation
    # @param [Object] datacontenttype Value to be assigned
    def datacontenttype=(datacontenttype)
      if !datacontenttype.nil? && datacontenttype.to_s.size < 1
        raise ArgumentError.new("invalid value for \"datacontenttype\", the character length must be great than or equal to 1.")
      end

      @datacontenttype = datacontenttype
    end

    # Custom attribute writer method with validation
    # @param [Object] dataschema Value to be assigned
    def dataschema=(dataschema)
      if !dataschema.nil? && dataschema.to_s.size < 1
        raise ArgumentError.new("invalid value for \"dataschema\", the character length must be great than or equal to 1.")
      end

      @dataschema = dataschema
    end

    # Custom attribute writer method with validation
    # @param [Object] subject Value to be assigned
    def subject=(subject)
      if !subject.nil? && subject.to_s.size < 1
        raise ArgumentError.new("invalid value for \"subject\", the character length must be great than or equal to 1.")
      end

      @subject = subject
    end

    # Custom attribute writer method with validation
    # @param [Object] time Value to be assigned
    def time=(time)
      if !time.nil? && time.to_s.size < 1
        raise ArgumentError.new("invalid value for \"time\", the character length must be great than or equal to 1.")
      end

      @time = time
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.same?(o)
      self.class == o.class &&
          id == o.id &&
          source == o.source &&
          specversion == o.specversion &&
          _type == o._type &&
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
      [id, source, specversion, _type, datacontenttype, dataschema, subject, time, data, data_base64].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if !attributes[self.class.attribute_map[key]]? && self.class.openapi_nullable.includes?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
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
        ({} of Symbol => String).tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = OpenAPIClient.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
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
      hash = {} of Symbol => String
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.includes?(attr)
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
        ({} of Symbol => String).tap do |hash|
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
