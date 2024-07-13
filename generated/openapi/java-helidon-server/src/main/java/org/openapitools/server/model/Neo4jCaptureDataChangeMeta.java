package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.Neo4jCaptureDataChangeMetaSource;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Neo4jCaptureDataChangeMeta   {

    private String operation;
    private Neo4jCaptureDataChangeMetaSource source;
    private Integer timestamp;
    private Integer txEventId;
    private Integer txEventsCount;
    private Integer txId;
    private String username;

    /**
     * Default constructor.
     */
    public Neo4jCaptureDataChangeMeta() {
    // JSON-B / Jackson
    }

    /**
     * Create Neo4jCaptureDataChangeMeta.
     *
     * @param operation operation
     * @param source source
     * @param timestamp timestamp
     * @param txEventId txEventId
     * @param txEventsCount txEventsCount
     * @param txId txId
     * @param username username
     */
    public Neo4jCaptureDataChangeMeta(
        String operation, 
        Neo4jCaptureDataChangeMetaSource source, 
        Integer timestamp, 
        Integer txEventId, 
        Integer txEventsCount, 
        Integer txId, 
        String username
    ) {
        this.operation = operation;
        this.source = source;
        this.timestamp = timestamp;
        this.txEventId = txEventId;
        this.txEventsCount = txEventsCount;
        this.txId = txId;
        this.username = username;
    }



    /**
     * Get operation
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Get source
     * @return source
     */
    public Neo4jCaptureDataChangeMetaSource getSource() {
        return source;
    }

    public void setSource(Neo4jCaptureDataChangeMetaSource source) {
        this.source = source;
    }

    /**
     * Get timestamp
     * @return timestamp
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Get txEventId
     * @return txEventId
     */
    public Integer getTxEventId() {
        return txEventId;
    }

    public void setTxEventId(Integer txEventId) {
        this.txEventId = txEventId;
    }

    /**
     * Get txEventsCount
     * @return txEventsCount
     */
    public Integer getTxEventsCount() {
        return txEventsCount;
    }

    public void setTxEventsCount(Integer txEventsCount) {
        this.txEventsCount = txEventsCount;
    }

    /**
     * Get txId
     * @return txId
     */
    public Integer getTxId() {
        return txId;
    }

    public void setTxId(Integer txId) {
        this.txId = txId;
    }

    /**
     * Get username
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Neo4jCaptureDataChangeMeta {\n");
        
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    txEventId: ").append(toIndentedString(txEventId)).append("\n");
        sb.append("    txEventsCount: ").append(toIndentedString(txEventsCount)).append("\n");
        sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

