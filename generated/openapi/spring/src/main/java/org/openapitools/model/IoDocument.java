package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * IoDocument
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-23T19:06:54.943239961Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class IoDocument {

  private String id;

  private String source;

  private String specversion;

  private String type = "IoDocument";

  private String datacontenttype;

  private URI dataschema;

  private String subject = "IoDocument";

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime time;

  private Object data;

  private String dataBase64;

  public IoDocument() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IoDocument(String id, String source, String specversion, String type) {
    this.id = id;
    this.source = source;
    this.specversion = specversion;
    this.type = type;
  }

  public IoDocument id(String id) {
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

  public IoDocument source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @NotNull 
  @Schema(name = "source", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public IoDocument specversion(String specversion) {
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

  public IoDocument type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IoDocument datacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
    return this;
  }

  /**
   * Content type of the data value. Must adhere to RFC 2046 format.
   * @return datacontenttype
   */
  @Size(min = 1) 
  @Schema(name = "datacontenttype", description = "Content type of the data value. Must adhere to RFC 2046 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("datacontenttype")
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
   */
  @Valid @Size(min = 1) 
  @Schema(name = "dataschema", description = "Identifies the schema that data adheres to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataschema")
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
   * Get subject
   * @return subject
   */
  
  @Schema(name = "subject", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public IoDocument time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
   * @return time
   */
  @Valid @Size(min = 1) 
  @Schema(name = "time", description = "Timestamp of when the occurrence happened. Must adhere to RFC 3339.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public IoDocument data(Object data) {
    this.data = data;
    return this;
  }

  /**
   * The event payload.
   * @return data
   */
  
  @Schema(name = "data", description = "The event payload.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public IoDocument dataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
    return this;
  }

  /**
   * Base64 encoded event payload. Must adhere to RFC4648.
   * @return dataBase64
   */
  
  @Schema(name = "data_base64", description = "Base64 encoded event payload. Must adhere to RFC4648.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data_base64")
  public String getDataBase64() {
    return dataBase64;
  }

  public void setDataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public IoDocument putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
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
    Objects.equals(this.additionalProperties, ioDocument.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, specversion, type, datacontenttype, dataschema, subject, time, data, dataBase64, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoDocument {\n");
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
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

