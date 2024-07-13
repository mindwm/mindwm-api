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
using MindwWM.Converters;

namespace MindwWM.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class GraphRelationshipAllOfData : IEquatable<GraphRelationshipAllOfData>
    {
        /// <summary>
        /// Gets or Sets Headers
        /// </summary>
        [Required]
        [DataMember(Name="headers", EmitDefaultValue=false)]
        public Object Headers { get; set; }

        /// <summary>
        /// Gets or Sets MessageKey
        /// </summary>
        [Required]
        [DataMember(Name="message_key", EmitDefaultValue=false)]
        public string MessageKey { get; set; }

        /// <summary>
        /// Gets or Sets Meta
        /// </summary>
        [Required]
        [DataMember(Name="meta", EmitDefaultValue=false)]
        public Neo4jCaptureDataChangeMeta Meta { get; set; }

        /// <summary>
        /// Gets or Sets Offset
        /// </summary>
        [Required]
        [DataMember(Name="offset", EmitDefaultValue=true)]
        public int Offset { get; set; }

        /// <summary>
        /// Gets or Sets Partition
        /// </summary>
        [Required]
        [DataMember(Name="partition", EmitDefaultValue=true)]
        public int Partition { get; set; }

        /// <summary>
        /// Gets or Sets SourceType
        /// </summary>
        [Required]
        [DataMember(Name="source_type", EmitDefaultValue=false)]
        public string SourceType { get; set; }

        /// <summary>
        /// Gets or Sets Timestamp
        /// </summary>
        [Required]
        [DataMember(Name="timestamp", EmitDefaultValue=true)]
        public DateTime Timestamp { get; set; }

        /// <summary>
        /// Gets or Sets Topic
        /// </summary>
        [Required]
        [DataMember(Name="topic", EmitDefaultValue=false)]
        public string Topic { get; set; }

        /// <summary>
        /// Gets or Sets Schema
        /// </summary>
        [Required]
        [DataMember(Name="schema", EmitDefaultValue=false)]
        public Neo4jCaptureDataChangeSchema Schema { get; set; }

        /// <summary>
        /// Gets or Sets Payload
        /// </summary>
        [Required]
        [DataMember(Name="payload", EmitDefaultValue=false)]
        public Neo4jCaptureDataChangeRelationshipPayload Payload { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GraphRelationshipAllOfData {\n");
            sb.Append("  Headers: ").Append(Headers).Append("\n");
            sb.Append("  MessageKey: ").Append(MessageKey).Append("\n");
            sb.Append("  Meta: ").Append(Meta).Append("\n");
            sb.Append("  Offset: ").Append(Offset).Append("\n");
            sb.Append("  Partition: ").Append(Partition).Append("\n");
            sb.Append("  SourceType: ").Append(SourceType).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  Topic: ").Append(Topic).Append("\n");
            sb.Append("  Schema: ").Append(Schema).Append("\n");
            sb.Append("  Payload: ").Append(Payload).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GraphRelationshipAllOfData)obj);
        }

        /// <summary>
        /// Returns true if GraphRelationshipAllOfData instances are equal
        /// </summary>
        /// <param name="other">Instance of GraphRelationshipAllOfData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GraphRelationshipAllOfData other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Headers == other.Headers ||
                    Headers != null &&
                    Headers.Equals(other.Headers)
                ) && 
                (
                    MessageKey == other.MessageKey ||
                    MessageKey != null &&
                    MessageKey.Equals(other.MessageKey)
                ) && 
                (
                    Meta == other.Meta ||
                    Meta != null &&
                    Meta.Equals(other.Meta)
                ) && 
                (
                    Offset == other.Offset ||
                    
                    Offset.Equals(other.Offset)
                ) && 
                (
                    Partition == other.Partition ||
                    
                    Partition.Equals(other.Partition)
                ) && 
                (
                    SourceType == other.SourceType ||
                    SourceType != null &&
                    SourceType.Equals(other.SourceType)
                ) && 
                (
                    Timestamp == other.Timestamp ||
                    
                    Timestamp.Equals(other.Timestamp)
                ) && 
                (
                    Topic == other.Topic ||
                    Topic != null &&
                    Topic.Equals(other.Topic)
                ) && 
                (
                    Schema == other.Schema ||
                    Schema != null &&
                    Schema.Equals(other.Schema)
                ) && 
                (
                    Payload == other.Payload ||
                    Payload != null &&
                    Payload.Equals(other.Payload)
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
                    if (Headers != null)
                    hashCode = hashCode * 59 + Headers.GetHashCode();
                    if (MessageKey != null)
                    hashCode = hashCode * 59 + MessageKey.GetHashCode();
                    if (Meta != null)
                    hashCode = hashCode * 59 + Meta.GetHashCode();
                    
                    hashCode = hashCode * 59 + Offset.GetHashCode();
                    
                    hashCode = hashCode * 59 + Partition.GetHashCode();
                    if (SourceType != null)
                    hashCode = hashCode * 59 + SourceType.GetHashCode();
                    
                    hashCode = hashCode * 59 + Timestamp.GetHashCode();
                    if (Topic != null)
                    hashCode = hashCode * 59 + Topic.GetHashCode();
                    if (Schema != null)
                    hashCode = hashCode * 59 + Schema.GetHashCode();
                    if (Payload != null)
                    hashCode = hashCode * 59 + Payload.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GraphRelationshipAllOfData left, GraphRelationshipAllOfData right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GraphRelationshipAllOfData left, GraphRelationshipAllOfData right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
