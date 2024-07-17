package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Neo4jCaptureDataChangeRelationshipPayloadEnd;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-07-17T13:48:43.073546029Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChangeRelationshipPayload   {
  
  private Object after;
  private String before;
  private Neo4jCaptureDataChangeRelationshipPayloadEnd end;
  private String id;
  private String label;
  private Neo4jCaptureDataChangeRelationshipPayloadEnd start;
  private String type;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("after")
  @NotNull
  public Object getAfter() {
    return after;
  }
  public void setAfter(Object after) {
    this.after = after;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("before")
  @NotNull
  public String getBefore() {
    return before;
  }
  public void setBefore(String before) {
    this.before = before;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("end")
  @NotNull
  @Valid
  public Neo4jCaptureDataChangeRelationshipPayloadEnd getEnd() {
    return end;
  }
  public void setEnd(Neo4jCaptureDataChangeRelationshipPayloadEnd end) {
    this.end = end;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("label")
  @NotNull
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("start")
  @NotNull
  @Valid
  public Neo4jCaptureDataChangeRelationshipPayloadEnd getStart() {
    return start;
  }
  public void setStart(Neo4jCaptureDataChangeRelationshipPayloadEnd start) {
    this.start = start;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull
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
    return Objects.equals(this.after, neo4jCaptureDataChangeRelationshipPayload.after) &&
        Objects.equals(this.before, neo4jCaptureDataChangeRelationshipPayload.before) &&
        Objects.equals(this.end, neo4jCaptureDataChangeRelationshipPayload.end) &&
        Objects.equals(this.id, neo4jCaptureDataChangeRelationshipPayload.id) &&
        Objects.equals(this.label, neo4jCaptureDataChangeRelationshipPayload.label) &&
        Objects.equals(this.start, neo4jCaptureDataChangeRelationshipPayload.start) &&
        Objects.equals(this.type, neo4jCaptureDataChangeRelationshipPayload.type);
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

