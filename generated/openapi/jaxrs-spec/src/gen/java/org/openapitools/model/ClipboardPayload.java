package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ClipboardPayloadContext;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ClipboardPayload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-07-16T19:19:36.105944178Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class ClipboardPayload   {
  private @Valid List<Integer> start = new ArrayList<>();
  private @Valid List<Integer> stop = new ArrayList<>();
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TypeEnum fromString(String s) {
        for (TypeEnum b : TypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  /**
   * Starting position of clipboard selection [x,y]
   **/
  public ClipboardPayload start(List<Integer> start) {
    this.start = start;
    return this;
  }

  
  @ApiModelProperty(value = "Starting position of clipboard selection [x,y]")
  @JsonProperty("start")
   @Size(min=2,max=2)public List<Integer> getStart() {
    return start;
  }

  @JsonProperty("start")
  public void setStart(List<Integer> start) {
    this.start = start;
  }

  public ClipboardPayload addStartItem(Integer startItem) {
    if (this.start == null) {
      this.start = new ArrayList<>();
    }

    this.start.add(startItem);
    return this;
  }

  public ClipboardPayload removeStartItem(Integer startItem) {
    if (startItem != null && this.start != null) {
      this.start.remove(startItem);
    }

    return this;
  }
  /**
   * Ending position of clipboard selection [x,y]
   **/
  public ClipboardPayload stop(List<Integer> stop) {
    this.stop = stop;
    return this;
  }

  
  @ApiModelProperty(value = "Ending position of clipboard selection [x,y]")
  @JsonProperty("stop")
   @Size(min=2,max=2)public List<Integer> getStop() {
    return stop;
  }

  @JsonProperty("stop")
  public void setStop(List<Integer> stop) {
    this.stop = stop;
  }

  public ClipboardPayload addStopItem(Integer stopItem) {
    if (this.stop == null) {
      this.stop = new ArrayList<>();
    }

    this.stop.add(stopItem);
    return this;
  }

  public ClipboardPayload removeStopItem(Integer stopItem) {
    if (stopItem != null && this.stop != null) {
      this.stop.remove(stopItem);
    }

    return this;
  }
  /**
   * Clipboard data
   **/
  public ClipboardPayload data(String data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "Clipboard data")
  @JsonProperty("data")
   @Size(min=1)public String getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(String data) {
    this.data = data;
  }

  /**
   * Clipboard type
   **/
  public ClipboardPayload type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "Clipboard type")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  public ClipboardPayload context(ClipboardPayloadContext context) {
    this.context = context;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("context")
  @Valid public ClipboardPayloadContext getContext() {
    return context;
  }

  @JsonProperty("context")
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

