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
    public partial class Neo4jCaptureDataChangeRelationshipPayloadEnd : IEquatable<Neo4jCaptureDataChangeRelationshipPayloadEnd>
    {
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [Required]
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Ids
        /// </summary>
        [Required]
        [DataMember(Name="ids", EmitDefaultValue=false)]
        public Dictionary<string, Object> Ids { get; set; }

        /// <summary>
        /// Gets or Sets Labels
        /// </summary>
        [Required]
        [DataMember(Name="labels", EmitDefaultValue=false)]
        public List<string> Labels { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Neo4jCaptureDataChangeRelationshipPayloadEnd {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
            sb.Append("  Labels: ").Append(Labels).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Neo4jCaptureDataChangeRelationshipPayloadEnd)obj);
        }

        /// <summary>
        /// Returns true if Neo4jCaptureDataChangeRelationshipPayloadEnd instances are equal
        /// </summary>
        /// <param name="other">Instance of Neo4jCaptureDataChangeRelationshipPayloadEnd to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Neo4jCaptureDataChangeRelationshipPayloadEnd other)
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
                    Ids == other.Ids ||
                    Ids != null &&
                    other.Ids != null &&
                    Ids.SequenceEqual(other.Ids)
                ) && 
                (
                    Labels == other.Labels ||
                    Labels != null &&
                    other.Labels != null &&
                    Labels.SequenceEqual(other.Labels)
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
                    if (Ids != null)
                    hashCode = hashCode * 59 + Ids.GetHashCode();
                    if (Labels != null)
                    hashCode = hashCode * 59 + Labels.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Neo4jCaptureDataChangeRelationshipPayloadEnd left, Neo4jCaptureDataChangeRelationshipPayloadEnd right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Neo4jCaptureDataChangeRelationshipPayloadEnd left, Neo4jCaptureDataChangeRelationshipPayloadEnd right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}