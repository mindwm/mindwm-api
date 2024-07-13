package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Neo4jCaptureDataChangeNodePayloadAfter   {

    private List<String> labels = new ArrayList<>();
    private Map<String, Object> properties = new HashMap<>();

    /**
     * Default constructor.
     */
    public Neo4jCaptureDataChangeNodePayloadAfter() {
    // JSON-B / Jackson
    }

    /**
     * Create Neo4jCaptureDataChangeNodePayloadAfter.
     *
     * @param labels labels
     * @param properties properties
     */
    public Neo4jCaptureDataChangeNodePayloadAfter(
        List<String> labels, 
        Map<String, Object> properties
    ) {
        this.labels = labels;
        this.properties = properties;
    }



    /**
     * Get labels
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
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
        sb.append("class Neo4jCaptureDataChangeNodePayloadAfter {\n");
        
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

