#' Create a new Neo4jCaptureDataChangeRelationshipPayloadEnd
#'
#' @description
#' Neo4jCaptureDataChangeRelationshipPayloadEnd Class
#'
#' @docType class
#' @title Neo4jCaptureDataChangeRelationshipPayloadEnd
#' @description Neo4jCaptureDataChangeRelationshipPayloadEnd Class
#' @format An \code{R6Class} generator object
#' @field id  character
#' @field ids  named list(\link{AnyType})
#' @field labels  list(character)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Neo4jCaptureDataChangeRelationshipPayloadEnd <- R6::R6Class(
  "Neo4jCaptureDataChangeRelationshipPayloadEnd",
  public = list(
    `id` = NULL,
    `ids` = NULL,
    `labels` = NULL,
    #' Initialize a new Neo4jCaptureDataChangeRelationshipPayloadEnd class.
    #'
    #' @description
    #' Initialize a new Neo4jCaptureDataChangeRelationshipPayloadEnd class.
    #'
    #' @param id id
    #' @param ids ids
    #' @param labels labels
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `ids`, `labels`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`ids`)) {
        stopifnot(is.vector(`ids`), length(`ids`) != 0)
        sapply(`ids`, function(x) stopifnot(R6::is.R6(x)))
        self$`ids` <- `ids`
      }
      if (!missing(`labels`)) {
        stopifnot(is.vector(`labels`), length(`labels`) != 0)
        sapply(`labels`, function(x) stopifnot(is.character(x)))
        self$`labels` <- `labels`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Neo4jCaptureDataChangeRelationshipPayloadEnd in JSON format
    #' @export
    toJSON = function() {
      Neo4jCaptureDataChangeRelationshipPayloadEndObject <- list()
      if (!is.null(self$`id`)) {
        Neo4jCaptureDataChangeRelationshipPayloadEndObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`ids`)) {
        Neo4jCaptureDataChangeRelationshipPayloadEndObject[["ids"]] <-
          lapply(self$`ids`, function(x) x$toJSON())
      }
      if (!is.null(self$`labels`)) {
        Neo4jCaptureDataChangeRelationshipPayloadEndObject[["labels"]] <-
          self$`labels`
      }
      Neo4jCaptureDataChangeRelationshipPayloadEndObject
    },
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeRelationshipPayloadEnd
    #'
    #' @description
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeRelationshipPayloadEnd
    #'
    #' @param input_json the JSON input
    #' @return the instance of Neo4jCaptureDataChangeRelationshipPayloadEnd
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`ids`)) {
        self$`ids` <- ApiClient$new()$deserializeObj(this_object$`ids`, "map(AnyType)", loadNamespace("MindWM"))
      }
      if (!is.null(this_object$`labels`)) {
        self$`labels` <- ApiClient$new()$deserializeObj(this_object$`labels`, "array[character]", loadNamespace("MindWM"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Neo4jCaptureDataChangeRelationshipPayloadEnd in JSON format
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
        if (!is.null(self$`ids`)) {
          sprintf(
          '"ids":
          %s
',
          jsonlite::toJSON(lapply(self$`ids`, function(x){ x$toJSON() }), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`labels`)) {
          sprintf(
          '"labels":
             [%s]
          ',
          paste(unlist(lapply(self$`labels`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeRelationshipPayloadEnd
    #'
    #' @description
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeRelationshipPayloadEnd
    #'
    #' @param input_json the JSON input
    #' @return the instance of Neo4jCaptureDataChangeRelationshipPayloadEnd
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`ids` <- ApiClient$new()$deserializeObj(this_object$`ids`, "map(AnyType)", loadNamespace("MindWM"))
      self$`labels` <- ApiClient$new()$deserializeObj(this_object$`labels`, "array[character]", loadNamespace("MindWM"))
      self
    },
    #' Validate JSON input with respect to Neo4jCaptureDataChangeRelationshipPayloadEnd
    #'
    #' @description
    #' Validate JSON input with respect to Neo4jCaptureDataChangeRelationshipPayloadEnd and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeRelationshipPayloadEnd: the required field `id` is missing."))
      }
      # check the required field `ids`
      if (!is.null(input_json$`ids`)) {
        stopifnot(is.vector(input_json$`ids`), length(input_json$`ids`) != 0)
        tmp <- sapply(input_json$`ids`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeRelationshipPayloadEnd: the required field `ids` is missing."))
      }
      # check the required field `labels`
      if (!is.null(input_json$`labels`)) {
        stopifnot(is.vector(input_json$`labels`), length(input_json$`labels`) != 0)
        tmp <- sapply(input_json$`labels`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeRelationshipPayloadEnd: the required field `labels` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Neo4jCaptureDataChangeRelationshipPayloadEnd
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

      # check if the required `ids` is null
      if (is.null(self$`ids`)) {
        return(FALSE)
      }

      # check if the required `labels` is null
      if (is.null(self$`labels`)) {
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

      # check if the required `ids` is null
      if (is.null(self$`ids`)) {
        invalid_fields["ids"] <- "Non-nullable required field `ids` cannot be null."
      }

      # check if the required `labels` is null
      if (is.null(self$`labels`)) {
        invalid_fields["labels"] <- "Non-nullable required field `labels` cannot be null."
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
# Neo4jCaptureDataChangeRelationshipPayloadEnd$unlock()
#
## Below is an example to define the print function
# Neo4jCaptureDataChangeRelationshipPayloadEnd$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Neo4jCaptureDataChangeRelationshipPayloadEnd$lock()

