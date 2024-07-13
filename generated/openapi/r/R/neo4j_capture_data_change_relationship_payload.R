#' Create a new Neo4jCaptureDataChangeRelationshipPayload
#'
#' @description
#' Neo4jCaptureDataChangeRelationshipPayload Class
#'
#' @docType class
#' @title Neo4jCaptureDataChangeRelationshipPayload
#' @description Neo4jCaptureDataChangeRelationshipPayload Class
#' @format An \code{R6Class} generator object
#' @field after  object
#' @field before  character
#' @field end  \link{Neo4jCaptureDataChangeRelationshipPayloadEnd}
#' @field id  character
#' @field label  character
#' @field start  \link{Neo4jCaptureDataChangeRelationshipPayloadEnd}
#' @field type  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Neo4jCaptureDataChangeRelationshipPayload <- R6::R6Class(
  "Neo4jCaptureDataChangeRelationshipPayload",
  public = list(
    `after` = NULL,
    `before` = NULL,
    `end` = NULL,
    `id` = NULL,
    `label` = NULL,
    `start` = NULL,
    `type` = NULL,
    #' Initialize a new Neo4jCaptureDataChangeRelationshipPayload class.
    #'
    #' @description
    #' Initialize a new Neo4jCaptureDataChangeRelationshipPayload class.
    #'
    #' @param after after
    #' @param before before
    #' @param end end
    #' @param id id
    #' @param label label
    #' @param start start
    #' @param type type
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`after`, `before`, `end`, `id`, `label`, `start`, `type`, ...) {
      if (!missing(`after`)) {
        self$`after` <- `after`
      }
      if (!missing(`before`)) {
        if (!(is.character(`before`) && length(`before`) == 1)) {
          stop(paste("Error! Invalid data for `before`. Must be a string:", `before`))
        }
        self$`before` <- `before`
      }
      if (!missing(`end`)) {
        stopifnot(R6::is.R6(`end`))
        self$`end` <- `end`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`label`)) {
        if (!(is.character(`label`) && length(`label`) == 1)) {
          stop(paste("Error! Invalid data for `label`. Must be a string:", `label`))
        }
        self$`label` <- `label`
      }
      if (!missing(`start`)) {
        stopifnot(R6::is.R6(`start`))
        self$`start` <- `start`
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
    #' @return Neo4jCaptureDataChangeRelationshipPayload in JSON format
    #' @export
    toJSON = function() {
      Neo4jCaptureDataChangeRelationshipPayloadObject <- list()
      if (!is.null(self$`after`)) {
        Neo4jCaptureDataChangeRelationshipPayloadObject[["after"]] <-
          self$`after`
      }
      if (!is.null(self$`before`)) {
        Neo4jCaptureDataChangeRelationshipPayloadObject[["before"]] <-
          self$`before`
      }
      if (!is.null(self$`end`)) {
        Neo4jCaptureDataChangeRelationshipPayloadObject[["end"]] <-
          self$`end`$toJSON()
      }
      if (!is.null(self$`id`)) {
        Neo4jCaptureDataChangeRelationshipPayloadObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`label`)) {
        Neo4jCaptureDataChangeRelationshipPayloadObject[["label"]] <-
          self$`label`
      }
      if (!is.null(self$`start`)) {
        Neo4jCaptureDataChangeRelationshipPayloadObject[["start"]] <-
          self$`start`$toJSON()
      }
      if (!is.null(self$`type`)) {
        Neo4jCaptureDataChangeRelationshipPayloadObject[["type"]] <-
          self$`type`
      }
      Neo4jCaptureDataChangeRelationshipPayloadObject
    },
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeRelationshipPayload
    #'
    #' @description
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeRelationshipPayload
    #'
    #' @param input_json the JSON input
    #' @return the instance of Neo4jCaptureDataChangeRelationshipPayload
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`after`)) {
        self$`after` <- this_object$`after`
      }
      if (!is.null(this_object$`before`)) {
        self$`before` <- this_object$`before`
      }
      if (!is.null(this_object$`end`)) {
        `end_object` <- Neo4jCaptureDataChangeRelationshipPayloadEnd$new()
        `end_object`$fromJSON(jsonlite::toJSON(this_object$`end`, auto_unbox = TRUE, digits = NA))
        self$`end` <- `end_object`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`label`)) {
        self$`label` <- this_object$`label`
      }
      if (!is.null(this_object$`start`)) {
        `start_object` <- Neo4jCaptureDataChangeRelationshipPayloadEnd$new()
        `start_object`$fromJSON(jsonlite::toJSON(this_object$`start`, auto_unbox = TRUE, digits = NA))
        self$`start` <- `start_object`
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
    #' @return Neo4jCaptureDataChangeRelationshipPayload in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`after`)) {
          sprintf(
          '"after":
            "%s"
                    ',
          self$`after`
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
        if (!is.null(self$`end`)) {
          sprintf(
          '"end":
          %s
          ',
          jsonlite::toJSON(self$`end`$toJSON(), auto_unbox = TRUE, digits = NA)
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
        if (!is.null(self$`label`)) {
          sprintf(
          '"label":
            "%s"
                    ',
          self$`label`
          )
        },
        if (!is.null(self$`start`)) {
          sprintf(
          '"start":
          %s
          ',
          jsonlite::toJSON(self$`start`$toJSON(), auto_unbox = TRUE, digits = NA)
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
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeRelationshipPayload
    #'
    #' @description
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeRelationshipPayload
    #'
    #' @param input_json the JSON input
    #' @return the instance of Neo4jCaptureDataChangeRelationshipPayload
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`after` <- this_object$`after`
      self$`before` <- this_object$`before`
      self$`end` <- Neo4jCaptureDataChangeRelationshipPayloadEnd$new()$fromJSON(jsonlite::toJSON(this_object$`end`, auto_unbox = TRUE, digits = NA))
      self$`id` <- this_object$`id`
      self$`label` <- this_object$`label`
      self$`start` <- Neo4jCaptureDataChangeRelationshipPayloadEnd$new()$fromJSON(jsonlite::toJSON(this_object$`start`, auto_unbox = TRUE, digits = NA))
      self$`type` <- this_object$`type`
      self
    },
    #' Validate JSON input with respect to Neo4jCaptureDataChangeRelationshipPayload
    #'
    #' @description
    #' Validate JSON input with respect to Neo4jCaptureDataChangeRelationshipPayload and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `after`
      if (!is.null(input_json$`after`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeRelationshipPayload: the required field `after` is missing."))
      }
      # check the required field `before`
      if (!is.null(input_json$`before`)) {
        if (!(is.character(input_json$`before`) && length(input_json$`before`) == 1)) {
          stop(paste("Error! Invalid data for `before`. Must be a string:", input_json$`before`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeRelationshipPayload: the required field `before` is missing."))
      }
      # check the required field `end`
      if (!is.null(input_json$`end`)) {
        stopifnot(R6::is.R6(input_json$`end`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeRelationshipPayload: the required field `end` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeRelationshipPayload: the required field `id` is missing."))
      }
      # check the required field `label`
      if (!is.null(input_json$`label`)) {
        if (!(is.character(input_json$`label`) && length(input_json$`label`) == 1)) {
          stop(paste("Error! Invalid data for `label`. Must be a string:", input_json$`label`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeRelationshipPayload: the required field `label` is missing."))
      }
      # check the required field `start`
      if (!is.null(input_json$`start`)) {
        stopifnot(R6::is.R6(input_json$`start`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeRelationshipPayload: the required field `start` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeRelationshipPayload: the required field `type` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Neo4jCaptureDataChangeRelationshipPayload
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

      # check if the required `end` is null
      if (is.null(self$`end`)) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `label` is null
      if (is.null(self$`label`)) {
        return(FALSE)
      }

      # check if the required `start` is null
      if (is.null(self$`start`)) {
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

      # check if the required `end` is null
      if (is.null(self$`end`)) {
        invalid_fields["end"] <- "Non-nullable required field `end` cannot be null."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `label` is null
      if (is.null(self$`label`)) {
        invalid_fields["label"] <- "Non-nullable required field `label` cannot be null."
      }

      # check if the required `start` is null
      if (is.null(self$`start`)) {
        invalid_fields["start"] <- "Non-nullable required field `start` cannot be null."
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
# Neo4jCaptureDataChangeRelationshipPayload$unlock()
#
## Below is an example to define the print function
# Neo4jCaptureDataChangeRelationshipPayload$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Neo4jCaptureDataChangeRelationshipPayload$lock()

