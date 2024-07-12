package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Selection context
 **/

@ApiModel(description = "Selection context")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-07-12T10:24:44.445020002Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class ClipboardPayloadContext   {
  @JsonProperty("window")
  private String window;

  /**
   * window id
   **/
  public ClipboardPayloadContext window(String window) {
    this.window = window;
    return this;
  }

  
  @ApiModelProperty(value = "window id")
  @JsonProperty("window")
  public String getWindow() {
    return window;
  }
  public void setWindow(String window) {
    this.window = window;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClipboardPayloadContext clipboardPayloadContext = (ClipboardPayloadContext) o;
    return Objects.equals(window, clipboardPayloadContext.window);
  }

  @Override
  public int hashCode() {
    return Objects.hash(window);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClipboardPayloadContext {\n");
    
    sb.append("    window: ").append(toIndentedString(window)).append("\n");
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

