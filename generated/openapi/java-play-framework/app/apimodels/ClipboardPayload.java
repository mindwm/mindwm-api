package apimodels;

import apimodels.ClipboardPayloadContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ClipboardPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-07-16T19:19:16.519861287Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ClipboardPayload   {
  @JsonProperty("start")
  @Size(min=2,max=2)

  private List<Integer> start = null;

  @JsonProperty("stop")
  @Size(min=2,max=2)

  private List<Integer> stop = null;

  @JsonProperty("data")
  @Size(min=1)

  private String data;

  /**
   * Clipboard type
   */
  public enum TypeEnum {
    PRIMARY("primary"),
    
    SECONDARY("secondary"),
    
    CLIPBOARD("clipboard");

    private final String value;

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

  @JsonProperty("type")
  
  private TypeEnum type;

  @JsonProperty("context")
  @Valid

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

  @SuppressWarnings("StringBufferReplaceableByString")
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

