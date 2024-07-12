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
 * Selection context
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-12T10:24:35.954099704Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class ClipboardPayloadContext {
  public static final String SERIALIZED_NAME_WINDOW = "window";
  @SerializedName(SERIALIZED_NAME_WINDOW)
  private String window;

  public ClipboardPayloadContext() {
  }

  public ClipboardPayloadContext window(String window) {
    this.window = window;
    return this;
  }

  /**
   * window id
   * @return window
   */
  @javax.annotation.Nullable
  public String getWindow() {
    return window;
  }

  public void setWindow(String window) {
    this.window = window;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClipboardPayloadContext clipboardPayloadContext = (ClipboardPayloadContext) o;
    return Objects.equals(this.window, clipboardPayloadContext.window);
  }

  @Override
  public int hashCode() {
    return Objects.hash(window);
  }

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
    openapiFields.add("window");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ClipboardPayloadContext
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ClipboardPayloadContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClipboardPayloadContext is not found in the empty JSON string", ClipboardPayloadContext.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ClipboardPayloadContext.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClipboardPayloadContext` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("window") != null && !jsonObj.get("window").isJsonNull()) && !jsonObj.get("window").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `window` to be a primitive type in the JSON string but got `%s`", jsonObj.get("window").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClipboardPayloadContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClipboardPayloadContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClipboardPayloadContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClipboardPayloadContext.class));

       return (TypeAdapter<T>) new TypeAdapter<ClipboardPayloadContext>() {
           @Override
           public void write(JsonWriter out, ClipboardPayloadContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClipboardPayloadContext read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ClipboardPayloadContext given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ClipboardPayloadContext
   * @throws IOException if the JSON string is invalid with respect to ClipboardPayloadContext
   */
  public static ClipboardPayloadContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClipboardPayloadContext.class);
  }

  /**
   * Convert an instance of ClipboardPayloadContext to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
