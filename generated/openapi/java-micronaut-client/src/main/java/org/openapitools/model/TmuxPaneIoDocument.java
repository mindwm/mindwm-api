/*
 * Mindwm API
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * TmuxPaneIoDocument
 */
@JsonPropertyOrder({
  TmuxPaneIoDocument.JSON_PROPERTY_INPUT,
  TmuxPaneIoDocument.JSON_PROPERTY_OUTPUT,
  TmuxPaneIoDocument.JSON_PROPERTY_PS1
})
@JsonTypeName("TmuxPaneIoDocument")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-07-16T19:19:08.246738677Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@Introspected
public class TmuxPaneIoDocument extends HashMap<String, Object> {
    public static final String JSON_PROPERTY_INPUT = "input";
    private String input;

    public static final String JSON_PROPERTY_OUTPUT = "output";
    private String output;

    public static final String JSON_PROPERTY_PS1 = "ps1";
    private String ps1;

    public TmuxPaneIoDocument(String input, String output, String ps1) {
        super();
        this.input = input;
        this.output = output;
        this.ps1 = ps1;
    }

    public TmuxPaneIoDocument input(String input) {
        this.input = input;
        return this;
    }

    /**
     * User input
     * @return input
     */
    @NotNull
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_INPUT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getInput() {
        return input;
    }

    @JsonProperty(JSON_PROPERTY_INPUT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setInput(String input) {
        this.input = input;
    }

    public TmuxPaneIoDocument output(String output) {
        this.output = output;
        return this;
    }

    /**
     * Command output (mix of stdout &amp; stderr)
     * @return output
     */
    @NotNull
    @Size(min=0)
    @JsonProperty(JSON_PROPERTY_OUTPUT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getOutput() {
        return output;
    }

    @JsonProperty(JSON_PROPERTY_OUTPUT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
     */
    @NotNull
    @Size(min=1)
    @JsonProperty(JSON_PROPERTY_PS1)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getPs1() {
        return ps1;
    }

    @JsonProperty(JSON_PROPERTY_PS1)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
        return Objects.equals(this.input, tmuxPaneIoDocument.input) &&
            Objects.equals(this.output, tmuxPaneIoDocument.output) &&
            Objects.equals(this.ps1, tmuxPaneIoDocument.ps1) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, output, ps1, super.hashCode());
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

