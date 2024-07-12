package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ClipboardPayloadContext;

@Canonical
class ClipboardPayload {
    /* Starting position of clipboard selection [x,y] */
    List<Integer> start = new ArrayList<>()
    /* Ending position of clipboard selection [x,y] */
    List<Integer> stop = new ArrayList<>()
    /* Clipboard data */
    String data

    enum TypeEnum {
    
        PRIMARY("primary"),
        
        SECONDARY("secondary"),
        
        CLIPBOARD("clipboard")
    
        private final String value
    
        TypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* Clipboard type */
    TypeEnum type
    
    ClipboardPayloadContext context
}
