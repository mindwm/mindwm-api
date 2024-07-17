package apimodels;

import apimodels.GraphRelationshipAllOfData;
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
 * GraphRelationship
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-07-17T13:48:26.994880597Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GraphRelationship extends HashMap<String, Object>  {
  @JsonProperty("id")
  @NotNull
@Size(min=1)

  private String id;

  /**
   * Gets or Sets source
   */
  public enum SourceEnum {
    GRAPH_RELATIONSHIP("graph.relationship");

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

  private GraphRelationshipAllOfData data;

  @JsonProperty("data_base64")
  
  private String dataBase64;

  public GraphRelationship id(String id) {
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

  public GraphRelationship source(SourceEnum source) {
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

  public GraphRelationship specversion(String specversion) {
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

  public GraphRelationship type(TypeEnum type) {
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

  public GraphRelationship datacontenttype(String datacontenttype) {
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

  public GraphRelationship dataschema(URI dataschema) {
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

  public GraphRelationship subject(String subject) {
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

  public GraphRelationship time(OffsetDateTime time) {
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

  public GraphRelationship data(GraphRelationshipAllOfData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public GraphRelationshipAllOfData getData() {
    return data;
  }

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
        Objects.equals(dataBase64, graphRelationship.dataBase64) &&
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

