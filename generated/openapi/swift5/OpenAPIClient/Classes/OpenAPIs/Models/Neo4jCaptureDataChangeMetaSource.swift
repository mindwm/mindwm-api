//
// Neo4jCaptureDataChangeMetaSource.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct Neo4jCaptureDataChangeMetaSource: Codable, JSONEncodable, Hashable {

    public var hostname: String

    public init(hostname: String) {
        self.hostname = hostname
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case hostname
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encode(hostname, forKey: .hostname)
    }
}

