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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * Neo4jCaptureDataChangeRelationshipPayloadEnd
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-16T18:17:42.271765641Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChangeRelationshipPayloadEnd {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private Map<String, Object> ids = new HashMap<>();

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels = new ArrayList<>();

  public Neo4jCaptureDataChangeRelationshipPayloadEnd() {
  }

  public Neo4jCaptureDataChangeRelationshipPayloadEnd id(String id) {
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


  public Neo4jCaptureDataChangeRelationshipPayloadEnd ids(Map<String, Object> ids) {
    this.ids = ids;
    return this;
  }

  public Neo4jCaptureDataChangeRelationshipPayloadEnd putIdsItem(String key, Object idsItem) {
    if (this.ids == null) {
      this.ids = new HashMap<>();
    }
    this.ids.put(key, idsItem);
    return this;
  }

  /**
   * Get ids
   * @return ids
   */
  @javax.annotation.Nonnull
  public Map<String, Object> getIds() {
    return ids;
  }

  public void setIds(Map<String, Object> ids) {
    this.ids = ids;
  }


  public Neo4jCaptureDataChangeRelationshipPayloadEnd labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public Neo4jCaptureDataChangeRelationshipPayloadEnd addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   */
  @javax.annotation.Nonnull
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Neo4jCaptureDataChangeRelationshipPayloadEnd neo4jCaptureDataChangeRelationshipPayloadEnd = (Neo4jCaptureDataChangeRelationshipPayloadEnd) o;
    return Objects.equals(this.id, neo4jCaptureDataChangeRelationshipPayloadEnd.id) &&
        Objects.equals(this.ids, neo4jCaptureDataChangeRelationshipPayloadEnd.ids) &&
        Objects.equals(this.labels, neo4jCaptureDataChangeRelationshipPayloadEnd.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ids, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jCaptureDataChangeRelationshipPayloadEnd {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("ids");
    openapiFields.add("labels");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("ids");
    openapiRequiredFields.add("labels");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Neo4jCaptureDataChangeRelationshipPayloadEnd
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Neo4jCaptureDataChangeRelationshipPayloadEnd.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Neo4jCaptureDataChangeRelationshipPayloadEnd is not found in the empty JSON string", Neo4jCaptureDataChangeRelationshipPayloadEnd.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Neo4jCaptureDataChangeRelationshipPayloadEnd.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Neo4jCaptureDataChangeRelationshipPayloadEnd` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Neo4jCaptureDataChangeRelationshipPayloadEnd.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("labels") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("labels").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `labels` to be an array in the JSON string but got `%s`", jsonObj.get("labels").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Neo4jCaptureDataChangeRelationshipPayloadEnd.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Neo4jCaptureDataChangeRelationshipPayloadEnd' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Neo4jCaptureDataChangeRelationshipPayloadEnd> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Neo4jCaptureDataChangeRelationshipPayloadEnd.class));

       return (TypeAdapter<T>) new TypeAdapter<Neo4jCaptureDataChangeRelationshipPayloadEnd>() {
           @Override
           public void write(JsonWriter out, Neo4jCaptureDataChangeRelationshipPayloadEnd value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Neo4jCaptureDataChangeRelationshipPayloadEnd read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Neo4jCaptureDataChangeRelationshipPayloadEnd given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Neo4jCaptureDataChangeRelationshipPayloadEnd
   * @throws IOException if the JSON string is invalid with respect to Neo4jCaptureDataChangeRelationshipPayloadEnd
   */
  public static Neo4jCaptureDataChangeRelationshipPayloadEnd fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Neo4jCaptureDataChangeRelationshipPayloadEnd.class);
  }

  /**
   * Convert an instance of Neo4jCaptureDataChangeRelationshipPayloadEnd to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

