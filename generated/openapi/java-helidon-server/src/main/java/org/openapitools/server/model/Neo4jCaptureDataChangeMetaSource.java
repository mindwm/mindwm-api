package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Neo4jCaptureDataChangeMetaSource   {

    private String hostname;

    /**
     * Default constructor.
     */
    public Neo4jCaptureDataChangeMetaSource() {
    // JSON-B / Jackson
    }

    /**
     * Create Neo4jCaptureDataChangeMetaSource.
     *
     * @param hostname hostname
     */
    public Neo4jCaptureDataChangeMetaSource(
        String hostname
    ) {
        this.hostname = hostname;
    }



    /**
     * Get hostname
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Neo4jCaptureDataChangeMetaSource {\n");
        
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
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

