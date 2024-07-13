#' @docType class
#' @title Neo4jCaptureDataChangePayload
#'
#' @description Neo4jCaptureDataChangePayload Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Neo4jCaptureDataChangePayload <- R6::R6Class(
  "Neo4jCaptureDataChangePayload",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("Neo4jCaptureDataChangeNodePayload", "Neo4jCaptureDataChangeRelationshipPayload"),
    #' Initialize a new Neo4jCaptureDataChangePayload.
    #'
    #' @description
    #' Initialize a new Neo4jCaptureDataChangePayload.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "Neo4jCaptureDataChangeNodePayload", "Neo4jCaptureDataChangeRelationshipPayload"
    #' @export
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "Neo4jCaptureDataChangeNodePayload") {
        self$actual_instance <- instance
        self$actual_type <- "Neo4jCaptureDataChangeNodePayload"
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "Neo4jCaptureDataChangeRelationshipPayload") {
        self$actual_instance <- instance
        self$actual_type <- "Neo4jCaptureDataChangeRelationshipPayload"
      } else {
        stop(paste("Failed to initialize Neo4jCaptureDataChangePayload with oneOf schemas Neo4jCaptureDataChangeNodePayload, Neo4jCaptureDataChangeRelationshipPayload. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangePayload.
    #'
    #' @description
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangePayload.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #' @return An instance of Neo4jCaptureDataChangePayload.
    #' @export
    fromJSONString = function(input) {
      self$fromJSON(input)
    },
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangePayload.
    #'
    #' @description
    #' Deserialize JSON string into an instance of Neo4jCaptureDataChangePayload.
    #'
    #' @param input The input JSON.
    #' @return An instance of Neo4jCaptureDataChangePayload.
    #' @export
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `Neo4jCaptureDataChangeNodePayload_result` <- tryCatch({
          `Neo4jCaptureDataChangeNodePayload`$public_methods$validateJSON(input)
          `Neo4jCaptureDataChangeNodePayload_instance` <- `Neo4jCaptureDataChangeNodePayload`$new()
          instance <- `Neo4jCaptureDataChangeNodePayload_instance`$fromJSON(input)
          instance_type <- "Neo4jCaptureDataChangeNodePayload"
          matched_schemas <- append(matched_schemas, "Neo4jCaptureDataChangeNodePayload")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`Neo4jCaptureDataChangeNodePayload_result`["error"])) {
        error_messages <- append(error_messages, `Neo4jCaptureDataChangeNodePayload_result`["message"])
      }

      `Neo4jCaptureDataChangeRelationshipPayload_result` <- tryCatch({
          `Neo4jCaptureDataChangeRelationshipPayload`$public_methods$validateJSON(input)
          `Neo4jCaptureDataChangeRelationshipPayload_instance` <- `Neo4jCaptureDataChangeRelationshipPayload`$new()
          instance <- `Neo4jCaptureDataChangeRelationshipPayload_instance`$fromJSON(input)
          instance_type <- "Neo4jCaptureDataChangeRelationshipPayload"
          matched_schemas <- append(matched_schemas, "Neo4jCaptureDataChangeRelationshipPayload")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`Neo4jCaptureDataChangeRelationshipPayload_result`["error"])) {
        error_messages <- append(error_messages, `Neo4jCaptureDataChangeRelationshipPayload_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into Neo4jCaptureDataChangePayload with oneOf schemas Neo4jCaptureDataChangeNodePayload, Neo4jCaptureDataChangeRelationshipPayload. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into Neo4jCaptureDataChangePayload with oneOf schemas Neo4jCaptureDataChangeNodePayload, Neo4jCaptureDataChangeRelationshipPayload. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },
    #' Serialize Neo4jCaptureDataChangePayload to JSON string.
    #'
    #' @description
    #' Serialize Neo4jCaptureDataChangePayload to JSON string.
    #'
    #' @return JSON string representation of the Neo4jCaptureDataChangePayload.
    #' @export
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },
    #' Serialize Neo4jCaptureDataChangePayload to JSON.
    #'
    #' @description
    #' Serialize Neo4jCaptureDataChangePayload to JSON.
    #'
    #' @return JSON representation of the Neo4jCaptureDataChangePayload.
    #' @export
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },
    #' Validate the input JSON with respect to Neo4jCaptureDataChangePayload.
    #'
    #' @description
    #' Validate the input JSON with respect to Neo4jCaptureDataChangePayload and
    #' throw exception if invalid.
    #'
    #' @param input The input JSON.
    #' @export
    validateJSON = function(input) {
      # backup current values
      actual_instance_bak <- self$actual_instance
      actual_type_bak <- self$actual_type

      # if it's not valid, an error will be thrown
      self$fromJSON(input)

      # no error thrown, restore old values
      self$actual_instance <- actual_instance_bak
      self$actual_type <- actual_type_bak
    },
    #' Returns the string representation of the instance.
    #'
    #' @description
    #' Returns the string representation of the instance.
    #'
    #' @return The string representation of the instance.
    #' @export
    toString = function() {
      jsoncontent <- c(
        sprintf('"actual_instance": %s', if (is.null(self$actual_instance)) NULL else self$actual_instance$toJSONString()),
        sprintf('"actual_type": "%s"', self$actual_type),
        sprintf('"one_of": "%s"', paste(unlist(self$one_of), collapse = ", "))
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::prettify(paste("{", jsoncontent, "}", sep = "")))
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
#Neo4jCaptureDataChangePayload$unlock()
#
## Below is an example to define the print function
#Neo4jCaptureDataChangePayload$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#Neo4jCaptureDataChangePayload$lock()

