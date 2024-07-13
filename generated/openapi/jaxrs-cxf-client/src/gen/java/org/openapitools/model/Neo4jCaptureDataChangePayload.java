package org.openapitools.model;

import org.openapitools.model.Neo4jCaptureDataChangeNodePayload;
import org.openapitools.model.Neo4jCaptureDataChangeRelationshipPayload;
import org.openapitools.model.Neo4jCaptureDataChangeRelationshipPayloadEnd;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Neo4jCaptureDataChangePayload  {
  
  @ApiModelProperty(required = true, value = "")
  private Object after;

  @ApiModelProperty(required = true, value = "")
  private String before;

  @ApiModelProperty(required = true, value = "")
  private String id;

  @ApiModelProperty(required = true, value = "")
  private String type;

  @ApiModelProperty(required = true, value = "")
  private Neo4jCaptureDataChangeRelationshipPayloadEnd end;

  @ApiModelProperty(required = true, value = "")
  private String label;

  @ApiModelProperty(required = true, value = "")
  private Neo4jCaptureDataChangeRelationshipPayloadEnd start;
 /**
   * Get after
   * @return after
  **/
  @JsonProperty("after")
  public Object getAfter() {
    return after;
  }

  public void setAfter(Object after) {
    this.after = after;
  }

  public Neo4jCaptureDataChangePayload after(Object after) {
    this.after = after;
    return this;
  }

 /**
   * Get before
   * @return before
  **/
  @JsonProperty("before")
  public String getBefore() {
    return before;
  }

  public void setBefore(String before) {
    this.before = before;
  }

  public Neo4jCaptureDataChangePayload before(String before) {
    this.before = before;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Neo4jCaptureDataChangePayload id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Neo4jCaptureDataChangePayload type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get end
   * @return end
  **/
  @JsonProperty("end")
  public Neo4jCaptureDataChangeRelationshipPayloadEnd getEnd() {
    return end;
  }

  public void setEnd(Neo4jCaptureDataChangeRelationshipPayloadEnd end) {
    this.end = end;
  }

  public Neo4jCaptureDataChangePayload end(Neo4jCaptureDataChangeRelationshipPayloadEnd end) {
    this.end = end;
    return this;
  }

 /**
   * Get label
   * @return label
  **/
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Neo4jCaptureDataChangePayload label(String label) {
    this.label = label;
    return this;
  }

 /**
   * Get start
   * @return start
  **/
  @JsonProperty("start")
  public Neo4jCaptureDataChangeRelationshipPayloadEnd getStart() {
    return start;
  }

  public void setStart(Neo4jCaptureDataChangeRelationshipPayloadEnd start) {
    this.start = start;
  }

  public Neo4jCaptureDataChangePayload start(Neo4jCaptureDataChangeRelationshipPayloadEnd start) {
    this.start = start;
    return this;
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
    return Objects.equals(this.after, neo4jCaptureDataChangePayload.after) &&
        Objects.equals(this.before, neo4jCaptureDataChangePayload.before) &&
        Objects.equals(this.id, neo4jCaptureDataChangePayload.id) &&
        Objects.equals(this.type, neo4jCaptureDataChangePayload.type) &&
        Objects.equals(this.end, neo4jCaptureDataChangePayload.end) &&
        Objects.equals(this.label, neo4jCaptureDataChangePayload.label) &&
        Objects.equals(this.start, neo4jCaptureDataChangePayload.start);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

