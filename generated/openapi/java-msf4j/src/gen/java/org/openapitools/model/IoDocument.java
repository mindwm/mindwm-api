package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CloudEventData;
import org.openapitools.model.TmuxPaneIoDocument;

/**
 * IoDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-07-12T10:59:43.422927096Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class IoDocument extends HashMap<String, Object>  {
  @JsonProperty("type")
  private String type;

  @JsonProperty("source")
  private String source;

  @JsonProperty("data")
  private TmuxPaneIoDocument data;

  @JsonProperty("id")
  private String id;

  @JsonProperty("specversion")
  private String specversion;

  @JsonProperty("datacontenttype")
  private String datacontenttype;

  @JsonProperty("dataschema")
  private URI dataschema;

  @JsonProperty("subject")
  private String subject;

  @JsonProperty("time")
  private Date time;

  @JsonProperty("data_base64")
  private String dataBase64;

  public IoDocument type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoDocument source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public IoDocument data(TmuxPaneIoDocument data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public TmuxPaneIoDocument getData() {
    return data;
  }

  public void setData(TmuxPaneIoDocument data) {
    this.data = data;
  }

  public IoDocument id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifies the event.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifies the event.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IoDocument specversion(String specversion) {
    this.specversion = specversion;
    return this;
  }

   /**
   * The version of the CloudEvents specification which the event uses.
   * @return specversion
  **/
  @ApiModelProperty(required = true, value = "The version of the CloudEvents specification which the event uses.")
  public String getSpecversion() {
    return specversion;
  }

  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }

  public IoDocument datacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
    return this;
  }

   /**
   * Content type of the data value. Must adhere to RFC 2046 format.
   * @return datacontenttype
  **/
  @ApiModelProperty(value = "Content type of the data value. Must adhere to RFC 2046 format.")
  public String getDatacontenttype() {
    return datacontenttype;
  }

  public void setDatacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
  }

  public IoDocument dataschema(URI dataschema) {
    this.dataschema = dataschema;
    return this;
  }

   /**
   * Identifies the schema that data adheres to.
   * @return dataschema
  **/
  @ApiModelProperty(value = "Identifies the schema that data adheres to.")
  public URI getDataschema() {
    return dataschema;
  }

  public void setDataschema(URI dataschema) {
    this.dataschema = dataschema;
  }

  public IoDocument subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Describes the subject of the event in the context of the event producer (identified by source).
   * @return subject
  **/
  @ApiModelProperty(value = "Describes the subject of the event in the context of the event producer (identified by source).")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public IoDocument time(Date time) {
    this.time = time;
    return this;
  }

   /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
   * @return time
  **/
  @ApiModelProperty(value = "Timestamp of when the occurrence happened. Must adhere to RFC 3339.")
  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public IoDocument dataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
    return this;
  }

   /**
   * Base64 encoded event payload. Must adhere to RFC4648.
   * @return dataBase64
  **/
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
    IoDocument ioDocument = (IoDocument) o;
    return Objects.equals(this.type, ioDocument.type) &&
        Objects.equals(this.source, ioDocument.source) &&
        Objects.equals(this.data, ioDocument.data) &&
        Objects.equals(this.id, ioDocument.id) &&
        Objects.equals(this.specversion, ioDocument.specversion) &&
        Objects.equals(this.datacontenttype, ioDocument.datacontenttype) &&
        Objects.equals(this.dataschema, ioDocument.dataschema) &&
        Objects.equals(this.subject, ioDocument.subject) &&
        Objects.equals(this.time, ioDocument.time) &&
        Objects.equals(this.dataBase64, ioDocument.dataBase64) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, source, data, id, specversion, datacontenttype, dataschema, subject, time, dataBase64, super.hashCode());
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

