/**
 * Mindwm API
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.server.api;

import javax.ws.rs.core.Response;

public class ApiException extends Exception {

  private static final long serialVersionUID = 1L;
  private Response response;

  public ApiException() {
    super();
  }

  public ApiException(Response response) {
    super("Api response has status code " + response.getStatus());
    this.response = response;
  }

  public Response getResponse() {
    return this.response;
  }
}
