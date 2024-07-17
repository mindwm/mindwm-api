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
import org.openapitools.client.model.ClipboardPayload;
import org.openapitools.client.model.OasAnyTypeNotMapped;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Clipboard extends HashMap<String, OasAnyTypeNotMapped> {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("source")
  private String source = null;
  @SerializedName("specversion")
  private String specversion = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("datacontenttype")
  private String datacontenttype = null;
  @SerializedName("dataschema")
  private URI dataschema = null;
  @SerializedName("subject")
  private String subject = null;
  @SerializedName("time")
  private Date time = null;
  @SerializedName("data")
  private ClipboardPayload data = null;
  @SerializedName("data_base64")
  private String dataBase64 = null;

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
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
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
   **/
  @ApiModelProperty(required = true, value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
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
   **/
  @ApiModelProperty(value = "")
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
   **/
  @ApiModelProperty(value = "")
  public ClipboardPayload getData() {
    return data;
  }
  public void setData(ClipboardPayload data) {
    this.data = data;
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
    Clipboard clipboard = (Clipboard) o;
    return (this.id == null ? clipboard.id == null : this.id.equals(clipboard.id)) &&
        (this.source == null ? clipboard.source == null : this.source.equals(clipboard.source)) &&
        (this.specversion == null ? clipboard.specversion == null : this.specversion.equals(clipboard.specversion)) &&
        (this.type == null ? clipboard.type == null : this.type.equals(clipboard.type)) &&
        (this.datacontenttype == null ? clipboard.datacontenttype == null : this.datacontenttype.equals(clipboard.datacontenttype)) &&
        (this.dataschema == null ? clipboard.dataschema == null : this.dataschema.equals(clipboard.dataschema)) &&
        (this.subject == null ? clipboard.subject == null : this.subject.equals(clipboard.subject)) &&
        (this.time == null ? clipboard.time == null : this.time.equals(clipboard.time)) &&
        (this.data == null ? clipboard.data == null : this.data.equals(clipboard.data)) &&
        (this.dataBase64 == null ? clipboard.dataBase64 == null : this.dataBase64.equals(clipboard.dataBase64));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.source == null ? 0: this.source.hashCode());
    result = 31 * result + (this.specversion == null ? 0: this.specversion.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.datacontenttype == null ? 0: this.datacontenttype.hashCode());
    result = 31 * result + (this.dataschema == null ? 0: this.dataschema.hashCode());
    result = 31 * result + (this.subject == null ? 0: this.subject.hashCode());
    result = 31 * result + (this.time == null ? 0: this.time.hashCode());
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    result = 31 * result + (this.dataBase64 == null ? 0: this.dataBase64.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Clipboard {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("  specversion: ").append(specversion).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  datacontenttype: ").append(datacontenttype).append("\n");
    sb.append("  dataschema: ").append(dataschema).append("\n");
    sb.append("  subject: ").append(subject).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("  dataBase64: ").append(dataBase64).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
