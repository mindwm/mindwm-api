#' Create a new Neo4jCaptureDataChangeMeta
#'
#' @description
#' Neo4jCaptureDataChangeMeta Class
#'
#' @docType class
#' @title Neo4jCaptureDataChangeMeta
#' @description Neo4jCaptureDataChangeMeta Class
#' @format An \code{R6Class} generator object
#' @field operation  character
#' @field source  \link{Neo4jCaptureDataChangeMetaSource}
#' @field timestamp  integer
#' @field txEventId  integer
#' @field txEventsCount  integer
#' @field txId  integer
#' @field username  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Neo4jCaptureDataChangeMeta <- R6::R6Class(
  "Neo4jCaptureDataChangeMeta",
  public = list(
    `operation` = NULL,
    `source` = NULL,
    `timestamp` = NULL,
    `txEventId` = NULL,
    `txEventsCount` = NULL,
    `txId` = NULL,
    `username` = NULL,
    #' Initialize a new Neo4jCaptureDataChangeMeta class.
    #'
    #' @description
    #' Initialize a new Neo4jCaptureDataChangeMeta class.
    #'
    #' @param operation operation
    #' @param source source
    #' @param timestamp timestamp
    #' @param txEventId txEventId
    #' @param txEventsCount txEventsCount
    #' @param txId txId
    #' @param username username
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`operation`, `source`, `timestamp`, `txEventId`, `txEventsCount`, `txId`, `username`, ...) {
      if (!missing(`operation`)) {
        if (!(is.character(`operation`) && length(`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", `operation`))
        }
        self$`operation` <- `operation`
      }
      if (!missing(`source`)) {
        stopifnot(R6::is.R6(`source`))
        self$`source` <- `source`
      }
      if (!missing(`timestamp`)) {
        if (!(is.numeric(`timestamp`) && length(`timestamp`) == 1)) {
          stop(paste("Error! Invalid data for `timestamp`. Must be an integer:", `timestamp`))
        }
        self$`timestamp` <- `timestamp`
      }
      if (!missing(`txEventId`)) {
        if (!(is.numeric(`txEventId`) && length(`txEventId`) == 1)) {
          stop(paste("Error! Invalid data for `txEventId`. Must be an integer:", `txEventId`))
        }
        self$`txEventId` <- `txEventId`
      }
      if (!missing(`txEventsCount`)) {
        if (!(is.numeric(`txEventsCount`) && length(`txEventsCount`) == 1)) {
          stop(paste("Error! Invalid data for `txEventsCount`. Must be an integer:", `txEventsCount`))
        }
        self$`txEventsCount` <- `txEventsCount`
      }
      if (!missing(`txId`)) {
        if (!(is.numeric(`txId`) && length(`txId`) == 1)) {
          stop(paste("Error! Invalid data for `txId`. Must be an integer:", `txId`))
        }
        self$`txId` <- `txId`
      }
      if (!missing(`username`)) {
        if (!(is.character(`username`) && length(`username`) == 1)) {
          stop(paste("Error! Invalid data for `username`. Must be a string:", `username`))
        }
        self$`username` <- `username`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Neo4jCaptureDataChangeMeta in JSON format
    #' @export
    toJSON = function() {
      Neo4jCaptureDataChangeMetaObject <- list()
      if (!is.null(self$`operation`)) {
        Neo4jCaptureDataChangeMetaObject[["operation"]] <-
          self$`operation`
      }
      if (!is.null(self$`source`)) {
        Neo4jCaptureDataChangeMetaObject[["source"]] <-
          self$`source`$toJSON()
      }
      if (!is.null(self$`timestamp`)) {
        Neo4jCaptureDataChangeMetaObject[["timestamp"]] <-
          self$`timestamp`
      }
      if (!is.null(self$`txEventId`)) {
        Neo4jCaptureDataChangeMetaObject[["txEventId"]] <-
          self$`txEventId`
      }
      if (!is.null(self$`txEventsCount`)) {
        Neo4jCaptureDataChangeMetaObject[["txEventsCount"]] <-
          self$`txEventsCount`
      }
      if (!is.null(self$`txId`)) {
        Neo4jCaptureDataChangeMetaObject[["txId"]] <-
          self$`txId`
      }
      if (!is.null(self$`username`)) {
        Neo4jCaptureDataChangeMetaObject[["username"]] <-
          self$`username`
      }
      Neo4jCaptureDataChangeMetaObject
    },
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeMeta
    #'
    #' @description
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeMeta
    #'
    #' @param input_json the JSON input
    #' @return the instance of Neo4jCaptureDataChangeMeta
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`operation`)) {
        self$`operation` <- this_object$`operation`
      }
      if (!is.null(this_object$`source`)) {
        `source_object` <- Neo4jCaptureDataChangeMetaSource$new()
        `source_object`$fromJSON(jsonlite::toJSON(this_object$`source`, auto_unbox = TRUE, digits = NA))
        self$`source` <- `source_object`
      }
      if (!is.null(this_object$`timestamp`)) {
        self$`timestamp` <- this_object$`timestamp`
      }
      if (!is.null(this_object$`txEventId`)) {
        self$`txEventId` <- this_object$`txEventId`
      }
      if (!is.null(this_object$`txEventsCount`)) {
        self$`txEventsCount` <- this_object$`txEventsCount`
      }
      if (!is.null(this_object$`txId`)) {
        self$`txId` <- this_object$`txId`
      }
      if (!is.null(this_object$`username`)) {
        self$`username` <- this_object$`username`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Neo4jCaptureDataChangeMeta in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`operation`)) {
          sprintf(
          '"operation":
            "%s"
                    ',
          self$`operation`
          )
        },
        if (!is.null(self$`source`)) {
          sprintf(
          '"source":
          %s
          ',
          jsonlite::toJSON(self$`source`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`timestamp`)) {
          sprintf(
          '"timestamp":
            %d
                    ',
          self$`timestamp`
          )
        },
        if (!is.null(self$`txEventId`)) {
          sprintf(
          '"txEventId":
            %d
                    ',
          self$`txEventId`
          )
        },
        if (!is.null(self$`txEventsCount`)) {
          sprintf(
          '"txEventsCount":
            %d
                    ',
          self$`txEventsCount`
          )
        },
        if (!is.null(self$`txId`)) {
          sprintf(
          '"txId":
            %d
                    ',
          self$`txId`
          )
        },
        if (!is.null(self$`username`)) {
          sprintf(
          '"username":
            "%s"
                    ',
          self$`username`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeMeta
    #'
    #' @description
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeMeta
    #'
    #' @param input_json the JSON input
    #' @return the instance of Neo4jCaptureDataChangeMeta
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`operation` <- this_object$`operation`
      self$`source` <- Neo4jCaptureDataChangeMetaSource$new()$fromJSON(jsonlite::toJSON(this_object$`source`, auto_unbox = TRUE, digits = NA))
      self$`timestamp` <- this_object$`timestamp`
      self$`txEventId` <- this_object$`txEventId`
      self$`txEventsCount` <- this_object$`txEventsCount`
      self$`txId` <- this_object$`txId`
      self$`username` <- this_object$`username`
      self
    },
    #' Validate JSON input with respect to Neo4jCaptureDataChangeMeta
    #'
    #' @description
    #' Validate JSON input with respect to Neo4jCaptureDataChangeMeta and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `operation`
      if (!is.null(input_json$`operation`)) {
        if (!(is.character(input_json$`operation`) && length(input_json$`operation`) == 1)) {
          stop(paste("Error! Invalid data for `operation`. Must be a string:", input_json$`operation`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeMeta: the required field `operation` is missing."))
      }
      # check the required field `source`
      if (!is.null(input_json$`source`)) {
        stopifnot(R6::is.R6(input_json$`source`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeMeta: the required field `source` is missing."))
      }
      # check the required field `timestamp`
      if (!is.null(input_json$`timestamp`)) {
        if (!(is.numeric(input_json$`timestamp`) && length(input_json$`timestamp`) == 1)) {
          stop(paste("Error! Invalid data for `timestamp`. Must be an integer:", input_json$`timestamp`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeMeta: the required field `timestamp` is missing."))
      }
      # check the required field `txEventId`
      if (!is.null(input_json$`txEventId`)) {
        if (!(is.numeric(input_json$`txEventId`) && length(input_json$`txEventId`) == 1)) {
          stop(paste("Error! Invalid data for `txEventId`. Must be an integer:", input_json$`txEventId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeMeta: the required field `txEventId` is missing."))
      }
      # check the required field `txEventsCount`
      if (!is.null(input_json$`txEventsCount`)) {
        if (!(is.numeric(input_json$`txEventsCount`) && length(input_json$`txEventsCount`) == 1)) {
          stop(paste("Error! Invalid data for `txEventsCount`. Must be an integer:", input_json$`txEventsCount`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeMeta: the required field `txEventsCount` is missing."))
      }
      # check the required field `txId`
      if (!is.null(input_json$`txId`)) {
        if (!(is.numeric(input_json$`txId`) && length(input_json$`txId`) == 1)) {
          stop(paste("Error! Invalid data for `txId`. Must be an integer:", input_json$`txId`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeMeta: the required field `txId` is missing."))
      }
      # check the required field `username`
      if (!is.null(input_json$`username`)) {
        if (!(is.character(input_json$`username`) && length(input_json$`username`) == 1)) {
          stop(paste("Error! Invalid data for `username`. Must be a string:", input_json$`username`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeMeta: the required field `username` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Neo4jCaptureDataChangeMeta
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
      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        return(FALSE)
      }

      # check if the required `source` is null
      if (is.null(self$`source`)) {
        return(FALSE)
      }

      # check if the required `timestamp` is null
      if (is.null(self$`timestamp`)) {
        return(FALSE)
      }

      # check if the required `txEventId` is null
      if (is.null(self$`txEventId`)) {
        return(FALSE)
      }

      # check if the required `txEventsCount` is null
      if (is.null(self$`txEventsCount`)) {
        return(FALSE)
      }

      # check if the required `txId` is null
      if (is.null(self$`txId`)) {
        return(FALSE)
      }

      # check if the required `username` is null
      if (is.null(self$`username`)) {
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
      # check if the required `operation` is null
      if (is.null(self$`operation`)) {
        invalid_fields["operation"] <- "Non-nullable required field `operation` cannot be null."
      }

      # check if the required `source` is null
      if (is.null(self$`source`)) {
        invalid_fields["source"] <- "Non-nullable required field `source` cannot be null."
      }

      # check if the required `timestamp` is null
      if (is.null(self$`timestamp`)) {
        invalid_fields["timestamp"] <- "Non-nullable required field `timestamp` cannot be null."
      }

      # check if the required `txEventId` is null
      if (is.null(self$`txEventId`)) {
        invalid_fields["txEventId"] <- "Non-nullable required field `txEventId` cannot be null."
      }

      # check if the required `txEventsCount` is null
      if (is.null(self$`txEventsCount`)) {
        invalid_fields["txEventsCount"] <- "Non-nullable required field `txEventsCount` cannot be null."
      }

      # check if the required `txId` is null
      if (is.null(self$`txId`)) {
        invalid_fields["txId"] <- "Non-nullable required field `txId` cannot be null."
      }

      # check if the required `username` is null
      if (is.null(self$`username`)) {
        invalid_fields["username"] <- "Non-nullable required field `username` cannot be null."
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
# Neo4jCaptureDataChangeMeta$unlock()
#
## Below is an example to define the print function
# Neo4jCaptureDataChangeMeta$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Neo4jCaptureDataChangeMeta$lock()

