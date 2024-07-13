package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.Neo4jCaptureDataChangeNodePayload;
import org.openapitools.model.Neo4jCaptureDataChangeRelationshipPayload;
import org.openapitools.model.Neo4jCaptureDataChangeRelationshipPayloadEnd;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  @Valid
  private Neo4jCaptureDataChangeRelationshipPayloadEnd end;

  @ApiModelProperty(required = true, value = "")
  private String label;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Neo4jCaptureDataChangeRelationshipPayloadEnd start;
 /**
  * Get after
  * @return after
  */
  @JsonProperty("after")
  @NotNull
  public Object getAfter() {
    return after;
  }

  /**
   * Sets the <code>after</code> property.
   */
 public void setAfter(Object after) {
    this.after = after;
  }

  /**
   * Sets the <code>after</code> property.
   */
  public Neo4jCaptureDataChangePayload after(Object after) {
    this.after = after;
    return this;
  }

 /**
  * Get before
  * @return before
  */
  @JsonProperty("before")
  @NotNull
  public String getBefore() {
    return before;
  }

  /**
   * Sets the <code>before</code> property.
   */
 public void setBefore(String before) {
    this.before = before;
  }

  /**
   * Sets the <code>before</code> property.
   */
  public Neo4jCaptureDataChangePayload before(String before) {
    this.before = before;
    return this;
  }

 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public Neo4jCaptureDataChangePayload id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public Neo4jCaptureDataChangePayload type(String type) {
    this.type = type;
    return this;
  }

 /**
  * Get end
  * @return end
  */
  @JsonProperty("end")
  @NotNull
  public Neo4jCaptureDataChangeRelationshipPayloadEnd getEnd() {
    return end;
  }

  /**
   * Sets the <code>end</code> property.
   */
 public void setEnd(Neo4jCaptureDataChangeRelationshipPayloadEnd end) {
    this.end = end;
  }

  /**
   * Sets the <code>end</code> property.
   */
  public Neo4jCaptureDataChangePayload end(Neo4jCaptureDataChangeRelationshipPayloadEnd end) {
    this.end = end;
    return this;
  }

 /**
  * Get label
  * @return label
  */
  @JsonProperty("label")
  @NotNull
  public String getLabel() {
    return label;
  }

  /**
   * Sets the <code>label</code> property.
   */
 public void setLabel(String label) {
    this.label = label;
  }

  /**
   * Sets the <code>label</code> property.
   */
  public Neo4jCaptureDataChangePayload label(String label) {
    this.label = label;
    return this;
  }

 /**
  * Get start
  * @return start
  */
  @JsonProperty("start")
  @NotNull
  public Neo4jCaptureDataChangeRelationshipPayloadEnd getStart() {
    return start;
  }

  /**
   * Sets the <code>start</code> property.
   */
 public void setStart(Neo4jCaptureDataChangeRelationshipPayloadEnd start) {
    this.start = start;
  }

  /**
   * Sets the <code>start</code> property.
   */
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

