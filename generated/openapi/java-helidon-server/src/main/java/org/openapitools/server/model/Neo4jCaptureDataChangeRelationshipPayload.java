package org.openapitools.server.model;

import org.openapitools.server.model.Neo4jCaptureDataChangeRelationshipPayloadEnd;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Neo4jCaptureDataChangeRelationshipPayload   {

    private Object after;
    private String before;
    private Neo4jCaptureDataChangeRelationshipPayloadEnd end;
    private String id;
    private String label;
    private Neo4jCaptureDataChangeRelationshipPayloadEnd start;
    private String type;

    /**
     * Default constructor.
     */
    public Neo4jCaptureDataChangeRelationshipPayload() {
    // JSON-B / Jackson
    }

    /**
     * Create Neo4jCaptureDataChangeRelationshipPayload.
     *
     * @param after after
     * @param before before
     * @param end end
     * @param id id
     * @param label label
     * @param start start
     * @param type type
     */
    public Neo4jCaptureDataChangeRelationshipPayload(
        Object after, 
        String before, 
        Neo4jCaptureDataChangeRelationshipPayloadEnd end, 
        String id, 
        String label, 
        Neo4jCaptureDataChangeRelationshipPayloadEnd start, 
        String type
    ) {
        this.after = after;
        this.before = before;
        this.end = end;
        this.id = id;
        this.label = label;
        this.start = start;
        this.type = type;
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
        sb.append("class Neo4jCaptureDataChangeRelationshipPayload {\n");
        
        sb.append("    after: ").append(toIndentedString(after)).append("\n");
        sb.append("    before: ").append(toIndentedString(before)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

