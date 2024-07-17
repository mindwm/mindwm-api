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
import org.openapitools.client.model.Neo4jCaptureDataChangeNodePayload;
import org.openapitools.client.model.Neo4jCaptureDataChangeRelationshipPayload;
import org.openapitools.client.model.Neo4jCaptureDataChangeRelationshipPayloadEnd;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-17T16:07:34.486843044Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class Neo4jCaptureDataChangePayload extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Neo4jCaptureDataChangePayload.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Neo4jCaptureDataChangePayload.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Neo4jCaptureDataChangePayload' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Neo4jCaptureDataChangeNodePayload> adapterNeo4jCaptureDataChangeNodePayload = gson.getDelegateAdapter(this, TypeToken.get(Neo4jCaptureDataChangeNodePayload.class));
            final TypeAdapter<Neo4jCaptureDataChangeRelationshipPayload> adapterNeo4jCaptureDataChangeRelationshipPayload = gson.getDelegateAdapter(this, TypeToken.get(Neo4jCaptureDataChangeRelationshipPayload.class));

            return (TypeAdapter<T>) new TypeAdapter<Neo4jCaptureDataChangePayload>() {
                @Override
                public void write(JsonWriter out, Neo4jCaptureDataChangePayload value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `Neo4jCaptureDataChangeNodePayload`
                    if (value.getActualInstance() instanceof Neo4jCaptureDataChangeNodePayload) {
                        JsonElement element = adapterNeo4jCaptureDataChangeNodePayload.toJsonTree((Neo4jCaptureDataChangeNodePayload)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Neo4jCaptureDataChangeRelationshipPayload`
                    if (value.getActualInstance() instanceof Neo4jCaptureDataChangeRelationshipPayload) {
                        JsonElement element = adapterNeo4jCaptureDataChangeRelationshipPayload.toJsonTree((Neo4jCaptureDataChangeRelationshipPayload)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: Neo4jCaptureDataChangeNodePayload, Neo4jCaptureDataChangeRelationshipPayload");
                }

                @Override
                public Neo4jCaptureDataChangePayload read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize Neo4jCaptureDataChangeNodePayload
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Neo4jCaptureDataChangeNodePayload.validateJsonElement(jsonElement);
                        actualAdapter = adapterNeo4jCaptureDataChangeNodePayload;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Neo4jCaptureDataChangeNodePayload'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Neo4jCaptureDataChangeNodePayload failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Neo4jCaptureDataChangeNodePayload'", e);
                    }
                    // deserialize Neo4jCaptureDataChangeRelationshipPayload
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Neo4jCaptureDataChangeRelationshipPayload.validateJsonElement(jsonElement);
                        actualAdapter = adapterNeo4jCaptureDataChangeRelationshipPayload;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Neo4jCaptureDataChangeRelationshipPayload'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Neo4jCaptureDataChangeRelationshipPayload failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Neo4jCaptureDataChangeRelationshipPayload'", e);
                    }

                    if (match == 1) {
                        Neo4jCaptureDataChangePayload ret = new Neo4jCaptureDataChangePayload();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for Neo4jCaptureDataChangePayload: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public Neo4jCaptureDataChangePayload() {
        super("oneOf", Boolean.FALSE);
    }

    public Neo4jCaptureDataChangePayload(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Neo4jCaptureDataChangeNodePayload", Neo4jCaptureDataChangeNodePayload.class);
        schemas.put("Neo4jCaptureDataChangeRelationshipPayload", Neo4jCaptureDataChangeRelationshipPayload.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return Neo4jCaptureDataChangePayload.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Neo4jCaptureDataChangeNodePayload, Neo4jCaptureDataChangeRelationshipPayload
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof Neo4jCaptureDataChangeNodePayload) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Neo4jCaptureDataChangeRelationshipPayload) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Neo4jCaptureDataChangeNodePayload, Neo4jCaptureDataChangeRelationshipPayload");
    }

    /**
     * Get the actual instance, which can be the following:
     * Neo4jCaptureDataChangeNodePayload, Neo4jCaptureDataChangeRelationshipPayload
     *
     * @return The actual instance (Neo4jCaptureDataChangeNodePayload, Neo4jCaptureDataChangeRelationshipPayload)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Neo4jCaptureDataChangeNodePayload`. If the actual instance is not `Neo4jCaptureDataChangeNodePayload`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Neo4jCaptureDataChangeNodePayload`
     * @throws ClassCastException if the instance is not `Neo4jCaptureDataChangeNodePayload`
     */
    public Neo4jCaptureDataChangeNodePayload getNeo4jCaptureDataChangeNodePayload() throws ClassCastException {
        return (Neo4jCaptureDataChangeNodePayload)super.getActualInstance();
    }
    /**
     * Get the actual instance of `Neo4jCaptureDataChangeRelationshipPayload`. If the actual instance is not `Neo4jCaptureDataChangeRelationshipPayload`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Neo4jCaptureDataChangeRelationshipPayload`
     * @throws ClassCastException if the instance is not `Neo4jCaptureDataChangeRelationshipPayload`
     */
    public Neo4jCaptureDataChangeRelationshipPayload getNeo4jCaptureDataChangeRelationshipPayload() throws ClassCastException {
        return (Neo4jCaptureDataChangeRelationshipPayload)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Neo4jCaptureDataChangePayload
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with Neo4jCaptureDataChangeNodePayload
        try {
            Neo4jCaptureDataChangeNodePayload.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Neo4jCaptureDataChangeNodePayload failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Neo4jCaptureDataChangeRelationshipPayload
        try {
            Neo4jCaptureDataChangeRelationshipPayload.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Neo4jCaptureDataChangeRelationshipPayload failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for Neo4jCaptureDataChangePayload with oneOf schemas: Neo4jCaptureDataChangeNodePayload, Neo4jCaptureDataChangeRelationshipPayload. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of Neo4jCaptureDataChangePayload given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Neo4jCaptureDataChangePayload
     * @throws IOException if the JSON string is invalid with respect to Neo4jCaptureDataChangePayload
     */
    public static Neo4jCaptureDataChangePayload fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Neo4jCaptureDataChangePayload.class);
    }

    /**
     * Convert an instance of Neo4jCaptureDataChangePayload to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

