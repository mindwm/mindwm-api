package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TmuxPaneIoDocument extends HashMap<String, Object>  {
  
  private String input;
  private String output;
  private String ps1;

  public TmuxPaneIoDocument () {

  }

  public TmuxPaneIoDocument (String input, String output, String ps1) {
    this.input = input;
    this.output = output;
    this.ps1 = ps1;
  }

    
  @JsonProperty("input")
  public String getInput() {
    return input;
  }
  public void setInput(String input) {
    this.input = input;
  }

    
  @JsonProperty("output")
  public String getOutput() {
    return output;
  }
  public void setOutput(String output) {
    this.output = output;
  }

    
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
