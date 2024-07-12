package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.Arrays;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CloudEventData;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CloudEvents Specification JSON Schema
 */

@Schema(name = "CloudEvent", description = "CloudEvents Specification JSON Schema")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-07-12T13:38:42.111054476Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class CloudEvent {

  private String id;

  private String source;

  private String specversion;

  private String type;

  private JsonNullable<@Size(min = 1) String> datacontenttype = JsonNullable.<String>undefined();

  private JsonNullable<@Size(min = 1) URI> dataschema = JsonNullable.<URI>undefined();

  private JsonNullable<@Size(min = 1) String> subject = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<@Size(min = 1) Date> time = JsonNullable.<Date>undefined();

  private JsonNullable<CloudEventData> data = JsonNullable.<CloudEventData>undefined();

  private JsonNullable<String> dataBase64 = JsonNullable.<String>undefined();

  public CloudEvent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CloudEvent(String id, String source, String specversion, String type) {
    this.id = id;
    this.source = source;
    this.specversion = specversion;
    this.type = type;
  }

  public CloudEvent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies the event.
   * @return id
   */
  @NotNull @Size(min = 1) 
  @Schema(name = "id", description = "Identifies the event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
   */
  @NotNull @Size(min = 1) 
  @Schema(name = "source", description = "Identifies the context in which an event happened.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("source")
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
   */
  @NotNull @Size(min = 1) 
  @Schema(name = "specversion", description = "The version of the CloudEvents specification which the event uses.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("specversion")
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
   */
  @NotNull @Size(min = 1) 
  @Schema(name = "type", description = "Describes the type of event related to the originating occurrence.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CloudEvent datacontenttype(String datacontenttype) {
    this.datacontenttype = JsonNullable.of(datacontenttype);
    return this;
  }

  /**
   * Content type of the data value. Must adhere to RFC 2046 format.
   * @return datacontenttype
   */
  @Size(min = 1) 
  @Schema(name = "datacontenttype", description = "Content type of the data value. Must adhere to RFC 2046 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("datacontenttype")
  public JsonNullable<@Size(min = 1) String> getDatacontenttype() {
    return datacontenttype;
  }

  public void setDatacontenttype(JsonNullable<String> datacontenttype) {
    this.datacontenttype = datacontenttype;
  }

  public CloudEvent dataschema(URI dataschema) {
    this.dataschema = JsonNullable.of(dataschema);
    return this;
  }

  /**
   * Identifies the schema that data adheres to.
   * @return dataschema
   */
  @Valid @Size(min = 1) 
  @Schema(name = "dataschema", description = "Identifies the schema that data adheres to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataschema")
  public JsonNullable<@Size(min = 1) URI> getDataschema() {
    return dataschema;
  }

  public void setDataschema(JsonNullable<URI> dataschema) {
    this.dataschema = dataschema;
  }

  public CloudEvent subject(String subject) {
    this.subject = JsonNullable.of(subject);
    return this;
  }

  /**
   * Describes the subject of the event in the context of the event producer (identified by source).
   * @return subject
   */
  @Size(min = 1) 
  @Schema(name = "subject", description = "Describes the subject of the event in the context of the event producer (identified by source).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subject")
  public JsonNullable<@Size(min = 1) String> getSubject() {
    return subject;
  }

  public void setSubject(JsonNullable<String> subject) {
    this.subject = subject;
  }

  public CloudEvent time(Date time) {
    this.time = JsonNullable.of(time);
    return this;
  }

  /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
   * @return time
   */
  @Valid @Size(min = 1) 
  @Schema(name = "time", description = "Timestamp of when the occurrence happened. Must adhere to RFC 3339.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time")
  public JsonNullable<@Size(min = 1) Date> getTime() {
    return time;
  }

  public void setTime(JsonNullable<Date> time) {
    this.time = time;
  }

  public CloudEvent data(CloudEventData data) {
    this.data = JsonNullable.of(data);
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public JsonNullable<CloudEventData> getData() {
    return data;
  }

  public void setData(JsonNullable<CloudEventData> data) {
    this.data = data;
  }

  public CloudEvent dataBase64(String dataBase64) {
    this.dataBase64 = JsonNullable.of(dataBase64);
    return this;
  }

  /**
   * Base64 encoded event payload. Must adhere to RFC4648.
   * @return dataBase64
   */
  
  @Schema(name = "data_base64", description = "Base64 encoded event payload. Must adhere to RFC4648.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data_base64")
  public JsonNullable<String> getDataBase64() {
    return dataBase64;
  }

  public void setDataBase64(JsonNullable<String> dataBase64) {
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
        equalsNullable(this.datacontenttype, cloudEvent.datacontenttype) &&
        equalsNullable(this.dataschema, cloudEvent.dataschema) &&
        equalsNullable(this.subject, cloudEvent.subject) &&
        equalsNullable(this.time, cloudEvent.time) &&
        equalsNullable(this.data, cloudEvent.data) &&
        equalsNullable(this.dataBase64, cloudEvent.dataBase64);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, specversion, type, hashCodeNullable(datacontenttype), hashCodeNullable(dataschema), hashCodeNullable(subject), hashCodeNullable(time), hashCodeNullable(data), hashCodeNullable(dataBase64));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

