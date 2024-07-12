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
    /// Clipboard
    /// </summary>
    [DataContract(Name = "Clipboard")]
    public partial class Clipboard : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Clipboard" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Clipboard()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="Clipboard" /> class.
        /// </summary>
        /// <param name="type">type.</param>
        /// <param name="source">source.</param>
        /// <param name="data">data.</param>
        /// <param name="id">Identifies the event. (required).</param>
        /// <param name="specversion">The version of the CloudEvents specification which the event uses. (required).</param>
        /// <param name="datacontenttype">Content type of the data value. Must adhere to RFC 2046 format..</param>
        /// <param name="dataschema">Identifies the schema that data adheres to..</param>
        /// <param name="subject">Describes the subject of the event in the context of the event producer (identified by source)..</param>
        /// <param name="time">Timestamp of when the occurrence happened. Must adhere to RFC 3339..</param>
        /// <param name="dataBase64">Base64 encoded event payload. Must adhere to RFC4648..</param>
        public Clipboard(string type = default(string), string source = default(string), ClipboardPayload data = default(ClipboardPayload), string id = default(string), string specversion = default(string), string datacontenttype = default(string), string dataschema = default(string), string subject = default(string), DateTime time = default(DateTime), string dataBase64 = default(string))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for Clipboard and cannot be null");
            }
            this.Id = id;
            // to ensure "specversion" is required (not null)
            if (specversion == null)
            {
                throw new ArgumentNullException("specversion is a required property for Clipboard and cannot be null");
            }
            this.Specversion = specversion;
            this.Type = type;
            this.Source = source;
            this.Data = data;
            this.Datacontenttype = datacontenttype;
            this.Dataschema = dataschema;
            this.Subject = subject;
            this.Time = time;
            this.DataBase64 = dataBase64;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets Source
        /// </summary>
        [DataMember(Name = "source", EmitDefaultValue = false)]
        public string Source { get; set; }

        /// <summary>
        /// Gets or Sets Data
        /// </summary>
        [DataMember(Name = "data", EmitDefaultValue = false)]
        public ClipboardPayload Data { get; set; }

        /// <summary>
        /// Identifies the event.
        /// </summary>
        /// <value>Identifies the event.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// The version of the CloudEvents specification which the event uses.
        /// </summary>
        /// <value>The version of the CloudEvents specification which the event uses.</value>
        [DataMember(Name = "specversion", IsRequired = true, EmitDefaultValue = true)]
        public string Specversion { get; set; }

        /// <summary>
        /// Content type of the data value. Must adhere to RFC 2046 format.
        /// </summary>
        /// <value>Content type of the data value. Must adhere to RFC 2046 format.</value>
        [DataMember(Name = "datacontenttype", EmitDefaultValue = false)]
        public string Datacontenttype { get; set; }

        /// <summary>
        /// Identifies the schema that data adheres to.
        /// </summary>
        /// <value>Identifies the schema that data adheres to.</value>
        [DataMember(Name = "dataschema", EmitDefaultValue = false)]
        public string Dataschema { get; set; }

        /// <summary>
        /// Describes the subject of the event in the context of the event producer (identified by source).
        /// </summary>
        /// <value>Describes the subject of the event in the context of the event producer (identified by source).</value>
        [DataMember(Name = "subject", EmitDefaultValue = false)]
        public string Subject { get; set; }

        /// <summary>
        /// Timestamp of when the occurrence happened. Must adhere to RFC 3339.
        /// </summary>
        /// <value>Timestamp of when the occurrence happened. Must adhere to RFC 3339.</value>
        [DataMember(Name = "time", EmitDefaultValue = false)]
        public DateTime Time { get; set; }

        /// <summary>
        /// Base64 encoded event payload. Must adhere to RFC4648.
        /// </summary>
        /// <value>Base64 encoded event payload. Must adhere to RFC4648.</value>
        [DataMember(Name = "data_base64", EmitDefaultValue = false)]
        public string DataBase64 { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Clipboard {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Source: ").Append(Source).Append("\n");
            sb.Append("  Data: ").Append(Data).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Specversion: ").Append(Specversion).Append("\n");
            sb.Append("  Datacontenttype: ").Append(Datacontenttype).Append("\n");
            sb.Append("  Dataschema: ").Append(Dataschema).Append("\n");
            sb.Append("  Subject: ").Append(Subject).Append("\n");
            sb.Append("  Time: ").Append(Time).Append("\n");
            sb.Append("  DataBase64: ").Append(DataBase64).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
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
            if (this.Source != null) {
                // Source (string) pattern
                Regex regexSource = new Regex(@"[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)$", RegexOptions.CultureInvariant);
                if (!regexSource.Match(this.Source).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Source, must match a pattern of " + regexSource, new [] { "Source" });
                }
            }

            // Id (string) minLength
            if (this.Id != null && this.Id.Length < 1)
            {
                yield return new ValidationResult("Invalid value for Id, length must be greater than 1.", new [] { "Id" });
            }

            // Specversion (string) minLength
            if (this.Specversion != null && this.Specversion.Length < 1)
            {
                yield return new ValidationResult("Invalid value for Specversion, length must be greater than 1.", new [] { "Specversion" });
            }

            // Datacontenttype (string) minLength
            if (this.Datacontenttype != null && this.Datacontenttype.Length < 1)
            {
                yield return new ValidationResult("Invalid value for Datacontenttype, length must be greater than 1.", new [] { "Datacontenttype" });
            }

            // Dataschema (string) minLength
            if (this.Dataschema != null && this.Dataschema.Length < 1)
            {
                yield return new ValidationResult("Invalid value for Dataschema, length must be greater than 1.", new [] { "Dataschema" });
            }

            // Subject (string) minLength
            if (this.Subject != null && this.Subject.Length < 1)
            {
                yield return new ValidationResult("Invalid value for Subject, length must be greater than 1.", new [] { "Subject" });
            }

            // Time (DateTime) minLength
            if (this.Time != null && this.Time.Length < 1)
            {
                yield return new ValidationResult("Invalid value for Time, length must be greater than 1.", new [] { "Time" });
            }

            yield break;
        }
    }

}