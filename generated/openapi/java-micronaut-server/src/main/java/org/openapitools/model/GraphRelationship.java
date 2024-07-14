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
import org.openapitools.model.GraphRelationshipAllOfData;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * GraphRelationship
 */
@JsonPropertyOrder({
  GraphRelationship.JSON_PROPERTY_ID,
  GraphRelationship.JSON_PROPERTY_SOURCE,
  GraphRelationship.JSON_PROPERTY_SPECVERSION,
  GraphRelationship.JSON_PROPERTY_TYPE,
  GraphRelationship.JSON_PROPERTY_DATACONTENTTYPE,
  GraphRelationship.JSON_PROPERTY_DATASCHEMA,
  GraphRelationship.JSON_PROPERTY_SUBJECT,
  GraphRelationship.JSON_PROPERTY_TIME,
  GraphRelationship.JSON_PROPERTY_DATA,
  GraphRelationship.JSON_PROPERTY_DATA_BASE64
})
@JsonTypeName("GraphRelationship")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-07-14T10:08:50.187341729Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@Introspected
public class GraphRelationship extends HashMap<String, Object> {
    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    /**
     * Gets or Sets source
     */
    public enum SourceEnum {
        GRAPH_RELATIONSHIP("graph.relationship");

        private String value;

        SourceEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SourceEnum fromValue(String value) {
            for (SourceEnum b : SourceEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_SOURCE = "source";
    private SourceEnum source;

    public static final String JSON_PROPERTY_SPECVERSION = "specversion";
    private String specversion;

    /**
     * Gets or Sets type
     */
    public enum TypeEnum {
        CREATED("created"),
        UPDATED("updated"),
        DELETED("deleted");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_TYPE = "type";
    private TypeEnum type;

    public static final String JSON_PROPERTY_DATACONTENTTYPE = "datacontenttype";
    private String datacontenttype;

    public static final String JSON_PROPERTY_DATASCHEMA = "dataschema";
    private URI dataschema;

    public static final String JSON_PROPERTY_SUBJECT = "subject";
    private String subject;

    public static final String JSON_PROPERTY_TIME = "time";
    private OffsetDateTime time;

    public static final String JSON_PROPERTY_DATA = "data";
    private GraphRelationshipAllOfData data;

    public static final String JSON_PROPERTY_DATA_BASE64 = "data_base64";
    private String dataBase64;

    public GraphRelationship(String id, SourceEnum source, String specversion, TypeEnum type) {
        super();
        this.id = id;
        this.source = source;
        this.specversion = specversion;
        this.type = type;
    }

    public GraphRelationship id(String id) {
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

    public GraphRelationship source(SourceEnum source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     * @return source
     */
    @NotNull
    @Schema(name = "source", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_SOURCE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public SourceEnum getSource() {
        return source;
    }

    @JsonProperty(JSON_PROPERTY_SOURCE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSource(SourceEnum source) {
        this.source = source;
    }

    public GraphRelationship specversion(String specversion) {
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

    public GraphRelationship type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public TypeEnum getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public GraphRelationship datacontenttype(String datacontenttype) {
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

    public GraphRelationship dataschema(URI dataschema) {
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

    public GraphRelationship subject(String subject) {
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

    public GraphRelationship time(OffsetDateTime time) {
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

    public GraphRelationship data(GraphRelationshipAllOfData data) {
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
    public GraphRelationshipAllOfData getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setData(GraphRelationshipAllOfData data) {
        this.data = data;
    }

    public GraphRelationship dataBase64(String dataBase64) {
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
        GraphRelationship graphRelationship = (GraphRelationship) o;
        return Objects.equals(this.id, graphRelationship.id) &&
            Objects.equals(this.source, graphRelationship.source) &&
            Objects.equals(this.specversion, graphRelationship.specversion) &&
            Objects.equals(this.type, graphRelationship.type) &&
            Objects.equals(this.datacontenttype, graphRelationship.datacontenttype) &&
            Objects.equals(this.dataschema, graphRelationship.dataschema) &&
            Objects.equals(this.subject, graphRelationship.subject) &&
            Objects.equals(this.time, graphRelationship.time) &&
            Objects.equals(this.data, graphRelationship.data) &&
            Objects.equals(this.dataBase64, graphRelationship.dataBase64) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, source, specversion, type, datacontenttype, dataschema, subject, time, data, dataBase64, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GraphRelationship {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

