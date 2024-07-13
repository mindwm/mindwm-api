/*
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * The version of the OpenAPI document: 0.1.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = MindwWM.Client.OpenAPIDateConverter;

namespace MindwWM.Model
{
    /// <summary>
    /// Neo4jCaptureDataChangeRelationshipPayloadEnd
    /// </summary>
    [DataContract(Name = "Neo4jCaptureDataChangeRelationshipPayload_end")]
    public partial class Neo4jCaptureDataChangeRelationshipPayloadEnd : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Neo4jCaptureDataChangeRelationshipPayloadEnd" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Neo4jCaptureDataChangeRelationshipPayloadEnd() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Neo4jCaptureDataChangeRelationshipPayloadEnd" /> class.
        /// </summary>
        /// <param name="id">id (required).</param>
        /// <param name="ids">ids (required).</param>
        /// <param name="labels">labels (required).</param>
        public Neo4jCaptureDataChangeRelationshipPayloadEnd(string id = default(string), Dictionary<string, Object> ids = default(Dictionary<string, Object>), List<string> labels = default(List<string>))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for Neo4jCaptureDataChangeRelationshipPayloadEnd and cannot be null");
            }
            this.Id = id;
            // to ensure "ids" is required (not null)
            if (ids == null)
            {
                throw new ArgumentNullException("ids is a required property for Neo4jCaptureDataChangeRelationshipPayloadEnd and cannot be null");
            }
            this.Ids = ids;
            // to ensure "labels" is required (not null)
            if (labels == null)
            {
                throw new ArgumentNullException("labels is a required property for Neo4jCaptureDataChangeRelationshipPayloadEnd and cannot be null");
            }
            this.Labels = labels;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Ids
        /// </summary>
        [DataMember(Name = "ids", IsRequired = true, EmitDefaultValue = true)]
        public Dictionary<string, Object> Ids { get; set; }

        /// <summary>
        /// Gets or Sets Labels
        /// </summary>
        [DataMember(Name = "labels", IsRequired = true, EmitDefaultValue = true)]
        public List<string> Labels { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
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
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
