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
    public partial class Neo4jCaptureDataChangeRelationshipPayload : IEquatable<Neo4jCaptureDataChangeRelationshipPayload>
    {
        /// <summary>
        /// Gets or Sets After
        /// </summary>
        [Required]
        [DataMember(Name="after", EmitDefaultValue=false)]
        public Object After { get; set; }

        /// <summary>
        /// Gets or Sets Before
        /// </summary>
        [Required]
        [DataMember(Name="before", EmitDefaultValue=false)]
        public string Before { get; set; }

        /// <summary>
        /// Gets or Sets End
        /// </summary>
        [Required]
        [DataMember(Name="end", EmitDefaultValue=false)]
        public Neo4jCaptureDataChangeRelationshipPayloadEnd End { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Label
        /// </summary>
        [Required]
        [DataMember(Name="label", EmitDefaultValue=false)]
        public string Label { get; set; }

        /// <summary>
        /// Gets or Sets Start
        /// </summary>
        [Required]
        [DataMember(Name="start", EmitDefaultValue=false)]
        public Neo4jCaptureDataChangeRelationshipPayloadEnd Start { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [Required]
        [DataMember(Name="type", EmitDefaultValue=false)]
        public string Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Neo4jCaptureDataChangeRelationshipPayload {\n");
            sb.Append("  After: ").Append(After).Append("\n");
            sb.Append("  Before: ").Append(Before).Append("\n");
            sb.Append("  End: ").Append(End).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Label: ").Append(Label).Append("\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
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
            return obj.GetType() == GetType() && Equals((Neo4jCaptureDataChangeRelationshipPayload)obj);
        }

        /// <summary>
        /// Returns true if Neo4jCaptureDataChangeRelationshipPayload instances are equal
        /// </summary>
        /// <param name="other">Instance of Neo4jCaptureDataChangeRelationshipPayload to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Neo4jCaptureDataChangeRelationshipPayload other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    After == other.After ||
                    After != null &&
                    After.Equals(other.After)
                ) && 
                (
                    Before == other.Before ||
                    Before != null &&
                    Before.Equals(other.Before)
                ) && 
                (
                    End == other.End ||
                    End != null &&
                    End.Equals(other.End)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Label == other.Label ||
                    Label != null &&
                    Label.Equals(other.Label)
                ) && 
                (
                    Start == other.Start ||
                    Start != null &&
                    Start.Equals(other.Start)
                ) && 
                (
                    Type == other.Type ||
                    Type != null &&
                    Type.Equals(other.Type)
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
                    if (After != null)
                    hashCode = hashCode * 59 + After.GetHashCode();
                    if (Before != null)
                    hashCode = hashCode * 59 + Before.GetHashCode();
                    if (End != null)
                    hashCode = hashCode * 59 + End.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Label != null)
                    hashCode = hashCode * 59 + Label.GetHashCode();
                    if (Start != null)
                    hashCode = hashCode * 59 + Start.GetHashCode();
                    if (Type != null)
                    hashCode = hashCode * 59 + Type.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Neo4jCaptureDataChangeRelationshipPayload left, Neo4jCaptureDataChangeRelationshipPayload right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Neo4jCaptureDataChangeRelationshipPayload left, Neo4jCaptureDataChangeRelationshipPayload right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
