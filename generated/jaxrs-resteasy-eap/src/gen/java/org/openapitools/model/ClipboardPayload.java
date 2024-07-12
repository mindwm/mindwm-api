package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ClipboardPayloadContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-07-12T10:25:08.450326845Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class ClipboardPayload   {
  
  private List<Integer> start = new ArrayList<>();
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

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type;
  private ClipboardPayloadContext context;

  /**
   * Starting position of clipboard selection [x,y]
   **/
  
  @ApiModelProperty(value = "Starting position of clipboard selection [x,y]")
  @JsonProperty("start")
 @Size(min=2,max=2)  public List<Integer> getStart() {
    return start;
  }
  public void setStart(List<Integer> start) {
    this.start = start;
  }

  /**
   * Ending position of clipboard selection [x,y]
   **/
  
  @ApiModelProperty(value = "Ending position of clipboard selection [x,y]")
  @JsonProperty("stop")
 @Size(min=2,max=2)  public List<Integer> getStop() {
    return stop;
  }
  public void setStop(List<Integer> stop) {
    this.stop = stop;
  }

  /**
   * Clipboard data
   **/
  
  @ApiModelProperty(value = "Clipboard data")
  @JsonProperty("data")
 @Size(min=1)  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  /**
   * Clipboard type
   **/
  
  @ApiModelProperty(value = "Clipboard type")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  
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

