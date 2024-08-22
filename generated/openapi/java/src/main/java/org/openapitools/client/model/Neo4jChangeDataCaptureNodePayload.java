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
import org.openapitools.client.model.Neo4jChangeDataCaptureNodePayloadAfter;

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
 * Neo4jChangeDataCaptureNodePayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-22T13:49:37.130540008Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jChangeDataCaptureNodePayload {
  public static final String SERIALIZED_NAME_AFTER = "after";
  @SerializedName(SERIALIZED_NAME_AFTER)
  private Neo4jChangeDataCaptureNodePayloadAfter after;

  public static final String SERIALIZED_NAME_BEFORE = "before";
  @SerializedName(SERIALIZED_NAME_BEFORE)
  private String before;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public Neo4jChangeDataCaptureNodePayload() {
  }

  public Neo4jChangeDataCaptureNodePayload after(Neo4jChangeDataCaptureNodePayloadAfter after) {
    this.after = after;
    return this;
  }

  /**
   * Get after
   * @return after
   */
  @javax.annotation.Nonnull
  public Neo4jChangeDataCaptureNodePayloadAfter getAfter() {
    return after;
  }

  public void setAfter(Neo4jChangeDataCaptureNodePayloadAfter after) {
    this.after = after;
  }


  public Neo4jChangeDataCaptureNodePayload before(String before) {
    this.before = before;
    return this;
  }

  /**
   * Get before
   * @return before
   */
  @javax.annotation.Nonnull
  public String getBefore() {
    return before;
  }

  public void setBefore(String before) {
    this.before = before;
  }


  public Neo4jChangeDataCaptureNodePayload id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Neo4jChangeDataCaptureNodePayload type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Neo4jChangeDataCaptureNodePayload neo4jChangeDataCaptureNodePayload = (Neo4jChangeDataCaptureNodePayload) o;
    return Objects.equals(this.after, neo4jChangeDataCaptureNodePayload.after) &&
        Objects.equals(this.before, neo4jChangeDataCaptureNodePayload.before) &&
        Objects.equals(this.id, neo4jChangeDataCaptureNodePayload.id) &&
        Objects.equals(this.type, neo4jChangeDataCaptureNodePayload.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, before, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jChangeDataCaptureNodePayload {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("after");
    openapiFields.add("before");
    openapiFields.add("id");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("after");
    openapiRequiredFields.add("before");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Neo4jChangeDataCaptureNodePayload
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Neo4jChangeDataCaptureNodePayload.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Neo4jChangeDataCaptureNodePayload is not found in the empty JSON string", Neo4jChangeDataCaptureNodePayload.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Neo4jChangeDataCaptureNodePayload.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Neo4jChangeDataCaptureNodePayload` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Neo4jChangeDataCaptureNodePayload.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `after`
      Neo4jChangeDataCaptureNodePayloadAfter.validateJsonElement(jsonObj.get("after"));
      if (!jsonObj.get("before").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `before` to be a primitive type in the JSON string but got `%s`", jsonObj.get("before").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Neo4jChangeDataCaptureNodePayload.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Neo4jChangeDataCaptureNodePayload' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Neo4jChangeDataCaptureNodePayload> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Neo4jChangeDataCaptureNodePayload.class));

       return (TypeAdapter<T>) new TypeAdapter<Neo4jChangeDataCaptureNodePayload>() {
           @Override
           public void write(JsonWriter out, Neo4jChangeDataCaptureNodePayload value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Neo4jChangeDataCaptureNodePayload read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Neo4jChangeDataCaptureNodePayload given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Neo4jChangeDataCaptureNodePayload
   * @throws IOException if the JSON string is invalid with respect to Neo4jChangeDataCaptureNodePayload
   */
  public static Neo4jChangeDataCaptureNodePayload fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Neo4jChangeDataCaptureNodePayload.class);
  }

  /**
   * Convert an instance of Neo4jChangeDataCaptureNodePayload to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

