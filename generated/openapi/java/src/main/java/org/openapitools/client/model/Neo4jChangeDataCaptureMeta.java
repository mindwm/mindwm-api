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
import org.openapitools.client.model.Neo4jChangeDataCaptureMetaSource;

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
 * Neo4jChangeDataCaptureMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-22T14:59:53.479770099Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jChangeDataCaptureMeta {
  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private Neo4jChangeDataCaptureMetaSource source;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Integer timestamp;

  public static final String SERIALIZED_NAME_TX_EVENT_ID = "txEventId";
  @SerializedName(SERIALIZED_NAME_TX_EVENT_ID)
  private Integer txEventId;

  public static final String SERIALIZED_NAME_TX_EVENTS_COUNT = "txEventsCount";
  @SerializedName(SERIALIZED_NAME_TX_EVENTS_COUNT)
  private Integer txEventsCount;

  public static final String SERIALIZED_NAME_TX_ID = "txId";
  @SerializedName(SERIALIZED_NAME_TX_ID)
  private Integer txId;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public Neo4jChangeDataCaptureMeta() {
  }

  public Neo4jChangeDataCaptureMeta operation(String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   */
  @javax.annotation.Nonnull
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }


  public Neo4jChangeDataCaptureMeta source(Neo4jChangeDataCaptureMetaSource source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   */
  @javax.annotation.Nonnull
  public Neo4jChangeDataCaptureMetaSource getSource() {
    return source;
  }

  public void setSource(Neo4jChangeDataCaptureMetaSource source) {
    this.source = source;
  }


  public Neo4jChangeDataCaptureMeta timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   */
  @javax.annotation.Nonnull
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }


  public Neo4jChangeDataCaptureMeta txEventId(Integer txEventId) {
    this.txEventId = txEventId;
    return this;
  }

  /**
   * Get txEventId
   * @return txEventId
   */
  @javax.annotation.Nonnull
  public Integer getTxEventId() {
    return txEventId;
  }

  public void setTxEventId(Integer txEventId) {
    this.txEventId = txEventId;
  }


  public Neo4jChangeDataCaptureMeta txEventsCount(Integer txEventsCount) {
    this.txEventsCount = txEventsCount;
    return this;
  }

  /**
   * Get txEventsCount
   * @return txEventsCount
   */
  @javax.annotation.Nonnull
  public Integer getTxEventsCount() {
    return txEventsCount;
  }

  public void setTxEventsCount(Integer txEventsCount) {
    this.txEventsCount = txEventsCount;
  }


  public Neo4jChangeDataCaptureMeta txId(Integer txId) {
    this.txId = txId;
    return this;
  }

  /**
   * Get txId
   * @return txId
   */
  @javax.annotation.Nonnull
  public Integer getTxId() {
    return txId;
  }

  public void setTxId(Integer txId) {
    this.txId = txId;
  }


  public Neo4jChangeDataCaptureMeta username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @javax.annotation.Nonnull
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Neo4jChangeDataCaptureMeta neo4jChangeDataCaptureMeta = (Neo4jChangeDataCaptureMeta) o;
    return Objects.equals(this.operation, neo4jChangeDataCaptureMeta.operation) &&
        Objects.equals(this.source, neo4jChangeDataCaptureMeta.source) &&
        Objects.equals(this.timestamp, neo4jChangeDataCaptureMeta.timestamp) &&
        Objects.equals(this.txEventId, neo4jChangeDataCaptureMeta.txEventId) &&
        Objects.equals(this.txEventsCount, neo4jChangeDataCaptureMeta.txEventsCount) &&
        Objects.equals(this.txId, neo4jChangeDataCaptureMeta.txId) &&
        Objects.equals(this.username, neo4jChangeDataCaptureMeta.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, source, timestamp, txEventId, txEventsCount, txId, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Neo4jChangeDataCaptureMeta {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    txEventId: ").append(toIndentedString(txEventId)).append("\n");
    sb.append("    txEventsCount: ").append(toIndentedString(txEventsCount)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("operation");
    openapiFields.add("source");
    openapiFields.add("timestamp");
    openapiFields.add("txEventId");
    openapiFields.add("txEventsCount");
    openapiFields.add("txId");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("operation");
    openapiRequiredFields.add("source");
    openapiRequiredFields.add("timestamp");
    openapiRequiredFields.add("txEventId");
    openapiRequiredFields.add("txEventsCount");
    openapiRequiredFields.add("txId");
    openapiRequiredFields.add("username");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Neo4jChangeDataCaptureMeta
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Neo4jChangeDataCaptureMeta.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Neo4jChangeDataCaptureMeta is not found in the empty JSON string", Neo4jChangeDataCaptureMeta.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Neo4jChangeDataCaptureMeta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Neo4jChangeDataCaptureMeta` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Neo4jChangeDataCaptureMeta.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("operation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation").toString()));
      }
      // validate the required field `source`
      Neo4jChangeDataCaptureMetaSource.validateJsonElement(jsonObj.get("source"));
      if (!jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Neo4jChangeDataCaptureMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Neo4jChangeDataCaptureMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Neo4jChangeDataCaptureMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Neo4jChangeDataCaptureMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<Neo4jChangeDataCaptureMeta>() {
           @Override
           public void write(JsonWriter out, Neo4jChangeDataCaptureMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Neo4jChangeDataCaptureMeta read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Neo4jChangeDataCaptureMeta given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Neo4jChangeDataCaptureMeta
   * @throws IOException if the JSON string is invalid with respect to Neo4jChangeDataCaptureMeta
   */
  public static Neo4jChangeDataCaptureMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Neo4jChangeDataCaptureMeta.class);
  }

  /**
   * Convert an instance of Neo4jChangeDataCaptureMeta to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

