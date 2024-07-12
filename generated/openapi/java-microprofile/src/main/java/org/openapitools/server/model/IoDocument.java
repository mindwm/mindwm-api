/**
 * Mindwm API
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.server.model;

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.server.model.TmuxPaneIoDocument;
import java.lang.reflect.Type;
import javax.json.bind.annotation.JsonbTypeDeserializer;
import javax.json.bind.annotation.JsonbTypeSerializer;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import javax.json.bind.annotation.JsonbProperty;


public class IoDocument extends HashMap<String, Object> {
  
  @JsonbProperty("type")
  private String type;

  @JsonbProperty("source")
  private String source;

  @JsonbProperty("data")
  private TmuxPaneIoDocument data;

 /**
  * Identifies the event.
  */
  @JsonbProperty("id")
  private String id;

 /**
  * The version of the CloudEvents specification which the event uses.
  */
  @JsonbProperty("specversion")
  private String specversion;

 /**
  * Content type of the data value. Must adhere to RFC 2046 format.
  */
  @JsonbProperty("datacontenttype")
  private String datacontenttype;

 /**
  * Identifies the schema that data adheres to.
  */
  @JsonbProperty("dataschema")
  private URI dataschema;

  @JsonbProperty("subject")
  private String subject = "IoDocument";

 /**
  * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
  */
  @JsonbProperty("time")
  private Date time;

 /**
  * Base64 encoded event payload. Must adhere to RFC4648.
  */
  @JsonbProperty("data_base64")
  private String dataBase64;

  /**
   * Get type
   * @return type
   **/
  public String getType() {
    return type;
  }

  /**
   * Set type
   */
  public void setType(String type) {
    this.type = type;
  }

  public IoDocument type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get source
   * @return source
   **/
  public String getSource() {
    return source;
  }

  /**
   * Set source
   */
  public void setSource(String source) {
    this.source = source;
  }

  public IoDocument source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get data
   * @return data
   **/
  public TmuxPaneIoDocument getData() {
    return data;
  }

  /**
   * Set data
   */
  public void setData(TmuxPaneIoDocument data) {
    this.data = data;
  }

  public IoDocument data(TmuxPaneIoDocument data) {
    this.data = data;
    return this;
  }

  /**
   * Identifies the event.
   * @return id
   **/
  public String getId() {
    return id;
  }

  /**
   * Set id
   */
  public void setId(String id) {
    this.id = id;
  }

  public IoDocument id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The version of the CloudEvents specification which the event uses.
   * @return specversion
   **/
  public String getSpecversion() {
    return specversion;
  }

  /**
   * Set specversion
   */
  public void setSpecversion(String specversion) {
    this.specversion = specversion;
  }

  public IoDocument specversion(String specversion) {
    this.specversion = specversion;
    return this;
  }

  /**
   * Content type of the data value. Must adhere to RFC 2046 format.
   * @return datacontenttype
   **/
  public String getDatacontenttype() {
    return datacontenttype;
  }

  /**
   * Set datacontenttype
   */
  public void setDatacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
  }

  public IoDocument datacontenttype(String datacontenttype) {
    this.datacontenttype = datacontenttype;
    return this;
  }

  /**
   * Identifies the schema that data adheres to.
   * @return dataschema
   **/
  public URI getDataschema() {
    return dataschema;
  }

  /**
   * Set dataschema
   */
  public void setDataschema(URI dataschema) {
    this.dataschema = dataschema;
  }

  public IoDocument dataschema(URI dataschema) {
    this.dataschema = dataschema;
    return this;
  }

  /**
   * Get subject
   * @return subject
   **/
  public String getSubject() {
    return subject;
  }

  /**
   * Set subject
   */
  public void setSubject(String subject) {
    this.subject = subject;
  }

  public IoDocument subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Timestamp of when the occurrence happened. Must adhere to RFC 3339.
   * @return time
   **/
  public Date getTime() {
    return time;
  }

  /**
   * Set time
   */
  public void setTime(Date time) {
    this.time = time;
  }

  public IoDocument time(Date time) {
    this.time = time;
    return this;
  }

  /**
   * Base64 encoded event payload. Must adhere to RFC4648.
   * @return dataBase64
   **/
  public String getDataBase64() {
    return dataBase64;
  }

  /**
   * Set dataBase64
   */
  public void setDataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
  }

  public IoDocument dataBase64(String dataBase64) {
    this.dataBase64 = dataBase64;
    return this;
  }


  /**
   * Create a string representation of this pojo.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoDocument {\n");
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

