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

package org.openapitools.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.client.model.Neo4jCaptureDataChangeRelationshipPayloadEnd;




public class Neo4jCaptureDataChangeRelationshipPayload  {
  
  private Object after;

  private String before;

  private Neo4jCaptureDataChangeRelationshipPayloadEnd end;

  private String id;

  private String label;

  private Neo4jCaptureDataChangeRelationshipPayloadEnd start;

  private String type;

 /**
   * Get after
   * @return after
  **/
  public Object getAfter() {
    return after;
  }

  /**
    * Set after
  **/
  public void setAfter(Object after) {
    this.after = after;
  }

  public Neo4jCaptureDataChangeRelationshipPayload after(Object after) {
    this.after = after;
    return this;
  }

 /**
   * Get before
   * @return before
  **/
  public String getBefore() {
    return before;
  }

  /**
    * Set before
  **/
  public void setBefore(String before) {
    this.before = before;
  }

  public Neo4jCaptureDataChangeRelationshipPayload before(String before) {
    this.before = before;
    return this;
  }

 /**
   * Get end
   * @return end
  **/
  public Neo4jCaptureDataChangeRelationshipPayloadEnd getEnd() {
    return end;
  }

  /**
    * Set end
  **/
  public void setEnd(Neo4jCaptureDataChangeRelationshipPayloadEnd end) {
    this.end = end;
  }

  public Neo4jCaptureDataChangeRelationshipPayload end(Neo4jCaptureDataChangeRelationshipPayloadEnd end) {
    this.end = end;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  /**
    * Set id
  **/
  public void setId(String id) {
    this.id = id;
  }

  public Neo4jCaptureDataChangeRelationshipPayload id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get label
   * @return label
  **/
  public String getLabel() {
    return label;
  }

  /**
    * Set label
  **/
  public void setLabel(String label) {
    this.label = label;
  }

  public Neo4jCaptureDataChangeRelationshipPayload label(String label) {
    this.label = label;
    return this;
  }

 /**
   * Get start
   * @return start
  **/
  public Neo4jCaptureDataChangeRelationshipPayloadEnd getStart() {
    return start;
  }

  /**
    * Set start
  **/
  public void setStart(Neo4jCaptureDataChangeRelationshipPayloadEnd start) {
    this.start = start;
  }

  public Neo4jCaptureDataChangeRelationshipPayload start(Neo4jCaptureDataChangeRelationshipPayloadEnd start) {
    this.start = start;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  /**
    * Set type
  **/
  public void setType(String type) {
    this.type = type;
  }

  public Neo4jCaptureDataChangeRelationshipPayload type(String type) {
    this.type = type;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jCaptureDataChangeRelationshipPayload {\n");
    
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

