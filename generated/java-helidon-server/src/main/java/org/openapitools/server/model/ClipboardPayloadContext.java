package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Selection context
 */
public class ClipboardPayloadContext   {

    private String window;

    /**
     * Default constructor.
     */
    public ClipboardPayloadContext() {
    // JSON-B / Jackson
    }

    /**
     * Create ClipboardPayloadContext.
     *
     * @param window window id
     */
    public ClipboardPayloadContext(
        String window
    ) {
        this.window = window;
    }



    /**
     * window id
     * @return window
     */
    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClipboardPayloadContext {\n");
        
        sb.append("    window: ").append(toIndentedString(window)).append("\n");
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

