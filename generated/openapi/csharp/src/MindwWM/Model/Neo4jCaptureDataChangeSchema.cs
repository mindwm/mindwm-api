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
    /// Neo4jCaptureDataChangeSchema
    /// </summary>
    [DataContract(Name = "Neo4jCaptureDataChange_schema")]
    public partial class Neo4jCaptureDataChangeSchema : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Neo4jCaptureDataChangeSchema" /> class.
        /// </summary>
        /// <param name="constraints">constraints.</param>
        /// <param name="properties">properties.</param>
        public Neo4jCaptureDataChangeSchema(Dictionary<string, Object> constraints = default(Dictionary<string, Object>), Dictionary<string, Object> properties = default(Dictionary<string, Object>))
        {
            this.Constraints = constraints;
            this.Properties = properties;
        }

        /// <summary>
        /// Gets or Sets Constraints
        /// </summary>
        [DataMember(Name = "constraints", EmitDefaultValue = false)]
        public Dictionary<string, Object> Constraints { get; set; }

        /// <summary>
        /// Gets or Sets Properties
        /// </summary>
        [DataMember(Name = "properties", EmitDefaultValue = false)]
        public Dictionary<string, Object> Properties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Neo4jCaptureDataChangeSchema {\n");
            sb.Append("  Constraints: ").Append(Constraints).Append("\n");
            sb.Append("  Properties: ").Append(Properties).Append("\n");
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
