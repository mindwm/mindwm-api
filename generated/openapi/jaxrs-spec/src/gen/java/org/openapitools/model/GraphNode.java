package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.GraphNodeAllOfData;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("GraphNode")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-07-21T21:29:44.473016452Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class GraphNode extends HashMap<String, Object>  {
  private String id;
  public enum SourceEnum {

    NODE(String.valueOf("graph.node")), RELATIONSHIP(String.valueOf("graph.relationship"));


    private String value;

    SourceEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static SourceEnum fromString(String s) {
        for (SourceEnum b : SourceEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private SourceEnum source;
  private String specversion;
  public enum TypeEnum {

    CREATED(String.valueOf("created")), UPDATED(String.valueOf("updated")), DELETED(String.valueOf("deleted"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TypeEnum fromString(String s) {
        for (TypeEnum b : TypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private TypeEnum type;
  private String datacontenttype;
  private URI dataschema;
  private String subject;
  private Date time;
  private GraphNodeAllOfData data;
  private String dataBase64;

  /**
   * Identifies the event.
   **/
  public GraphNode id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Identifies the event.")
  @JsonProperty("id")
  @NotNull  @Size(min=1)public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public GraphNode source(SourceEnum source) {
    this.source = source;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("source")
  @NotNull public SourceEnum getSource() {
    return source;
  }

  @JsonProperty("source")
  public void setSource(SourceEnum source) {
    this.source = source;
  }

  /**
   * The version of the CloudEvents specification which the event uses.
   **/
  public GraphNode specversion(String specversion) {
    this.specversion = specversion;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The version of the CloudEvents specification which the event uses.")
  @JsonProperty("specversion")
  @NotNull  @Size(min=1)public String getSpecversion() {
    return specversion;
  }

  @JsonProperty("specversion")
  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }

  /**
   **/
  public GraphNode type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Content type of the data value. Must adhere to RFC 2046 format.
   **/
  public GraphNode datacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
    return this;
  }

  
  @ApiModelProperty(value = "Content type of the data value. Must adhere to RFC 2046 format.")
  @JsonProperty("datacontenttype")
   @Size(min=1)public String getDatacontenttype() {
    return datacontenttype;
  }

  @JsonProperty("datacontenttype")
  public void setDatacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
  }

  /**
   * Identifies the schema that data adheres to.
   **/
  public GraphNode dataschema(URI dataschema) {
    this.dataschema = dataschema;
    return this;
  }

  
  @ApiModelProperty(value = "Identifies the schema that data adheres to.")
  @JsonProperty("dataschema")
   @Size(min=1)public URI getDataschema() {
    return dataschema;
  }

  @JsonProperty("dataschema")
  public void setDataschema(URI dataschema) {
    this.dataschema = dataschema;
  }

  /**
   * Describes the subject of the event in the context of the event producer (identified by source).
   **/
  public GraphNode subject(String subject) {
    this.subject = subject;
    return this;
  }

  
  @ApiModelProperty(value = "Describes the subject of the event in the context of the event producer (identified by source).")
  @JsonProperty("subject")
   @Size(min=1)public String getSubject() {
    return subject;
  }

  @JsonProperty("subject")
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
   **/
  public GraphNode time(Date time) {
    this.time = time;
    return this;
  }

  
  @ApiModelProperty(value = "Timestamp of when the occurrence happened. Must adhere to RFC 3339.")
  @JsonProperty("time")
   @Size(min=1)public Date getTime() {
    return time;
  }

  @JsonProperty("time")
  public void setTime(Date time) {
    this.time = time;
  }

  /**
   **/
  public GraphNode data(GraphNodeAllOfData data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  @Valid public GraphNodeAllOfData getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(GraphNodeAllOfData data) {
    this.data = data;
  }

  /**
   * Base64 encoded event payload. Must adhere to RFC4648.
   **/
  public GraphNode dataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
    return this;
  }

  
  @ApiModelProperty(value = "Base64 encoded event payload. Must adhere to RFC4648.")
  @JsonProperty("data_base64")
  public String getDataBase64() {
    return dataBase64;
  }

  @JsonProperty("data_base64")
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
    return Objects.equals(this.id, graphNode.id) &&
        Objects.equals(this.source, graphNode.source) &&
        Objects.equals(this.specversion, graphNode.specversion) &&
        Objects.equals(this.type, graphNode.type) &&
        Objects.equals(this.datacontenttype, graphNode.datacontenttype) &&
        Objects.equals(this.dataschema, graphNode.dataschema) &&
        Objects.equals(this.subject, graphNode.subject) &&
        Objects.equals(this.time, graphNode.time) &&
        Objects.equals(this.data, graphNode.data) &&
        Objects.equals(this.dataBase64, graphNode.dataBase64) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, specversion, type, datacontenttype, dataschema, subject, time, data, dataBase64, super.hashCode());
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

