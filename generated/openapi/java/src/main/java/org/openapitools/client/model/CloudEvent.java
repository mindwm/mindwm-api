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
import java.net.URI;
import java.time.OffsetDateTime;
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
 * CloudEvents Specification JSON Schema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-23T17:16:46.530081047Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class CloudEvent {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_SPECVERSION = "specversion";
  @SerializedName(SERIALIZED_NAME_SPECVERSION)
  private String specversion;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DATACONTENTTYPE = "datacontenttype";
  @SerializedName(SERIALIZED_NAME_DATACONTENTTYPE)
  private String datacontenttype;

  public static final String SERIALIZED_NAME_DATASCHEMA = "dataschema";
  @SerializedName(SERIALIZED_NAME_DATASCHEMA)
  private URI dataschema;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private OffsetDateTime time;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data;

  public static final String SERIALIZED_NAME_DATA_BASE64 = "data_base64";
  @SerializedName(SERIALIZED_NAME_DATA_BASE64)
  private String dataBase64;

  public CloudEvent() {
  }

  public CloudEvent id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies the event.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public CloudEvent source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Identifies the context in which an event happened.
   * @return source
   */
  @javax.annotation.Nonnull
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  public CloudEvent specversion(String specversion) {
    this.specversion = specversion;
    return this;
  }

  /**
   * The version of the CloudEvents specification which the event uses.
   * @return specversion
   */
  @javax.annotation.Nonnull
  public String getSpecversion() {
    return specversion;
  }

  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }


  public CloudEvent type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Describes the type of event related to the originating occurrence.
   * @return type
   */
  @javax.annotation.Nonnull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public CloudEvent datacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
    return this;
  }

  /**
   * Content type of the data value. Must adhere to RFC 2046 format.
   * @return datacontenttype
   */
  @javax.annotation.Nullable
  public String getDatacontenttype() {
    return datacontenttype;
  }

  public void setDatacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
  }


  public CloudEvent dataschema(URI dataschema) {
    this.dataschema = dataschema;
    return this;
  }

  /**
   * Identifies the schema that data adheres to.
   * @return dataschema
   */
  @javax.annotation.Nullable
  public URI getDataschema() {
    return dataschema;
  }

  public void setDataschema(URI dataschema) {
    this.dataschema = dataschema;
  }


  public CloudEvent subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Describes the subject of the event in the context of the event producer (identified by source).
   * @return subject
   */
  @javax.annotation.Nullable
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  public CloudEvent time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
   * @return time
   */
  @javax.annotation.Nullable
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }


  public CloudEvent data(Object data) {
    this.data = data;
    return this;
  }

  /**
   * The event payload.
   * @return data
   */
  @javax.annotation.Nullable
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }


  public CloudEvent dataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
    return this;
  }

  /**
   * Base64 encoded event payload. Must adhere to RFC4648.
   * @return dataBase64
   */
  @javax.annotation.Nullable
  public String getDataBase64() {
    return dataBase64;
  }

  public void setDataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudEvent cloudEvent = (CloudEvent) o;
    return Objects.equals(this.id, cloudEvent.id) &&
        Objects.equals(this.source, cloudEvent.source) &&
        Objects.equals(this.specversion, cloudEvent.specversion) &&
        Objects.equals(this.type, cloudEvent.type) &&
        Objects.equals(this.datacontenttype, cloudEvent.datacontenttype) &&
        Objects.equals(this.dataschema, cloudEvent.dataschema) &&
        Objects.equals(this.subject, cloudEvent.subject) &&
        Objects.equals(this.time, cloudEvent.time) &&
        Objects.equals(this.data, cloudEvent.data) &&
        Objects.equals(this.dataBase64, cloudEvent.dataBase64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, specversion, type, datacontenttype, dataschema, subject, time, data, dataBase64);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    specversion: ").append(toIndentedString(specversion)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    datacontenttype: ").append(toIndentedString(datacontenttype)).append("\n");
    sb.append("    dataschema: ").append(toIndentedString(dataschema)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    dataBase64: ").append(toIndentedString(dataBase64)).append("\n");
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
    openapiFields.add("source");
    openapiFields.add("specversion");
    openapiFields.add("type");
    openapiFields.add("datacontenttype");
    openapiFields.add("dataschema");
    openapiFields.add("subject");
    openapiFields.add("time");
    openapiFields.add("data");
    openapiFields.add("data_base64");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("source");
    openapiRequiredFields.add("specversion");
    openapiRequiredFields.add("type");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CloudEvent
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CloudEvent.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudEvent is not found in the empty JSON string", CloudEvent.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CloudEvent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudEvent` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CloudEvent.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if (!jsonObj.get("specversion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specversion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specversion").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("datacontenttype") != null && !jsonObj.get("datacontenttype").isJsonNull()) && !jsonObj.get("datacontenttype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datacontenttype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datacontenttype").toString()));
      }
      if ((jsonObj.get("dataschema") != null && !jsonObj.get("dataschema").isJsonNull()) && !jsonObj.get("dataschema").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataschema` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataschema").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if ((jsonObj.get("data_base64") != null && !jsonObj.get("data_base64").isJsonNull()) && !jsonObj.get("data_base64").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_base64` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_base64").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudEvent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudEvent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudEvent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudEvent.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudEvent>() {
           @Override
           public void write(JsonWriter out, CloudEvent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudEvent read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CloudEvent given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CloudEvent
   * @throws IOException if the JSON string is invalid with respect to CloudEvent
   */
  public static CloudEvent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudEvent.class);
  }

  /**
   * Convert an instance of CloudEvent to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
