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
import java.net.URI;
import java.time.OffsetDateTime;
import org.openapitools.client.model.CloudEventData;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.NoSuchElementException;



/**
  * CloudEvents Specification JSON Schema
 **/

public class CloudEvent  {
  
 /**
   * Identifies the event.
  **/
  private String id;

 /**
   * Identifies the context in which an event happened.
  **/
  private String source;

 /**
   * The version of the CloudEvents specification which the event uses.
  **/
  private String specversion;

 /**
   * Describes the type of event related to the originating occurrence.
  **/
  private String type;

 /**
   * Content type of the data value. Must adhere to RFC 2046 format.
  **/
  private String datacontenttype;

 /**
   * Identifies the schema that data adheres to.
  **/
  private URI dataschema;

 /**
   * Describes the subject of the event in the context of the event producer (identified by source).
  **/
  private String subject;

 /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
  **/
  private OffsetDateTime time;

  private CloudEventData data;

 /**
   * Base64 encoded event payload. Must adhere to RFC4648.
  **/
  private String dataBase64;

 /**
   * Identifies the event.
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

  public CloudEvent id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Identifies the context in which an event happened.
   * @return source
  **/
  public String getSource() {
    return source;
  }

  /**
    * Set source
  **/
  public void setSource(String source) {
    this.source = source;
  }

  public CloudEvent source(String source) {
    this.source = source;
    return this;
  }

 /**
   * The version of the CloudEvents specification which the event uses.
   * @return specversion
  **/
  public String getSpecversion() {
    return specversion;
  }

  /**
    * Set specversion
  **/
  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }

  public CloudEvent specversion(String specversion) {
    this.specversion = specversion;
    return this;
  }

 /**
   * Describes the type of event related to the originating occurrence.
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

  public CloudEvent type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Content type of the data value. Must adhere to RFC 2046 format.
   * @return datacontenttype
  **/
  public String getDatacontenttype() {
    return datacontenttype;
  }

  /**
    * Set datacontenttype
  **/
  public void setDatacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
  }

  public CloudEvent datacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
    return this;
  }

 /**
   * Identifies the schema that data adheres to.
   * @return dataschema
  **/
  public URI getDataschema() {
    return dataschema;
  }

  /**
    * Set dataschema
  **/
  public void setDataschema(URI dataschema) {
    this.dataschema = dataschema;
  }

  public CloudEvent dataschema(URI dataschema) {
    this.dataschema = dataschema;
    return this;
  }

 /**
   * Describes the subject of the event in the context of the event producer (identified by source).
   * @return subject
  **/
  public String getSubject() {
    return subject;
  }

  /**
    * Set subject
  **/
  public void setSubject(String subject) {
    this.subject = subject;
  }

  public CloudEvent subject(String subject) {
    this.subject = subject;
    return this;
  }

 /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
   * @return time
  **/
  public OffsetDateTime getTime() {
    return time;
  }

  /**
    * Set time
  **/
  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public CloudEvent time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  public CloudEventData getData() {
    return data;
  }

  /**
    * Set data
  **/
  public void setData(CloudEventData data) {
    this.data = data;
  }

  public CloudEvent data(CloudEventData data) {
    this.data = data;
    return this;
  }

 /**
   * Base64 encoded event payload. Must adhere to RFC4648.
   * @return dataBase64
  **/
  public String getDataBase64() {
    return dataBase64;
  }

  /**
    * Set dataBase64
  **/
  public void setDataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
  }

  public CloudEvent dataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    specversion: ").append(toIndentedString(specversion)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    datacontenttype: ").append(toIndentedString(datacontenttype)).append("\n");
    sb.append("    dataschema: ").append(toIndentedString(dataschema)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    dataBase64: ").append(toIndentedString(dataBase64)).append("\n");
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
