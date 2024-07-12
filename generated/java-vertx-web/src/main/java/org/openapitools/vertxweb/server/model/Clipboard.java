package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ClipboardPayload;
import org.openapitools.vertxweb.server.model.CloudEventData;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Clipboard extends HashMap<String, Object>  {
  
  private String type;
  private String source;
  private ClipboardPayload data;
  private String id;
  private String specversion;
  private String datacontenttype;
  private URI dataschema;
  private String subject;
  private OffsetDateTime time;
  private String dataBase64;

  public Clipboard () {

  }

  public Clipboard (String type, String source, ClipboardPayload data, String id, String specversion, String datacontenttype, URI dataschema, String subject, OffsetDateTime time, String dataBase64) {
    this.type = type;
    this.source = source;
    this.data = data;
    this.id = id;
    this.specversion = specversion;
    this.datacontenttype = datacontenttype;
    this.dataschema = dataschema;
    this.subject = subject;
    this.time = time;
    this.dataBase64 = dataBase64;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

    
  @JsonProperty("data")
  public ClipboardPayload getData() {
    return data;
  }
  public void setData(ClipboardPayload data) {
    this.data = data;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("specversion")
  public String getSpecversion() {
    return specversion;
  }
  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }

    
  @JsonProperty("datacontenttype")
  public String getDatacontenttype() {
    return datacontenttype;
  }
  public void setDatacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
  }

    
  @JsonProperty("dataschema")
  public URI getDataschema() {
    return dataschema;
  }
  public void setDataschema(URI dataschema) {
    this.dataschema = dataschema;
  }

    
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

    
  @JsonProperty("time")
  public OffsetDateTime getTime() {
    return time;
  }
  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

    
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
    Clipboard clipboard = (Clipboard) o;
    return super.equals(o) && Objects.equals(type, clipboard.type) &&
        Objects.equals(source, clipboard.source) &&
        Objects.equals(data, clipboard.data) &&
        Objects.equals(id, clipboard.id) &&
        Objects.equals(specversion, clipboard.specversion) &&
        Objects.equals(datacontenttype, clipboard.datacontenttype) &&
        Objects.equals(dataschema, clipboard.dataschema) &&
        Objects.equals(subject, clipboard.subject) &&
        Objects.equals(time, clipboard.time) &&
        Objects.equals(dataBase64, clipboard.dataBase64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), type, super.hashCode(), source, super.hashCode(), data, super.hashCode(), id, super.hashCode(), specversion, super.hashCode(), datacontenttype, super.hashCode(), dataschema, super.hashCode(), subject, super.hashCode(), time, super.hashCode(), dataBase64);
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
