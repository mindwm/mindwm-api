#' Create a new IoDocument
#'
#' @description
#' IoDocument Class
#'
#' @docType class
#' @title IoDocument
#' @description IoDocument Class
#' @format An \code{R6Class} generator object
#' @field type  character [optional]
#' @field source  character [optional]
#' @field data  \link{TmuxPaneIoDocument} [optional]
#' @field id Identifies the event. character
#' @field specversion The version of the CloudEvents specification which the event uses. character
#' @field datacontenttype Content type of the data value. Must adhere to RFC 2046 format. character [optional]
#' @field dataschema Identifies the schema that data adheres to. character [optional]
#' @field subject Describes the subject of the event in the context of the event producer (identified by source). character [optional]
#' @field time Timestamp of when the occurrence happened. Must adhere to RFC 3339. character [optional]
#' @field data_base64 Base64 encoded event payload. Must adhere to RFC4648. character [optional]
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
IoDocument <- R6::R6Class(
  "IoDocument",
  inherit = AnyType,
  public = list(
    `type` = NULL,
    `source` = NULL,
    `data` = NULL,
    `id` = NULL,
    `specversion` = NULL,
    `datacontenttype` = NULL,
    `dataschema` = NULL,
    `subject` = NULL,
    `time` = NULL,
    `data_base64` = NULL,
    `_field_list` = c("type", "source", "data", "id", "specversion", "datacontenttype", "dataschema", "subject", "time", "data_base64"),
    `additional_properties` = list(),
    #' Initialize a new IoDocument class.
    #'
    #' @description
    #' Initialize a new IoDocument class.
    #'
    #' @param id Identifies the event.
    #' @param specversion The version of the CloudEvents specification which the event uses.
    #' @param type type
    #' @param source source
    #' @param data data
    #' @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
    #' @param dataschema Identifies the schema that data adheres to.
    #' @param subject Describes the subject of the event in the context of the event producer (identified by source).
    #' @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
    #' @param data_base64 Base64 encoded event payload. Must adhere to RFC4648.
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `specversion`, `type` = NULL, `source` = NULL, `data` = NULL, `datacontenttype` = NULL, `dataschema` = NULL, `subject` = NULL, `time` = NULL, `data_base64` = NULL, additional_properties = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`specversion`)) {
        if (!(is.character(`specversion`) && length(`specversion`) == 1)) {
          stop(paste("Error! Invalid data for `specversion`. Must be a string:", `specversion`))
        }
        self$`specversion` <- `specversion`
      }
      if (!is.null(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`source`)) {
        if (!(is.character(`source`) && length(`source`) == 1)) {
          stop(paste("Error! Invalid data for `source`. Must be a string:", `source`))
        }
        self$`source` <- `source`
      }
      if (!is.null(`data`)) {
        stopifnot(R6::is.R6(`data`))
        self$`data` <- `data`
      }
      if (!is.null(`datacontenttype`)) {
        if (!(is.character(`datacontenttype`) && length(`datacontenttype`) == 1)) {
          stop(paste("Error! Invalid data for `datacontenttype`. Must be a string:", `datacontenttype`))
        }
        self$`datacontenttype` <- `datacontenttype`
      }
      if (!is.null(`dataschema`)) {
        if (!(is.character(`dataschema`) && length(`dataschema`) == 1)) {
          stop(paste("Error! Invalid data for `dataschema`. Must be a string:", `dataschema`))
        }
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(`dataschema`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `dataschema`. Must be a URL:", `dataschema`))
        }
        self$`dataschema` <- `dataschema`
      }
      if (!is.null(`subject`)) {
        if (!(is.character(`subject`) && length(`subject`) == 1)) {
          stop(paste("Error! Invalid data for `subject`. Must be a string:", `subject`))
        }
        self$`subject` <- `subject`
      }
      if (!is.null(`time`)) {
        if (!is.character(`time`)) {
          stop(paste("Error! Invalid data for `time`. Must be a string:", `time`))
        }
        self$`time` <- `time`
      }
      if (!is.null(`data_base64`)) {
        if (!(is.character(`data_base64`) && length(`data_base64`) == 1)) {
          stop(paste("Error! Invalid data for `data_base64`. Must be a string:", `data_base64`))
        }
        self$`data_base64` <- `data_base64`
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
    #' @return IoDocument in JSON format
    #' @export
    toJSON = function() {
      IoDocumentObject <- list()
      if (!is.null(self$`type`)) {
        IoDocumentObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`source`)) {
        IoDocumentObject[["source"]] <-
          self$`source`
      }
      if (!is.null(self$`data`)) {
        IoDocumentObject[["data"]] <-
          self$`data`$toJSON()
      }
      if (!is.null(self$`id`)) {
        IoDocumentObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`specversion`)) {
        IoDocumentObject[["specversion"]] <-
          self$`specversion`
      }
      if (!is.null(self$`datacontenttype`)) {
        IoDocumentObject[["datacontenttype"]] <-
          self$`datacontenttype`
      }
      if (!is.null(self$`dataschema`)) {
        IoDocumentObject[["dataschema"]] <-
          self$`dataschema`
      }
      if (!is.null(self$`subject`)) {
        IoDocumentObject[["subject"]] <-
          self$`subject`
      }
      if (!is.null(self$`time`)) {
        IoDocumentObject[["time"]] <-
          self$`time`
      }
      if (!is.null(self$`data_base64`)) {
        IoDocumentObject[["data_base64"]] <-
          self$`data_base64`
      }
      for (key in names(self$additional_properties)) {
        IoDocumentObject[[key]] <- self$additional_properties[[key]]
      }

      IoDocumentObject
    },
    #' Deserialize JSON string into an instance of IoDocument
    #'
    #' @description
    #' Deserialize JSON string into an instance of IoDocument
    #'
    #' @param input_json the JSON input
    #' @return the instance of IoDocument
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`source`)) {
        self$`source` <- this_object$`source`
      }
      if (!is.null(this_object$`data`)) {
        `data_object` <- TmuxPaneIoDocument$new()
        `data_object`$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
        self$`data` <- `data_object`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`specversion`)) {
        self$`specversion` <- this_object$`specversion`
      }
      if (!is.null(this_object$`datacontenttype`)) {
        self$`datacontenttype` <- this_object$`datacontenttype`
      }
      if (!is.null(this_object$`dataschema`)) {
        # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
        if (!stringr::str_detect(this_object$`dataschema`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
          stop(paste("Error! Invalid data for `dataschema`. Must be a URL:", this_object$`dataschema`))
        }
        self$`dataschema` <- this_object$`dataschema`
      }
      if (!is.null(this_object$`subject`)) {
        self$`subject` <- this_object$`subject`
      }
      if (!is.null(this_object$`time`)) {
        self$`time` <- this_object$`time`
      }
      if (!is.null(this_object$`data_base64`)) {
        self$`data_base64` <- this_object$`data_base64`
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
    #' @return IoDocument in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        },
        if (!is.null(self$`source`)) {
          sprintf(
          '"source":
            "%s"
                    ',
          self$`source`
          )
        },
        if (!is.null(self$`data`)) {
          sprintf(
          '"data":
          %s
          ',
          jsonlite::toJSON(self$`data`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`specversion`)) {
          sprintf(
          '"specversion":
            "%s"
                    ',
          self$`specversion`
          )
        },
        if (!is.null(self$`datacontenttype`)) {
          sprintf(
          '"datacontenttype":
            "%s"
                    ',
          self$`datacontenttype`
          )
        },
        if (!is.null(self$`dataschema`)) {
          sprintf(
          '"dataschema":
            "%s"
                    ',
          self$`dataschema`
          )
        },
        if (!is.null(self$`subject`)) {
          sprintf(
          '"subject":
            "%s"
                    ',
          self$`subject`
          )
        },
        if (!is.null(self$`time`)) {
          sprintf(
          '"time":
            "%s"
                    ',
          self$`time`
          )
        },
        if (!is.null(self$`data_base64`)) {
          sprintf(
          '"data_base64":
            "%s"
                    ',
          self$`data_base64`
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
    #' Deserialize JSON string into an instance of IoDocument
    #'
    #' @description
    #' Deserialize JSON string into an instance of IoDocument
    #'
    #' @param input_json the JSON input
    #' @return the instance of IoDocument
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- this_object$`type`
      self$`source` <- this_object$`source`
      self$`data` <- TmuxPaneIoDocument$new()$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
      self$`id` <- this_object$`id`
      self$`specversion` <- this_object$`specversion`
      self$`datacontenttype` <- this_object$`datacontenttype`
      # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
      if (!stringr::str_detect(this_object$`dataschema`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
        stop(paste("Error! Invalid data for `dataschema`. Must be a URL:", this_object$`dataschema`))
      }
      self$`dataschema` <- this_object$`dataschema`
      self$`subject` <- this_object$`subject`
      self$`time` <- this_object$`time`
      self$`data_base64` <- this_object$`data_base64`
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },
    #' Validate JSON input with respect to IoDocument
    #'
    #' @description
    #' Validate JSON input with respect to IoDocument and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for IoDocument: the required field `id` is missing."))
      }
      # check the required field `specversion`
      if (!is.null(input_json$`specversion`)) {
        if (!(is.character(input_json$`specversion`) && length(input_json$`specversion`) == 1)) {
          stop(paste("Error! Invalid data for `specversion`. Must be a string:", input_json$`specversion`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for IoDocument: the required field `specversion` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of IoDocument
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
      if (!str_detect(self$`source`, "[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)\\\\.tmux\\\\.[A-Za-z0-9+/]*={0,2}\\.[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}\\\\.[0-9]+?\\\\.[0-9]+?\\\\.tiodocument$")) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (nchar(self$`id`) < 1) {
        return(FALSE)
      }

      # check if the required `specversion` is null
      if (is.null(self$`specversion`)) {
        return(FALSE)
      }

      if (nchar(self$`specversion`) < 1) {
        return(FALSE)
      }

      if (nchar(self$`datacontenttype`) < 1) {
        return(FALSE)
      }

      if (nchar(self$`dataschema`) < 1) {
        return(FALSE)
      }
      # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
      if (!stringr::str_detect(self$`dataschema`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
        return(FALSE)
      }

      if (nchar(self$`subject`) < 1) {
        return(FALSE)
      }

      if (nchar(self$`time`) < 1) {
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
      if (!str_detect(self$`source`, "[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)\\\\.tmux\\\\.[A-Za-z0-9+/]*={0,2}\\.[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}\\\\.[0-9]+?\\\\.[0-9]+?\\\\.tiodocument$")) {
        invalid_fields["source"] <- "Invalid value for `source`, must conform to the pattern [a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)\\\\.tmux\\\\.[A-Za-z0-9+/]*={0,2}\\.[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}\\\\.[0-9]+?\\\\.[0-9]+?\\\\.tiodocument$."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (nchar(self$`id`) < 1) {
        invalid_fields["id"] <- "Invalid length for `id`, must be bigger than or equal to 1."
      }

      # check if the required `specversion` is null
      if (is.null(self$`specversion`)) {
        invalid_fields["specversion"] <- "Non-nullable required field `specversion` cannot be null."
      }

      if (nchar(self$`specversion`) < 1) {
        invalid_fields["specversion"] <- "Invalid length for `specversion`, must be bigger than or equal to 1."
      }

      if (nchar(self$`datacontenttype`) < 1) {
        invalid_fields["datacontenttype"] <- "Invalid length for `datacontenttype`, must be bigger than or equal to 1."
      }

      if (nchar(self$`dataschema`) < 1) {
        invalid_fields["dataschema"] <- "Invalid length for `dataschema`, must be bigger than or equal to 1."
      }
      # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
      if (!stringr::str_detect(self$`dataschema`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
        invalid_fields["dataschema"] <- "Invalid value for `dataschema`, must be URL."
      }

      if (nchar(self$`subject`) < 1) {
        invalid_fields["subject"] <- "Invalid length for `subject`, must be bigger than or equal to 1."
      }

      if (nchar(self$`time`) < 1) {
        invalid_fields["time"] <- "Invalid length for `time`, must be bigger than or equal to 1."
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
# IoDocument$unlock()
#
## Below is an example to define the print function
# IoDocument$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# IoDocument$lock()

