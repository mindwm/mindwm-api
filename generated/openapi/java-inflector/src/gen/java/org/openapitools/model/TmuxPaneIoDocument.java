package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-07-14T12:11:43.764762192Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class TmuxPaneIoDocument extends HashMap<String, Object>  {
  @JsonProperty("input")
  private String input;

  @JsonProperty("output")
  private String output;

  @JsonProperty("ps1")
  private String ps1;

  /**
   * User input
   **/
  public TmuxPaneIoDocument input(String input) {
    this.input = input;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "User input")
  @JsonProperty("input")
  public String getInput() {
    return input;
  }
  public void setInput(String input) {
    this.input = input;
  }

  /**
   * Command output (mix of stdout & stderr)
   **/
  public TmuxPaneIoDocument output(String output) {
    this.output = output;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Command output (mix of stdout & stderr)")
  @JsonProperty("output")
  public String getOutput() {
    return output;
  }
  public void setOutput(String output) {
    this.output = output;
  }

  /**
   * ps1 (prompt) AFTER the input and output
   **/
  public TmuxPaneIoDocument ps1(String ps1) {
    this.ps1 = ps1;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "ps1 (prompt) AFTER the input and output")
  @JsonProperty("ps1")
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
    return super.equals(o) && Objects.equals(input, tmuxPaneIoDocument.input) &&
        Objects.equals(output, tmuxPaneIoDocument.output) &&
        Objects.equals(ps1, tmuxPaneIoDocument.ps1);
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

