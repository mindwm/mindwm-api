package org.openapitools.server.model;

import org.openapitools.server.model.Neo4jCaptureDataChangeNodePayloadAfter;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Neo4jCaptureDataChangeNodePayload   {

    private Neo4jCaptureDataChangeNodePayloadAfter after;
    private String before;
    private String id;
    private String type;

    /**
     * Default constructor.
     */
    public Neo4jCaptureDataChangeNodePayload() {
    // JSON-B / Jackson
    }

    /**
     * Create Neo4jCaptureDataChangeNodePayload.
     *
     * @param after after
     * @param before before
     * @param id id
     * @param type type
     */
    public Neo4jCaptureDataChangeNodePayload(
        Neo4jCaptureDataChangeNodePayloadAfter after, 
        String before, 
        String id, 
        String type
    ) {
        this.after = after;
        this.before = before;
        this.id = id;
        this.type = type;
    }



    /**
     * Get after
     * @return after
     */
    public Neo4jCaptureDataChangeNodePayloadAfter getAfter() {
        return after;
    }

    public void setAfter(Neo4jCaptureDataChangeNodePayloadAfter after) {
        this.after = after;
    }

    /**
     * Get before
     * @return before
     */
    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
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
     * Get type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Neo4jCaptureDataChangeNodePayload {\n");
        
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

