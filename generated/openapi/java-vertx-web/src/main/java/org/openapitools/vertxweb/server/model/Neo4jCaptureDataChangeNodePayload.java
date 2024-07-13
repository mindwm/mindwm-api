package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.Neo4jCaptureDataChangeNodePayloadAfter;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Neo4jCaptureDataChangeNodePayload   {
  
  private Neo4jCaptureDataChangeNodePayloadAfter after;
  private String before;
  private String id;
  private String type;

  public Neo4jCaptureDataChangeNodePayload () {

  }

  public Neo4jCaptureDataChangeNodePayload (Neo4jCaptureDataChangeNodePayloadAfter after, String before, String id, String type) {
    this.after = after;
    this.before = before;
    this.id = id;
    this.type = type;
  }

    
  @JsonProperty("after")
  public Neo4jCaptureDataChangeNodePayloadAfter getAfter() {
    return after;
  }
  public void setAfter(Neo4jCaptureDataChangeNodePayloadAfter after) {
    this.after = after;
  }

    
  @JsonProperty("before")
  public String getBefore() {
    return before;
  }
  public void setBefore(String before) {
    this.before = before;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("type")
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
