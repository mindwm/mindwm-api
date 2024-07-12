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

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.OasAnyTypeNotMapped;
import org.openapitools.client.model.TmuxPaneIoDocument;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class IoDocument extends HashMap<String, OasAnyTypeNotMapped> {
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("source")
  private String source = null;
  @SerializedName("data")
  private TmuxPaneIoDocument data = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("specversion")
  private String specversion = null;
  @SerializedName("datacontenttype")
  private String datacontenttype = null;
  @SerializedName("dataschema")
  private URI dataschema = null;
  @SerializedName("subject")
  private String subject = null;
  @SerializedName("time")
  private Date time = null;
  @SerializedName("data_base64")
  private String dataBase64 = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TmuxPaneIoDocument getData() {
    return data;
  }
  public void setData(TmuxPaneIoDocument data) {
    this.data = data;
  }

  /**
   * Identifies the event.
   **/
  @ApiModelProperty(required = true, value = "Identifies the event.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The version of the CloudEvents specification which the event uses.
   **/
  @ApiModelProperty(required = true, value = "The version of the CloudEvents specification which the event uses.")
  public String getSpecversion() {
    return specversion;
  }
  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }

  /**
   * Content type of the data value. Must adhere to RFC 2046 format.
   **/
  @ApiModelProperty(value = "Content type of the data value. Must adhere to RFC 2046 format.")
  public String getDatacontenttype() {
    return datacontenttype;
  }
  public void setDatacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
  }

  /**
   * Identifies the schema that data adheres to.
   **/
  @ApiModelProperty(value = "Identifies the schema that data adheres to.")
  public URI getDataschema() {
    return dataschema;
  }
  public void setDataschema(URI dataschema) {
    this.dataschema = dataschema;
  }

  /**
   * Describes the subject of the event in the context of the event producer (identified by source).
   **/
  @ApiModelProperty(value = "Describes the subject of the event in the context of the event producer (identified by source).")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
   **/
  @ApiModelProperty(value = "Timestamp of when the occurrence happened. Must adhere to RFC 3339.")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  /**
   * Base64 encoded event payload. Must adhere to RFC4648.
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
    return (this.type == null ? ioDocument.type == null : this.type.equals(ioDocument.type)) &&
        (this.source == null ? ioDocument.source == null : this.source.equals(ioDocument.source)) &&
        (this.data == null ? ioDocument.data == null : this.data.equals(ioDocument.data)) &&
        (this.id == null ? ioDocument.id == null : this.id.equals(ioDocument.id)) &&
        (this.specversion == null ? ioDocument.specversion == null : this.specversion.equals(ioDocument.specversion)) &&
        (this.datacontenttype == null ? ioDocument.datacontenttype == null : this.datacontenttype.equals(ioDocument.datacontenttype)) &&
        (this.dataschema == null ? ioDocument.dataschema == null : this.dataschema.equals(ioDocument.dataschema)) &&
        (this.subject == null ? ioDocument.subject == null : this.subject.equals(ioDocument.subject)) &&
        (this.time == null ? ioDocument.time == null : this.time.equals(ioDocument.time)) &&
        (this.dataBase64 == null ? ioDocument.dataBase64 == null : this.dataBase64.equals(ioDocument.dataBase64));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.source == null ? 0: this.source.hashCode());
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.specversion == null ? 0: this.specversion.hashCode());
    result = 31 * result + (this.datacontenttype == null ? 0: this.datacontenttype.hashCode());
    result = 31 * result + (this.dataschema == null ? 0: this.dataschema.hashCode());
    result = 31 * result + (this.subject == null ? 0: this.subject.hashCode());
    result = 31 * result + (this.time == null ? 0: this.time.hashCode());
    result = 31 * result + (this.dataBase64 == null ? 0: this.dataBase64.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoDocument {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  specversion: ").append(specversion).append("\n");
    sb.append("  datacontenttype: ").append(datacontenttype).append("\n");
    sb.append("  dataschema: ").append(dataschema).append("\n");
    sb.append("  subject: ").append(subject).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  dataBase64: ").append(dataBase64).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}