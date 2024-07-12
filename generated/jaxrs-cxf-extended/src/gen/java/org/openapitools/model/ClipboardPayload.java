package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ClipboardPayloadContext;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ClipboardPayload  {
  
 /**
  * Starting position of clipboard selection [x,y]
  */
  @ApiModelProperty(value = "Starting position of clipboard selection [x,y]")
  private List<Integer> start = new ArrayList<>();

 /**
  * Ending position of clipboard selection [x,y]
  */
  @ApiModelProperty(value = "Ending position of clipboard selection [x,y]")
  private List<Integer> stop = new ArrayList<>();

 /**
  * Clipboard data
  */
  @ApiModelProperty(value = "Clipboard data")
  private String data;

public enum TypeEnum {

    @JsonProperty("primary") PRIMARY(String.valueOf("primary")),
    @JsonProperty("secondary") SECONDARY(String.valueOf("secondary")),
    @JsonProperty("clipboard") CLIPBOARD(String.valueOf("clipboard"));

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

 /**
  * Clipboard type
  */
  @ApiModelProperty(value = "Clipboard type")
  private TypeEnum type;

  @ApiModelProperty(value = "")
  @Valid
  private ClipboardPayloadContext context;
 /**
  * Starting position of clipboard selection [x,y]
  * @return start
  */
  @JsonProperty("start")
 @Size(min=2,max=2)  public List<Integer> getStart() {
    return start;
  }

  /**
   * Sets the <code>start</code> property.
   */
 public void setStart(List<Integer> start) {
    this.start = start;
  }

  /**
   * Sets the <code>start</code> property.
   */
  public ClipboardPayload start(List<Integer> start) {
    this.start = start;
    return this;
  }

  /**
   * Adds a new item to the <code>start</code> list.
   */
  public ClipboardPayload addStartItem(Integer startItem) {
    this.start.add(startItem);
    return this;
  }

 /**
  * Ending position of clipboard selection [x,y]
  * @return stop
  */
  @JsonProperty("stop")
 @Size(min=2,max=2)  public List<Integer> getStop() {
    return stop;
  }

  /**
   * Sets the <code>stop</code> property.
   */
 public void setStop(List<Integer> stop) {
    this.stop = stop;
  }

  /**
   * Sets the <code>stop</code> property.
   */
  public ClipboardPayload stop(List<Integer> stop) {
    this.stop = stop;
    return this;
  }

  /**
   * Adds a new item to the <code>stop</code> list.
   */
  public ClipboardPayload addStopItem(Integer stopItem) {
    this.stop.add(stopItem);
    return this;
  }

 /**
  * Clipboard data
  * @return data
  */
  @JsonProperty("data")
 @Size(min=1)  public String getData() {
    return data;
  }

  /**
   * Sets the <code>data</code> property.
   */
 public void setData(String data) {
    this.data = data;
  }

  /**
   * Sets the <code>data</code> property.
   */
  public ClipboardPayload data(String data) {
    this.data = data;
    return this;
  }

 /**
  * Clipboard type
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public ClipboardPayload type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * Get context
  * @return context
  */
  @JsonProperty("context")
  public ClipboardPayloadContext getContext() {
    return context;
  }

  /**
   * Sets the <code>context</code> property.
   */
 public void setContext(ClipboardPayloadContext context) {
    this.context = context;
  }

  /**
   * Sets the <code>context</code> property.
   */
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

