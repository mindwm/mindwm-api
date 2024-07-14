package apimodels;

import apimodels.Neo4jCaptureDataChangeNodePayload;
import apimodels.Neo4jCaptureDataChangeRelationshipPayload;
import apimodels.Neo4jCaptureDataChangeRelationshipPayloadEnd;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Neo4jCaptureDataChangePayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-07-14T10:08:56.234850658Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Neo4jCaptureDataChangePayload   {
  @JsonProperty("after")
  @NotNull

  private Object after;

  @JsonProperty("before")
  @NotNull

  private String before;

  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("type")
  @NotNull

  private String type;

  @JsonProperty("end")
  @NotNull
@Valid

  private Neo4jCaptureDataChangeRelationshipPayloadEnd end;

  @JsonProperty("label")
  @NotNull

  private String label;

  @JsonProperty("start")
  @NotNull
@Valid

  private Neo4jCaptureDataChangeRelationshipPayloadEnd start;

  public Neo4jCaptureDataChangePayload after(Object after) {
    this.after = after;
    return this;
  }

   /**
   * Get after
   * @return after
  **/
  public Object getAfter() {
    return after;
  }

  public void setAfter(Object after) {
    this.after = after;
  }

  public Neo4jCaptureDataChangePayload before(String before) {
    this.before = before;
    return this;
  }

   /**
   * Get before
   * @return before
  **/
  public String getBefore() {
    return before;
  }

  public void setBefore(String before) {
    this.before = before;
  }

  public Neo4jCaptureDataChangePayload id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Neo4jCaptureDataChangePayload type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Neo4jCaptureDataChangePayload end(Neo4jCaptureDataChangeRelationshipPayloadEnd end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  public Neo4jCaptureDataChangeRelationshipPayloadEnd getEnd() {
    return end;
  }

  public void setEnd(Neo4jCaptureDataChangeRelationshipPayloadEnd end) {
    this.end = end;
  }

  public Neo4jCaptureDataChangePayload label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Neo4jCaptureDataChangePayload start(Neo4jCaptureDataChangeRelationshipPayloadEnd start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  public Neo4jCaptureDataChangeRelationshipPayloadEnd getStart() {
    return start;
  }

  public void setStart(Neo4jCaptureDataChangeRelationshipPayloadEnd start) {
    this.start = start;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Neo4jCaptureDataChangePayload neo4jCaptureDataChangePayload = (Neo4jCaptureDataChangePayload) o;
    return Objects.equals(after, neo4jCaptureDataChangePayload.after) &&
        Objects.equals(before, neo4jCaptureDataChangePayload.before) &&
        Objects.equals(id, neo4jCaptureDataChangePayload.id) &&
        Objects.equals(type, neo4jCaptureDataChangePayload.type) &&
        Objects.equals(end, neo4jCaptureDataChangePayload.end) &&
        Objects.equals(label, neo4jCaptureDataChangePayload.label) &&
        Objects.equals(start, neo4jCaptureDataChangePayload.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, before, id, type, end, label, start);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jCaptureDataChangePayload {\n");
    
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

