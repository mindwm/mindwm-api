package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Neo4jCaptureDataChangeNodePayloadAfter;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-07-17T16:07:43.630284849Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChangeNodePayload   {
  @JsonProperty("after")
  private Neo4jCaptureDataChangeNodePayloadAfter after;

  @JsonProperty("before")
  private String before;

  @JsonProperty("id")
  private String id;

  @JsonProperty("type")
  private String type;

  /**
   **/
  public Neo4jCaptureDataChangeNodePayload after(Neo4jCaptureDataChangeNodePayloadAfter after) {
    this.after = after;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("after")
  public Neo4jCaptureDataChangeNodePayloadAfter getAfter() {
    return after;
  }
  public void setAfter(Neo4jCaptureDataChangeNodePayloadAfter after) {
    this.after = after;
  }

  /**
   **/
  public Neo4jCaptureDataChangeNodePayload before(String before) {
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
  public Neo4jCaptureDataChangeNodePayload id(String id) {
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
  public Neo4jCaptureDataChangeNodePayload type(String type) {
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

