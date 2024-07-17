package org.openapitools.model;

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.TmuxPaneIoDocument;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class IoDocument extends HashMap<String, Object> {
  
  @ApiModelProperty(required = true, value = "Identifies the event.")
 /**
   * Identifies the event.
  **/
  private String id;

  @ApiModelProperty(required = true, value = "")
  private String source;

  @ApiModelProperty(required = true, value = "The version of the CloudEvents specification which the event uses.")
 /**
   * The version of the CloudEvents specification which the event uses.
  **/
  private String specversion;

  @ApiModelProperty(required = true, value = "")
  private String type = "IoDocument";

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

  @ApiModelProperty(value = "")
  private String subject = "IoDocument";

  @ApiModelProperty(value = "Timestamp of when the occurrence happened. Must adhere to RFC 3339.")
 /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
  **/
  private Date time;

  @ApiModelProperty(value = "")
  private TmuxPaneIoDocument data;

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

  public IoDocument id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get source
   * @return source
  **/
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public IoDocument source(String source) {
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

  public IoDocument specversion(String specversion) {
    this.specversion = specversion;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoDocument type(String type) {
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

  public IoDocument datacontenttype(String datacontenttype) {
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

  public IoDocument dataschema(URI dataschema) {
    this.dataschema = dataschema;
    return this;
  }

 /**
   * Get subject
   * @return subject
  **/
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public IoDocument subject(String subject) {
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

  public IoDocument time(Date time) {
    this.time = time;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public TmuxPaneIoDocument getData() {
    return data;
  }

  public void setData(TmuxPaneIoDocument data) {
    this.data = data;
  }

  public IoDocument data(TmuxPaneIoDocument data) {
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

  public IoDocument dataBase64(String dataBase64) {
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
    IoDocument ioDocument = (IoDocument) o;
    return Objects.equals(this.id, ioDocument.id) &&
        Objects.equals(this.source, ioDocument.source) &&
        Objects.equals(this.specversion, ioDocument.specversion) &&
        Objects.equals(this.type, ioDocument.type) &&
        Objects.equals(this.datacontenttype, ioDocument.datacontenttype) &&
        Objects.equals(this.dataschema, ioDocument.dataschema) &&
        Objects.equals(this.subject, ioDocument.subject) &&
        Objects.equals(this.time, ioDocument.time) &&
        Objects.equals(this.data, ioDocument.data) &&
        Objects.equals(this.dataBase64, ioDocument.dataBase64) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, specversion, type, datacontenttype, dataschema, subject, time, data, dataBase64, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoDocument {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

