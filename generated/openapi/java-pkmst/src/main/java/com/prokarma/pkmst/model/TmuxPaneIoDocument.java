package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * TmuxPaneIoDocument
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-07-17T13:48:25.018972668Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class TmuxPaneIoDocument extends HashMap<String, Object>  {
  @JsonProperty("input")
  private String input;

  @JsonProperty("output")
  private String output;

  @JsonProperty("ps1")
  private String ps1;

  public TmuxPaneIoDocument input(String input) {
    this.input = input;
    return this;
  }

  /**
   * User input
   * @return input
   */
  @ApiModelProperty(required = true, value = "User input")
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
  @ApiModelProperty(required = true, value = "Command output (mix of stdout & stderr)")
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
  @ApiModelProperty(required = true, value = "ps1 (prompt) AFTER the input and output")
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
    return Objects.equals(this.input, tmuxPaneIoDocument.input) &&
        Objects.equals(this.output, tmuxPaneIoDocument.output) &&
        Objects.equals(this.ps1, tmuxPaneIoDocument.ps1) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, output, ps1, super.hashCode());
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

