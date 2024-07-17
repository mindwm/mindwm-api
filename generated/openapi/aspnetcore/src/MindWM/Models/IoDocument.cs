/*
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using MindWM.Converters;

namespace MindWM.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class IoDocument : IEquatable<IoDocument>
    {
        /// <summary>
        /// Identifies the event.
        /// </summary>
        /// <value>Identifies the event.</value>
        [Required]
        [MinLength(1)]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Source
        /// </summary>
        [Required]
        [DataMember(Name="source", EmitDefaultValue=false)]
        public string Source { get; set; }

        /// <summary>
        /// The version of the CloudEvents specification which the event uses.
        /// </summary>
        /// <value>The version of the CloudEvents specification which the event uses.</value>
        [Required]
        [MinLength(1)]
        [DataMember(Name="specversion", EmitDefaultValue=false)]
        public string Specversion { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; } = "IoDocument";

        /// <summary>
        /// Content type of the data value. Must adhere to RFC 2046 format.
        /// </summary>
        /// <value>Content type of the data value. Must adhere to RFC 2046 format.</value>
        [MinLength(1)]
        [DataMember(Name="datacontenttype", EmitDefaultValue=false)]
        public string Datacontenttype { get; set; }

        /// <summary>
        /// Identifies the schema that data adheres to.
        /// </summary>
        /// <value>Identifies the schema that data adheres to.</value>
        [MinLength(1)]
        [DataMember(Name="dataschema", EmitDefaultValue=false)]
        public string Dataschema { get; set; }

        /// <summary>
        /// Gets or Sets Subject
        /// </summary>
        [DataMember(Name="subject", EmitDefaultValue=false)]
        public string Subject { get; set; } = "IoDocument";

        /// <summary>
        /// Timestamp of when the occurrence happened. Must adhere to RFC 3339.
        /// </summary>
        /// <value>Timestamp of when the occurrence happened. Must adhere to RFC 3339.</value>
        [MinLength(1)]
        [DataMember(Name="time", EmitDefaultValue=true)]
        public DateTime Time { get; set; }

        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [DataMember(Name="data", EmitDefaultValue=false)]
        public TmuxPaneIoDocument Data { get; set; }

        /// <summary>
        /// Base64 encoded event payload. Must adhere to RFC4648.
        /// </summary>
        /// <value>Base64 encoded event payload. Must adhere to RFC4648.</value>
        [DataMember(Name="data_base64", EmitDefaultValue=false)]
        public string DataBase64 { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class IoDocument {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Source: ").Append(Source).Append("\n");
            sb.Append("  Specversion: ").Append(Specversion).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Datacontenttype: ").Append(Datacontenttype).Append("\n");
            sb.Append("  Dataschema: ").Append(Dataschema).Append("\n");
            sb.Append("  Subject: ").Append(Subject).Append("\n");
            sb.Append("  Time: ").Append(Time).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
            sb.Append("  DataBase64: ").Append(DataBase64).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((IoDocument)obj);
        }

        /// <summary>
        /// Returns true if IoDocument instances are equal
        /// </summary>
        /// <param name="other">Instance of IoDocument to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IoDocument other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Source == other.Source ||
                    Source != null &&
                    Source.Equals(other.Source)
                ) && 
                (
                    Specversion == other.Specversion ||
                    Specversion != null &&
                    Specversion.Equals(other.Specversion)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
                ) && 
                (
                    Datacontenttype == other.Datacontenttype ||
                    Datacontenttype != null &&
                    Datacontenttype.Equals(other.Datacontenttype)
                ) && 
                (
                    Dataschema == other.Dataschema ||
                    Dataschema != null &&
                    Dataschema.Equals(other.Dataschema)
                ) && 
                (
                    Subject == other.Subject ||
                    Subject != null &&
                    Subject.Equals(other.Subject)
                ) && 
                (
                    Time == other.Time ||
                    
                    Time.Equals(other.Time)
                ) && 
                (
                    Data == other.Data ||
                    Data != null &&
                    Data.Equals(other.Data)
                ) && 
                (
                    DataBase64 == other.DataBase64 ||
                    DataBase64 != null &&
                    DataBase64.Equals(other.DataBase64)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Source != null)
                    hashCode = hashCode * 59 + Source.GetHashCode();
                    if (Specversion != null)
                    hashCode = hashCode * 59 + Specversion.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                    if (Datacontenttype != null)
                    hashCode = hashCode * 59 + Datacontenttype.GetHashCode();
                    if (Dataschema != null)
                    hashCode = hashCode * 59 + Dataschema.GetHashCode();
                    if (Subject != null)
                    hashCode = hashCode * 59 + Subject.GetHashCode();
                    
                    hashCode = hashCode * 59 + Time.GetHashCode();
                    if (Data != null)
                    hashCode = hashCode * 59 + Data.GetHashCode();
                    if (DataBase64 != null)
                    hashCode = hashCode * 59 + DataBase64.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(IoDocument left, IoDocument right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(IoDocument left, IoDocument right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
