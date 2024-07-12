#' Create a new ClipboardPayload
#'
#' @description
#' ClipboardPayload Class
#'
#' @docType class
#' @title ClipboardPayload
#' @description ClipboardPayload Class
#' @format An \code{R6Class} generator object
#' @field start Starting position of clipboard selection [x,y] list(integer) [optional]
#' @field stop Ending position of clipboard selection [x,y] list(integer) [optional]
#' @field data Clipboard data character [optional]
#' @field type Clipboard type character [optional]
#' @field context  \link{ClipboardPayloadContext} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ClipboardPayload <- R6::R6Class(
  "ClipboardPayload",
  public = list(
    `start` = NULL,
    `stop` = NULL,
    `data` = NULL,
    `type` = NULL,
    `context` = NULL,
    #' Initialize a new ClipboardPayload class.
    #'
    #' @description
    #' Initialize a new ClipboardPayload class.
    #'
    #' @param start Starting position of clipboard selection [x,y]
    #' @param stop Ending position of clipboard selection [x,y]
    #' @param data Clipboard data
    #' @param type Clipboard type
    #' @param context context
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`start` = NULL, `stop` = NULL, `data` = NULL, `type` = NULL, `context` = NULL, ...) {
      if (!is.null(`start`)) {
        stopifnot(is.vector(`start`), length(`start`) != 0)
        sapply(`start`, function(x) stopifnot(is.character(x)))
        self$`start` <- `start`
      }
      if (!is.null(`stop`)) {
        stopifnot(is.vector(`stop`), length(`stop`) != 0)
        sapply(`stop`, function(x) stopifnot(is.character(x)))
        self$`stop` <- `stop`
      }
      if (!is.null(`data`)) {
        if (!(is.character(`data`) && length(`data`) == 1)) {
          stop(paste("Error! Invalid data for `data`. Must be a string:", `data`))
        }
        self$`data` <- `data`
      }
      if (!is.null(`type`)) {
        if (!(`type` %in% c("primary", "secondary", "clipboard"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"primary\", \"secondary\", \"clipboard\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`context`)) {
        stopifnot(R6::is.R6(`context`))
        self$`context` <- `context`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ClipboardPayload in JSON format
    #' @export
    toJSON = function() {
      ClipboardPayloadObject <- list()
      if (!is.null(self$`start`)) {
        ClipboardPayloadObject[["start"]] <-
          self$`start`
      }
      if (!is.null(self$`stop`)) {
        ClipboardPayloadObject[["stop"]] <-
          self$`stop`
      }
      if (!is.null(self$`data`)) {
        ClipboardPayloadObject[["data"]] <-
          self$`data`
      }
      if (!is.null(self$`type`)) {
        ClipboardPayloadObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`context`)) {
        ClipboardPayloadObject[["context"]] <-
          self$`context`$toJSON()
      }
      ClipboardPayloadObject
    },
    #' Deserialize JSON string into an instance of ClipboardPayload
    #'
    #' @description
    #' Deserialize JSON string into an instance of ClipboardPayload
    #'
    #' @param input_json the JSON input
    #' @return the instance of ClipboardPayload
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`start`)) {
        self$`start` <- ApiClient$new()$deserializeObj(this_object$`start`, "array[integer]", loadNamespace("MindwWM"))
      }
      if (!is.null(this_object$`stop`)) {
        self$`stop` <- ApiClient$new()$deserializeObj(this_object$`stop`, "array[integer]", loadNamespace("MindwWM"))
      }
      if (!is.null(this_object$`data`)) {
        self$`data` <- this_object$`data`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("primary", "secondary", "clipboard"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"primary\", \"secondary\", \"clipboard\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`context`)) {
        `context_object` <- ClipboardPayloadContext$new()
        `context_object`$fromJSON(jsonlite::toJSON(this_object$`context`, auto_unbox = TRUE, digits = NA))
        self$`context` <- `context_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ClipboardPayload in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`start`)) {
          sprintf(
          '"start":
             [%s]
          ',
          paste(unlist(lapply(self$`start`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`stop`)) {
          sprintf(
          '"stop":
             [%s]
          ',
          paste(unlist(lapply(self$`stop`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`data`)) {
          sprintf(
          '"data":
            "%s"
                    ',
          self$`data`
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        },
        if (!is.null(self$`context`)) {
          sprintf(
          '"context":
          %s
          ',
          jsonlite::toJSON(self$`context`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ClipboardPayload
    #'
    #' @description
    #' Deserialize JSON string into an instance of ClipboardPayload
    #'
    #' @param input_json the JSON input
    #' @return the instance of ClipboardPayload
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`start` <- ApiClient$new()$deserializeObj(this_object$`start`, "array[integer]", loadNamespace("MindwWM"))
      self$`stop` <- ApiClient$new()$deserializeObj(this_object$`stop`, "array[integer]", loadNamespace("MindwWM"))
      self$`data` <- this_object$`data`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("primary", "secondary", "clipboard"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"primary\", \"secondary\", \"clipboard\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`context` <- ClipboardPayloadContext$new()$fromJSON(jsonlite::toJSON(this_object$`context`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to ClipboardPayload
    #'
    #' @description
    #' Validate JSON input with respect to ClipboardPayload and throw an exception if invalid
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
    #' @return String representation of ClipboardPayload
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
      if (length(self$`start`) > 2) {
        return(FALSE)
      }
      if (length(self$`start`) < 2) {
        return(FALSE)
      }

      if (length(self$`stop`) > 2) {
        return(FALSE)
      }
      if (length(self$`stop`) < 2) {
        return(FALSE)
      }

      if (nchar(self$`data`) < 1) {
        return(FALSE)
      }

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
      if (length(self$`start`) > 2) {
        invalid_fields["start"] <- "Invalid length for `start`, number of items must be less than or equal to 2."
      }
      if (length(self$`start`) < 2) {
        invalid_fields["start"] <- "Invalid length for ``, number of items must be greater than or equal to 2."
      }

      if (length(self$`stop`) > 2) {
        invalid_fields["stop"] <- "Invalid length for `stop`, number of items must be less than or equal to 2."
      }
      if (length(self$`stop`) < 2) {
        invalid_fields["stop"] <- "Invalid length for ``, number of items must be greater than or equal to 2."
      }

      if (nchar(self$`data`) < 1) {
        invalid_fields["data"] <- "Invalid length for `data`, must be bigger than or equal to 1."
      }

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
# ClipboardPayload$unlock()
#
## Below is an example to define the print function
# ClipboardPayload$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ClipboardPayload$lock()

