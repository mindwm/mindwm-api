//
// IoDocument.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct IoDocument: Codable, JSONEncodable, Hashable {

    static let sourceRule = StringRule(minLength: nil, maxLength: nil, pattern: "/[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)\\\\.tmux\\\\.[A-Za-z0-9+\/]*={0,2}\\.[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}\\\\.[0-9]+?\\\\.[0-9]+?\\\\.tiodocument$/")
    static let idRule = StringRule(minLength: 1, maxLength: nil, pattern: nil)
    static let specversionRule = StringRule(minLength: 1, maxLength: nil, pattern: nil)
    static let datacontenttypeRule = StringRule(minLength: 1, maxLength: nil, pattern: nil)
    static let dataschemaRule = StringRule(minLength: 1, maxLength: nil, pattern: nil)
    static let subjectRule = StringRule(minLength: 1, maxLength: nil, pattern: nil)
    public var type: String?
    public var source: String?
    public var data: TmuxPaneIoDocument?
    /** Identifies the event. */
    public var id: String
    /** The version of the CloudEvents specification which the event uses. */
    public var specversion: String
    /** Content type of the data value. Must adhere to RFC 2046 format. */
    public var datacontenttype: String?
    /** Identifies the schema that data adheres to. */
    public var dataschema: String?
    /** Describes the subject of the event in the context of the event producer (identified by source). */
    public var subject: String?
    /** Timestamp of when the occurrence happened. Must adhere to RFC 3339. */
    public var time: Date?
    /** Base64 encoded event payload. Must adhere to RFC4648. */
    public var dataBase64: String?

    public init(type: String? = nil, source: String? = nil, data: TmuxPaneIoDocument? = nil, id: String, specversion: String, datacontenttype: String? = nil, dataschema: String? = nil, subject: String? = nil, time: Date? = nil, dataBase64: String? = nil) {
        self.type = type
        self.source = source
        self.data = data
        self.id = id
        self.specversion = specversion
        self.datacontenttype = datacontenttype
        self.dataschema = dataschema
        self.subject = subject
        self.time = time
        self.dataBase64 = dataBase64
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case type
        case source
        case data
        case id
        case specversion
        case datacontenttype
        case dataschema
        case subject
        case time
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
        try container.encodeIfPresent(type, forKey: .type)
        try container.encodeIfPresent(source, forKey: .source)
        try container.encodeIfPresent(data, forKey: .data)
        try container.encode(id, forKey: .id)
        try container.encode(specversion, forKey: .specversion)
        try container.encodeIfPresent(datacontenttype, forKey: .datacontenttype)
        try container.encodeIfPresent(dataschema, forKey: .dataschema)
        try container.encodeIfPresent(subject, forKey: .subject)
        try container.encodeIfPresent(time, forKey: .time)
        try container.encodeIfPresent(dataBase64, forKey: .dataBase64)
        var additionalPropertiesContainer = encoder.container(keyedBy: String.self)
        try additionalPropertiesContainer.encodeMap(additionalProperties)
    }

    // Decodable protocol methods

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)

        type = try container.decodeIfPresent(String.self, forKey: .type)
        source = try container.decodeIfPresent(String.self, forKey: .source)
        data = try container.decodeIfPresent(TmuxPaneIoDocument.self, forKey: .data)
        id = try container.decode(String.self, forKey: .id)
        specversion = try container.decode(String.self, forKey: .specversion)
        datacontenttype = try container.decodeIfPresent(String.self, forKey: .datacontenttype)
        dataschema = try container.decodeIfPresent(String.self, forKey: .dataschema)
        subject = try container.decodeIfPresent(String.self, forKey: .subject)
        time = try container.decodeIfPresent(Date.self, forKey: .time)
        dataBase64 = try container.decodeIfPresent(String.self, forKey: .dataBase64)
        var nonAdditionalPropertyKeys = Set<String>()
        nonAdditionalPropertyKeys.insert("type")
        nonAdditionalPropertyKeys.insert("source")
        nonAdditionalPropertyKeys.insert("data")
        nonAdditionalPropertyKeys.insert("id")
        nonAdditionalPropertyKeys.insert("specversion")
        nonAdditionalPropertyKeys.insert("datacontenttype")
        nonAdditionalPropertyKeys.insert("dataschema")
        nonAdditionalPropertyKeys.insert("subject")
        nonAdditionalPropertyKeys.insert("time")
        nonAdditionalPropertyKeys.insert("data_base64")
        let additionalPropertiesContainer = try decoder.container(keyedBy: String.self)
        additionalProperties = try additionalPropertiesContainer.decodeMap(AnyCodable.self, excludedKeys: nonAdditionalPropertyKeys)
    }
}

