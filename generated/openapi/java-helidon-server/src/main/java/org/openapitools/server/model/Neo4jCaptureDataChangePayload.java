package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.Neo4jCaptureDataChangeNodePayload;
import org.openapitools.server.model.Neo4jCaptureDataChangeRelationshipPayload;
import org.openapitools.server.model.Neo4jCaptureDataChangeRelationshipPayloadEnd;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Neo4jCaptureDataChangePayload   {

    private Object after;
    private String before;
    private String id;
    private String type;
    private Neo4jCaptureDataChangeRelationshipPayloadEnd end;
    private String label;
    private Neo4jCaptureDataChangeRelationshipPayloadEnd start;

    /**
     * Default constructor.
     */
    public Neo4jCaptureDataChangePayload() {
    // JSON-B / Jackson
    }

    /**
     * Create Neo4jCaptureDataChangePayload.
     *
     * @param after after
     * @param before before
     * @param id id
     * @param type type
     * @param end end
     * @param label label
     * @param start start
     */
    public Neo4jCaptureDataChangePayload(
        Object after, 
        String before, 
        String id, 
        String type, 
        Neo4jCaptureDataChangeRelationshipPayloadEnd end, 
        String label, 
        Neo4jCaptureDataChangeRelationshipPayloadEnd start
    ) {
        this.after = after;
        this.before = before;
        this.id = id;
        this.type = type;
        this.end = end;
        this.label = label;
        this.start = start;
    }



    /**
     * Get after
     * @return after
     */
    public Object getAfter() {
        return after;
    }

    public void setAfter(Object after) {
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
     * Get end
     * @return end
     */
    public Neo4jCaptureDataChangeRelationshipPayloadEnd getEnd() {
        return end;
    }

    public void setEnd(Neo4jCaptureDataChangeRelationshipPayloadEnd end) {
        this.end = end;
    }

    /**
     * Get label
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Get start
     * @return start
     */
    public Neo4jCaptureDataChangeRelationshipPayloadEnd getStart() {
        return start;
    }

    public void setStart(Neo4jCaptureDataChangeRelationshipPayloadEnd start) {
        this.start = start;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Neo4jCaptureDataChangePayload {\n");
        
        sb.append("    after: ").append(toIndentedString(after)).append("\n");
        sb.append("    before: ").append(toIndentedString(before)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

