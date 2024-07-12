package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ClipboardPayloadContext;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ClipboardPayload   {

    private List<Integer> start = new ArrayList<>();
    private List<Integer> stop = new ArrayList<>();
    private String data;

    /**
    * Clipboard type
    */
    public enum TypeEnum {
        PRIMARY("primary"),
        SECONDARY("secondary"),
        CLIPBOARD("clipboard");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private TypeEnum type;
    private ClipboardPayloadContext context;

    /**
     * Default constructor.
     */
    public ClipboardPayload() {
    // JSON-B / Jackson
    }

    /**
     * Create ClipboardPayload.
     *
     * @param start Starting position of clipboard selection [x,y]
     * @param stop Ending position of clipboard selection [x,y]
     * @param data Clipboard data
     * @param type Clipboard type
     * @param context context
     */
    public ClipboardPayload(
        List<Integer> start, 
        List<Integer> stop, 
        String data, 
        TypeEnum type, 
        ClipboardPayloadContext context
    ) {
        this.start = start;
        this.stop = stop;
        this.data = data;
        this.type = type;
        this.context = context;
    }



    /**
     * Starting position of clipboard selection [x,y]
     * @return start
     */
    public List<Integer> getStart() {
        return start;
    }

    public void setStart(List<Integer> start) {
        this.start = start;
    }

    /**
     * Ending position of clipboard selection [x,y]
     * @return stop
     */
    public List<Integer> getStop() {
        return stop;
    }

    public void setStop(List<Integer> stop) {
        this.stop = stop;
    }

    /**
     * Clipboard data
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    /**
     * Clipboard type
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get context
     * @return context
     */
    public ClipboardPayloadContext getContext() {
        return context;
    }

    public void setContext(ClipboardPayloadContext context) {
        this.context = context;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClipboardPayload {\n");
        
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

