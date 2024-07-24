package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import org.openapitools.model.ClipboardContext;
import org.openapitools.model.Vector2int;

@Canonical
class Clipboard {
    
    ClipboardContext context

    enum ClipboardTypeEnum {
    
        PRIMARY("Primary"),
        
        SECONDARY("Secondary"),
        
        CLIPBOARD("Clipboard")
    
        private final String value
    
        ClipboardTypeEnum(String value) {
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

    /* Type of clipboard */
    ClipboardTypeEnum clipboardType
    /* Clipboard content */
    String content
    
    Vector2int selectionStart
    
    Vector2int selectionEnd
}
