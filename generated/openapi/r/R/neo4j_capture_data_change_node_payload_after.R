#' Create a new Neo4jCaptureDataChangeNodePayloadAfter
#'
#' @description
#' Neo4jCaptureDataChangeNodePayloadAfter Class
#'
#' @docType class
#' @title Neo4jCaptureDataChangeNodePayloadAfter
#' @description Neo4jCaptureDataChangeNodePayloadAfter Class
#' @format An \code{R6Class} generator object
#' @field labels  list(character)
#' @field properties  named list(\link{AnyType})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Neo4jCaptureDataChangeNodePayloadAfter <- R6::R6Class(
  "Neo4jCaptureDataChangeNodePayloadAfter",
  public = list(
    `labels` = NULL,
    `properties` = NULL,
    #' Initialize a new Neo4jCaptureDataChangeNodePayloadAfter class.
    #'
    #' @description
    #' Initialize a new Neo4jCaptureDataChangeNodePayloadAfter class.
    #'
    #' @param labels labels
    #' @param properties properties
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`labels`, `properties`, ...) {
      if (!missing(`labels`)) {
        stopifnot(is.vector(`labels`), length(`labels`) != 0)
        sapply(`labels`, function(x) stopifnot(is.character(x)))
        self$`labels` <- `labels`
      }
      if (!missing(`properties`)) {
        stopifnot(is.vector(`properties`), length(`properties`) != 0)
        sapply(`properties`, function(x) stopifnot(R6::is.R6(x)))
        self$`properties` <- `properties`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Neo4jCaptureDataChangeNodePayloadAfter in JSON format
    #' @export
    toJSON = function() {
      Neo4jCaptureDataChangeNodePayloadAfterObject <- list()
      if (!is.null(self$`labels`)) {
        Neo4jCaptureDataChangeNodePayloadAfterObject[["labels"]] <-
          self$`labels`
      }
      if (!is.null(self$`properties`)) {
        Neo4jCaptureDataChangeNodePayloadAfterObject[["properties"]] <-
          lapply(self$`properties`, function(x) x$toJSON())
      }
      Neo4jCaptureDataChangeNodePayloadAfterObject
    },
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeNodePayloadAfter
    #'
    #' @description
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeNodePayloadAfter
    #'
    #' @param input_json the JSON input
    #' @return the instance of Neo4jCaptureDataChangeNodePayloadAfter
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`labels`)) {
        self$`labels` <- ApiClient$new()$deserializeObj(this_object$`labels`, "array[character]", loadNamespace("MindwWM"))
      }
      if (!is.null(this_object$`properties`)) {
        self$`properties` <- ApiClient$new()$deserializeObj(this_object$`properties`, "map(AnyType)", loadNamespace("MindwWM"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Neo4jCaptureDataChangeNodePayloadAfter in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`labels`)) {
          sprintf(
          '"labels":
             [%s]
          ',
          paste(unlist(lapply(self$`labels`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`properties`)) {
          sprintf(
          '"properties":
          %s
',
          jsonlite::toJSON(lapply(self$`properties`, function(x){ x$toJSON() }), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeNodePayloadAfter
    #'
    #' @description
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeNodePayloadAfter
    #'
    #' @param input_json the JSON input
    #' @return the instance of Neo4jCaptureDataChangeNodePayloadAfter
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`labels` <- ApiClient$new()$deserializeObj(this_object$`labels`, "array[character]", loadNamespace("MindwWM"))
      self$`properties` <- ApiClient$new()$deserializeObj(this_object$`properties`, "map(AnyType)", loadNamespace("MindwWM"))
      self
    },
    #' Validate JSON input with respect to Neo4jCaptureDataChangeNodePayloadAfter
    #'
    #' @description
    #' Validate JSON input with respect to Neo4jCaptureDataChangeNodePayloadAfter and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `labels`
      if (!is.null(input_json$`labels`)) {
        stopifnot(is.vector(input_json$`labels`), length(input_json$`labels`) != 0)
        tmp <- sapply(input_json$`labels`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeNodePayloadAfter: the required field `labels` is missing."))
      }
      # check the required field `properties`
      if (!is.null(input_json$`properties`)) {
        stopifnot(is.vector(input_json$`properties`), length(input_json$`properties`) != 0)
        tmp <- sapply(input_json$`properties`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeNodePayloadAfter: the required field `properties` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Neo4jCaptureDataChangeNodePayloadAfter
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
      # check if the required `labels` is null
      if (is.null(self$`labels`)) {
        return(FALSE)
      }

      # check if the required `properties` is null
      if (is.null(self$`properties`)) {
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
      # check if the required `labels` is null
      if (is.null(self$`labels`)) {
        invalid_fields["labels"] <- "Non-nullable required field `labels` cannot be null."
      }

      # check if the required `properties` is null
      if (is.null(self$`properties`)) {
        invalid_fields["properties"] <- "Non-nullable required field `properties` cannot be null."
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
# Neo4jCaptureDataChangeNodePayloadAfter$unlock()
#
## Below is an example to define the print function
# Neo4jCaptureDataChangeNodePayloadAfter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Neo4jCaptureDataChangeNodePayloadAfter$lock()

