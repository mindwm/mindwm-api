package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CloudEventData;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@ApiModel(description="CloudEvents Specification JSON Schema")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-07-17T14:05:27.023145952Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class CloudEvent   {
  
  private String id;
  private String source;
  private String specversion;
  private String type;
  private String datacontenttype;
  private URI dataschema;
  private String subject;
  private Date time;
  private CloudEventData data;
  private String dataBase64;

  /**
   * Identifies the event.
   **/
  
  @ApiModelProperty(required = true, value = "Identifies the event.")
  @JsonProperty("id")
  @NotNull
 @Size(min=1)  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Identifies the context in which an event happened.
   **/
  
  @ApiModelProperty(required = true, value = "Identifies the context in which an event happened.")
  @JsonProperty("source")
  @NotNull
 @Size(min=1)  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * The version of the CloudEvents specification which the event uses.
   **/
  
  @ApiModelProperty(required = true, value = "The version of the CloudEvents specification which the event uses.")
  @JsonProperty("specversion")
  @NotNull
 @Size(min=1)  public String getSpecversion() {
    return specversion;
  }
  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }

  /**
   * Describes the type of event related to the originating occurrence.
   **/
  
  @ApiModelProperty(required = true, value = "Describes the type of event related to the originating occurrence.")
  @JsonProperty("type")
  @NotNull
 @Size(min=1)  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Content type of the data value. Must adhere to RFC 2046 format.
   **/
  
  @ApiModelProperty(value = "Content type of the data value. Must adhere to RFC 2046 format.")
  @JsonProperty("datacontenttype")
 @Size(min=1)  public String getDatacontenttype() {
    return datacontenttype;
  }
  public void setDatacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
  }

  /**
   * Identifies the schema that data adheres to.
   **/
  
  @ApiModelProperty(value = "Identifies the schema that data adheres to.")
  @JsonProperty("dataschema")
 @Size(min=1)  public URI getDataschema() {
    return dataschema;
  }
  public void setDataschema(URI dataschema) {
    this.dataschema = dataschema;
  }

  /**
   * Describes the subject of the event in the context of the event producer (identified by source).
   **/
  
  @ApiModelProperty(value = "Describes the subject of the event in the context of the event producer (identified by source).")
  @JsonProperty("subject")
 @Size(min=1)  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
   **/
  
  @ApiModelProperty(value = "Timestamp of when the occurrence happened. Must adhere to RFC 3339.")
  @JsonProperty("time")
 @Size(min=1)  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  @Valid
  public CloudEventData getData() {
    return data;
  }
  public void setData(CloudEventData data) {
    this.data = data;
  }

  /**
   * Base64 encoded event payload. Must adhere to RFC4648.
   **/
  
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

