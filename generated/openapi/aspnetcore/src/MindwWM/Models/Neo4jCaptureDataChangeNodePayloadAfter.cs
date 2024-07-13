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
    public partial class Neo4jCaptureDataChangeNodePayloadAfter : IEquatable<Neo4jCaptureDataChangeNodePayloadAfter>
    {
        /// <summary>
        /// Gets or Sets Labels
        /// </summary>
        [Required]
        [DataMember(Name="labels", EmitDefaultValue=false)]
        public List<string> Labels { get; set; }

        /// <summary>
        /// Gets or Sets Properties
        /// </summary>
        [Required]
        [DataMember(Name="properties", EmitDefaultValue=false)]
        public Dictionary<string, Object> Properties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Neo4jCaptureDataChangeNodePayloadAfter {\n");
            sb.Append("  Labels: ").Append(Labels).Append("\n");
            sb.Append("  Properties: ").Append(Properties).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Neo4jCaptureDataChangeNodePayloadAfter)obj);
        }

        /// <summary>
        /// Returns true if Neo4jCaptureDataChangeNodePayloadAfter instances are equal
        /// </summary>
        /// <param name="other">Instance of Neo4jCaptureDataChangeNodePayloadAfter to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Neo4jCaptureDataChangeNodePayloadAfter other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Labels == other.Labels ||
                    Labels != null &&
                    other.Labels != null &&
                    Labels.SequenceEqual(other.Labels)
                ) && 
                (
                    Properties == other.Properties ||
                    Properties != null &&
                    other.Properties != null &&
                    Properties.SequenceEqual(other.Properties)
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
                    if (Labels != null)
                    hashCode = hashCode * 59 + Labels.GetHashCode();
                    if (Properties != null)
                    hashCode = hashCode * 59 + Properties.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Neo4jCaptureDataChangeNodePayloadAfter left, Neo4jCaptureDataChangeNodePayloadAfter right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Neo4jCaptureDataChangeNodePayloadAfter left, Neo4jCaptureDataChangeNodePayloadAfter right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
