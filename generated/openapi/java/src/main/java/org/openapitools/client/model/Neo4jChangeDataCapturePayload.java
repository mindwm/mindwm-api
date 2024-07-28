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
import org.openapitools.client.model.Neo4jChangeDataCaptureNodePayload;
import org.openapitools.client.model.Neo4jChangeDataCaptureRelationshipPayload;
import org.openapitools.client.model.Neo4jChangeDataCaptureRelationshipPayloadEnd;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-28T13:33:10.984109087Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jChangeDataCapturePayload extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Neo4jChangeDataCapturePayload.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Neo4jChangeDataCapturePayload.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Neo4jChangeDataCapturePayload' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Neo4jChangeDataCaptureNodePayload> adapterNeo4jChangeDataCaptureNodePayload = gson.getDelegateAdapter(this, TypeToken.get(Neo4jChangeDataCaptureNodePayload.class));
            final TypeAdapter<Neo4jChangeDataCaptureRelationshipPayload> adapterNeo4jChangeDataCaptureRelationshipPayload = gson.getDelegateAdapter(this, TypeToken.get(Neo4jChangeDataCaptureRelationshipPayload.class));

            return (TypeAdapter<T>) new TypeAdapter<Neo4jChangeDataCapturePayload>() {
                @Override
                public void write(JsonWriter out, Neo4jChangeDataCapturePayload value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Neo4jChangeDataCaptureNodePayload`
                    if (value.getActualInstance() instanceof Neo4jChangeDataCaptureNodePayload) {
                        JsonElement element = adapterNeo4jChangeDataCaptureNodePayload.toJsonTree((Neo4jChangeDataCaptureNodePayload)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Neo4jChangeDataCaptureRelationshipPayload`
                    if (value.getActualInstance() instanceof Neo4jChangeDataCaptureRelationshipPayload) {
                        JsonElement element = adapterNeo4jChangeDataCaptureRelationshipPayload.toJsonTree((Neo4jChangeDataCaptureRelationshipPayload)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: Neo4jChangeDataCaptureNodePayload, Neo4jChangeDataCaptureRelationshipPayload");
                }

                @Override
                public Neo4jChangeDataCapturePayload read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Neo4jChangeDataCaptureNodePayload
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Neo4jChangeDataCaptureNodePayload.validateJsonElement(jsonElement);
                        actualAdapter = adapterNeo4jChangeDataCaptureNodePayload;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Neo4jChangeDataCaptureNodePayload'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Neo4jChangeDataCaptureNodePayload failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Neo4jChangeDataCaptureNodePayload'", e);
                    }
                    // deserialize Neo4jChangeDataCaptureRelationshipPayload
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Neo4jChangeDataCaptureRelationshipPayload.validateJsonElement(jsonElement);
                        actualAdapter = adapterNeo4jChangeDataCaptureRelationshipPayload;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Neo4jChangeDataCaptureRelationshipPayload'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Neo4jChangeDataCaptureRelationshipPayload failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Neo4jChangeDataCaptureRelationshipPayload'", e);
                    }

                    if (match == 1) {
                        Neo4jChangeDataCapturePayload ret = new Neo4jChangeDataCapturePayload();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for Neo4jChangeDataCapturePayload: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public Neo4jChangeDataCapturePayload() {
        super("oneOf", Boolean.FALSE);
    }

    public Neo4jChangeDataCapturePayload(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Neo4jChangeDataCaptureNodePayload", Neo4jChangeDataCaptureNodePayload.class);
        schemas.put("Neo4jChangeDataCaptureRelationshipPayload", Neo4jChangeDataCaptureRelationshipPayload.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return Neo4jChangeDataCapturePayload.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Neo4jChangeDataCaptureNodePayload, Neo4jChangeDataCaptureRelationshipPayload
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Neo4jChangeDataCaptureNodePayload) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Neo4jChangeDataCaptureRelationshipPayload) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Neo4jChangeDataCaptureNodePayload, Neo4jChangeDataCaptureRelationshipPayload");
    }

    /**
     * Get the actual instance, which can be the following:
     * Neo4jChangeDataCaptureNodePayload, Neo4jChangeDataCaptureRelationshipPayload
     *
     * @return The actual instance (Neo4jChangeDataCaptureNodePayload, Neo4jChangeDataCaptureRelationshipPayload)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Neo4jChangeDataCaptureNodePayload`. If the actual instance is not `Neo4jChangeDataCaptureNodePayload`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Neo4jChangeDataCaptureNodePayload`
     * @throws ClassCastException if the instance is not `Neo4jChangeDataCaptureNodePayload`
     */
    public Neo4jChangeDataCaptureNodePayload getNeo4jChangeDataCaptureNodePayload() throws ClassCastException {
        return (Neo4jChangeDataCaptureNodePayload)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Neo4jChangeDataCaptureRelationshipPayload`. If the actual instance is not `Neo4jChangeDataCaptureRelationshipPayload`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Neo4jChangeDataCaptureRelationshipPayload`
     * @throws ClassCastException if the instance is not `Neo4jChangeDataCaptureRelationshipPayload`
     */
    public Neo4jChangeDataCaptureRelationshipPayload getNeo4jChangeDataCaptureRelationshipPayload() throws ClassCastException {
        return (Neo4jChangeDataCaptureRelationshipPayload)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Neo4jChangeDataCapturePayload
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with Neo4jChangeDataCaptureNodePayload
        try {
            Neo4jChangeDataCaptureNodePayload.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Neo4jChangeDataCaptureNodePayload failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Neo4jChangeDataCaptureRelationshipPayload
        try {
            Neo4jChangeDataCaptureRelationshipPayload.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Neo4jChangeDataCaptureRelationshipPayload failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for Neo4jChangeDataCapturePayload with oneOf schemas: Neo4jChangeDataCaptureNodePayload, Neo4jChangeDataCaptureRelationshipPayload. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of Neo4jChangeDataCapturePayload given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Neo4jChangeDataCapturePayload
     * @throws IOException if the JSON string is invalid with respect to Neo4jChangeDataCapturePayload
     */
    public static Neo4jChangeDataCapturePayload fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Neo4jChangeDataCapturePayload.class);
    }

    /**
     * Convert an instance of Neo4jChangeDataCapturePayload to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

