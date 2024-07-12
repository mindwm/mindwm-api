package org.openapitools.server.model;

import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.server.model.ClipboardPayload;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Clipboard extends HashMap<String, Object>  {

    private String type;
    private String source;
    private ClipboardPayload data;
    private String id;
    private String specversion;
    private String datacontenttype;
    private URI dataschema;
    private String subject;
    private OffsetDateTime time;
    private String dataBase64;

    /**
     * Default constructor.
     */
    public Clipboard() {
    // JSON-B / Jackson
    }

    /**
     * Create Clipboard.
     *
     * @param type type
     * @param source source
     * @param data data
     * @param id Identifies the event.
     * @param specversion The version of the CloudEvents specification which the event uses.
     * @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
     * @param dataschema Identifies the schema that data adheres to.
     * @param subject subject
     * @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
     * @param dataBase64 Base64 encoded event payload. Must adhere to RFC4648.
     */
    public Clipboard(
        String type, 
        String source, 
        ClipboardPayload data, 
        String id, 
        String specversion, 
        String datacontenttype, 
        URI dataschema, 
        String subject, 
        OffsetDateTime time, 
        String dataBase64
    ) {
        this.type = type;
        this.source = source;
        this.data = data;
        this.id = id;
        this.specversion = specversion;
        this.datacontenttype = datacontenttype;
        this.dataschema = dataschema;
        this.subject = subject;
        this.time = time;
        this.dataBase64 = dataBase64;
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
     * Get source
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Get data
     * @return data
     */
    public ClipboardPayload getData() {
        return data;
    }

    public void setData(ClipboardPayload data) {
        this.data = data;
    }

    /**
     * Identifies the event.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The version of the CloudEvents specification which the event uses.
     * @return specversion
     */
    public String getSpecversion() {
        return specversion;
    }

    public void setSpecversion(String specversion) {
        this.specversion = specversion;
    }

    /**
     * Content type of the data value. Must adhere to RFC 2046 format.
     * @return datacontenttype
     */
    public String getDatacontenttype() {
        return datacontenttype;
    }

    public void setDatacontenttype(String datacontenttype) {
        this.datacontenttype = datacontenttype;
    }

    /**
     * Identifies the schema that data adheres to.
     * @return dataschema
     */
    public URI getDataschema() {
        return dataschema;
    }

    public void setDataschema(URI dataschema) {
        this.dataschema = dataschema;
    }

    /**
     * Get subject
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
     * @return time
     */
    public OffsetDateTime getTime() {
        return time;
    }

    public void setTime(OffsetDateTime time) {
        this.time = time;
    }

    /**
     * Base64 encoded event payload. Must adhere to RFC4648.
     * @return dataBase64
     */
    public String getDataBase64() {
        return dataBase64;
    }

    public void setDataBase64(String dataBase64) {
        this.dataBase64 = dataBase64;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Clipboard {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    specversion: ").append(toIndentedString(specversion)).append("\n");
        sb.append("    datacontenttype: ").append(toIndentedString(datacontenttype)).append("\n");
        sb.append("    dataschema: ").append(toIndentedString(dataschema)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    dataBase64: ").append(toIndentedString(dataBase64)).append("\n");
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

