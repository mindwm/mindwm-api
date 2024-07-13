package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Selection context
 */

@Schema(name = "ClipboardPayload_context", description = "Selection context")
@JsonTypeName("ClipboardPayload_context")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-07-13T19:25:32.525091345Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class ClipboardPayloadContext {

  private String window;

  public ClipboardPayloadContext window(String window) {
    this.window = window;
    return this;
  }

  /**
   * window id
   * @return window
   */
  
  @Schema(name = "window", description = "window id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.window, clipboardPayloadContext.window);
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

