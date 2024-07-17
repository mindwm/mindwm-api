package apimodels;

import apimodels.CloudEventData;
import java.net.URI;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CloudEvents Specification JSON Schema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-07-17T14:05:08.692111550Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CloudEvent   {
  @JsonProperty("id")
  @NotNull
@Size(min=1)

  private String id;

  @JsonProperty("source")
  @NotNull
@Size(min=1)

  private String source;

  @JsonProperty("specversion")
  @NotNull
@Size(min=1)

  private String specversion;

  @JsonProperty("type")
  @NotNull
@Size(min=1)

  private String type;

  @JsonProperty("datacontenttype")
  @Size(min=1)

  private String datacontenttype;

  @JsonProperty("dataschema")
  @Size(min=1)
@Valid

  private URI dataschema;

  @JsonProperty("subject")
  @Size(min=1)

  private String subject;

  @JsonProperty("time")
  @Size(min=1)
@Valid

  private OffsetDateTime time;

  @JsonProperty("data")
  @Valid

  private CloudEventData data;

  @JsonProperty("data_base64")
  
  private String dataBase64;

  public CloudEvent id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifies the event.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CloudEvent source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Identifies the context in which an event happened.
   * @return source
  **/
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public CloudEvent specversion(String specversion) {
    this.specversion = specversion;
    return this;
  }

   /**
   * The version of the CloudEvents specification which the event uses.
   * @return specversion
  **/
  public String getSpecversion() {
    return specversion;
  }

  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }

  public CloudEvent type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Describes the type of event related to the originating occurrence.
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CloudEvent datacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
    return this;
  }

   /**
   * Content type of the data value. Must adhere to RFC 2046 format.
   * @return datacontenttype
  **/
  public String getDatacontenttype() {
    return datacontenttype;
  }

  public void setDatacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
  }

  public CloudEvent dataschema(URI dataschema) {
    this.dataschema = dataschema;
    return this;
  }

   /**
   * Identifies the schema that data adheres to.
   * @return dataschema
  **/
  public URI getDataschema() {
    return dataschema;
  }

  public void setDataschema(URI dataschema) {
    this.dataschema = dataschema;
  }

  public CloudEvent subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Describes the subject of the event in the context of the event producer (identified by source).
   * @return subject
  **/
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public CloudEvent time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
   * @return time
  **/
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public CloudEvent data(CloudEventData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public CloudEventData getData() {
    return data;
  }

  public void setData(CloudEventData data) {
    this.data = data;
  }

  public CloudEvent dataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
    return this;
  }

   /**
   * Base64 encoded event payload. Must adhere to RFC4648.
   * @return dataBase64
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

