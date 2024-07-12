goog.provide('API.Client.TmuxPaneIoDocument');

/**
 * @record
 */
API.Client.TmuxPaneIoDocument = function() {}

/**
 * User input
 * @type {!string}
 * @export
 */
API.Client.TmuxPaneIoDocument.prototype.input;

/**
 * Command output (mix of stdout & stderr)
 * @type {!string}
 * @export
 */
API.Client.TmuxPaneIoDocument.prototype.output;

/**
 * ps1 (prompt) AFTER the input and output
 * @type {!string}
 * @export
 */
API.Client.TmuxPaneIoDocument.prototype.ps1;

