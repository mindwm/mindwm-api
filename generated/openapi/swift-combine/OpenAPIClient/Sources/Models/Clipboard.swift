//
// Clipboard.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

public struct Clipboard: Codable {
    public enum ClipboardType: String, Codable, CaseIterable {
        case primary = "Primary"
        case secondary = "Secondary"
        case clipboard = "Clipboard"
    }
    public var context: ClipboardContext
    /// Type of clipboard
    public var clipboardType: ClipboardType
    /// Clipboard content
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
}