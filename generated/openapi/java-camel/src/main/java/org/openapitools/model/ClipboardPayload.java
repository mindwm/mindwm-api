package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ClipboardPayloadContext;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ClipboardPayload
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-07-13T22:09:28.668148392Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class ClipboardPayload {

  @Valid
  private List<Integer> start = new ArrayList<>();

  @Valid
  private List<Integer> stop = new ArrayList<>();

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private TypeEnum type;

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
   */
  @Size(min = 2, max = 2) 
  @Schema(name = "start", description = "Starting position of clipboard selection [x,y]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start")
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
   */
  @Size(min = 2, max = 2) 
  @Schema(name = "stop", description = "Ending position of clipboard selection [x,y]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stop")
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
   */
  @Size(min = 1) 
  @Schema(name = "data", description = "Clipboard data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
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
   */
  
  @Schema(name = "type", description = "Clipboard type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
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
   */
  @Valid 
  @Schema(name = "context", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

