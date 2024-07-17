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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.Neo4jCaptureDataChangeMeta;
import org.openapitools.client.model.Neo4jCaptureDataChangeNodePayload;
import org.openapitools.client.model.Neo4jCaptureDataChangeSchema;

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
 * GraphNodeAllOfData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T13:48:07.311557187Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class GraphNodeAllOfData {
  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private Object headers;

  public static final String SERIALIZED_NAME_MESSAGE_KEY = "message_key";
  @SerializedName(SERIALIZED_NAME_MESSAGE_KEY)
  private String messageKey;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Neo4jCaptureDataChangeMeta meta;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_PARTITION = "partition";
  @SerializedName(SERIALIZED_NAME_PARTITION)
  private Integer partition;

  public static final String SERIALIZED_NAME_SOURCE_TYPE = "source_type";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  private String sourceType;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private Neo4jCaptureDataChangeSchema schema;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private Neo4jCaptureDataChangeNodePayload payload;

  public GraphNodeAllOfData() {
  }

  public GraphNodeAllOfData headers(Object headers) {
    this.headers = headers;
    return this;
  }

  /**
   * Get headers
   * @return headers
   */
  @javax.annotation.Nonnull
  public Object getHeaders() {
    return headers;
  }

  public void setHeaders(Object headers) {
    this.headers = headers;
  }


  public GraphNodeAllOfData messageKey(String messageKey) {
    this.messageKey = messageKey;
    return this;
  }

  /**
   * Get messageKey
   * @return messageKey
   */
  @javax.annotation.Nonnull
  public String getMessageKey() {
    return messageKey;
  }

  public void setMessageKey(String messageKey) {
    this.messageKey = messageKey;
  }


  public GraphNodeAllOfData meta(Neo4jCaptureDataChangeMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
   */
  @javax.annotation.Nonnull
  public Neo4jCaptureDataChangeMeta getMeta() {
    return meta;
  }

  public void setMeta(Neo4jCaptureDataChangeMeta meta) {
    this.meta = meta;
  }


  public GraphNodeAllOfData offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
   */
  @javax.annotation.Nonnull
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public GraphNodeAllOfData partition(Integer partition) {
    this.partition = partition;
    return this;
  }

  /**
   * Get partition
   * @return partition
   */
  @javax.annotation.Nonnull
  public Integer getPartition() {
    return partition;
  }

  public void setPartition(Integer partition) {
    this.partition = partition;
  }


  public GraphNodeAllOfData sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   * @return sourceType
   */
  @javax.annotation.Nonnull
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }


  public GraphNodeAllOfData timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public GraphNodeAllOfData topic(String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * Get topic
   * @return topic
   */
  @javax.annotation.Nonnull
  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }


  public GraphNodeAllOfData schema(Neo4jCaptureDataChangeSchema schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Get schema
   * @return schema
   */
  @javax.annotation.Nonnull
  public Neo4jCaptureDataChangeSchema getSchema() {
    return schema;
  }

  public void setSchema(Neo4jCaptureDataChangeSchema schema) {
    this.schema = schema;
  }


  public GraphNodeAllOfData payload(Neo4jCaptureDataChangeNodePayload payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
   */
  @javax.annotation.Nonnull
  public Neo4jCaptureDataChangeNodePayload getPayload() {
    return payload;
  }

  public void setPayload(Neo4jCaptureDataChangeNodePayload payload) {
    this.payload = payload;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphNodeAllOfData graphNodeAllOfData = (GraphNodeAllOfData) o;
    return Objects.equals(this.headers, graphNodeAllOfData.headers) &&
        Objects.equals(this.messageKey, graphNodeAllOfData.messageKey) &&
        Objects.equals(this.meta, graphNodeAllOfData.meta) &&
        Objects.equals(this.offset, graphNodeAllOfData.offset) &&
        Objects.equals(this.partition, graphNodeAllOfData.partition) &&
        Objects.equals(this.sourceType, graphNodeAllOfData.sourceType) &&
        Objects.equals(this.timestamp, graphNodeAllOfData.timestamp) &&
        Objects.equals(this.topic, graphNodeAllOfData.topic) &&
        Objects.equals(this.schema, graphNodeAllOfData.schema) &&
        Objects.equals(this.payload, graphNodeAllOfData.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, messageKey, meta, offset, partition, sourceType, timestamp, topic, schema, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphNodeAllOfData {\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    messageKey: ").append(toIndentedString(messageKey)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
    openapiFields.add("headers");
    openapiFields.add("message_key");
    openapiFields.add("meta");
    openapiFields.add("offset");
    openapiFields.add("partition");
    openapiFields.add("source_type");
    openapiFields.add("timestamp");
    openapiFields.add("topic");
    openapiFields.add("schema");
    openapiFields.add("payload");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("headers");
    openapiRequiredFields.add("message_key");
    openapiRequiredFields.add("meta");
    openapiRequiredFields.add("offset");
    openapiRequiredFields.add("partition");
    openapiRequiredFields.add("source_type");
    openapiRequiredFields.add("timestamp");
    openapiRequiredFields.add("topic");
    openapiRequiredFields.add("schema");
    openapiRequiredFields.add("payload");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GraphNodeAllOfData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GraphNodeAllOfData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GraphNodeAllOfData is not found in the empty JSON string", GraphNodeAllOfData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GraphNodeAllOfData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GraphNodeAllOfData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GraphNodeAllOfData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("message_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message_key").toString()));
      }
      // validate the required field `meta`
      Neo4jCaptureDataChangeMeta.validateJsonElement(jsonObj.get("meta"));
      if (!jsonObj.get("source_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_type").toString()));
      }
      if (!jsonObj.get("topic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topic").toString()));
      }
      // validate the required field `schema`
      Neo4jCaptureDataChangeSchema.validateJsonElement(jsonObj.get("schema"));
      // validate the required field `payload`
      Neo4jCaptureDataChangeNodePayload.validateJsonElement(jsonObj.get("payload"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GraphNodeAllOfData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GraphNodeAllOfData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GraphNodeAllOfData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GraphNodeAllOfData.class));

       return (TypeAdapter<T>) new TypeAdapter<GraphNodeAllOfData>() {
           @Override
           public void write(JsonWriter out, GraphNodeAllOfData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GraphNodeAllOfData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GraphNodeAllOfData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GraphNodeAllOfData
   * @throws IOException if the JSON string is invalid with respect to GraphNodeAllOfData
   */
  public static GraphNodeAllOfData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GraphNodeAllOfData.class);
  }

  /**
   * Convert an instance of GraphNodeAllOfData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

