package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Touch
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-22T13:50:00.995778238Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Touch {

  @Valid
  private List<BigDecimal> ids = new ArrayList<>();

  public Touch() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Touch(List<BigDecimal> ids) {
    this.ids = ids;
  }

  public Touch ids(List<BigDecimal> ids) {
    this.ids = ids;
    return this;
  }

  public Touch addIdsItem(BigDecimal idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

  /**
   * Get ids
   * @return ids
   */
  @NotNull @Valid 
  @Schema(name = "ids", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ids")
  public List<BigDecimal> getIds() {
    return ids;
  }

  public void setIds(List<BigDecimal> ids) {
    this.ids = ids;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Touch touch = (Touch) o;
    return Objects.equals(this.ids, touch.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Touch {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

