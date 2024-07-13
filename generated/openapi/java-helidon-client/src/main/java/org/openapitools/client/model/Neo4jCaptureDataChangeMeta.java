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
import org.openapitools.client.model.Neo4jCaptureDataChangeMetaSource;




public class Neo4jCaptureDataChangeMeta  {
  
  private String operation;

  private Neo4jCaptureDataChangeMetaSource source;

  private Integer timestamp;

  private Integer txEventId;

  private Integer txEventsCount;

  private Integer txId;

  private String username;

 /**
   * Get operation
   * @return operation
  **/
  public String getOperation() {
    return operation;
  }

  /**
    * Set operation
  **/
  public void setOperation(String operation) {
    this.operation = operation;
  }

  public Neo4jCaptureDataChangeMeta operation(String operation) {
    this.operation = operation;
    return this;
  }

 /**
   * Get source
   * @return source
  **/
  public Neo4jCaptureDataChangeMetaSource getSource() {
    return source;
  }

  /**
    * Set source
  **/
  public void setSource(Neo4jCaptureDataChangeMetaSource source) {
    this.source = source;
  }

  public Neo4jCaptureDataChangeMeta source(Neo4jCaptureDataChangeMetaSource source) {
    this.source = source;
    return this;
  }

 /**
   * Get timestamp
   * @return timestamp
  **/
  public Integer getTimestamp() {
    return timestamp;
  }

  /**
    * Set timestamp
  **/
  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public Neo4jCaptureDataChangeMeta timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

 /**
   * Get txEventId
   * @return txEventId
  **/
  public Integer getTxEventId() {
    return txEventId;
  }

  /**
    * Set txEventId
  **/
  public void setTxEventId(Integer txEventId) {
    this.txEventId = txEventId;
  }

  public Neo4jCaptureDataChangeMeta txEventId(Integer txEventId) {
    this.txEventId = txEventId;
    return this;
  }

 /**
   * Get txEventsCount
   * @return txEventsCount
  **/
  public Integer getTxEventsCount() {
    return txEventsCount;
  }

  /**
    * Set txEventsCount
  **/
  public void setTxEventsCount(Integer txEventsCount) {
    this.txEventsCount = txEventsCount;
  }

  public Neo4jCaptureDataChangeMeta txEventsCount(Integer txEventsCount) {
    this.txEventsCount = txEventsCount;
    return this;
  }

 /**
   * Get txId
   * @return txId
  **/
  public Integer getTxId() {
    return txId;
  }

  /**
    * Set txId
  **/
  public void setTxId(Integer txId) {
    this.txId = txId;
  }

  public Neo4jCaptureDataChangeMeta txId(Integer txId) {
    this.txId = txId;
    return this;
  }

 /**
   * Get username
   * @return username
  **/
  public String getUsername() {
    return username;
  }

  /**
    * Set username
  **/
  public void setUsername(String username) {
    this.username = username;
  }

  public Neo4jCaptureDataChangeMeta username(String username) {
    this.username = username;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jCaptureDataChangeMeta {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    txEventId: ").append(toIndentedString(txEventId)).append("\n");
    sb.append("    txEventsCount: ").append(toIndentedString(txEventsCount)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

