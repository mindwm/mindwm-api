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
    /// Neo4jCaptureDataChangeMeta
    /// </summary>
    [DataContract(Name = "Neo4jCaptureDataChange_meta")]
    public partial class Neo4jCaptureDataChangeMeta : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Neo4jCaptureDataChangeMeta" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Neo4jCaptureDataChangeMeta() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Neo4jCaptureDataChangeMeta" /> class.
        /// </summary>
        /// <param name="operation">operation (required).</param>
        /// <param name="source">source (required).</param>
        /// <param name="timestamp">timestamp (required).</param>
        /// <param name="txEventId">txEventId (required).</param>
        /// <param name="txEventsCount">txEventsCount (required).</param>
        /// <param name="txId">txId (required).</param>
        /// <param name="username">username (required).</param>
        public Neo4jCaptureDataChangeMeta(string operation = default(string), Neo4jCaptureDataChangeMetaSource source = default(Neo4jCaptureDataChangeMetaSource), int timestamp = default(int), int txEventId = default(int), int txEventsCount = default(int), int txId = default(int), string username = default(string))
        {
            // to ensure "operation" is required (not null)
            if (operation == null)
            {
                throw new ArgumentNullException("operation is a required property for Neo4jCaptureDataChangeMeta and cannot be null");
            }
            this.Operation = operation;
            // to ensure "source" is required (not null)
            if (source == null)
            {
                throw new ArgumentNullException("source is a required property for Neo4jCaptureDataChangeMeta and cannot be null");
            }
            this.Source = source;
            this.Timestamp = timestamp;
            this.TxEventId = txEventId;
            this.TxEventsCount = txEventsCount;
            this.TxId = txId;
            // to ensure "username" is required (not null)
            if (username == null)
            {
                throw new ArgumentNullException("username is a required property for Neo4jCaptureDataChangeMeta and cannot be null");
            }
            this.Username = username;
        }

        /// <summary>
        /// Gets or Sets Operation
        /// </summary>
        [DataMember(Name = "operation", IsRequired = true, EmitDefaultValue = true)]
        public string Operation { get; set; }

        /// <summary>
        /// Gets or Sets Source
        /// </summary>
        [DataMember(Name = "source", IsRequired = true, EmitDefaultValue = true)]
        public Neo4jCaptureDataChangeMetaSource Source { get; set; }

        /// <summary>
        /// Gets or Sets Timestamp
        /// </summary>
        [DataMember(Name = "timestamp", IsRequired = true, EmitDefaultValue = true)]
        public int Timestamp { get; set; }

        /// <summary>
        /// Gets or Sets TxEventId
        /// </summary>
        [DataMember(Name = "txEventId", IsRequired = true, EmitDefaultValue = true)]
        public int TxEventId { get; set; }

        /// <summary>
        /// Gets or Sets TxEventsCount
        /// </summary>
        [DataMember(Name = "txEventsCount", IsRequired = true, EmitDefaultValue = true)]
        public int TxEventsCount { get; set; }

        /// <summary>
        /// Gets or Sets TxId
        /// </summary>
        [DataMember(Name = "txId", IsRequired = true, EmitDefaultValue = true)]
        public int TxId { get; set; }

        /// <summary>
        /// Gets or Sets Username
        /// </summary>
        [DataMember(Name = "username", IsRequired = true, EmitDefaultValue = true)]
        public string Username { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Neo4jCaptureDataChangeMeta {\n");
            sb.Append("  Operation: ").Append(Operation).Append("\n");
            sb.Append("  Source: ").Append(Source).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  TxEventId: ").Append(TxEventId).Append("\n");
            sb.Append("  TxEventsCount: ").Append(TxEventsCount).Append("\n");
            sb.Append("  TxId: ").Append(TxId).Append("\n");
            sb.Append("  Username: ").Append(Username).Append("\n");
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
