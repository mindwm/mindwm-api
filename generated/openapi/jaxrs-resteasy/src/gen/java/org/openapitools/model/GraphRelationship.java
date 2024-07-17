package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-07-17T14:05:27.023145952Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class GraphRelationship extends HashMap<String, Object>  {
  
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private SourceEnum source;
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
   **/
  
  @ApiModelProperty(required = true, value = "Identifies the event.")
  @JsonProperty("id")
  @NotNull
 @Size(min=1)  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("source")
  @NotNull
  public SourceEnum getSource() {
    return source;
  }
  public void setSource(SourceEnum source) {
    this.source = source;
  }

  /**
   * The version of the CloudEvents specification which the event uses.
   **/
  
  @ApiModelProperty(required = true, value = "The version of the CloudEvents specification which the event uses.")
  @JsonProperty("specversion")
  @NotNull
 @Size(min=1)  public String getSpecversion() {
    return specversion;
  }
  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Content type of the data value. Must adhere to RFC 2046 format.
   **/
  
  @ApiModelProperty(value = "Content type of the data value. Must adhere to RFC 2046 format.")
  @JsonProperty("datacontenttype")
 @Size(min=1)  public String getDatacontenttype() {
    return datacontenttype;
  }
  public void setDatacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
  }

  /**
   * Identifies the schema that data adheres to.
   **/
  
  @ApiModelProperty(value = "Identifies the schema that data adheres to.")
  @JsonProperty("dataschema")
 @Size(min=1)  public URI getDataschema() {
    return dataschema;
  }
  public void setDataschema(URI dataschema) {
    this.dataschema = dataschema;
  }

  /**
   * Describes the subject of the event in the context of the event producer (identified by source).
   **/
  
  @ApiModelProperty(value = "Describes the subject of the event in the context of the event producer (identified by source).")
  @JsonProperty("subject")
 @Size(min=1)  public String getSubject() {
    return subject;
  }
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
   **/
  
  @ApiModelProperty(value = "Timestamp of when the occurrence happened. Must adhere to RFC 3339.")
  @JsonProperty("time")
 @Size(min=1)  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  @Valid
  public GraphRelationshipAllOfData getData() {
    return data;
  }
  public void setData(GraphRelationshipAllOfData data) {
    this.data = data;
  }

  /**
   * Base64 encoded event payload. Must adhere to RFC4648.
   **/
  
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
    return super.equals(o) && Objects.equals(this.id, graphRelationship.id) &&
        Objects.equals(this.source, graphRelationship.source) &&
        Objects.equals(this.specversion, graphRelationship.specversion) &&
        Objects.equals(this.type, graphRelationship.type) &&
        Objects.equals(this.datacontenttype, graphRelationship.datacontenttype) &&
        Objects.equals(this.dataschema, graphRelationship.dataschema) &&
        Objects.equals(this.subject, graphRelationship.subject) &&
        Objects.equals(this.time, graphRelationship.time) &&
        Objects.equals(this.data, graphRelationship.data) &&
        Objects.equals(this.dataBase64, graphRelationship.dataBase64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), id, super.hashCode(), source, super.hashCode(), specversion, super.hashCode(), type, super.hashCode(), datacontenttype, super.hashCode(), dataschema, super.hashCode(), subject, super.hashCode(), time, super.hashCode(), data, super.hashCode(), dataBase64);
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

