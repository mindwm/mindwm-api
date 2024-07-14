//
// Neo4jCaptureDataChangePayload.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public enum Neo4jCaptureDataChangePayload: Codable, JSONEncodable, Hashable {
    case typeNeo4jCaptureDataChangeNodePayload(Neo4jCaptureDataChangeNodePayload)
    case typeNeo4jCaptureDataChangeRelationshipPayload(Neo4jCaptureDataChangeRelationshipPayload)

    public func encode(to encoder: Encoder) throws {
        var container = encoder.singleValueContainer()
        switch self {
        case .typeNeo4jCaptureDataChangeNodePayload(let value):
            try container.encode(value)
        case .typeNeo4jCaptureDataChangeRelationshipPayload(let value):
            try container.encode(value)
        }
    }

    public init(from decoder: Decoder) throws {
        let container = try decoder.singleValueContainer()
        if let value = try? container.decode(Neo4jCaptureDataChangeNodePayload.self) {
            self = .typeNeo4jCaptureDataChangeNodePayload(value)
        } else if let value = try? container.decode(Neo4jCaptureDataChangeRelationshipPayload.self) {
            self = .typeNeo4jCaptureDataChangeRelationshipPayload(value)
        } else {
            throw DecodingError.typeMismatch(Self.Type.self, .init(codingPath: decoder.codingPath, debugDescription: "Unable to decode instance of Neo4jCaptureDataChangePayload"))
        }
    }
}
