//
// Neo4jCaptureDataChange.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct Neo4jCaptureDataChange: Codable, JSONEncodable, Hashable {

    public var headers: [String: AnyCodable]
    public var messageKey: String
    public var meta: Neo4jCaptureDataChangeMeta
    public var offset: Int
    public var partition: Int
    public var sourceType: String
    public var timestamp: Date
    public var topic: String
    public var schema: Neo4jCaptureDataChangeSchema
    public var payload: Neo4jCaptureDataChangePayload

    public init(headers: [String: AnyCodable], messageKey: String, meta: Neo4jCaptureDataChangeMeta, offset: Int, partition: Int, sourceType: String, timestamp: Date, topic: String, schema: Neo4jCaptureDataChangeSchema, payload: Neo4jCaptureDataChangePayload) {
        self.headers = headers
        self.messageKey = messageKey
        self.meta = meta
        self.offset = offset
        self.partition = partition
        self.sourceType = sourceType
        self.timestamp = timestamp
        self.topic = topic
        self.schema = schema
        self.payload = payload
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case headers
        case messageKey = "message_key"
        case meta
        case offset
        case partition
        case sourceType = "source_type"
        case timestamp
        case topic
        case schema
        case payload
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(headers, forKey: .headers)
        try container.encode(messageKey, forKey: .messageKey)
        try container.encode(meta, forKey: .meta)
        try container.encode(offset, forKey: .offset)
        try container.encode(partition, forKey: .partition)
        try container.encode(sourceType, forKey: .sourceType)
        try container.encode(timestamp, forKey: .timestamp)
        try container.encode(topic, forKey: .topic)
        try container.encode(schema, forKey: .schema)
        try container.encode(payload, forKey: .payload)
    }
}

