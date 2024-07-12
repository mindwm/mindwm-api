#' Create a new TmuxPaneIoDocument
#'
#' @description
#' TmuxPaneIoDocument Class
#'
#' @docType class
#' @title TmuxPaneIoDocument
#' @description TmuxPaneIoDocument Class
#' @format An \code{R6Class} generator object
#' @field input User input character
#' @field output Command output (mix of stdout & stderr) character
#' @field ps1 ps1 (prompt) AFTER the input and output character
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TmuxPaneIoDocument <- R6::R6Class(
  "TmuxPaneIoDocument",
  inherit = AnyType,
  public = list(
    `input` = NULL,
    `output` = NULL,
    `ps1` = NULL,
    `_field_list` = c("input", "output", "ps1"),
    `additional_properties` = list(),
    #' Initialize a new TmuxPaneIoDocument class.
    #'
    #' @description
    #' Initialize a new TmuxPaneIoDocument class.
    #'
    #' @param input User input
    #' @param output Command output (mix of stdout & stderr)
    #' @param ps1 ps1 (prompt) AFTER the input and output
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`input`, `output`, `ps1`, additional_properties = NULL, ...) {
      if (!missing(`input`)) {
        if (!(is.character(`input`) && length(`input`) == 1)) {
          stop(paste("Error! Invalid data for `input`. Must be a string:", `input`))
        }
        self$`input` <- `input`
      }
      if (!missing(`output`)) {
        if (!(is.character(`output`) && length(`output`) == 1)) {
          stop(paste("Error! Invalid data for `output`. Must be a string:", `output`))
        }
        self$`output` <- `output`
      }
      if (!missing(`ps1`)) {
        if (!(is.character(`ps1`) && length(`ps1`) == 1)) {
          stop(paste("Error! Invalid data for `ps1`. Must be a string:", `ps1`))
        }
        self$`ps1` <- `ps1`
      }
      if (!is.null(additional_properties)) {
        for (key in names(additional_properties)) {
          self$additional_properties[[key]] <- additional_properties[[key]]
        }
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TmuxPaneIoDocument in JSON format
    #' @export
    toJSON = function() {
      TmuxPaneIoDocumentObject <- list()
      if (!is.null(self$`input`)) {
        TmuxPaneIoDocumentObject[["input"]] <-
          self$`input`
      }
      if (!is.null(self$`output`)) {
        TmuxPaneIoDocumentObject[["output"]] <-
          self$`output`
      }
      if (!is.null(self$`ps1`)) {
        TmuxPaneIoDocumentObject[["ps1"]] <-
          self$`ps1`
      }
      for (key in names(self$additional_properties)) {
        TmuxPaneIoDocumentObject[[key]] <- self$additional_properties[[key]]
      }

      TmuxPaneIoDocumentObject
    },
    #' Deserialize JSON string into an instance of TmuxPaneIoDocument
    #'
    #' @description
    #' Deserialize JSON string into an instance of TmuxPaneIoDocument
    #'
    #' @param input_json the JSON input
    #' @return the instance of TmuxPaneIoDocument
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`input`)) {
        self$`input` <- this_object$`input`
      }
      if (!is.null(this_object$`output`)) {
        self$`output` <- this_object$`output`
      }
      if (!is.null(this_object$`ps1`)) {
        self$`ps1` <- this_object$`ps1`
      }
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return TmuxPaneIoDocument in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`input`)) {
          sprintf(
          '"input":
            "%s"
                    ',
          self$`input`
          )
        },
        if (!is.null(self$`output`)) {
          sprintf(
          '"output":
            "%s"
                    ',
          self$`output`
          )
        },
        if (!is.null(self$`ps1`)) {
          sprintf(
          '"ps1":
            "%s"
                    ',
          self$`ps1`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
      json_obj <- jsonlite::fromJSON(json_string)
      for (key in names(self$additional_properties)) {
        json_obj[[key]] <- self$additional_properties[[key]]
      }
      json_string <- as.character(jsonlite::minify(jsonlite::toJSON(json_obj, auto_unbox = TRUE, digits = NA)))
    },
    #' Deserialize JSON string into an instance of TmuxPaneIoDocument
    #'
    #' @description
    #' Deserialize JSON string into an instance of TmuxPaneIoDocument
    #'
    #' @param input_json the JSON input
    #' @return the instance of TmuxPaneIoDocument
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`input` <- this_object$`input`
      self$`output` <- this_object$`output`
      self$`ps1` <- this_object$`ps1`
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },
    #' Validate JSON input with respect to TmuxPaneIoDocument
    #'
    #' @description
    #' Validate JSON input with respect to TmuxPaneIoDocument and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `input`
      if (!is.null(input_json$`input`)) {
        if (!(is.character(input_json$`input`) && length(input_json$`input`) == 1)) {
          stop(paste("Error! Invalid data for `input`. Must be a string:", input_json$`input`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TmuxPaneIoDocument: the required field `input` is missing."))
      }
      # check the required field `output`
      if (!is.null(input_json$`output`)) {
        if (!(is.character(input_json$`output`) && length(input_json$`output`) == 1)) {
          stop(paste("Error! Invalid data for `output`. Must be a string:", input_json$`output`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TmuxPaneIoDocument: the required field `output` is missing."))
      }
      # check the required field `ps1`
      if (!is.null(input_json$`ps1`)) {
        if (!(is.character(input_json$`ps1`) && length(input_json$`ps1`) == 1)) {
          stop(paste("Error! Invalid data for `ps1`. Must be a string:", input_json$`ps1`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for TmuxPaneIoDocument: the required field `ps1` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TmuxPaneIoDocument
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
      # check if the required `input` is null
      if (is.null(self$`input`)) {
        return(FALSE)
      }

      if (nchar(self$`input`) < 1) {
        return(FALSE)
      }

      # check if the required `output` is null
      if (is.null(self$`output`)) {
        return(FALSE)
      }

      if (nchar(self$`output`) < 0) {
        return(FALSE)
      }

      # check if the required `ps1` is null
      if (is.null(self$`ps1`)) {
        return(FALSE)
      }

      if (nchar(self$`ps1`) < 1) {
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
      # check if the required `input` is null
      if (is.null(self$`input`)) {
        invalid_fields["input"] <- "Non-nullable required field `input` cannot be null."
      }

      if (nchar(self$`input`) < 1) {
        invalid_fields["input"] <- "Invalid length for `input`, must be bigger than or equal to 1."
      }

      # check if the required `output` is null
      if (is.null(self$`output`)) {
        invalid_fields["output"] <- "Non-nullable required field `output` cannot be null."
      }

      if (nchar(self$`output`) < 0) {
        invalid_fields["output"] <- "Invalid length for `output`, must be bigger than or equal to 0."
      }

      # check if the required `ps1` is null
      if (is.null(self$`ps1`)) {
        invalid_fields["ps1"] <- "Non-nullable required field `ps1` cannot be null."
      }

      if (nchar(self$`ps1`) < 1) {
        invalid_fields["ps1"] <- "Invalid length for `ps1`, must be bigger than or equal to 1."
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
# TmuxPaneIoDocument$unlock()
#
## Below is an example to define the print function
# TmuxPaneIoDocument$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TmuxPaneIoDocument$lock()

