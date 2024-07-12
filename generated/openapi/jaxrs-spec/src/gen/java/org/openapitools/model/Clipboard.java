package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.ClipboardPayload;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Clipboard")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-07-12T11:00:04.614871798Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Clipboard extends HashMap<String, Object>  {
  private String type;
  private String source;
  private ClipboardPayload data;
  private String id;
  private String specversion;
  private String datacontenttype;
  private URI dataschema;
  private String subject;
  private Date time;
  private String dataBase64;

  /**
   **/
  public Clipboard type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public Clipboard source(String source) {
    this.source = source;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("source")
   @Pattern(regexp="[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)$")public String getSource() {
    return source;
  }

  @JsonProperty("source")
  public void setSource(String source) {
    this.source = source;
  }

  /**
   **/
  public Clipboard data(ClipboardPayload data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  @Valid public ClipboardPayload getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(ClipboardPayload data) {
    this.data = data;
  }

  /**
   * Identifies the event.
   **/
  public Clipboard id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Identifies the event.")
  @JsonProperty("id")
  @NotNull  @Size(min=1)public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The version of the CloudEvents specification which the event uses.
   **/
  public Clipboard specversion(String specversion) {
    this.specversion = specversion;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The version of the CloudEvents specification which the event uses.")
  @JsonProperty("specversion")
  @NotNull  @Size(min=1)public String getSpecversion() {
    return specversion;
  }

  @JsonProperty("specversion")
  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }

  /**
   * Content type of the data value. Must adhere to RFC 2046 format.
   **/
  public Clipboard datacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
    return this;
  }

  
  @ApiModelProperty(value = "Content type of the data value. Must adhere to RFC 2046 format.")
  @JsonProperty("datacontenttype")
   @Size(min=1)public String getDatacontenttype() {
    return datacontenttype;
  }

  @JsonProperty("datacontenttype")
  public void setDatacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
  }

  /**
   * Identifies the schema that data adheres to.
   **/
  public Clipboard dataschema(URI dataschema) {
    this.dataschema = dataschema;
    return this;
  }

  
  @ApiModelProperty(value = "Identifies the schema that data adheres to.")
  @JsonProperty("dataschema")
   @Size(min=1)public URI getDataschema() {
    return dataschema;
  }

  @JsonProperty("dataschema")
  public void setDataschema(URI dataschema) {
    this.dataschema = dataschema;
  }

  /**
   **/
  public Clipboard subject(String subject) {
    this.subject = subject;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }

  @JsonProperty("subject")
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
   **/
  public Clipboard time(Date time) {
    this.time = time;
    return this;
  }

  
  @ApiModelProperty(value = "Timestamp of when the occurrence happened. Must adhere to RFC 3339.")
  @JsonProperty("time")
   @Size(min=1)public Date getTime() {
    return time;
  }

  @JsonProperty("time")
  public void setTime(Date time) {
    this.time = time;
  }

  /**
   * Base64 encoded event payload. Must adhere to RFC4648.
   **/
  public Clipboard dataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
    return this;
  }

  
  @ApiModelProperty(value = "Base64 encoded event payload. Must adhere to RFC4648.")
  @JsonProperty("data_base64")
  public String getDataBase64() {
    return dataBase64;
  }

  @JsonProperty("data_base64")
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
    return Objects.equals(this.type, clipboard.type) &&
        Objects.equals(this.source, clipboard.source) &&
        Objects.equals(this.data, clipboard.data) &&
        Objects.equals(this.id, clipboard.id) &&
        Objects.equals(this.specversion, clipboard.specversion) &&
        Objects.equals(this.datacontenttype, clipboard.datacontenttype) &&
        Objects.equals(this.dataschema, clipboard.dataschema) &&
        Objects.equals(this.subject, clipboard.subject) &&
        Objects.equals(this.time, clipboard.time) &&
        Objects.equals(this.dataBase64, clipboard.dataBase64) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, source, data, id, specversion, datacontenttype, dataschema, subject, time, dataBase64, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Clipboard {\n");
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

