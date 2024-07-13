package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Neo4jCaptureDataChangeSchema   {

    private Map<String, Object> constraints = new HashMap<>();
    private Map<String, Object> properties = new HashMap<>();

    /**
     * Default constructor.
     */
    public Neo4jCaptureDataChangeSchema() {
    // JSON-B / Jackson
    }

    /**
     * Create Neo4jCaptureDataChangeSchema.
     *
     * @param constraints constraints
     * @param properties properties
     */
    public Neo4jCaptureDataChangeSchema(
        Map<String, Object> constraints, 
        Map<String, Object> properties
    ) {
        this.constraints = constraints;
        this.properties = properties;
    }



    /**
     * Get constraints
     * @return constraints
     */
    public Map<String, Object> getConstraints() {
        return constraints;
    }

    public void setConstraints(Map<String, Object> constraints) {
        this.constraints = constraints;
    }

    /**
     * Get properties
     * @return properties
     */
    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Neo4jCaptureDataChangeSchema {\n");
        
        sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

