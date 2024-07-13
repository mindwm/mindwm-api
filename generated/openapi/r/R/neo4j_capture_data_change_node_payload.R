#' Create a new Neo4jCaptureDataChangeNodePayload
#'
#' @description
#' Neo4jCaptureDataChangeNodePayload Class
#'
#' @docType class
#' @title Neo4jCaptureDataChangeNodePayload
#' @description Neo4jCaptureDataChangeNodePayload Class
#' @format An \code{R6Class} generator object
#' @field after  \link{Neo4jCaptureDataChangeNodePayloadAfter}
#' @field before  character
#' @field id  character
#' @field type  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Neo4jCaptureDataChangeNodePayload <- R6::R6Class(
  "Neo4jCaptureDataChangeNodePayload",
  public = list(
    `after` = NULL,
    `before` = NULL,
    `id` = NULL,
    `type` = NULL,
    #' Initialize a new Neo4jCaptureDataChangeNodePayload class.
    #'
    #' @description
    #' Initialize a new Neo4jCaptureDataChangeNodePayload class.
    #'
    #' @param after after
    #' @param before before
    #' @param id id
    #' @param type type
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`after`, `before`, `id`, `type`, ...) {
      if (!missing(`after`)) {
        stopifnot(R6::is.R6(`after`))
        self$`after` <- `after`
      }
      if (!missing(`before`)) {
        if (!(is.character(`before`) && length(`before`) == 1)) {
          stop(paste("Error! Invalid data for `before`. Must be a string:", `before`))
        }
        self$`before` <- `before`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Neo4jCaptureDataChangeNodePayload in JSON format
    #' @export
    toJSON = function() {
      Neo4jCaptureDataChangeNodePayloadObject <- list()
      if (!is.null(self$`after`)) {
        Neo4jCaptureDataChangeNodePayloadObject[["after"]] <-
          self$`after`$toJSON()
      }
      if (!is.null(self$`before`)) {
        Neo4jCaptureDataChangeNodePayloadObject[["before"]] <-
          self$`before`
      }
      if (!is.null(self$`id`)) {
        Neo4jCaptureDataChangeNodePayloadObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`type`)) {
        Neo4jCaptureDataChangeNodePayloadObject[["type"]] <-
          self$`type`
      }
      Neo4jCaptureDataChangeNodePayloadObject
    },
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeNodePayload
    #'
    #' @description
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeNodePayload
    #'
    #' @param input_json the JSON input
    #' @return the instance of Neo4jCaptureDataChangeNodePayload
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`after`)) {
        `after_object` <- Neo4jCaptureDataChangeNodePayloadAfter$new()
        `after_object`$fromJSON(jsonlite::toJSON(this_object$`after`, auto_unbox = TRUE, digits = NA))
        self$`after` <- `after_object`
      }
      if (!is.null(this_object$`before`)) {
        self$`before` <- this_object$`before`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Neo4jCaptureDataChangeNodePayload in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`after`)) {
          sprintf(
          '"after":
          %s
          ',
          jsonlite::toJSON(self$`after`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`before`)) {
          sprintf(
          '"before":
            "%s"
                    ',
          self$`before`
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
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeNodePayload
    #'
    #' @description
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeNodePayload
    #'
    #' @param input_json the JSON input
    #' @return the instance of Neo4jCaptureDataChangeNodePayload
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`after` <- Neo4jCaptureDataChangeNodePayloadAfter$new()$fromJSON(jsonlite::toJSON(this_object$`after`, auto_unbox = TRUE, digits = NA))
      self$`before` <- this_object$`before`
      self$`id` <- this_object$`id`
      self$`type` <- this_object$`type`
      self
    },
    #' Validate JSON input with respect to Neo4jCaptureDataChangeNodePayload
    #'
    #' @description
    #' Validate JSON input with respect to Neo4jCaptureDataChangeNodePayload and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `after`
      if (!is.null(input_json$`after`)) {
        stopifnot(R6::is.R6(input_json$`after`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeNodePayload: the required field `after` is missing."))
      }
      # check the required field `before`
      if (!is.null(input_json$`before`)) {
        if (!(is.character(input_json$`before`) && length(input_json$`before`) == 1)) {
          stop(paste("Error! Invalid data for `before`. Must be a string:", input_json$`before`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeNodePayload: the required field `before` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeNodePayload: the required field `id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeNodePayload: the required field `type` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Neo4jCaptureDataChangeNodePayload
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
      # check if the required `after` is null
      if (is.null(self$`after`)) {
        return(FALSE)
      }

      # check if the required `before` is null
      if (is.null(self$`before`)) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
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
      # check if the required `after` is null
      if (is.null(self$`after`)) {
        invalid_fields["after"] <- "Non-nullable required field `after` cannot be null."
      }

      # check if the required `before` is null
      if (is.null(self$`before`)) {
        invalid_fields["before"] <- "Non-nullable required field `before` cannot be null."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
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
# Neo4jCaptureDataChangeNodePayload$unlock()
#
## Below is an example to define the print function
# Neo4jCaptureDataChangeNodePayload$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Neo4jCaptureDataChangeNodePayload$lock()

