//
// Clipboard.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

public struct Clipboard: Codable, JSONEncodable, Hashable {

    public enum ClipboardType: String, Codable, CaseIterable {
        case primary = "Primary"
        case secondary = "Secondary"
        case clipboard = "Clipboard"
    }
    public var context: ClipboardContext
    /** Type of clipboard */
    public var clipboardType: ClipboardType
    /** Clipboard content */
    public var content: String
    public var selectionStart: Vector2int?
    public var selectionEnd: Vector2int?

    public init(context: ClipboardContext, clipboardType: ClipboardType, content: String, selectionStart: Vector2int? = nil, selectionEnd: Vector2int? = nil) {
        self.context = context
        self.clipboardType = clipboardType
        self.content = content
        self.selectionStart = selectionStart
        self.selectionEnd = selectionEnd
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case context
        case clipboardType
        case content
        case selectionStart
        case selectionEnd
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
        try container.encode(context, forKey: .context)
        try container.encode(clipboardType, forKey: .clipboardType)
        try container.encode(content, forKey: .content)
        try container.encodeIfPresent(selectionStart, forKey: .selectionStart)
        try container.encodeIfPresent(selectionEnd, forKey: .selectionEnd)
        var additionalPropertiesContainer = encoder.container(keyedBy: String.self)
        try additionalPropertiesContainer.encodeMap(additionalProperties)
    }

    // Decodable protocol methods

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)

        context = try container.decode(ClipboardContext.self, forKey: .context)
        clipboardType = try container.decode(ClipboardType.self, forKey: .clipboardType)
        content = try container.decode(String.self, forKey: .content)
        selectionStart = try container.decodeIfPresent(Vector2int.self, forKey: .selectionStart)
        selectionEnd = try container.decodeIfPresent(Vector2int.self, forKey: .selectionEnd)
        var nonAdditionalPropertyKeys = Set<String>()
        nonAdditionalPropertyKeys.insert("context")
        nonAdditionalPropertyKeys.insert("clipboardType")
        nonAdditionalPropertyKeys.insert("content")
        nonAdditionalPropertyKeys.insert("selectionStart")
        nonAdditionalPropertyKeys.insert("selectionEnd")
        let additionalPropertiesContainer = try decoder.container(keyedBy: String.self)
        additionalProperties = try additionalPropertiesContainer.decodeMap(AnyCodable.self, excludedKeys: nonAdditionalPropertyKeys)
    }
}

