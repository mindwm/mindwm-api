//
// GraphRelationship.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct GraphRelationship: Codable, JSONEncodable, Hashable {

    public enum Source: String, Codable, CaseIterable {
        case graphPeriodRelationship = "graph.relationship"
    }
    public enum ModelType: String, Codable, CaseIterable {
        case created = "created"
        case updated = "updated"
        case deleted = "deleted"
    }
    static let idRule = StringRule(minLength: 1, maxLength: nil, pattern: nil)
    static let specversionRule = StringRule(minLength: 1, maxLength: nil, pattern: nil)
    static let datacontenttypeRule = StringRule(minLength: 1, maxLength: nil, pattern: nil)
    static let dataschemaRule = StringRule(minLength: 1, maxLength: nil, pattern: nil)
    static let subjectRule = StringRule(minLength: 1, maxLength: nil, pattern: nil)
    /** Identifies the event. */
    public var id: String
    public var source: Source
    /** The version of the CloudEvents specification which the event uses. */
    public var specversion: String
    public var type: ModelType
    /** Content type of the data value. Must adhere to RFC 2046 format. */
    public var datacontenttype: String?
    /** Identifies the schema that data adheres to. */
    public var dataschema: String?
    /** Describes the subject of the event in the context of the event producer (identified by source). */
    public var subject: String?
    /** Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
    public var time: Date?
    public var data: GraphRelationshipAllOfData?
    /** Base64 encoded event payload. Must adhere to RFC4648. */
    public var dataBase64: String?

    public init(id: String, source: Source, specversion: String, type: ModelType, datacontenttype: String? = nil, dataschema: String? = nil, subject: String? = nil, time: Date? = nil, data: GraphRelationshipAllOfData? = nil, dataBase64: String? = nil) {
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
        var additionalPropertiesContainer = encoder.container(keyedBy: String.self)
        try additionalPropertiesContainer.encodeMap(additionalProperties)
    }

    // Decodable protocol methods

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)

        id = try container.decode(String.self, forKey: .id)
        source = try container.decode(Source.self, forKey: .source)
        specversion = try container.decode(String.self, forKey: .specversion)
        type = try container.decode(ModelType.self, forKey: .type)
        datacontenttype = try container.decodeIfPresent(String.self, forKey: .datacontenttype)
        dataschema = try container.decodeIfPresent(String.self, forKey: .dataschema)
        subject = try container.decodeIfPresent(String.self, forKey: .subject)
        time = try container.decodeIfPresent(Date.self, forKey: .time)
        data = try container.decodeIfPresent(GraphRelationshipAllOfData.self, forKey: .data)
        dataBase64 = try container.decodeIfPresent(String.self, forKey: .dataBase64)
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
        let additionalPropertiesContainer = try decoder.container(keyedBy: String.self)
        additionalProperties = try additionalPropertiesContainer.decodeMap(AnyCodable.self, excludedKeys: nonAdditionalPropertyKeys)
    }
}

