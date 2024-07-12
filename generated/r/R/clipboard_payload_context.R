#' Create a new ClipboardPayloadContext
#'
#' @description
#' Selection context
#'
#' @docType class
#' @title ClipboardPayloadContext
#' @description ClipboardPayloadContext Class
#' @format An \code{R6Class} generator object
#' @field window window id character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ClipboardPayloadContext <- R6::R6Class(
  "ClipboardPayloadContext",
  public = list(
    `window` = NULL,
    #' Initialize a new ClipboardPayloadContext class.
    #'
    #' @description
    #' Initialize a new ClipboardPayloadContext class.
    #'
    #' @param window window id
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`window` = NULL, ...) {
      if (!is.null(`window`)) {
        if (!(is.character(`window`) && length(`window`) == 1)) {
          stop(paste("Error! Invalid data for `window`. Must be a string:", `window`))
        }
        self$`window` <- `window`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ClipboardPayloadContext in JSON format
    #' @export
    toJSON = function() {
      ClipboardPayloadContextObject <- list()
      if (!is.null(self$`window`)) {
        ClipboardPayloadContextObject[["window"]] <-
          self$`window`
      }
      ClipboardPayloadContextObject
    },
    #' Deserialize JSON string into an instance of ClipboardPayloadContext
    #'
    #' @description
    #' Deserialize JSON string into an instance of ClipboardPayloadContext
    #'
    #' @param input_json the JSON input
    #' @return the instance of ClipboardPayloadContext
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`window`)) {
        self$`window` <- this_object$`window`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ClipboardPayloadContext in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`window`)) {
          sprintf(
          '"window":
            "%s"
                    ',
          self$`window`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ClipboardPayloadContext
    #'
    #' @description
    #' Deserialize JSON string into an instance of ClipboardPayloadContext
    #'
    #' @param input_json the JSON input
    #' @return the instance of ClipboardPayloadContext
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`window` <- this_object$`window`
      self
    },
    #' Validate JSON input with respect to ClipboardPayloadContext
    #'
    #' @description
    #' Validate JSON input with respect to ClipboardPayloadContext and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ClipboardPayloadContext
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# ClipboardPayloadContext$unlock()
#
## Below is an example to define the print function
# ClipboardPayloadContext$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ClipboardPayloadContext$lock()

