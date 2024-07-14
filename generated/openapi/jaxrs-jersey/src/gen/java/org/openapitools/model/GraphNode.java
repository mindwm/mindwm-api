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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.GraphNodeAllOfData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * GraphNode
 */
@JsonPropertyOrder({
  GraphNode.JSON_PROPERTY_ID,
  GraphNode.JSON_PROPERTY_SOURCE,
  GraphNode.JSON_PROPERTY_SPECVERSION,
  GraphNode.JSON_PROPERTY_TYPE,
  GraphNode.JSON_PROPERTY_DATACONTENTTYPE,
  GraphNode.JSON_PROPERTY_DATASCHEMA,
  GraphNode.JSON_PROPERTY_SUBJECT,
  GraphNode.JSON_PROPERTY_TIME,
  GraphNode.JSON_PROPERTY_DATA,
  GraphNode.JSON_PROPERTY_DATA_BASE64
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-07-14T12:12:07.388853331Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class GraphNode extends HashMap<String, Object>  {
  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private String id;

  /**
   * Gets or Sets source
   */
  public enum SourceEnum {
    NODE("graph.node"),
    
    RELATIONSHIP("graph.relationship");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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
  @JsonProperty(JSON_PROPERTY_SOURCE)
  private SourceEnum source;

  public static final String JSON_PROPERTY_SPECVERSION = "specversion";
  @JsonProperty(JSON_PROPERTY_SPECVERSION)
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

    @Override
    @JsonValue
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
  @JsonProperty(JSON_PROPERTY_TYPE)
  private TypeEnum type;

  public static final String JSON_PROPERTY_DATACONTENTTYPE = "datacontenttype";
  @JsonProperty(JSON_PROPERTY_DATACONTENTTYPE)
  private String datacontenttype;

  public static final String JSON_PROPERTY_DATASCHEMA = "dataschema";
  @JsonProperty(JSON_PROPERTY_DATASCHEMA)
  private URI dataschema;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  private String subject;

  public static final String JSON_PROPERTY_TIME = "time";
  @JsonProperty(JSON_PROPERTY_TIME)
  private Date time;

  public static final String JSON_PROPERTY_DATA = "data";
  @JsonProperty(JSON_PROPERTY_DATA)
  private GraphNodeAllOfData data;

  public static final String JSON_PROPERTY_DATA_BASE64 = "data_base64";
  @JsonProperty(JSON_PROPERTY_DATA_BASE64)
  private String dataBase64;

  public GraphNode id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies the event.
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(required = true, value = "Identifies the event.")
  @NotNull  @Size(min=1)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GraphNode source(SourceEnum source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   **/
  @JsonProperty(value = "source")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public GraphNode specversion(String specversion) {
    this.specversion = specversion;
    return this;
  }

  /**
   * The version of the CloudEvents specification which the event uses.
   * @return specversion
   **/
  @JsonProperty(value = "specversion")
  @ApiModelProperty(required = true, value = "The version of the CloudEvents specification which the event uses.")
  @NotNull  @Size(min=1)
  public String getSpecversion() {
    return specversion;
  }

  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }

  public GraphNode type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @JsonProperty(value = "type")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public GraphNode datacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
    return this;
  }

  /**
   * Content type of the data value. Must adhere to RFC 2046 format.
   * @return datacontenttype
   **/
  @JsonProperty(value = "datacontenttype")
  @ApiModelProperty(value = "Content type of the data value. Must adhere to RFC 2046 format.")
   @Size(min=1)
  public String getDatacontenttype() {
    return datacontenttype;
  }

  public void setDatacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
  }

  public GraphNode dataschema(URI dataschema) {
    this.dataschema = dataschema;
    return this;
  }

  /**
   * Identifies the schema that data adheres to.
   * @return dataschema
   **/
  @JsonProperty(value = "dataschema")
  @ApiModelProperty(value = "Identifies the schema that data adheres to.")
   @Size(min=1)
  public URI getDataschema() {
    return dataschema;
  }

  public void setDataschema(URI dataschema) {
    this.dataschema = dataschema;
  }

  public GraphNode subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Describes the subject of the event in the context of the event producer (identified by source).
   * @return subject
   **/
  @JsonProperty(value = "subject")
  @ApiModelProperty(value = "Describes the subject of the event in the context of the event producer (identified by source).")
   @Size(min=1)
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public GraphNode time(Date time) {
    this.time = time;
    return this;
  }

  /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
   * @return time
   **/
  @JsonProperty(value = "time")
  @ApiModelProperty(value = "Timestamp of when the occurrence happened. Must adhere to RFC 3339.")
   @Size(min=1)
  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public GraphNode data(GraphNodeAllOfData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  @JsonProperty(value = "data")
  @ApiModelProperty(value = "")
  @Valid 
  public GraphNodeAllOfData getData() {
    return data;
  }

  public void setData(GraphNodeAllOfData data) {
    this.data = data;
  }

  public GraphNode dataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
    return this;
  }

  /**
   * Base64 encoded event payload. Must adhere to RFC4648.
   * @return dataBase64
   **/
  @JsonProperty(value = "data_base64")
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
    GraphNode graphNode = (GraphNode) o;
    return super.equals(o) && Objects.equals(this.id, graphNode.id) &&
        Objects.equals(this.source, graphNode.source) &&
        Objects.equals(this.specversion, graphNode.specversion) &&
        Objects.equals(this.type, graphNode.type) &&
        Objects.equals(this.datacontenttype, graphNode.datacontenttype) &&
        Objects.equals(this.dataschema, graphNode.dataschema) &&
        Objects.equals(this.subject, graphNode.subject) &&
        Objects.equals(this.time, graphNode.time) &&
        Objects.equals(this.data, graphNode.data) &&
        Objects.equals(this.dataBase64, graphNode.dataBase64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), id, super.hashCode(), source, super.hashCode(), specversion, super.hashCode(), type, super.hashCode(), datacontenttype, super.hashCode(), dataschema, super.hashCode(), subject, super.hashCode(), time, super.hashCode(), data, super.hashCode(), dataBase64);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphNode {\n");
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

