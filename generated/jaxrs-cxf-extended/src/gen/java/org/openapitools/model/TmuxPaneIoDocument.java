package org.openapitools.model;

import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TmuxPaneIoDocument extends HashMap<String, Object> {
  
 /**
  * User input
  */
  @ApiModelProperty(required = true, value = "User input")
  private String input;

 /**
  * Command output (mix of stdout & stderr)
  */
  @ApiModelProperty(required = true, value = "Command output (mix of stdout & stderr)")
  private String output;

 /**
  * ps1 (prompt) AFTER the input and output
  */
  @ApiModelProperty(required = true, value = "ps1 (prompt) AFTER the input and output")
  private String ps1;
 /**
  * User input
  * @return input
  */
  @JsonProperty("input")
  @NotNull
 @Size(min=1)  public String getInput() {
    return input;
  }

  /**
   * Sets the <code>input</code> property.
   */
 public void setInput(String input) {
    this.input = input;
  }

  /**
   * Sets the <code>input</code> property.
   */
  public TmuxPaneIoDocument input(String input) {
    this.input = input;
    return this;
  }

 /**
  * Command output (mix of stdout &amp; stderr)
  * @return output
  */
  @JsonProperty("output")
  @NotNull
 @Size(min=0)  public String getOutput() {
    return output;
  }

  /**
   * Sets the <code>output</code> property.
   */
 public void setOutput(String output) {
    this.output = output;
  }

  /**
   * Sets the <code>output</code> property.
   */
  public TmuxPaneIoDocument output(String output) {
    this.output = output;
    return this;
  }

 /**
  * ps1 (prompt) AFTER the input and output
  * @return ps1
  */
  @JsonProperty("ps1")
  @NotNull
 @Size(min=1)  public String getPs1() {
    return ps1;
  }

  /**
   * Sets the <code>ps1</code> property.
   */
 public void setPs1(String ps1) {
    this.ps1 = ps1;
  }

  /**
   * Sets the <code>ps1</code> property.
   */
  public TmuxPaneIoDocument ps1(String ps1) {
    this.ps1 = ps1;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

