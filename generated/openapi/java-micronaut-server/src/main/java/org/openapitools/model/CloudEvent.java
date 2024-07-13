/*
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

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.net.URI;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CloudEventData;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CloudEvents Specification JSON Schema
 */
@Schema(name = "CloudEvent", description = "CloudEvents Specification JSON Schema")
@JsonPropertyOrder({
  CloudEvent.JSON_PROPERTY_ID,
  CloudEvent.JSON_PROPERTY_SOURCE,
  CloudEvent.JSON_PROPERTY_SPECVERSION,
  CloudEvent.JSON_PROPERTY_TYPE,
  CloudEvent.JSON_PROPERTY_DATACONTENTTYPE,
  CloudEvent.JSON_PROPERTY_DATASCHEMA,
  CloudEvent.JSON_PROPERTY_SUBJECT,
  CloudEvent.JSON_PROPERTY_TIME,
  CloudEvent.JSON_PROPERTY_DATA,
  CloudEvent.JSON_PROPERTY_DATA_BASE64
})
@JsonTypeName("CloudEvent")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-07-13T19:25:21.734128876Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@Introspected
public class CloudEvent {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_SOURCE = "source";
    private String source;

    public static final String JSON_PROPERTY_SPECVERSION = "specversion";
    private String specversion;

    public static final String JSON_PROPERTY_TYPE = "type";
    private String type;

    public static final String JSON_PROPERTY_DATACONTENTTYPE = "datacontenttype";
    private String datacontenttype;

    public static final String JSON_PROPERTY_DATASCHEMA = "dataschema";
    private URI dataschema;

    public static final String JSON_PROPERTY_SUBJECT = "subject";
    private String subject;

    public static final String JSON_PROPERTY_TIME = "time";
    private OffsetDateTime time;

    public static final String JSON_PROPERTY_DATA = "data";
    private CloudEventData data;

    public static final String JSON_PROPERTY_DATA_BASE64 = "data_base64";
    private String dataBase64;

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
    @NotNull
    @Size(min=1)
    @Schema(name = "id", description = "Identifies the event.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    @NotNull
    @Size(min=1)
    @Schema(name = "source", description = "Identifies the context in which an event happened.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_SOURCE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getSource() {
        return source;
    }

    @JsonProperty(JSON_PROPERTY_SOURCE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    @NotNull
    @Size(min=1)
    @Schema(name = "specversion", description = "The version of the CloudEvents specification which the event uses.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_SPECVERSION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getSpecversion() {
        return specversion;
    }

    @JsonProperty(JSON_PROPERTY_SPECVERSION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    @NotNull
    @Size(min=1)
    @Schema(name = "type", description = "Describes the type of event related to the originating occurrence.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
     */
    @Nullable
    @Size(min=1)
    @Schema(name = "datacontenttype", description = "Content type of the data value. Must adhere to RFC 2046 format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DATACONTENTTYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDatacontenttype() {
        return datacontenttype;
    }

    @JsonProperty(JSON_PROPERTY_DATACONTENTTYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Size(min=1)
    @Schema(name = "dataschema", description = "Identifies the schema that data adheres to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DATASCHEMA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public URI getDataschema() {
        return dataschema;
    }

    @JsonProperty(JSON_PROPERTY_DATASCHEMA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Size(min=1)
    @Schema(name = "subject", description = "Describes the subject of the event in the context of the event producer (identified by source).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_SUBJECT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSubject() {
        return subject;
    }

    @JsonProperty(JSON_PROPERTY_SUBJECT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Size(min=1)
    @Schema(name = "time", description = "Timestamp of when the occurrence happened. Must adhere to RFC 3339.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getTime() {
        return time;
    }

    @JsonProperty(JSON_PROPERTY_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
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
     */
    @Valid
    @Nullable
    @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CloudEventData getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Schema(name = "data_base64", description = "Base64 encoded event payload. Must adhere to RFC4648.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DATA_BASE64)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getDataBase64() {
        return dataBase64;
    }

    @JsonProperty(JSON_PROPERTY_DATA_BASE64)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
        return Objects.equals(this.id, cloudEvent.id) &&
            Objects.equals(this.source, cloudEvent.source) &&
            Objects.equals(this.specversion, cloudEvent.specversion) &&
            Objects.equals(this.type, cloudEvent.type) &&
            Objects.equals(this.datacontenttype, cloudEvent.datacontenttype) &&
            Objects.equals(this.dataschema, cloudEvent.dataschema) &&
            Objects.equals(this.subject, cloudEvent.subject) &&
            Objects.equals(this.time, cloudEvent.time) &&
            Objects.equals(this.data, cloudEvent.data) &&
            Objects.equals(this.dataBase64, cloudEvent.dataBase64);
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

