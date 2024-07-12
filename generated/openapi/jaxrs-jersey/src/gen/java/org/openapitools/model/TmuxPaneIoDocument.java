/*
 * Mindwm API
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * TmuxPaneIoDocument
 */
@JsonPropertyOrder({
  TmuxPaneIoDocument.JSON_PROPERTY_INPUT,
  TmuxPaneIoDocument.JSON_PROPERTY_OUTPUT,
  TmuxPaneIoDocument.JSON_PROPERTY_PS1
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-07-12T11:12:30.427829805Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class TmuxPaneIoDocument extends HashMap<String, Object>  {
  public static final String JSON_PROPERTY_INPUT = "input";
  @JsonProperty(JSON_PROPERTY_INPUT)
  private String input;

  public static final String JSON_PROPERTY_OUTPUT = "output";
  @JsonProperty(JSON_PROPERTY_OUTPUT)
  private String output;

  public static final String JSON_PROPERTY_PS1 = "ps1";
  @JsonProperty(JSON_PROPERTY_PS1)
  private String ps1;

  public TmuxPaneIoDocument input(String input) {
    this.input = input;
    return this;
  }

  /**
   * User input
   * @return input
   **/
  @JsonProperty(value = "input")
  @ApiModelProperty(required = true, value = "User input")
  @NotNull  @Size(min=1)
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
   * Command output (mix of stdout &amp; stderr)
   * @return output
   **/
  @JsonProperty(value = "output")
  @ApiModelProperty(required = true, value = "Command output (mix of stdout & stderr)")
  @NotNull  @Size(min=0)
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
   **/
  @JsonProperty(value = "ps1")
  @ApiModelProperty(required = true, value = "ps1 (prompt) AFTER the input and output")
  @NotNull  @Size(min=1)
  public String getPs1() {
    return ps1;
  }

  public void setPs1(String ps1) {
    this.ps1 = ps1;
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
    return super.equals(o) && Objects.equals(this.input, tmuxPaneIoDocument.input) &&
        Objects.equals(this.output, tmuxPaneIoDocument.output) &&
        Objects.equals(this.ps1, tmuxPaneIoDocument.ps1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), input, super.hashCode(), output, super.hashCode(), ps1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TmuxPaneIoDocument {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    ps1: ").append(toIndentedString(ps1)).append("\n");
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

