//
// TouchEvent.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct TouchEvent: Codable, JSONEncodable, Hashable {

    static let idRule = StringRule(minLength: 1, maxLength: nil, pattern: nil)
    static let specversionRule = StringRule(minLength: 1, maxLength: nil, pattern: nil)
    static let datacontenttypeRule = StringRule(minLength: 1, maxLength: nil, pattern: nil)
    static let dataschemaRule = StringRule(minLength: 1, maxLength: nil, pattern: nil)
    /** Identifies the event. */
    public var id: String
    public var source: String
    /** The version of the CloudEvents specification which the event uses. */
    public var specversion: String
    public var type: String = "touch"
    /** Content type of the data value. Must adhere to RFC 2046 format. */
    public var datacontenttype: String?
    /** Identifies the schema that data adheres to. */
    public var dataschema: String?
    public var subject: String? = "node"
    /** Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
    public var time: Date?
    public var data: Touch?
    /** Base64 encoded event payload. Must adhere to RFC4648. */
    public var dataBase64: String?
    /** knative broker ttl, workaround for https://github.com/knative-extensions/eventing-natss/issues/518 */
    public var knativebrokerttl: String? = "255"

    public init(id: String, source: String, specversion: String, type: String = "touch", datacontenttype: String? = nil, dataschema: String? = nil, subject: String? = "node", time: Date? = nil, data: Touch? = nil, dataBase64: String? = nil, knativebrokerttl: String? = "255") {
        self.id = id
        self.source = source
        self.specversion = specversion
        self.type = type
        self.datacontenttype = datacontenttype
        self.dataschema = dataschema
        self.subject = subject
        self.time = time
        self.data = data
        self.dataBase64 = dataBase64
        self.knativebrokerttl = knativebrokerttl
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case source
        case specversion
        case type
        case datacontenttype
        case dataschema
        case subject
        case time
        case data
        case dataBase64 = "data_base64"
        case knativebrokerttl
    }

    public var additionalProperties: [String: AnyCodable] = [:]

    public subscript(key: String) -> AnyCodable? {
        get {
            if let value = additionalProperties[key] {
                return value
            }
            return nil
        }

        set {
            additionalProperties[key] = newValue
        }
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(id, forKey: .id)
        try container.encode(source, forKey: .source)
        try container.encode(specversion, forKey: .specversion)
        try container.encode(type, forKey: .type)
        try container.encodeIfPresent(datacontenttype, forKey: .datacontenttype)
        try container.encodeIfPresent(dataschema, forKey: .dataschema)
        try container.encodeIfPresent(subject, forKey: .subject)
        try container.encodeIfPresent(time, forKey: .time)
        try container.encodeIfPresent(data, forKey: .data)
        try container.encodeIfPresent(dataBase64, forKey: .dataBase64)
        try container.encodeIfPresent(knativebrokerttl, forKey: .knativebrokerttl)
        var additionalPropertiesContainer = encoder.container(keyedBy: String.self)
        try additionalPropertiesContainer.encodeMap(additionalProperties)
    }

    // Decodable protocol methods

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)

        id = try container.decode(String.self, forKey: .id)
        source = try container.decode(String.self, forKey: .source)
        specversion = try container.decode(String.self, forKey: .specversion)
        type = try container.decode(String.self, forKey: .type)
        datacontenttype = try container.decodeIfPresent(String.self, forKey: .datacontenttype)
        dataschema = try container.decodeIfPresent(String.self, forKey: .dataschema)
        subject = try container.decodeIfPresent(String.self, forKey: .subject)
        time = try container.decodeIfPresent(Date.self, forKey: .time)
        data = try container.decodeIfPresent(Touch.self, forKey: .data)
        dataBase64 = try container.decodeIfPresent(String.self, forKey: .dataBase64)
        knativebrokerttl = try container.decodeIfPresent(String.self, forKey: .knativebrokerttl)
        var nonAdditionalPropertyKeys = Set<String>()
        nonAdditionalPropertyKeys.insert("id")
        nonAdditionalPropertyKeys.insert("source")
        nonAdditionalPropertyKeys.insert("specversion")
        nonAdditionalPropertyKeys.insert("type")
        nonAdditionalPropertyKeys.insert("datacontenttype")
        nonAdditionalPropertyKeys.insert("dataschema")
        nonAdditionalPropertyKeys.insert("subject")
        nonAdditionalPropertyKeys.insert("time")
        nonAdditionalPropertyKeys.insert("data")
        nonAdditionalPropertyKeys.insert("data_base64")
        nonAdditionalPropertyKeys.insert("knativebrokerttl")
        let additionalPropertiesContainer = try decoder.container(keyedBy: String.self)
        additionalProperties = try additionalPropertiesContainer.decodeMap(AnyCodable.self, excludedKeys: nonAdditionalPropertyKeys)
    }
}

