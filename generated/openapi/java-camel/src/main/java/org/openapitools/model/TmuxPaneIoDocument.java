package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * TmuxPaneIoDocument
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-07-13T22:09:28.668148392Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class TmuxPaneIoDocument {

  private String input;

  private String output;

  private String ps1;

  public TmuxPaneIoDocument() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TmuxPaneIoDocument(String input, String output, String ps1) {
    this.input = input;
    this.output = output;
    this.ps1 = ps1;
  }

  public TmuxPaneIoDocument input(String input) {
    this.input = input;
    return this;
  }

  /**
   * User input
   * @return input
   */
  @NotNull @Size(min = 1) 
  @Schema(name = "input", description = "User input", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("input")
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public TmuxPaneIoDocument output(String output) {
    this.output = output;
    return this;
  }

  /**
   * Command output (mix of stdout & stderr)
   * @return output
   */
  @NotNull @Size(min = 0) 
  @Schema(name = "output", description = "Command output (mix of stdout & stderr)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("output")
  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }

  public TmuxPaneIoDocument ps1(String ps1) {
    this.ps1 = ps1;
    return this;
  }

  /**
   * ps1 (prompt) AFTER the input and output
   * @return ps1
   */
  @NotNull @Size(min = 1) 
  @Schema(name = "ps1", description = "ps1 (prompt) AFTER the input and output", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ps1")
  public String getPs1() {
    return ps1;
  }

  public void setPs1(String ps1) {
    this.ps1 = ps1;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public TmuxPaneIoDocument putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TmuxPaneIoDocument tmuxPaneIoDocument = (TmuxPaneIoDocument) o;
    return Objects.equals(this.input, tmuxPaneIoDocument.input) &&
        Objects.equals(this.output, tmuxPaneIoDocument.output) &&
        Objects.equals(this.ps1, tmuxPaneIoDocument.ps1) &&
    Objects.equals(this.additionalProperties, tmuxPaneIoDocument.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, output, ps1, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmuxPaneIoDocument {\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    ps1: ").append(toIndentedString(ps1)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

