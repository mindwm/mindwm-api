package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.Neo4jCaptureDataChangeNodePayload;
import org.openapitools.vertxweb.server.model.Neo4jCaptureDataChangeRelationshipPayload;
import org.openapitools.vertxweb.server.model.Neo4jCaptureDataChangeRelationshipPayloadEnd;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Neo4jCaptureDataChangePayload   {
  
  private Object after;
  private String before;
  private String id;
  private String type;
  private Neo4jCaptureDataChangeRelationshipPayloadEnd end;
  private String label;
  private Neo4jCaptureDataChangeRelationshipPayloadEnd start;

  public Neo4jCaptureDataChangePayload () {

  }

  public Neo4jCaptureDataChangePayload (Object after, String before, String id, String type, Neo4jCaptureDataChangeRelationshipPayloadEnd end, String label, Neo4jCaptureDataChangeRelationshipPayloadEnd start) {
    this.after = after;
    this.before = before;
    this.id = id;
    this.type = type;
    this.end = end;
    this.label = label;
    this.start = start;
  }

    
  @JsonProperty("after")
  public Object getAfter() {
    return after;
  }
  public void setAfter(Object after) {
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

    
  @JsonProperty("end")
  public Neo4jCaptureDataChangeRelationshipPayloadEnd getEnd() {
    return end;
  }
  public void setEnd(Neo4jCaptureDataChangeRelationshipPayloadEnd end) {
    this.end = end;
  }

    
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

    
  @JsonProperty("start")
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
