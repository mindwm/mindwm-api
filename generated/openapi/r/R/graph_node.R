#' Create a new GraphNode
#'
#' @description
#' GraphNode Class
#'
#' @docType class
#' @title GraphNode
#' @description GraphNode Class
#' @format An \code{R6Class} generator object
#' @field id Identifies the event. character
#' @field source  character
#' @field specversion The version of the CloudEvents specification which the event uses. character
#' @field type  character
#' @field datacontenttype Content type of the data value. Must adhere to RFC 2046 format. character [optional]
#' @field dataschema Identifies the schema that data adheres to. character [optional]
#' @field subject Describes the subject of the event in the context of the event producer (identified by source). character [optional]
#' @field time Timestamp of when the occurrence happened. Must adhere to RFC 3339. character [optional]
#' @field data  \link{GraphNodeAllOfData} [optional]
#' @field data_base64 Base64 encoded event payload. Must adhere to RFC4648. character [optional]
#' @field _field_list a list of fields list(character)
#' @field additional_properties additional properties list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
GraphNode <- R6::R6Class(
  "GraphNode",
  inherit = AnyType,
  public = list(
    `id` = NULL,
    `source` = NULL,
    `specversion` = NULL,
    `type` = NULL,
    `datacontenttype` = NULL,
    `dataschema` = NULL,
    `subject` = NULL,
    `time` = NULL,
    `data` = NULL,
    `data_base64` = NULL,
    `_field_list` = c("id", "source", "specversion", "type", "datacontenttype", "dataschema", "subject", "time", "data", "data_base64"),
    `additional_properties` = list(),
    #' Initialize a new GraphNode class.
    #'
    #' @description
    #' Initialize a new GraphNode class.
    #'
    #' @param id Identifies the event.
    #' @param source source
    #' @param specversion The version of the CloudEvents specification which the event uses.
    #' @param type type
    #' @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
    #' @param dataschema Identifies the schema that data adheres to.
    #' @param subject Describes the subject of the event in the context of the event producer (identified by source).
    #' @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
    #' @param data data
    #' @param data_base64 Base64 encoded event payload. Must adhere to RFC4648.
    #' @param additional_properties additional properties (optional)
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `source`, `specversion`, `type`, `datacontenttype` = NULL, `dataschema` = NULL, `subject` = NULL, `time` = NULL, `data` = NULL, `data_base64` = NULL, additional_properties = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`source`)) {
        if (!(`source` %in% c("graph.node", "graph.relationship"))) {
          stop(paste("Error! \"", `source`, "\" cannot be assigned to `source`. Must be \"graph.node\", \"graph.relationship\".", sep = ""))
        }
        if (!(is.character(`source`) && length(`source`) == 1)) {
          stop(paste("Error! Invalid data for `source`. Must be a string:", `source`))
        }
        self$`source` <- `source`
      }
      if (!missing(`specversion`)) {
        if (!(is.character(`specversion`) && length(`specversion`) == 1)) {
          stop(paste("Error! Invalid data for `specversion`. Must be a string:", `specversion`))
        }
        self$`specversion` <- `specversion`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c("created", "updated", "deleted"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"created\", \"updated\", \"deleted\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
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
      if (!is.null(`data`)) {
        stopifnot(R6::is.R6(`data`))
        self$`data` <- `data`
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
    #' @return GraphNode in JSON format
    #' @export
    toJSON = function() {
      GraphNodeObject <- list()
      if (!is.null(self$`id`)) {
        GraphNodeObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`source`)) {
        GraphNodeObject[["source"]] <-
          self$`source`
      }
      if (!is.null(self$`specversion`)) {
        GraphNodeObject[["specversion"]] <-
          self$`specversion`
      }
      if (!is.null(self$`type`)) {
        GraphNodeObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`datacontenttype`)) {
        GraphNodeObject[["datacontenttype"]] <-
          self$`datacontenttype`
      }
      if (!is.null(self$`dataschema`)) {
        GraphNodeObject[["dataschema"]] <-
          self$`dataschema`
      }
      if (!is.null(self$`subject`)) {
        GraphNodeObject[["subject"]] <-
          self$`subject`
      }
      if (!is.null(self$`time`)) {
        GraphNodeObject[["time"]] <-
          self$`time`
      }
      if (!is.null(self$`data`)) {
        GraphNodeObject[["data"]] <-
          self$`data`$toJSON()
      }
      if (!is.null(self$`data_base64`)) {
        GraphNodeObject[["data_base64"]] <-
          self$`data_base64`
      }
      for (key in names(self$additional_properties)) {
        GraphNodeObject[[key]] <- self$additional_properties[[key]]
      }

      GraphNodeObject
    },
    #' Deserialize JSON string into an instance of GraphNode
    #'
    #' @description
    #' Deserialize JSON string into an instance of GraphNode
    #'
    #' @param input_json the JSON input
    #' @return the instance of GraphNode
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`source`)) {
        if (!is.null(this_object$`source`) && !(this_object$`source` %in% c("graph.node", "graph.relationship"))) {
          stop(paste("Error! \"", this_object$`source`, "\" cannot be assigned to `source`. Must be \"graph.node\", \"graph.relationship\".", sep = ""))
        }
        self$`source` <- this_object$`source`
      }
      if (!is.null(this_object$`specversion`)) {
        self$`specversion` <- this_object$`specversion`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("created", "updated", "deleted"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"created\", \"updated\", \"deleted\".", sep = ""))
        }
        self$`type` <- this_object$`type`
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
      if (!is.null(this_object$`data`)) {
        `data_object` <- GraphNodeAllOfData$new()
        `data_object`$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
        self$`data` <- `data_object`
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
    #' @return GraphNode in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
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
        if (!is.null(self$`specversion`)) {
          sprintf(
          '"specversion":
            "%s"
                    ',
          self$`specversion`
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
        if (!is.null(self$`data`)) {
          sprintf(
          '"data":
          %s
          ',
          jsonlite::toJSON(self$`data`$toJSON(), auto_unbox = TRUE, digits = NA)
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
    #' Deserialize JSON string into an instance of GraphNode
    #'
    #' @description
    #' Deserialize JSON string into an instance of GraphNode
    #'
    #' @param input_json the JSON input
    #' @return the instance of GraphNode
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`source`) && !(this_object$`source` %in% c("graph.node", "graph.relationship"))) {
        stop(paste("Error! \"", this_object$`source`, "\" cannot be assigned to `source`. Must be \"graph.node\", \"graph.relationship\".", sep = ""))
      }
      self$`source` <- this_object$`source`
      self$`specversion` <- this_object$`specversion`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("created", "updated", "deleted"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"created\", \"updated\", \"deleted\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`datacontenttype` <- this_object$`datacontenttype`
      # to validate URL. ref: https://stackoverflow.com/questions/73952024/url-validation-in-r
      if (!stringr::str_detect(this_object$`dataschema`, "(https?|ftp)://[^ /$.?#].[^\\s]*")) {
        stop(paste("Error! Invalid data for `dataschema`. Must be a URL:", this_object$`dataschema`))
      }
      self$`dataschema` <- this_object$`dataschema`
      self$`subject` <- this_object$`subject`
      self$`time` <- this_object$`time`
      self$`data` <- GraphNodeAllOfData$new()$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
      self$`data_base64` <- this_object$`data_base64`
      # process additional properties/fields in the payload
      for (key in names(this_object)) {
        if (!(key %in% self$`_field_list`)) { # json key not in list of fields
          self$additional_properties[[key]] <- this_object[[key]]
        }
      }

      self
    },
    #' Validate JSON input with respect to GraphNode
    #'
    #' @description
    #' Validate JSON input with respect to GraphNode and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for GraphNode: the required field `id` is missing."))
      }
      # check the required field `source`
      if (!is.null(input_json$`source`)) {
        if (!(is.character(input_json$`source`) && length(input_json$`source`) == 1)) {
          stop(paste("Error! Invalid data for `source`. Must be a string:", input_json$`source`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GraphNode: the required field `source` is missing."))
      }
      # check the required field `specversion`
      if (!is.null(input_json$`specversion`)) {
        if (!(is.character(input_json$`specversion`) && length(input_json$`specversion`) == 1)) {
          stop(paste("Error! Invalid data for `specversion`. Must be a string:", input_json$`specversion`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GraphNode: the required field `specversion` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for GraphNode: the required field `type` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of GraphNode
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (nchar(self$`id`) < 1) {
        return(FALSE)
      }

      # check if the required `source` is null
      if (is.null(self$`source`)) {
        return(FALSE)
      }

      # check if the required `specversion` is null
      if (is.null(self$`specversion`)) {
        return(FALSE)
      }

      if (nchar(self$`specversion`) < 1) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (nchar(self$`id`) < 1) {
        invalid_fields["id"] <- "Invalid length for `id`, must be bigger than or equal to 1."
      }

      # check if the required `source` is null
      if (is.null(self$`source`)) {
        invalid_fields["source"] <- "Non-nullable required field `source` cannot be null."
      }

      # check if the required `specversion` is null
      if (is.null(self$`specversion`)) {
        invalid_fields["specversion"] <- "Non-nullable required field `specversion` cannot be null."
      }

      if (nchar(self$`specversion`) < 1) {
        invalid_fields["specversion"] <- "Invalid length for `specversion`, must be bigger than or equal to 1."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
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
# GraphNode$unlock()
#
## Below is an example to define the print function
# GraphNode$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# GraphNode$lock()

