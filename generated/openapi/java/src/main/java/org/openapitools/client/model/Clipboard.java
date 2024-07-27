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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.ClipboardContext;
import org.openapitools.client.model.Vector2int;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Clipboard
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-27T19:48:07.432410968Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Clipboard {
  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private ClipboardContext context;

  /**
   * Type of clipboard
   */
  @JsonAdapter(ClipboardTypeEnum.Adapter.class)
  public enum ClipboardTypeEnum {
    PRIMARY("Primary"),
    
    SECONDARY("Secondary"),
    
    CLIPBOARD("Clipboard");

    private String value;

    ClipboardTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ClipboardTypeEnum fromValue(String value) {
      for (ClipboardTypeEnum b : ClipboardTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ClipboardTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ClipboardTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ClipboardTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ClipboardTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ClipboardTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CLIPBOARD_TYPE = "clipboardType";
  @SerializedName(SERIALIZED_NAME_CLIPBOARD_TYPE)
  private ClipboardTypeEnum clipboardType;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_SELECTION_START = "selectionStart";
  @SerializedName(SERIALIZED_NAME_SELECTION_START)
  private Vector2int selectionStart;

  public static final String SERIALIZED_NAME_SELECTION_END = "selectionEnd";
  @SerializedName(SERIALIZED_NAME_SELECTION_END)
  private Vector2int selectionEnd;

  public Clipboard() {
  }

  public Clipboard context(ClipboardContext context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
   */
  @javax.annotation.Nonnull
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
  @javax.annotation.Nonnull
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
  @javax.annotation.Nonnull
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Clipboard instance itself
   */
  public Clipboard putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
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
        Objects.equals(this.selectionEnd, clipboard.selectionEnd)&&
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("context");
    openapiFields.add("clipboardType");
    openapiFields.add("content");
    openapiFields.add("selectionStart");
    openapiFields.add("selectionEnd");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("context");
    openapiRequiredFields.add("clipboardType");
    openapiRequiredFields.add("content");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Clipboard
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Clipboard.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Clipboard is not found in the empty JSON string", Clipboard.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Clipboard.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `context`
      ClipboardContext.validateJsonElement(jsonObj.get("context"));
      if (!jsonObj.get("clipboardType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clipboardType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clipboardType").toString()));
      }
      // validate the required field `clipboardType`
      ClipboardTypeEnum.validateJsonElement(jsonObj.get("clipboardType"));
      if (!jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      // validate the optional field `selectionStart`
      if (jsonObj.get("selectionStart") != null && !jsonObj.get("selectionStart").isJsonNull()) {
        Vector2int.validateJsonElement(jsonObj.get("selectionStart"));
      }
      // validate the optional field `selectionEnd`
      if (jsonObj.get("selectionEnd") != null && !jsonObj.get("selectionEnd").isJsonNull()) {
        Vector2int.validateJsonElement(jsonObj.get("selectionEnd"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Clipboard.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Clipboard' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Clipboard> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Clipboard.class));

       return (TypeAdapter<T>) new TypeAdapter<Clipboard>() {
           @Override
           public void write(JsonWriter out, Clipboard value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Clipboard read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             Clipboard instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Clipboard given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Clipboard
   * @throws IOException if the JSON string is invalid with respect to Clipboard
   */
  public static Clipboard fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Clipboard.class);
  }

  /**
   * Convert an instance of Clipboard to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

