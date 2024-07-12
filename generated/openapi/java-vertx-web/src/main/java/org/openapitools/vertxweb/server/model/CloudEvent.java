package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URI;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CloudEventData;

/**
 * CloudEvents Specification JSON Schema
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CloudEvent   {
  
  private String id;
  private String source;
  private String specversion;
  private String type;
  private String datacontenttype;
  private URI dataschema;
  private String subject;
  private OffsetDateTime time;
  private CloudEventData data;
  private String dataBase64;

  public CloudEvent () {

  }

  public CloudEvent (String id, String source, String specversion, String type, String datacontenttype, URI dataschema, String subject, OffsetDateTime time, CloudEventData data, String dataBase64) {
    this.id = id;
    this.source = source;
    this.specversion = specversion;
    this.type = type;
    this.datacontenttype = datacontenttype;
    this.dataschema = dataschema;
    this.subject = subject;
    this.time = time;
    this.data = data;
    this.dataBase64 = dataBase64;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

    
  @JsonProperty("specversion")
  public String getSpecversion() {
    return specversion;
  }
  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
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

    
  @JsonProperty("data")
  public CloudEventData getData() {
    return data;
  }
  public void setData(CloudEventData data) {
    this.data = data;
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
