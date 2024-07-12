package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CloudEventData;
import org.openapitools.model.TmuxPaneIoDocument;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class IoDocument extends HashMap<String, Object>  {
  
  private String type;

  private String source;

  private TmuxPaneIoDocument data;

  private String id;

  private String specversion;

  private String datacontenttype;

  private URI dataschema;

  private String subject;

  private java.util.Date time;

  private String dataBase64;

  /**
   **/
  public IoDocument type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   **/
  public IoDocument source(String source) {
    this.source = source;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("source")
 @Pattern(regexp="[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)\\\\.tmux\\\\.[A-Za-z0-9+/]*={0,2}\\.[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}\\\\.[0-9]+?\\\\.[0-9]+?\\\\.tiodocument$")  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }


  /**
   **/
  public IoDocument data(TmuxPaneIoDocument data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public TmuxPaneIoDocument getData() {
    return data;
  }
  public void setData(TmuxPaneIoDocument data) {
    this.data = data;
  }


  /**
   * Identifies the event.
   **/
  public IoDocument id(String id) {
    this.id = id;
    return this;
  }

  
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
   * The version of the CloudEvents specification which the event uses.
   **/
  public IoDocument specversion(String specversion) {
    this.specversion = specversion;
    return this;
  }

  
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
   * Content type of the data value. Must adhere to RFC 2046 format.
   **/
  public IoDocument datacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
    return this;
  }

  
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
  public IoDocument dataschema(URI dataschema) {
    this.dataschema = dataschema;
    return this;
  }

  
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
  public IoDocument subject(String subject) {
    this.subject = subject;
    return this;
  }

  
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
  public IoDocument time(java.util.Date time) {
    this.time = time;
    return this;
  }

  
  @ApiModelProperty(value = "Timestamp of when the occurrence happened. Must adhere to RFC 3339.")
  @JsonProperty("time")
 @Size(min=1)  public java.util.Date getTime() {
    return time;
  }
  public void setTime(java.util.Date time) {
    this.time = time;
  }


  /**
   * Base64 encoded event payload. Must adhere to RFC4648.
   **/
  public IoDocument dataBase64(String dataBase64) {
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
    IoDocument ioDocument = (IoDocument) o;
    return super.equals(o) && Objects.equals(this.type, ioDocument.type) &&
        Objects.equals(this.source, ioDocument.source) &&
        Objects.equals(this.data, ioDocument.data) &&
        Objects.equals(this.id, ioDocument.id) &&
        Objects.equals(this.specversion, ioDocument.specversion) &&
        Objects.equals(this.datacontenttype, ioDocument.datacontenttype) &&
        Objects.equals(this.dataschema, ioDocument.dataschema) &&
        Objects.equals(this.subject, ioDocument.subject) &&
        Objects.equals(this.time, ioDocument.time) &&
        Objects.equals(this.dataBase64, ioDocument.dataBase64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), type, super.hashCode(), source, super.hashCode(), data, super.hashCode(), id, super.hashCode(), specversion, super.hashCode(), datacontenttype, super.hashCode(), dataschema, super.hashCode(), subject, super.hashCode(), time, super.hashCode(), dataBase64);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoDocument {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    specversion: ").append(toIndentedString(specversion)).append("\n");
    sb.append("    datacontenttype: ").append(toIndentedString(datacontenttype)).append("\n");
    sb.append("    dataschema: ").append(toIndentedString(dataschema)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
