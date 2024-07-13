package apimodels;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TmuxPaneIoDocument
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-07-13T22:09:22.926672300Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TmuxPaneIoDocument extends HashMap<String, Object>  {
  @JsonProperty("input")
  @NotNull
@Size(min=1)

  private String input;

  @JsonProperty("output")
  @NotNull
@Size(min=0)

  private String output;

  @JsonProperty("ps1")
  @NotNull
@Size(min=1)

  private String ps1;

  public TmuxPaneIoDocument input(String input) {
    this.input = input;
    return this;
  }

   /**
   * User input
   * @return input
  **/
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
  **/
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
    return Objects.equals(input, tmuxPaneIoDocument.input) &&
        Objects.equals(output, tmuxPaneIoDocument.output) &&
        Objects.equals(ps1, tmuxPaneIoDocument.ps1) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, output, ps1, super.hashCode());
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

