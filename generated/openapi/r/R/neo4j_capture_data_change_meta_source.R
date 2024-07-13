#' Create a new Neo4jCaptureDataChangeMetaSource
#'
#' @description
#' Neo4jCaptureDataChangeMetaSource Class
#'
#' @docType class
#' @title Neo4jCaptureDataChangeMetaSource
#' @description Neo4jCaptureDataChangeMetaSource Class
#' @format An \code{R6Class} generator object
#' @field hostname  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Neo4jCaptureDataChangeMetaSource <- R6::R6Class(
  "Neo4jCaptureDataChangeMetaSource",
  public = list(
    `hostname` = NULL,
    #' Initialize a new Neo4jCaptureDataChangeMetaSource class.
    #'
    #' @description
    #' Initialize a new Neo4jCaptureDataChangeMetaSource class.
    #'
    #' @param hostname hostname
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`hostname`, ...) {
      if (!missing(`hostname`)) {
        if (!(is.character(`hostname`) && length(`hostname`) == 1)) {
          stop(paste("Error! Invalid data for `hostname`. Must be a string:", `hostname`))
        }
        self$`hostname` <- `hostname`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Neo4jCaptureDataChangeMetaSource in JSON format
    #' @export
    toJSON = function() {
      Neo4jCaptureDataChangeMetaSourceObject <- list()
      if (!is.null(self$`hostname`)) {
        Neo4jCaptureDataChangeMetaSourceObject[["hostname"]] <-
          self$`hostname`
      }
      Neo4jCaptureDataChangeMetaSourceObject
    },
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeMetaSource
    #'
    #' @description
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeMetaSource
    #'
    #' @param input_json the JSON input
    #' @return the instance of Neo4jCaptureDataChangeMetaSource
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`hostname`)) {
        self$`hostname` <- this_object$`hostname`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Neo4jCaptureDataChangeMetaSource in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`hostname`)) {
          sprintf(
          '"hostname":
            "%s"
                    ',
          self$`hostname`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeMetaSource
    #'
    #' @description
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangeMetaSource
    #'
    #' @param input_json the JSON input
    #' @return the instance of Neo4jCaptureDataChangeMetaSource
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`hostname` <- this_object$`hostname`
      self
    },
    #' Validate JSON input with respect to Neo4jCaptureDataChangeMetaSource
    #'
    #' @description
    #' Validate JSON input with respect to Neo4jCaptureDataChangeMetaSource and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `hostname`
      if (!is.null(input_json$`hostname`)) {
        if (!(is.character(input_json$`hostname`) && length(input_json$`hostname`) == 1)) {
          stop(paste("Error! Invalid data for `hostname`. Must be a string:", input_json$`hostname`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Neo4jCaptureDataChangeMetaSource: the required field `hostname` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Neo4jCaptureDataChangeMetaSource
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
      # check if the required `hostname` is null
      if (is.null(self$`hostname`)) {
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
      # check if the required `hostname` is null
      if (is.null(self$`hostname`)) {
        invalid_fields["hostname"] <- "Non-nullable required field `hostname` cannot be null."
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
# Neo4jCaptureDataChangeMetaSource$unlock()
#
## Below is an example to define the print function
# Neo4jCaptureDataChangeMetaSource$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Neo4jCaptureDataChangeMetaSource$lock()

