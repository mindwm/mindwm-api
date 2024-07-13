#' Create a new Neo4jCaptureDataChange
#'
#' @description
#' Neo4jCaptureDataChange Class
#'
#' @docType class
#' @title Neo4jCaptureDataChange
#' @description Neo4jCaptureDataChange Class
#' @format An \code{R6Class} generator object
#' @field headers  named list(\link{AnyType})
#' @field message_key  character
#' @field meta  \link{Neo4jCaptureDataChangeMeta}
#' @field offset  integer
#' @field partition  integer
#' @field source_type  character
#' @field timestamp  character
#' @field topic  character
#' @field schema  \link{Neo4jCaptureDataChangeSchema}
#' @field payload  \link{Neo4jCaptureDataChangePayload}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Neo4jCaptureDataChange <- R6::R6Class(
  "Neo4jCaptureDataChange",
  public = list(
    `headers` = NULL,
    `message_key` = NULL,
    `meta` = NULL,
    `offset` = NULL,
    `partition` = NULL,
    `source_type` = NULL,
    `timestamp` = NULL,
    `topic` = NULL,
    `schema` = NULL,
    `payload` = NULL,
    #' Initialize a new Neo4jCaptureDataChange class.
    #'
    #' @description
    #' Initialize a new Neo4jCaptureDataChange class.
    #'
    #' @param headers headers
    #' @param message_key message_key
    #' @param meta meta
    #' @param offset offset
    #' @param partition partition
    #' @param source_type source_type
    #' @param timestamp timestamp
    #' @param topic topic
    #' @param schema schema
    #' @param payload payload
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`headers`, `message_key`, `meta`, `offset`, `partition`, `source_type`, `timestamp`, `topic`, `schema`, `payload`, ...) {
      if (!missing(`headers`)) {
        stopifnot(is.vector(`headers`), length(`headers`) != 0)
        sapply(`headers`, function(x) stopifnot(R6::is.R6(x)))
        self$`headers` <- `headers`
      }
      if (!missing(`message_key`)) {
        if (!(is.character(`message_key`) && length(`message_key`) == 1)) {
          stop(paste("Error! Invalid data for `message_key`. Must be a string:", `message_key`))
        }
        self$`message_key` <- `message_key`
      }
      if (!missing(`meta`)) {
        stopifnot(R6::is.R6(`meta`))
        self$`meta` <- `meta`
      }
      if (!missing(`offset`)) {
        if (!(is.numeric(`offset`) && length(`offset`) == 1)) {
          stop(paste("Error! Invalid data for `offset`. Must be an integer:", `offset`))
        }
        self$`offset` <- `offset`
      }
      if (!missing(`partition`)) {
        if (!(is.numeric(`partition`) && length(`partition`) == 1)) {
          stop(paste("Error! Invalid data for `partition`. Must be an integer:", `partition`))
        }
        self$`partition` <- `partition`
      }
      if (!missing(`source_type`)) {
        if (!(is.character(`source_type`) && length(`source_type`) == 1)) {
          stop(paste("Error! Invalid data for `source_type`. Must be a string:", `source_type`))
        }
        self$`source_type` <- `source_type`
      }
      if (!missing(`timestamp`)) {
        if (!(is.character(`timestamp`) && length(`timestamp`) == 1)) {
          stop(paste("Error! Invalid data for `timestamp`. Must be a string:", `timestamp`))
        }
        self$`timestamp` <- `timestamp`
      }
      if (!missing(`topic`)) {
        if (!(is.character(`topic`) && length(`topic`) == 1)) {
          stop(paste("Error! Invalid data for `topic`. Must be a string:", `topic`))
        }
        self$`topic` <- `topic`
      }
      if (!missing(`schema`)) {
        stopifnot(R6::is.R6(`schema`))
        self$`schema` <- `schema`
      }
      if (!missing(`payload`)) {
        stopifnot(R6::is.R6(`payload`))
        self$`payload` <- `payload`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Neo4jCaptureDataChange in JSON format
    #' @export
    toJSON = function() {
      Neo4jCaptureDataChangeObject <- list()
      if (!is.null(self$`headers`)) {
        Neo4jCaptureDataChangeObject[["headers"]] <-
          lapply(self$`headers`, function(x) x$toJSON())
      }
      if (!is.null(self$`message_key`)) {
        Neo4jCaptureDataChangeObject[["message_key"]] <-
          self$`message_key`
      }
      if (!is.null(self$`meta`)) {
        Neo4jCaptureDataChangeObject[["meta"]] <-
          self$`meta`$toJSON()
      }
      if (!is.null(self$`offset`)) {
        Neo4jCaptureDataChangeObject[["offset"]] <-
          self$`offset`
      }
      if (!is.null(self$`partition`)) {
        Neo4jCaptureDataChangeObject[["partition"]] <-
          self$`partition`
      }
      if (!is.null(self$`source_type`)) {
        Neo4jCaptureDataChangeObject[["source_type"]] <-
          self$`source_type`
      }
      if (!is.null(self$`timestamp`)) {
        Neo4jCaptureDataChangeObject[["timestamp"]] <-
          self$`timestamp`
      }
      if (!is.null(self$`topic`)) {
        Neo4jCaptureDataChangeObject[["topic"]] <-
          self$`topic`
      }
      if (!is.null(self$`schema`)) {
        Neo4jCaptureDataChangeObject[["schema"]] <-
          self$`schema`$toJSON()
      }
      if (!is.null(self$`payload`)) {
        Neo4jCaptureDataChangeObject[["payload"]] <-
          self$`payload`$toJSON()
      }
      Neo4jCaptureDataChangeObject
    },
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChange
    #'
    #' @description
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChange
    #'
    #' @param input_json the JSON input
    #' @return the instance of Neo4jCaptureDataChange
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`headers`)) {
        self$`headers` <- ApiClient$new()$deserializeObj(this_object$`headers`, "map(AnyType)", loadNamespace("MindwWM"))
      }
      if (!is.null(this_object$`message_key`)) {
        self$`message_key` <- this_object$`message_key`
      }
      if (!is.null(this_object$`meta`)) {
        `meta_object` <- Neo4jCaptureDataChangeMeta$new()
        `meta_object`$fromJSON(jsonlite::toJSON(this_object$`meta`, auto_unbox = TRUE, digits = NA))
        self$`meta` <- `meta_object`
      }
      if (!is.null(this_object$`offset`)) {
        self$`offset` <- this_object$`offset`
      }
      if (!is.null(this_object$`partition`)) {
        self$`partition` <- this_object$`partition`
      }
      if (!is.null(this_object$`source_type`)) {
        self$`source_type` <- this_object$`source_type`
      }
      if (!is.null(this_object$`timestamp`)) {
        self$`timestamp` <- this_object$`timestamp`
      }
      if (!is.null(this_object$`topic`)) {
        self$`topic` <- this_object$`topic`
      }
      if (!is.null(this_object$`schema`)) {
        `schema_object` <- Neo4jCaptureDataChangeSchema$new()
        `schema_object`$fromJSON(jsonlite::toJSON(this_object$`schema`, auto_unbox = TRUE, digits = NA))
        self$`schema` <- `schema_object`
      }
      if (!is.null(this_object$`payload`)) {
        `payload_object` <- Neo4jCaptureDataChangePayload$new()
        `payload_object`$fromJSON(jsonlite::toJSON(this_object$`payload`, auto_unbox = TRUE, digits = NA))
        self$`payload` <- `payload_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Neo4jCaptureDataChange in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`headers`)) {
          sprintf(
          '"headers":
          %s
',
          jsonlite::toJSON(lapply(self$`headers`, function(x){ x$toJSON() }), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`message_key`)) {
          sprintf(
          '"message_key":
            "%s"
                    ',
          self$`message_key`
          )
        },
        if (!is.null(self$`meta`)) {
          sprintf(
          '"meta":
          %s
          ',
          jsonlite::toJSON(self$`meta`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`offset`)) {
          sprintf(
          '"offset":
            %d
                    ',
          self$`offset`
          )
        },
        if (!is.null(self$`partition`)) {
          sprintf(
          '"partition":
            %d
                    ',
          self$`partition`
          )
        },
        if (!is.null(self$`source_type`)) {
          sprintf(
          '"source_type":
            "%s"
                    ',
          self$`source_type`
          )
        },
        if (!is.null(self$`timestamp`)) {
          sprintf(
          '"timestamp":
            "%s"
                    ',
          self$`timestamp`
          )
        },
        if (!is.null(self$`topic`)) {
          sprintf(
          '"topic":
            "%s"
                    ',
          self$`topic`
          )
        },
        if (!is.null(self$`schema`)) {
          sprintf(
          '"schema":
          %s
          ',
          jsonlite::toJSON(self$`schema`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`payload`)) {
          sprintf(
          '"payload":
          %s
          ',
          jsonlite::toJSON(self$`payload`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChange
    #'
    #' @description
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChange
    #'
    #' @param input_json the JSON input
    #' @return the instance of Neo4jCaptureDataChange
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`headers` <- ApiClient$new()$deserializeObj(this_object$`headers`, "map(AnyType)", loadNamespace("MindwWM"))
      self$`message_key` <- this_object$`message_key`
      self$`meta` <- Neo4jCaptureDataChangeMeta$new()$fromJSON(jsonlite::toJSON(this_object$`meta`, auto_unbox = TRUE, digits = NA))
      self$`offset` <- this_object$`offset`
      self$`partition` <- this_object$`partition`
      self$`source_type` <- this_object$`source_type`
      self$`timestamp` <- this_object$`timestamp`
      self$`topic` <- this_object$`topic`
      self$`schema` <- Neo4jCaptureDataChangeSchema$new()$fromJSON(jsonlite::toJSON(this_object$`schema`, auto_unbox = TRUE, digits = NA))
      self$`payload` <- Neo4jCaptureDataChangePayload$new()$fromJSON(jsonlite::toJSON(this_object$`payload`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to Neo4jCaptureDataChange
    #'
    #' @description
    #' Validate JSON input with respect to Neo4jCaptureDataChange and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `headers`
      if (!is.null(input_json$`headers`)) {
        stopifnot(is.vector(input_json$`headers`), length(input_json$`headers`) != 0)
        tmp <- sapply(input_json$`headers`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChange: the required field `headers` is missing."))
      }
      # check the required field `message_key`
      if (!is.null(input_json$`message_key`)) {
        if (!(is.character(input_json$`message_key`) && length(input_json$`message_key`) == 1)) {
          stop(paste("Error! Invalid data for `message_key`. Must be a string:", input_json$`message_key`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChange: the required field `message_key` is missing."))
      }
      # check the required field `meta`
      if (!is.null(input_json$`meta`)) {
        stopifnot(R6::is.R6(input_json$`meta`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChange: the required field `meta` is missing."))
      }
      # check the required field `offset`
      if (!is.null(input_json$`offset`)) {
        if (!(is.numeric(input_json$`offset`) && length(input_json$`offset`) == 1)) {
          stop(paste("Error! Invalid data for `offset`. Must be an integer:", input_json$`offset`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChange: the required field `offset` is missing."))
      }
      # check the required field `partition`
      if (!is.null(input_json$`partition`)) {
        if (!(is.numeric(input_json$`partition`) && length(input_json$`partition`) == 1)) {
          stop(paste("Error! Invalid data for `partition`. Must be an integer:", input_json$`partition`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChange: the required field `partition` is missing."))
      }
      # check the required field `source_type`
      if (!is.null(input_json$`source_type`)) {
        if (!(is.character(input_json$`source_type`) && length(input_json$`source_type`) == 1)) {
          stop(paste("Error! Invalid data for `source_type`. Must be a string:", input_json$`source_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChange: the required field `source_type` is missing."))
      }
      # check the required field `timestamp`
      if (!is.null(input_json$`timestamp`)) {
        if (!(is.character(input_json$`timestamp`) && length(input_json$`timestamp`) == 1)) {
          stop(paste("Error! Invalid data for `timestamp`. Must be a string:", input_json$`timestamp`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChange: the required field `timestamp` is missing."))
      }
      # check the required field `topic`
      if (!is.null(input_json$`topic`)) {
        if (!(is.character(input_json$`topic`) && length(input_json$`topic`) == 1)) {
          stop(paste("Error! Invalid data for `topic`. Must be a string:", input_json$`topic`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChange: the required field `topic` is missing."))
      }
      # check the required field `schema`
      if (!is.null(input_json$`schema`)) {
        stopifnot(R6::is.R6(input_json$`schema`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChange: the required field `schema` is missing."))
      }
      # check the required field `payload`
      if (!is.null(input_json$`payload`)) {
        stopifnot(R6::is.R6(input_json$`payload`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChange: the required field `payload` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Neo4jCaptureDataChange
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
      # check if the required `headers` is null
      if (is.null(self$`headers`)) {
        return(FALSE)
      }

      # check if the required `message_key` is null
      if (is.null(self$`message_key`)) {
        return(FALSE)
      }

      # check if the required `meta` is null
      if (is.null(self$`meta`)) {
        return(FALSE)
      }

      # check if the required `offset` is null
      if (is.null(self$`offset`)) {
        return(FALSE)
      }

      # check if the required `partition` is null
      if (is.null(self$`partition`)) {
        return(FALSE)
      }

      # check if the required `source_type` is null
      if (is.null(self$`source_type`)) {
        return(FALSE)
      }

      # check if the required `timestamp` is null
      if (is.null(self$`timestamp`)) {
        return(FALSE)
      }

      # check if the required `topic` is null
      if (is.null(self$`topic`)) {
        return(FALSE)
      }

      # check if the required `schema` is null
      if (is.null(self$`schema`)) {
        return(FALSE)
      }

      # check if the required `payload` is null
      if (is.null(self$`payload`)) {
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
      # check if the required `headers` is null
      if (is.null(self$`headers`)) {
        invalid_fields["headers"] <- "Non-nullable required field `headers` cannot be null."
      }

      # check if the required `message_key` is null
      if (is.null(self$`message_key`)) {
        invalid_fields["message_key"] <- "Non-nullable required field `message_key` cannot be null."
      }

      # check if the required `meta` is null
      if (is.null(self$`meta`)) {
        invalid_fields["meta"] <- "Non-nullable required field `meta` cannot be null."
      }

      # check if the required `offset` is null
      if (is.null(self$`offset`)) {
        invalid_fields["offset"] <- "Non-nullable required field `offset` cannot be null."
      }

      # check if the required `partition` is null
      if (is.null(self$`partition`)) {
        invalid_fields["partition"] <- "Non-nullable required field `partition` cannot be null."
      }

      # check if the required `source_type` is null
      if (is.null(self$`source_type`)) {
        invalid_fields["source_type"] <- "Non-nullable required field `source_type` cannot be null."
      }

      # check if the required `timestamp` is null
      if (is.null(self$`timestamp`)) {
        invalid_fields["timestamp"] <- "Non-nullable required field `timestamp` cannot be null."
      }

      # check if the required `topic` is null
      if (is.null(self$`topic`)) {
        invalid_fields["topic"] <- "Non-nullable required field `topic` cannot be null."
      }

      # check if the required `schema` is null
      if (is.null(self$`schema`)) {
        invalid_fields["schema"] <- "Non-nullable required field `schema` cannot be null."
      }

      # check if the required `payload` is null
      if (is.null(self$`payload`)) {
        invalid_fields["payload"] <- "Non-nullable required field `payload` cannot be null."
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
# Neo4jCaptureDataChange$unlock()
#
## Below is an example to define the print function
# Neo4jCaptureDataChange$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Neo4jCaptureDataChange$lock()

