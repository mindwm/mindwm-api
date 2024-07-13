/*
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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Neo4jCaptureDataChangeNodePayloadAfter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Neo4jCaptureDataChangeNodePayload
 */
@JsonPropertyOrder({
  Neo4jCaptureDataChangeNodePayload.JSON_PROPERTY_AFTER,
  Neo4jCaptureDataChangeNodePayload.JSON_PROPERTY_BEFORE,
  Neo4jCaptureDataChangeNodePayload.JSON_PROPERTY_ID,
  Neo4jCaptureDataChangeNodePayload.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-07-13T22:09:36.528281041Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChangeNodePayload   {
  public static final String JSON_PROPERTY_AFTER = "after";
  @JsonProperty(JSON_PROPERTY_AFTER)
  private Neo4jCaptureDataChangeNodePayloadAfter after;

  public static final String JSON_PROPERTY_BEFORE = "before";
  @JsonProperty(JSON_PROPERTY_BEFORE)
  private String before;

  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private String type;

  public Neo4jCaptureDataChangeNodePayload after(Neo4jCaptureDataChangeNodePayloadAfter after) {
    this.after = after;
    return this;
  }

  /**
   * Get after
   * @return after
   **/
  @JsonProperty(value = "after")
  @ApiModelProperty(required = true, value = "")
  @NotNull @Valid 
  public Neo4jCaptureDataChangeNodePayloadAfter getAfter() {
    return after;
  }

  public void setAfter(Neo4jCaptureDataChangeNodePayloadAfter after) {
    this.after = after;
  }

  public Neo4jCaptureDataChangeNodePayload before(String before) {
    this.before = before;
    return this;
  }

  /**
   * Get before
   * @return before
   **/
  @JsonProperty(value = "before")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public String getBefore() {
    return before;
  }

  public void setBefore(String before) {
    this.before = before;
  }

  public Neo4jCaptureDataChangeNodePayload id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Neo4jCaptureDataChangeNodePayload type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @JsonProperty(value = "type")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Neo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayload = (Neo4jCaptureDataChangeNodePayload) o;
    return Objects.equals(this.after, neo4jCaptureDataChangeNodePayload.after) &&
        Objects.equals(this.before, neo4jCaptureDataChangeNodePayload.before) &&
        Objects.equals(this.id, neo4jCaptureDataChangeNodePayload.id) &&
        Objects.equals(this.type, neo4jCaptureDataChangeNodePayload.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, before, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jCaptureDataChangeNodePayload {\n");
    
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

