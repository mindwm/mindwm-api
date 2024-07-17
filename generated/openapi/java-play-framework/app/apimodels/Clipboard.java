package apimodels;

import apimodels.ClipboardPayload;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Clipboard
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-07-17T13:48:26.994880597Z[Etc/UTC]", comments = "Generator version: 7.7.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Clipboard extends HashMap<String, Object>  {
  @JsonProperty("type")
  
  private String type;

  @JsonProperty("source")
  @Pattern(regexp="[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)$")

  private String source;

  @JsonProperty("data")
  @Valid

  private ClipboardPayload data;

  @JsonProperty("id")
  @NotNull
@Size(min=1)

  private String id;

  @JsonProperty("specversion")
  @NotNull
@Size(min=1)

  private String specversion;

  @JsonProperty("datacontenttype")
  @Size(min=1)

  private String datacontenttype;

  @JsonProperty("dataschema")
  @Size(min=1)
@Valid

  private URI dataschema;

  @JsonProperty("subject")
  
  private String subject;

  @JsonProperty("time")
  @Size(min=1)
@Valid

  private OffsetDateTime time;

  @JsonProperty("data_base64")
  
  private String dataBase64;

  public Clipboard type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Clipboard source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Clipboard data(ClipboardPayload data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public ClipboardPayload getData() {
    return data;
  }

  public void setData(ClipboardPayload data) {
    this.data = data;
  }

  public Clipboard id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifies the event.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Clipboard specversion(String specversion) {
    this.specversion = specversion;
    return this;
  }

   /**
   * The version of the CloudEvents specification which the event uses.
   * @return specversion
  **/
  public String getSpecversion() {
    return specversion;
  }

  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }

  public Clipboard datacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
    return this;
  }

   /**
   * Content type of the data value. Must adhere to RFC 2046 format.
   * @return datacontenttype
  **/
  public String getDatacontenttype() {
    return datacontenttype;
  }

  public void setDatacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
  }

  public Clipboard dataschema(URI dataschema) {
    this.dataschema = dataschema;
    return this;
  }

   /**
   * Identifies the schema that data adheres to.
   * @return dataschema
  **/
  public URI getDataschema() {
    return dataschema;
  }

  public void setDataschema(URI dataschema) {
    this.dataschema = dataschema;
  }

  public Clipboard subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Clipboard time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
   * @return time
  **/
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public Clipboard dataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
    return this;
  }

   /**
   * Base64 encoded event payload. Must adhere to RFC4648.
   * @return dataBase64
  **/
  public String getDataBase64() {
    return dataBase64;
  }

  public void setDataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Clipboard clipboard = (Clipboard) o;
    return Objects.equals(type, clipboard.type) &&
        Objects.equals(source, clipboard.source) &&
        Objects.equals(data, clipboard.data) &&
        Objects.equals(id, clipboard.id) &&
        Objects.equals(specversion, clipboard.specversion) &&
        Objects.equals(datacontenttype, clipboard.datacontenttype) &&
        Objects.equals(dataschema, clipboard.dataschema) &&
        Objects.equals(subject, clipboard.subject) &&
        Objects.equals(time, clipboard.time) &&
        Objects.equals(dataBase64, clipboard.dataBase64) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, source, data, id, specversion, datacontenttype, dataschema, subject, time, dataBase64, super.hashCode());
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

