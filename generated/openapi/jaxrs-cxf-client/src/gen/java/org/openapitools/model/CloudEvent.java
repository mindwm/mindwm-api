package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.net.URI;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * CloudEvents Specification JSON Schema
 **/
@ApiModel(description="CloudEvents Specification JSON Schema")

public class CloudEvent  {
  
  @ApiModelProperty(required = true, value = "Identifies the event.")
 /**
   * Identifies the event.
  **/
  private String id;

  @ApiModelProperty(required = true, value = "Identifies the context in which an event happened.")
 /**
   * Identifies the context in which an event happened.
  **/
  private String source;

  @ApiModelProperty(required = true, value = "The version of the CloudEvents specification which the event uses.")
 /**
   * The version of the CloudEvents specification which the event uses.
  **/
  private String specversion;

  @ApiModelProperty(required = true, value = "Describes the type of event related to the originating occurrence.")
 /**
   * Describes the type of event related to the originating occurrence.
  **/
  private String type;

  @ApiModelProperty(value = "Content type of the data value. Must adhere to RFC 2046 format.")
 /**
   * Content type of the data value. Must adhere to RFC 2046 format.
  **/
  private String datacontenttype;

  @ApiModelProperty(value = "Identifies the schema that data adheres to.")
 /**
   * Identifies the schema that data adheres to.
  **/
  private URI dataschema;

  @ApiModelProperty(value = "Describes the subject of the event in the context of the event producer (identified by source).")
 /**
   * Describes the subject of the event in the context of the event producer (identified by source).
  **/
  private String subject;

  @ApiModelProperty(value = "Timestamp of when the occurrence happened. Must adhere to RFC 3339.")
 /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
  **/
  private Date time;

  @ApiModelProperty(value = "The event payload.")
 /**
   * The event payload.
  **/
  private Object data;

  @ApiModelProperty(value = "Base64 encoded event payload. Must adhere to RFC4648.")
 /**
   * Base64 encoded event payload. Must adhere to RFC4648.
  **/
  private String dataBase64;
 /**
   * Identifies the event.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

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
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

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
  @JsonProperty("specversion")
  public String getSpecversion() {
    return specversion;
  }

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
  @JsonProperty("type")
  public String getType() {
    return type;
  }

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
  @JsonProperty("datacontenttype")
  public String getDatacontenttype() {
    return datacontenttype;
  }

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
  @JsonProperty("dataschema")
  public URI getDataschema() {
    return dataschema;
  }

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
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }

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
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public CloudEvent time(Date time) {
    this.time = time;
    return this;
  }

 /**
   * The event payload.
   * @return data
  **/
  @JsonProperty("data")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public CloudEvent data(Object data) {
    this.data = data;
    return this;
  }

 /**
   * Base64 encoded event payload. Must adhere to RFC4648.
   * @return dataBase64
  **/
  @JsonProperty("data_base64")
  public String getDataBase64() {
    return dataBase64;
  }

  public void setDataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
  }

  public CloudEvent dataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

