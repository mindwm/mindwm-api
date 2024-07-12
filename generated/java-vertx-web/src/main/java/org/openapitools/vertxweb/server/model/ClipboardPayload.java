package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ClipboardPayloadContext;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public ClipboardPayload () {

  }

  public ClipboardPayload (List<Integer> start, List<Integer> stop, String data, TypeEnum type, ClipboardPayloadContext context) {
    this.start = start;
    this.stop = stop;
    this.data = data;
    this.type = type;
    this.context = context;
  }

    
  @JsonProperty("start")
  public List<Integer> getStart() {
    return start;
  }
  public void setStart(List<Integer> start) {
    this.start = start;
  }

    
  @JsonProperty("stop")
  public List<Integer> getStop() {
    return stop;
  }
  public void setStop(List<Integer> stop) {
    this.stop = stop;
  }

    
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
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
