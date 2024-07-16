#' Create a new Neo4jCaptureDataChangeSchema
#'
#' @description
#' Neo4jCaptureDataChangeSchema Class
#'
#' @docType class
#' @title Neo4jCaptureDataChangeSchema
#' @description Neo4jCaptureDataChangeSchema Class
#' @format An \code{R6Class} generator object
#' @field constraints  named list(\link{AnyType}) [optional]
#' @field properties  named list(\link{AnyType}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Neo4jCaptureDataChangeSchema <- R6::R6Class(
  "Neo4jCaptureDataChangeSchema",
  public = list(
    `constraints` = NULL,
    `properties` = NULL,
    #' Initialize a new Neo4jCaptureDataChangeSchema class.
    #'
    #' @description
    #' Initialize a new Neo4jCaptureDataChangeSchema class.
    #'
    #' @param constraints constraints
    #' @param properties properties
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`constraints` = NULL, `properties` = NULL, ...) {
      if (!is.null(`constraints`)) {
        stopifnot(is.vector(`constraints`), length(`constraints`) != 0)
        sapply(`constraints`, function(x) stopifnot(R6::is.R6(x)))
        self$`constraints` <- `constraints`
      }
      if (!is.null(`properties`)) {
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
    #' @return Neo4jCaptureDataChangeSchema in JSON format
    #' @export
    toJSON = function() {
      Neo4jCaptureDataChangeSchemaObject <- list()
      if (!is.null(self$`constraints`)) {
        Neo4jCaptureDataChangeSchemaObject[["constraints"]] <-
          lapply(self$`constraints`, function(x) x$toJSON())
      }
      if (!is.null(self$`properties`)) {
        Neo4jCaptureDataChangeSchemaObject[["properties"]] <-
          lapply(self$`properties`, function(x) x$toJSON())
      }
      Neo4jCaptureDataChangeSchemaObject
    },
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeSchema
    #'
    #' @description
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeSchema
    #'
    #' @param input_json the JSON input
    #' @return the instance of Neo4jCaptureDataChangeSchema
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`constraints`)) {
        self$`constraints` <- ApiClient$new()$deserializeObj(this_object$`constraints`, "map(AnyType)", loadNamespace("MindWM"))
      }
      if (!is.null(this_object$`properties`)) {
        self$`properties` <- ApiClient$new()$deserializeObj(this_object$`properties`, "map(AnyType)", loadNamespace("MindWM"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Neo4jCaptureDataChangeSchema in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`constraints`)) {
          sprintf(
          '"constraints":
          %s
',
          jsonlite::toJSON(lapply(self$`constraints`, function(x){ x$toJSON() }), auto_unbox = TRUE, digits = NA)
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
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeSchema
    #'
    #' @description
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeSchema
    #'
    #' @param input_json the JSON input
    #' @return the instance of Neo4jCaptureDataChangeSchema
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`constraints` <- ApiClient$new()$deserializeObj(this_object$`constraints`, "map(AnyType)", loadNamespace("MindWM"))
      self$`properties` <- ApiClient$new()$deserializeObj(this_object$`properties`, "map(AnyType)", loadNamespace("MindWM"))
      self
    },
    #' Validate JSON input with respect to Neo4jCaptureDataChangeSchema
    #'
    #' @description
    #' Validate JSON input with respect to Neo4jCaptureDataChangeSchema and throw an exception if invalid
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
    #' @return String representation of Neo4jCaptureDataChangeSchema
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
# Neo4jCaptureDataChangeSchema$unlock()
#
## Below is an example to define the print function
# Neo4jCaptureDataChangeSchema$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Neo4jCaptureDataChangeSchema$lock()

