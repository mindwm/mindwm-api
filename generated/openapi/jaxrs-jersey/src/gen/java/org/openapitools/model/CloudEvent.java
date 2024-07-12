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
import java.net.URI;
import java.util.Date;
import org.openapitools.model.CloudEventData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * CloudEvents Specification JSON Schema
 */
@ApiModel(description = "CloudEvents Specification JSON Schema")
@JsonPropertyOrder({
  CloudEvent.JSON_PROPERTY_ID,
  CloudEvent.JSON_PROPERTY_SOURCE,
  CloudEvent.JSON_PROPERTY_SPECVERSION,
  CloudEvent.JSON_PROPERTY_TYPE,
  CloudEvent.JSON_PROPERTY_DATACONTENTTYPE,
  CloudEvent.JSON_PROPERTY_DATASCHEMA,
  CloudEvent.JSON_PROPERTY_SUBJECT,
  CloudEvent.JSON_PROPERTY_TIME,
  CloudEvent.JSON_PROPERTY_DATA,
  CloudEvent.JSON_PROPERTY_DATA_BASE64
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-07-12T12:33:22.893302606Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class CloudEvent   {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private String id;

  public static final String JSON_PROPERTY_SOURCE = "source";
  @JsonProperty(JSON_PROPERTY_SOURCE)
  private String source;

  public static final String JSON_PROPERTY_SPECVERSION = "specversion";
  @JsonProperty(JSON_PROPERTY_SPECVERSION)
  private String specversion;

  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private String type;

  public static final String JSON_PROPERTY_DATACONTENTTYPE = "datacontenttype";
  @JsonProperty(JSON_PROPERTY_DATACONTENTTYPE)
  private String datacontenttype;

  public static final String JSON_PROPERTY_DATASCHEMA = "dataschema";
  @JsonProperty(JSON_PROPERTY_DATASCHEMA)
  private URI dataschema;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  private String subject;

  public static final String JSON_PROPERTY_TIME = "time";
  @JsonProperty(JSON_PROPERTY_TIME)
  private Date time;

  public static final String JSON_PROPERTY_DATA = "data";
  @JsonProperty(JSON_PROPERTY_DATA)
  private CloudEventData data;

  public static final String JSON_PROPERTY_DATA_BASE64 = "data_base64";
  @JsonProperty(JSON_PROPERTY_DATA_BASE64)
  private String dataBase64;

  public CloudEvent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies the event.
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(required = true, value = "Identifies the event.")
  @NotNull  @Size(min=1)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CloudEvent source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Identifies the context in which an event happened.
   * @return source
   **/
  @JsonProperty(value = "source")
  @ApiModelProperty(required = true, value = "Identifies the context in which an event happened.")
  @NotNull  @Size(min=1)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public CloudEvent specversion(String specversion) {
    this.specversion = specversion;
    return this;
  }

  /**
   * The version of the CloudEvents specification which the event uses.
   * @return specversion
   **/
  @JsonProperty(value = "specversion")
  @ApiModelProperty(required = true, value = "The version of the CloudEvents specification which the event uses.")
  @NotNull  @Size(min=1)
  public String getSpecversion() {
    return specversion;
  }

  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }

  public CloudEvent type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Describes the type of event related to the originating occurrence.
   * @return type
   **/
  @JsonProperty(value = "type")
  @ApiModelProperty(required = true, value = "Describes the type of event related to the originating occurrence.")
  @NotNull  @Size(min=1)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CloudEvent datacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
    return this;
  }

  /**
   * Content type of the data value. Must adhere to RFC 2046 format.
   * @return datacontenttype
   **/
  @JsonProperty(value = "datacontenttype")
  @ApiModelProperty(value = "Content type of the data value. Must adhere to RFC 2046 format.")
   @Size(min=1)
  public String getDatacontenttype() {
    return datacontenttype;
  }

  public void setDatacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
  }

  public CloudEvent dataschema(URI dataschema) {
    this.dataschema = dataschema;
    return this;
  }

  /**
   * Identifies the schema that data adheres to.
   * @return dataschema
   **/
  @JsonProperty(value = "dataschema")
  @ApiModelProperty(value = "Identifies the schema that data adheres to.")
   @Size(min=1)
  public URI getDataschema() {
    return dataschema;
  }

  public void setDataschema(URI dataschema) {
    this.dataschema = dataschema;
  }

  public CloudEvent subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Describes the subject of the event in the context of the event producer (identified by source).
   * @return subject
   **/
  @JsonProperty(value = "subject")
  @ApiModelProperty(value = "Describes the subject of the event in the context of the event producer (identified by source).")
   @Size(min=1)
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public CloudEvent time(Date time) {
    this.time = time;
    return this;
  }

  /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
   * @return time
   **/
  @JsonProperty(value = "time")
  @ApiModelProperty(value = "Timestamp of when the occurrence happened. Must adhere to RFC 3339.")
   @Size(min=1)
  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public CloudEvent data(CloudEventData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @JsonProperty(value = "data")
  @ApiModelProperty(value = "")
  @Valid 
  public CloudEventData getData() {
    return data;
  }

  public void setData(CloudEventData data) {
    this.data = data;
  }

  public CloudEvent dataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
    return this;
  }

  /**
   * Base64 encoded event payload. Must adhere to RFC4648.
   * @return dataBase64
   **/
  @JsonProperty(value = "data_base64")
  @ApiModelProperty(value = "Base64 encoded event payload. Must adhere to RFC4648.")
  
  public String getDataBase64() {
    return dataBase64;
  }

  public void setDataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudEvent cloudEvent = (CloudEvent) o;
    return Objects.equals(this.id, cloudEvent.id) &&
        Objects.equals(this.source, cloudEvent.source) &&
        Objects.equals(this.specversion, cloudEvent.specversion) &&
        Objects.equals(this.type, cloudEvent.type) &&
        Objects.equals(this.datacontenttype, cloudEvent.datacontenttype) &&
        Objects.equals(this.dataschema, cloudEvent.dataschema) &&
        Objects.equals(this.subject, cloudEvent.subject) &&
        Objects.equals(this.time, cloudEvent.time) &&
        Objects.equals(this.data, cloudEvent.data) &&
        Objects.equals(this.dataBase64, cloudEvent.dataBase64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, specversion, type, datacontenttype, dataschema, subject, time, data, dataBase64);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

