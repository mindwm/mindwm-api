package org.openapitools.server.model;

import java.util.HashMap;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TmuxPaneIoDocument extends HashMap<String, Object>  {

    private String input;
    private String output;
    private String ps1;

    /**
     * Default constructor.
     */
    public TmuxPaneIoDocument() {
    // JSON-B / Jackson
    }

    /**
     * Create TmuxPaneIoDocument.
     *
     * @param input User input
     * @param output Command output (mix of stdout &amp; stderr)
     * @param ps1 ps1 (prompt) AFTER the input and output
     */
    public TmuxPaneIoDocument(
        String input, 
        String output, 
        String ps1
    ) {
        this.input = input;
        this.output = output;
        this.ps1 = ps1;
    }



    /**
     * User input
     * @return input
     */
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * Command output (mix of stdout & stderr)
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * ps1 (prompt) AFTER the input and output
     * @return ps1
     */
    public String getPs1() {
        return ps1;
    }

    public void setPs1(String ps1) {
        this.ps1 = ps1;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

