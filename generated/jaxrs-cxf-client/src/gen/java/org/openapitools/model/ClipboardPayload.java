package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ClipboardPayloadContext;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ClipboardPayload  {
  
  @ApiModelProperty(value = "Starting position of clipboard selection [x,y]")
 /**
   * Starting position of clipboard selection [x,y]
  **/
  private List<Integer> start = new ArrayList<>();

  @ApiModelProperty(value = "Ending position of clipboard selection [x,y]")
 /**
   * Ending position of clipboard selection [x,y]
  **/
  private List<Integer> stop = new ArrayList<>();

  @ApiModelProperty(value = "Clipboard data")
 /**
   * Clipboard data
  **/
  private String data;

public enum TypeEnum {

PRIMARY(String.valueOf("primary")), SECONDARY(String.valueOf("secondary")), CLIPBOARD(String.valueOf("clipboard"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "Clipboard type")
 /**
   * Clipboard type
  **/
  private TypeEnum type;

  @ApiModelProperty(value = "")
  private ClipboardPayloadContext context;
 /**
   * Starting position of clipboard selection [x,y]
   * @return start
  **/
  @JsonProperty("start")
  public List<Integer> getStart() {
    return start;
  }

  public void setStart(List<Integer> start) {
    this.start = start;
  }

  public ClipboardPayload start(List<Integer> start) {
    this.start = start;
    return this;
  }

  public ClipboardPayload addStartItem(Integer startItem) {
    this.start.add(startItem);
    return this;
  }

 /**
   * Ending position of clipboard selection [x,y]
   * @return stop
  **/
  @JsonProperty("stop")
  public List<Integer> getStop() {
    return stop;
  }

  public void setStop(List<Integer> stop) {
    this.stop = stop;
  }

  public ClipboardPayload stop(List<Integer> stop) {
    this.stop = stop;
    return this;
  }

  public ClipboardPayload addStopItem(Integer stopItem) {
    this.stop.add(stopItem);
    return this;
  }

 /**
   * Clipboard data
   * @return data
  **/
  @JsonProperty("data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public ClipboardPayload data(String data) {
    this.data = data;
    return this;
  }

 /**
   * Clipboard type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ClipboardPayload type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get context
   * @return context
  **/
  @JsonProperty("context")
  public ClipboardPayloadContext getContext() {
    return context;
  }

  public void setContext(ClipboardPayloadContext context) {
    this.context = context;
  }

  public ClipboardPayload context(ClipboardPayloadContext context) {
    this.context = context;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

