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
 * Neo4jCaptureDataChangeMetaSource
 */

@JsonTypeName("Neo4jCaptureDataChange_meta_source")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-07-14T10:09:02.160291331Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChangeMetaSource {

  private String hostname;

  public Neo4jCaptureDataChangeMetaSource() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Neo4jCaptureDataChangeMetaSource(String hostname) {
    this.hostname = hostname;
  }

  public Neo4jCaptureDataChangeMetaSource hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * Get hostname
   * @return hostname
   */
  @NotNull 
  @Schema(name = "hostname", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Neo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource = (Neo4jCaptureDataChangeMetaSource) o;
    return Objects.equals(this.hostname, neo4jCaptureDataChangeMetaSource.hostname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jCaptureDataChangeMetaSource {\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
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

