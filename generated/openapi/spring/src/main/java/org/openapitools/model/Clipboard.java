package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ClipboardContext;
import org.openapitools.model.Vector2int;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * Clipboard
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-28T13:33:34.746287493Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Clipboard {

  private ClipboardContext context;

  /**
   * Type of clipboard
   */
  public enum ClipboardTypeEnum {
    PRIMARY("Primary"),
    
    SECONDARY("Secondary"),
    
    CLIPBOARD("Clipboard");

    private String value;

    ClipboardTypeEnum(String value) {
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
    public static ClipboardTypeEnum fromValue(String value) {
      for (ClipboardTypeEnum b : ClipboardTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ClipboardTypeEnum clipboardType;

  private String content;

  private Vector2int selectionStart;

  private Vector2int selectionEnd;

  public Clipboard() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Clipboard(ClipboardContext context, ClipboardTypeEnum clipboardType, String content) {
    this.context = context;
    this.clipboardType = clipboardType;
    this.content = content;
  }

  public Clipboard context(ClipboardContext context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
   */
  @NotNull @Valid 
  @Schema(name = "context", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("context")
  public ClipboardContext getContext() {
    return context;
  }

  public void setContext(ClipboardContext context) {
    this.context = context;
  }

  public Clipboard clipboardType(ClipboardTypeEnum clipboardType) {
    this.clipboardType = clipboardType;
    return this;
  }

  /**
   * Type of clipboard
   * @return clipboardType
   */
  @NotNull 
  @Schema(name = "clipboardType", description = "Type of clipboard", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("clipboardType")
  public ClipboardTypeEnum getClipboardType() {
    return clipboardType;
  }

  public void setClipboardType(ClipboardTypeEnum clipboardType) {
    this.clipboardType = clipboardType;
  }

  public Clipboard content(String content) {
    this.content = content;
    return this;
  }

  /**
   * Clipboard content
   * @return content
   */
  @NotNull 
  @Schema(name = "content", description = "Clipboard content", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Clipboard selectionStart(Vector2int selectionStart) {
    this.selectionStart = selectionStart;
    return this;
  }

  /**
   * Get selectionStart
   * @return selectionStart
   */
  @Valid 
  @Schema(name = "selectionStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selectionStart")
  public Vector2int getSelectionStart() {
    return selectionStart;
  }

  public void setSelectionStart(Vector2int selectionStart) {
    this.selectionStart = selectionStart;
  }

  public Clipboard selectionEnd(Vector2int selectionEnd) {
    this.selectionEnd = selectionEnd;
    return this;
  }

  /**
   * Get selectionEnd
   * @return selectionEnd
   */
  @Valid 
  @Schema(name = "selectionEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selectionEnd")
  public Vector2int getSelectionEnd() {
    return selectionEnd;
  }

  public void setSelectionEnd(Vector2int selectionEnd) {
    this.selectionEnd = selectionEnd;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public Clipboard putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Clipboard clipboard = (Clipboard) o;
    return Objects.equals(this.context, clipboard.context) &&
        Objects.equals(this.clipboardType, clipboard.clipboardType) &&
        Objects.equals(this.content, clipboard.content) &&
        Objects.equals(this.selectionStart, clipboard.selectionStart) &&
        Objects.equals(this.selectionEnd, clipboard.selectionEnd) &&
    Objects.equals(this.additionalProperties, clipboard.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, clipboardType, content, selectionStart, selectionEnd, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Clipboard {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    clipboardType: ").append(toIndentedString(clipboardType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    selectionStart: ").append(toIndentedString(selectionStart)).append("\n");
    sb.append("    selectionEnd: ").append(toIndentedString(selectionEnd)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

