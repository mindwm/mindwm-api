package apimodels;

import apimodels.Neo4jCaptureDataChangeNodePayloadAfter;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Neo4jCaptureDataChangeNodePayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-07-14T10:08:56.234850658Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Neo4jCaptureDataChangeNodePayload   {
  @JsonProperty("after")
  @NotNull
@Valid

  private Neo4jCaptureDataChangeNodePayloadAfter after;

  @JsonProperty("before")
  @NotNull

  private String before;

  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("type")
  @NotNull

  private String type;

  public Neo4jCaptureDataChangeNodePayload after(Neo4jCaptureDataChangeNodePayloadAfter after) {
    this.after = after;
    return this;
  }

   /**
   * Get after
   * @return after
  **/
  public Neo4jCaptureDataChangeNodePayloadAfter getAfter() {
    return after;
  }

  public void setAfter(Neo4jCaptureDataChangeNodePayloadAfter after) {
    this.after = after;
  }

  public Neo4jCaptureDataChangeNodePayload before(String before) {
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

  public Neo4jCaptureDataChangeNodePayload id(String id) {
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

  public Neo4jCaptureDataChangeNodePayload type(String type) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Neo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayload = (Neo4jCaptureDataChangeNodePayload) o;
    return Objects.equals(after, neo4jCaptureDataChangeNodePayload.after) &&
        Objects.equals(before, neo4jCaptureDataChangeNodePayload.before) &&
        Objects.equals(id, neo4jCaptureDataChangeNodePayload.id) &&
        Objects.equals(type, neo4jCaptureDataChangeNodePayload.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, before, id, type);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jCaptureDataChangeNodePayload {\n");
    
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

