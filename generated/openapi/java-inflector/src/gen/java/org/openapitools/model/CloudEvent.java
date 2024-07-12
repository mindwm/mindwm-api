package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CloudEventData;



/**
 * CloudEvents Specification JSON Schema
 **/

@ApiModel(description = "CloudEvents Specification JSON Schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-07-12T11:12:09.157517509Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class CloudEvent   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("source")
  private String source;

  @JsonProperty("specversion")
  private String specversion;

  @JsonProperty("type")
  private String type;

  @JsonProperty("datacontenttype")
  private String datacontenttype;

  @JsonProperty("dataschema")
  private URI dataschema;

  @JsonProperty("subject")
  private String subject;

  @JsonProperty("time")
  private Date time;

  @JsonProperty("data")
  private CloudEventData data;

  @JsonProperty("data_base64")
  private String dataBase64;

  /**
   * Identifies the event.
   **/
  public CloudEvent id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Identifies the event.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Identifies the context in which an event happened.
   **/
  public CloudEvent source(String source) {
    this.source = source;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Identifies the context in which an event happened.")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * The version of the CloudEvents specification which the event uses.
   **/
  public CloudEvent specversion(String specversion) {
    this.specversion = specversion;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The version of the CloudEvents specification which the event uses.")
  @JsonProperty("specversion")
  public String getSpecversion() {
    return specversion;
  }
  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }

  /**
   * Describes the type of event related to the originating occurrence.
   **/
  public CloudEvent type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Describes the type of event related to the originating occurrence.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Content type of the data value. Must adhere to RFC 2046 format.
   **/
  public CloudEvent datacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
    return this;
  }

  
  @ApiModelProperty(value = "Content type of the data value. Must adhere to RFC 2046 format.")
  @JsonProperty("datacontenttype")
  public String getDatacontenttype() {
    return datacontenttype;
  }
  public void setDatacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
  }

  /**
   * Identifies the schema that data adheres to.
   **/
  public CloudEvent dataschema(URI dataschema) {
    this.dataschema = dataschema;
    return this;
  }

  
  @ApiModelProperty(value = "Identifies the schema that data adheres to.")
  @JsonProperty("dataschema")
  public URI getDataschema() {
    return dataschema;
  }
  public void setDataschema(URI dataschema) {
    this.dataschema = dataschema;
  }

  /**
   * Describes the subject of the event in the context of the event producer (identified by source).
   **/
  public CloudEvent subject(String subject) {
    this.subject = subject;
    return this;
  }

  
  @ApiModelProperty(value = "Describes the subject of the event in the context of the event producer (identified by source).")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
   **/
  public CloudEvent time(Date time) {
    this.time = time;
    return this;
  }

  
  @ApiModelProperty(value = "Timestamp of when the occurrence happened. Must adhere to RFC 3339.")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  /**
   **/
  public CloudEvent data(CloudEventData data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public CloudEventData getData() {
    return data;
  }
  public void setData(CloudEventData data) {
    this.data = data;
  }

  /**
   * Base64 encoded event payload. Must adhere to RFC4648.
   **/
  public CloudEvent dataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
    return this;
  }

  
  @ApiModelProperty(value = "Base64 encoded event payload. Must adhere to RFC4648.")
  @JsonProperty("data_base64")
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
    return Objects.equals(id, cloudEvent.id) &&
        Objects.equals(source, cloudEvent.source) &&
        Objects.equals(specversion, cloudEvent.specversion) &&
        Objects.equals(type, cloudEvent.type) &&
        Objects.equals(datacontenttype, cloudEvent.datacontenttype) &&
        Objects.equals(dataschema, cloudEvent.dataschema) &&
        Objects.equals(subject, cloudEvent.subject) &&
        Objects.equals(time, cloudEvent.time) &&
        Objects.equals(data, cloudEvent.data) &&
        Objects.equals(dataBase64, cloudEvent.dataBase64);
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

