/*
 * Mindwm API
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ClipboardPayload
 */
@JsonPropertyOrder({
  ClipboardPayload.JSON_PROPERTY_START,
  ClipboardPayload.JSON_PROPERTY_STOP,
  ClipboardPayload.JSON_PROPERTY_DATA,
  ClipboardPayload.JSON_PROPERTY_TYPE,
  ClipboardPayload.JSON_PROPERTY_CONTEXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-07-12T10:25:05.042023741Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class ClipboardPayload   {
  public static final String JSON_PROPERTY_START = "start";
  @JsonProperty(JSON_PROPERTY_START)
  private List<Integer> start = new ArrayList<>();

  public static final String JSON_PROPERTY_STOP = "stop";
  @JsonProperty(JSON_PROPERTY_STOP)
  private List<Integer> stop = new ArrayList<>();

  public static final String JSON_PROPERTY_DATA = "data";
  @JsonProperty(JSON_PROPERTY_DATA)
  private String data;

  /**
   * Clipboard type
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private TypeEnum type;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  private ClipboardPayloadContext context;

  public ClipboardPayload start(List<Integer> start) {
    this.start = start;
    return this;
  }

  public ClipboardPayload addStartItem(Integer startItem) {
    if (this.start == null) {
      this.start = new ArrayList<>();
    }
    this.start.add(startItem);
    return this;
  }

  /**
   * Starting position of clipboard selection [x,y]
   * @return start
   **/
  @JsonProperty(value = "start")
  @ApiModelProperty(value = "Starting position of clipboard selection [x,y]")
   @Size(min=2,max=2)
  public List<Integer> getStart() {
    return start;
  }

  public void setStart(List<Integer> start) {
    this.start = start;
  }

  public ClipboardPayload stop(List<Integer> stop) {
    this.stop = stop;
    return this;
  }

  public ClipboardPayload addStopItem(Integer stopItem) {
    if (this.stop == null) {
      this.stop = new ArrayList<>();
    }
    this.stop.add(stopItem);
    return this;
  }

  /**
   * Ending position of clipboard selection [x,y]
   * @return stop
   **/
  @JsonProperty(value = "stop")
  @ApiModelProperty(value = "Ending position of clipboard selection [x,y]")
   @Size(min=2,max=2)
  public List<Integer> getStop() {
    return stop;
  }

  public void setStop(List<Integer> stop) {
    this.stop = stop;
  }

  public ClipboardPayload data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Clipboard data
   * @return data
   **/
  @JsonProperty(value = "data")
  @ApiModelProperty(value = "Clipboard data")
   @Size(min=1)
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public ClipboardPayload type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Clipboard type
   * @return type
   **/
  @JsonProperty(value = "type")
  @ApiModelProperty(value = "Clipboard type")
  
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ClipboardPayload context(ClipboardPayloadContext context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
   **/
  @JsonProperty(value = "context")
  @ApiModelProperty(value = "")
  @Valid 
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
    return Objects.equals(this.start, clipboardPayload.start) &&
        Objects.equals(this.stop, clipboardPayload.stop) &&
        Objects.equals(this.data, clipboardPayload.data) &&
        Objects.equals(this.type, clipboardPayload.type) &&
        Objects.equals(this.context, clipboardPayload.context);
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
