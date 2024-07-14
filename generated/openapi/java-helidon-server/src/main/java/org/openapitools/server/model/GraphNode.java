package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.server.model.GraphNodeAllOfData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GraphNode extends HashMap<String, Object>  {

    private String id;

    /**
    * Gets or Sets source
    */
    public enum SourceEnum {
        NODE("graph.node"),
        RELATIONSHIP("graph.relationship");

        private String value;

        SourceEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static SourceEnum fromValue(String text) {
            for (SourceEnum b : SourceEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private SourceEnum source;
    private String specversion;

    /**
    * Gets or Sets type
    */
    public enum TypeEnum {
        CREATED("created"),
        UPDATED("updated"),
        DELETED("deleted");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private TypeEnum type;
    private String datacontenttype;
    private URI dataschema;
    private String subject;
    private OffsetDateTime time;
    private GraphNodeAllOfData data;
    private String dataBase64;

    /**
     * Default constructor.
     */
    public GraphNode() {
    // JSON-B / Jackson
    }

    /**
     * Create GraphNode.
     *
     * @param id Identifies the event.
     * @param source source
     * @param specversion The version of the CloudEvents specification which the event uses.
     * @param type type
     * @param datacontenttype Content type of the data value. Must adhere to RFC 2046 format.
     * @param dataschema Identifies the schema that data adheres to.
     * @param subject Describes the subject of the event in the context of the event producer (identified by source).
     * @param time Timestamp of when the occurrence happened. Must adhere to RFC 3339.
     * @param data data
     * @param dataBase64 Base64 encoded event payload. Must adhere to RFC4648.
     */
    public GraphNode(
        String id, 
        SourceEnum source, 
        String specversion, 
        TypeEnum type, 
        String datacontenttype, 
        URI dataschema, 
        String subject, 
        OffsetDateTime time, 
        GraphNodeAllOfData data, 
        String dataBase64
    ) {
        this.id = id;
        this.source = source;
        this.specversion = specversion;
        this.type = type;
        this.datacontenttype = datacontenttype;
        this.dataschema = dataschema;
        this.subject = subject;
        this.time = time;
        this.data = data;
        this.dataBase64 = dataBase64;
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
     * Get source
     * @return source
     */
    public SourceEnum getSource() {
        return source;
    }

    public void setSource(SourceEnum source) {
        this.source = source;
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
     * Get type
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
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
     * Describes the subject of the event in the context of the event producer (identified by source).
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
     * Get data
     * @return data
     */
    public GraphNodeAllOfData getData() {
        return data;
    }

    public void setData(GraphNodeAllOfData data) {
        this.data = data;
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
        sb.append("class GraphNode {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    specversion: ").append(toIndentedString(specversion)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    datacontenttype: ").append(toIndentedString(datacontenttype)).append("\n");
        sb.append("    dataschema: ").append(toIndentedString(dataschema)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

