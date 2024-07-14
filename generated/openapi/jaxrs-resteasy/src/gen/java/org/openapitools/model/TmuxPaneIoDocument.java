package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-07-14T10:09:12.233329301Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class TmuxPaneIoDocument extends HashMap<String, Object>  {
  
  private String input;
  private String output;
  private String ps1;

  /**
   * User input
   **/
  
  @ApiModelProperty(required = true, value = "User input")
  @JsonProperty("input")
  @NotNull
 @Size(min=1)  public String getInput() {
    return input;
  }
  public void setInput(String input) {
    this.input = input;
  }

  /**
   * Command output (mix of stdout &amp; stderr)
   **/
  
  @ApiModelProperty(required = true, value = "Command output (mix of stdout & stderr)")
  @JsonProperty("output")
  @NotNull
 @Size(min=0)  public String getOutput() {
    return output;
  }
  public void setOutput(String output) {
    this.output = output;
  }

  /**
   * ps1 (prompt) AFTER the input and output
   **/
  
  @ApiModelProperty(required = true, value = "ps1 (prompt) AFTER the input and output")
  @JsonProperty("ps1")
  @NotNull
 @Size(min=1)  public String getPs1() {
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

