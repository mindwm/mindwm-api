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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.TmuxPaneIoDocument;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * IoDocument
 */
@JsonPropertyOrder({
  IoDocument.JSON_PROPERTY_TYPE,
  IoDocument.JSON_PROPERTY_SOURCE,
  IoDocument.JSON_PROPERTY_DATA,
  IoDocument.JSON_PROPERTY_ID,
  IoDocument.JSON_PROPERTY_SPECVERSION,
  IoDocument.JSON_PROPERTY_DATACONTENTTYPE,
  IoDocument.JSON_PROPERTY_DATASCHEMA,
  IoDocument.JSON_PROPERTY_SUBJECT,
  IoDocument.JSON_PROPERTY_TIME,
  IoDocument.JSON_PROPERTY_DATA_BASE64
})
@JsonTypeName("IoDocument")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-07-13T19:25:21.734128876Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@Introspected
public class IoDocument extends HashMap<String, Object> {
    public static final String JSON_PROPERTY_TYPE = "type";
    private String type;

    public static final String JSON_PROPERTY_SOURCE = "source";
    private String source;

    public static final String JSON_PROPERTY_DATA = "data";
    private TmuxPaneIoDocument data;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_SPECVERSION = "specversion";
    private String specversion;

    public static final String JSON_PROPERTY_DATACONTENTTYPE = "datacontenttype";
    private String datacontenttype;

    public static final String JSON_PROPERTY_DATASCHEMA = "dataschema";
    private URI dataschema;

    public static final String JSON_PROPERTY_SUBJECT = "subject";
    private String subject = "IoDocument";

    public static final String JSON_PROPERTY_TIME = "time";
    private OffsetDateTime time;

    public static final String JSON_PROPERTY_DATA_BASE64 = "data_base64";
    private String dataBase64;

    public IoDocument(String id, String source, String specversion, String type) {
        super();
        this.id = id;
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
    @Nullable
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Pattern(regexp="[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)\\\\.tmux\\\\.[A-Za-z0-9+/]*={0,2}\\.[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}\\\\.[0-9]+?\\\\.[0-9]+?\\\\.tiodocument$")
    @Schema(name = "source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_SOURCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSource() {
        return source;
    }

    @JsonProperty(JSON_PROPERTY_SOURCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TmuxPaneIoDocument getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

    public IoDocument specversion(String specversion) {
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

    public IoDocument datacontenttype(String datacontenttype) {
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

    public IoDocument dataschema(URI dataschema) {
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

    public IoDocument subject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get subject
     * @return subject
     */
    @Nullable
    @Schema(name = "subject", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

    public IoDocument time(OffsetDateTime time) {
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

    public IoDocument dataBase64(String dataBase64) {
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

