package org.openapitools.server.model;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.server.model.Neo4jCaptureDataChangeMeta;
import org.openapitools.server.model.Neo4jCaptureDataChangePayload;
import org.openapitools.server.model.Neo4jCaptureDataChangeSchema;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Neo4jCaptureDataChange   {

    private Map<String, Object> headers = new HashMap<>();
    private String messageKey;
    private Neo4jCaptureDataChangeMeta meta;
    private Integer offset;
    private Integer partition;
    private String sourceType;
    private OffsetDateTime timestamp;
    private String topic;
    private Neo4jCaptureDataChangeSchema schema;
    private Neo4jCaptureDataChangePayload payload;

    /**
     * Default constructor.
     */
    public Neo4jCaptureDataChange() {
    // JSON-B / Jackson
    }

    /**
     * Create Neo4jCaptureDataChange.
     *
     * @param headers headers
     * @param messageKey messageKey
     * @param meta meta
     * @param offset offset
     * @param partition partition
     * @param sourceType sourceType
     * @param timestamp timestamp
     * @param topic topic
     * @param schema schema
     * @param payload payload
     */
    public Neo4jCaptureDataChange(
        Map<String, Object> headers, 
        String messageKey, 
        Neo4jCaptureDataChangeMeta meta, 
        Integer offset, 
        Integer partition, 
        String sourceType, 
        OffsetDateTime timestamp, 
        String topic, 
        Neo4jCaptureDataChangeSchema schema, 
        Neo4jCaptureDataChangePayload payload
    ) {
        this.headers = headers;
        this.messageKey = messageKey;
        this.meta = meta;
        this.offset = offset;
        this.partition = partition;
        this.sourceType = sourceType;
        this.timestamp = timestamp;
        this.topic = topic;
        this.schema = schema;
        this.payload = payload;
    }



    /**
     * Get headers
     * @return headers
     */
    public Map<String, Object> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, Object> headers) {
        this.headers = headers;
    }

    /**
     * Get messageKey
     * @return messageKey
     */
    public String getMessageKey() {
        return messageKey;
    }

    public void setMessageKey(String messageKey) {
        this.messageKey = messageKey;
    }

    /**
     * Get meta
     * @return meta
     */
    public Neo4jCaptureDataChangeMeta getMeta() {
        return meta;
    }

    public void setMeta(Neo4jCaptureDataChangeMeta meta) {
        this.meta = meta;
    }

    /**
     * Get offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * Get partition
     * @return partition
     */
    public Integer getPartition() {
        return partition;
    }

    public void setPartition(Integer partition) {
        this.partition = partition;
    }

    /**
     * Get sourceType
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * Get timestamp
     * @return timestamp
     */
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Get topic
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * Get schema
     * @return schema
     */
    public Neo4jCaptureDataChangeSchema getSchema() {
        return schema;
    }

    public void setSchema(Neo4jCaptureDataChangeSchema schema) {
        this.schema = schema;
    }

    /**
     * Get payload
     * @return payload
     */
    public Neo4jCaptureDataChangePayload getPayload() {
        return payload;
    }

    public void setPayload(Neo4jCaptureDataChangePayload payload) {
        this.payload = payload;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Neo4jCaptureDataChange {\n");
        
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    messageKey: ").append(toIndentedString(messageKey)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

