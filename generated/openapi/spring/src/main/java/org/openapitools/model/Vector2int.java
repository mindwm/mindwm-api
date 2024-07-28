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
 * Vector2int
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-28T13:33:34.746287493Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Vector2int {

  private BigDecimal x;

  private BigDecimal y;

  public Vector2int() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Vector2int(BigDecimal x, BigDecimal y) {
    this.x = x;
    this.y = y;
  }

  public Vector2int x(BigDecimal x) {
    this.x = x;
    return this;
  }

  /**
   * the X coordinate
   * minimum: 0
   * maximum: 4294967295
   * @return x
   */
  @NotNull @Valid @DecimalMin("0") @DecimalMax("4294967295") 
  @Schema(name = "x", description = "the X coordinate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("x")
  public BigDecimal getX() {
    return x;
  }

  public void setX(BigDecimal x) {
    this.x = x;
  }

  public Vector2int y(BigDecimal y) {
    this.y = y;
    return this;
  }

  /**
   * the Y coordinate
   * minimum: 0
   * maximum: 4294967295
   * @return y
   */
  @NotNull @Valid @DecimalMin("0") @DecimalMax("4294967295") 
  @Schema(name = "y", description = "the Y coordinate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("y")
  public BigDecimal getY() {
    return y;
  }

  public void setY(BigDecimal y) {
    this.y = y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vector2int vector2int = (Vector2int) o;
    return Objects.equals(this.x, vector2int.x) &&
        Objects.equals(this.y, vector2int.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vector2int {\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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

