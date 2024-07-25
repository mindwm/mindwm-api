package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ClipboardContext
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-25T09:20:33.535979507Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class ClipboardContext {

  private BigDecimal windowId;

  public ClipboardContext() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ClipboardContext(BigDecimal windowId) {
    this.windowId = windowId;
  }

  public ClipboardContext windowId(BigDecimal windowId) {
    this.windowId = windowId;
    return this;
  }

  /**
   * Xorg window_id
   * minimum: 0
   * maximum: 4294967295
   * @return windowId
   */
  @NotNull @Valid @DecimalMin("0") @DecimalMax("4294967295") 
  @Schema(name = "windowId", description = "Xorg window_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("windowId")
  public BigDecimal getWindowId() {
    return windowId;
  }

  public void setWindowId(BigDecimal windowId) {
    this.windowId = windowId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClipboardContext clipboardContext = (ClipboardContext) o;
    return Objects.equals(this.windowId, clipboardContext.windowId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(windowId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClipboardContext {\n");
    sb.append("    windowId: ").append(toIndentedString(windowId)).append("\n");
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

