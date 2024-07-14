package apimodels;

import apimodels.GraphNodeAllOfData;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GraphNode
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-07-14T10:08:56.234850658Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GraphNode extends HashMap<String, Object>  {
  @JsonProperty("id")
  @NotNull
@Size(min=1)

  private String id;

  /**
   * Gets or Sets source
   */
  public enum SourceEnum {
    NODE("graph.node"),
    
    RELATIONSHIP("graph.relationship");

    private final String value;

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

  @JsonProperty("source")
  @NotNull

  private SourceEnum source;

  @JsonProperty("specversion")
  @NotNull
@Size(min=1)

  private String specversion;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    CREATED("created"),
    
    UPDATED("updated"),
    
    DELETED("deleted");

    private final String value;

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

  @JsonProperty("type")
  @NotNull

  private TypeEnum type;

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

  private GraphNodeAllOfData data;

  @JsonProperty("data_base64")
  
  private String dataBase64;

  public GraphNode id(String id) {
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

  public GraphNode source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
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
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public GraphNode time(OffsetDateTime time) {
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

  public GraphNode data(GraphNodeAllOfData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
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
    return Objects.equals(id, graphNode.id) &&
        Objects.equals(source, graphNode.source) &&
        Objects.equals(specversion, graphNode.specversion) &&
        Objects.equals(type, graphNode.type) &&
        Objects.equals(datacontenttype, graphNode.datacontenttype) &&
        Objects.equals(dataschema, graphNode.dataschema) &&
        Objects.equals(subject, graphNode.subject) &&
        Objects.equals(time, graphNode.time) &&
        Objects.equals(data, graphNode.data) &&
        Objects.equals(dataBase64, graphNode.dataBase64) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, specversion, type, datacontenttype, dataschema, subject, time, data, dataBase64, super.hashCode());
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

