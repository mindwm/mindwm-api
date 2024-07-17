package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Neo4jCaptureDataChangeRelationshipPayloadEnd;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-07-17T13:48:16.702923304Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChangeRelationshipPayload   {
  @JsonProperty("after")
  private Object after;

  @JsonProperty("before")
  private String before;

  @JsonProperty("end")
  private Neo4jCaptureDataChangeRelationshipPayloadEnd end;

  @JsonProperty("id")
  private String id;

  @JsonProperty("label")
  private String label;

  @JsonProperty("start")
  private Neo4jCaptureDataChangeRelationshipPayloadEnd start;

  @JsonProperty("type")
  private String type;

  /**
   **/
  public Neo4jCaptureDataChangeRelationshipPayload after(Object after) {
    this.after = after;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("after")
  public Object getAfter() {
    return after;
  }
  public void setAfter(Object after) {
    this.after = after;
  }

  /**
   **/
  public Neo4jCaptureDataChangeRelationshipPayload before(String before) {
    this.before = before;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("before")
  public String getBefore() {
    return before;
  }
  public void setBefore(String before) {
    this.before = before;
  }

  /**
   **/
  public Neo4jCaptureDataChangeRelationshipPayload end(Neo4jCaptureDataChangeRelationshipPayloadEnd end) {
    this.end = end;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("end")
  public Neo4jCaptureDataChangeRelationshipPayloadEnd getEnd() {
    return end;
  }
  public void setEnd(Neo4jCaptureDataChangeRelationshipPayloadEnd end) {
    this.end = end;
  }

  /**
   **/
  public Neo4jCaptureDataChangeRelationshipPayload id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public Neo4jCaptureDataChangeRelationshipPayload label(String label) {
    this.label = label;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   **/
  public Neo4jCaptureDataChangeRelationshipPayload start(Neo4jCaptureDataChangeRelationshipPayloadEnd start) {
    this.start = start;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("start")
  public Neo4jCaptureDataChangeRelationshipPayloadEnd getStart() {
    return start;
  }
  public void setStart(Neo4jCaptureDataChangeRelationshipPayloadEnd start) {
    this.start = start;
  }

  /**
   **/
  public Neo4jCaptureDataChangeRelationshipPayload type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

