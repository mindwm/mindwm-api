/**
 * Mindwm API
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * OpenAPI spec version: 0.1.0
 *
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 *
 * https://openapi-generator.tech
 */

package MindwWM

def box(str: String): String = {
  val lines = str.linesIterator.toList
  val maxLen = (0 +: lines.map(_.length)).max
  val boxed = lines.map { line =>
    s" | ${line.padTo(maxLen, ' ')} |"
  }
  val bar = " +-" + ("-" * maxLen) + "-+"
  (bar +: boxed :+ bar).mkString("\n")
}