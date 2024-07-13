package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Neo4jCaptureDataChangeRelationshipPayloadEnd   {

    private String id;
    private Map<String, Object> ids = new HashMap<>();
    private List<String> labels = new ArrayList<>();

    /**
     * Default constructor.
     */
    public Neo4jCaptureDataChangeRelationshipPayloadEnd() {
    // JSON-B / Jackson
    }

    /**
     * Create Neo4jCaptureDataChangeRelationshipPayloadEnd.
     *
     * @param id id
     * @param ids ids
     * @param labels labels
     */
    public Neo4jCaptureDataChangeRelationshipPayloadEnd(
        String id, 
        Map<String, Object> ids, 
        List<String> labels
    ) {
        this.id = id;
        this.ids = ids;
        this.labels = labels;
    }



    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get ids
     * @return ids
     */
    public Map<String, Object> getIds() {
        return ids;
    }

    public void setIds(Map<String, Object> ids) {
        this.ids = ids;
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
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

