/*
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * OpenAPI document version: 0.1.0
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ClipboardPayloadContext;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-07-16T19:19:18.384203832Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class ClipboardPayload   {
  
  private List<Integer> start = new ArrayList<>();
  private List<Integer> stop = new ArrayList<>();
  private String data;


  public enum TypeEnum {
    PRIMARY("primary"),
    SECONDARY("secondary"),
    CLIPBOARD("clipboard");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private ClipboardPayloadContext context;

  /**
   * Starting position of clipboard selection [x,y]
   */
  public ClipboardPayload start(List<Integer> start) {
    this.start = start;
    return this;
  }

  
  @ApiModelProperty(value = "Starting position of clipboard selection [x,y]")
  @JsonProperty("start")
  public List<Integer> getStart() {
    return start;
  }
  public void setStart(List<Integer> start) {
    this.start = start;
  }

  /**
   * Ending position of clipboard selection [x,y]
   */
  public ClipboardPayload stop(List<Integer> stop) {
    this.stop = stop;
    return this;
  }

  
  @ApiModelProperty(value = "Ending position of clipboard selection [x,y]")
  @JsonProperty("stop")
  public List<Integer> getStop() {
    return stop;
  }
  public void setStop(List<Integer> stop) {
    this.stop = stop;
  }

  /**
   * Clipboard data
   */
  public ClipboardPayload data(String data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "Clipboard data")
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  /**
   * Clipboard type
   */
  public ClipboardPayload type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "Clipboard type")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   */
  public ClipboardPayload context(ClipboardPayloadContext context) {
    this.context = context;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("context")
  public ClipboardPayloadContext getContext() {
    return context;
  }
  public void setContext(ClipboardPayloadContext context) {
    this.context = context;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClipboardPayload clipboardPayload = (ClipboardPayload) o;
    return Objects.equals(start, clipboardPayload.start) &&
        Objects.equals(stop, clipboardPayload.stop) &&
        Objects.equals(data, clipboardPayload.data) &&
        Objects.equals(type, clipboardPayload.type) &&
        Objects.equals(context, clipboardPayload.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, stop, data, type, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClipboardPayload {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

