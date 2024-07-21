/*
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * OpenAPI document version: 0.1.0
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
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
import org.openapitools.model.GraphRelationshipAllOfData;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-07-21T21:29:29.661361815Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class GraphRelationship extends HashMap<String, Object>  {
  
  private String id;


  public enum SourceEnum {
    GRAPH_RELATIONSHIP("graph.relationship");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private SourceEnum source;
  private String specversion;


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
      return value;
    }
  }

  private TypeEnum type;
  private String datacontenttype;
  private URI dataschema;
  private String subject;
  private Date time;
  private GraphRelationshipAllOfData data;
  private String dataBase64;

  /**
   * Identifies the event.
   */
  public GraphRelationship id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Identifies the event.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   */
  public GraphRelationship source(SourceEnum source) {
    this.source = source;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("source")
  public SourceEnum getSource() {
    return source;
  }
  public void setSource(SourceEnum source) {
    this.source = source;
  }

  /**
   * The version of the CloudEvents specification which the event uses.
   */
  public GraphRelationship specversion(String specversion) {
    this.specversion = specversion;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The version of the CloudEvents specification which the event uses.")
  @JsonProperty("specversion")
  public String getSpecversion() {
    return specversion;
  }
  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }

  /**
   */
  public GraphRelationship type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Content type of the data value. Must adhere to RFC 2046 format.
   */
  public GraphRelationship datacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
    return this;
  }

  
  @ApiModelProperty(value = "Content type of the data value. Must adhere to RFC 2046 format.")
  @JsonProperty("datacontenttype")
  public String getDatacontenttype() {
    return datacontenttype;
  }
  public void setDatacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
  }

  /**
   * Identifies the schema that data adheres to.
   */
  public GraphRelationship dataschema(URI dataschema) {
    this.dataschema = dataschema;
    return this;
  }

  
  @ApiModelProperty(value = "Identifies the schema that data adheres to.")
  @JsonProperty("dataschema")
  public URI getDataschema() {
    return dataschema;
  }
  public void setDataschema(URI dataschema) {
    this.dataschema = dataschema;
  }

  /**
   * Describes the subject of the event in the context of the event producer (identified by source).
   */
  public GraphRelationship subject(String subject) {
    this.subject = subject;
    return this;
  }

  
  @ApiModelProperty(value = "Describes the subject of the event in the context of the event producer (identified by source).")
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
   */
  public GraphRelationship time(Date time) {
    this.time = time;
    return this;
  }

  
  @ApiModelProperty(value = "Timestamp of when the occurrence happened. Must adhere to RFC 3339.")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  /**
   */
  public GraphRelationship data(GraphRelationshipAllOfData data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public GraphRelationshipAllOfData getData() {
    return data;
  }
  public void setData(GraphRelationshipAllOfData data) {
    this.data = data;
  }

  /**
   * Base64 encoded event payload. Must adhere to RFC4648.
   */
  public GraphRelationship dataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
    return this;
  }

  
  @ApiModelProperty(value = "Base64 encoded event payload. Must adhere to RFC4648.")
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
    GraphRelationship graphRelationship = (GraphRelationship) o;
    return Objects.equals(id, graphRelationship.id) &&
        Objects.equals(source, graphRelationship.source) &&
        Objects.equals(specversion, graphRelationship.specversion) &&
        Objects.equals(type, graphRelationship.type) &&
        Objects.equals(datacontenttype, graphRelationship.datacontenttype) &&
        Objects.equals(dataschema, graphRelationship.dataschema) &&
        Objects.equals(subject, graphRelationship.subject) &&
        Objects.equals(time, graphRelationship.time) &&
        Objects.equals(data, graphRelationship.data) &&
        Objects.equals(dataBase64, graphRelationship.dataBase64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, specversion, type, datacontenttype, dataschema, subject, time, data, dataBase64);
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

