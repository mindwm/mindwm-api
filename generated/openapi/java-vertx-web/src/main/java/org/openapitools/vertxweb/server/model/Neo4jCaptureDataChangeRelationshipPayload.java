package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.Neo4jCaptureDataChangeRelationshipPayloadEnd;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Neo4jCaptureDataChangeRelationshipPayload   {
  
  private Object after;
  private String before;
  private Neo4jCaptureDataChangeRelationshipPayloadEnd end;
  private String id;
  private String label;
  private Neo4jCaptureDataChangeRelationshipPayloadEnd start;
  private String type;

  public Neo4jCaptureDataChangeRelationshipPayload () {

  }

  public Neo4jCaptureDataChangeRelationshipPayload (Object after, String before, Neo4jCaptureDataChangeRelationshipPayloadEnd end, String id, String label, Neo4jCaptureDataChangeRelationshipPayloadEnd start, String type) {
    this.after = after;
    this.before = before;
    this.end = end;
    this.id = id;
    this.label = label;
    this.start = start;
    this.type = type;
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

    
  @JsonProperty("end")
  public Neo4jCaptureDataChangeRelationshipPayloadEnd getEnd() {
    return end;
  }
  public void setEnd(Neo4jCaptureDataChangeRelationshipPayloadEnd end) {
    this.end = end;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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
    Neo4jCaptureDataChangeRelationshipPayload neo4jCaptureDataChangeRelationshipPayload = (Neo4jCaptureDataChangeRelationshipPayload) o;
    return Objects.equals(after, neo4jCaptureDataChangeRelationshipPayload.after) &&
        Objects.equals(before, neo4jCaptureDataChangeRelationshipPayload.before) &&
        Objects.equals(end, neo4jCaptureDataChangeRelationshipPayload.end) &&
        Objects.equals(id, neo4jCaptureDataChangeRelationshipPayload.id) &&
        Objects.equals(label, neo4jCaptureDataChangeRelationshipPayload.label) &&
        Objects.equals(start, neo4jCaptureDataChangeRelationshipPayload.start) &&
        Objects.equals(type, neo4jCaptureDataChangeRelationshipPayload.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, before, end, id, label, start, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jCaptureDataChangeRelationshipPayload {\n");
    
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
