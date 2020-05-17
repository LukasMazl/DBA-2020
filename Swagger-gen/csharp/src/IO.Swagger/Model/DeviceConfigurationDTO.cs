/* 
 * DBA 2020
 *
 * semestral work
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace IO.Swagger.Model
{
    /// <summary>
    /// DeviceConfigurationDTO
    /// </summary>
    [DataContract]
    public partial class DeviceConfigurationDTO :  IEquatable<DeviceConfigurationDTO>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DeviceConfigurationDTO" /> class.
        /// </summary>
        /// <param name="DeviceConfigurationEntity">DeviceConfigurationEntity.</param>
        public DeviceConfigurationDTO(DeviceConfigurationEntity DeviceConfigurationEntity = null)
        {
            this.DeviceConfigurationEntity = DeviceConfigurationEntity;
        }
        
        /// <summary>
        /// Gets or Sets DeviceConfigurationEntity
        /// </summary>
        [DataMember(Name="deviceConfigurationEntity", EmitDefaultValue=false)]
        public DeviceConfigurationEntity DeviceConfigurationEntity { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DeviceConfigurationDTO {\n");
            sb.Append("  DeviceConfigurationEntity: ").Append(DeviceConfigurationEntity).Append("\n");
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
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as DeviceConfigurationDTO);
        }

        /// <summary>
        /// Returns true if DeviceConfigurationDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of DeviceConfigurationDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DeviceConfigurationDTO other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.DeviceConfigurationEntity == other.DeviceConfigurationEntity ||
                    this.DeviceConfigurationEntity != null &&
                    this.DeviceConfigurationEntity.Equals(other.DeviceConfigurationEntity)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.DeviceConfigurationEntity != null)
                    hash = hash * 59 + this.DeviceConfigurationEntity.GetHashCode();
                return hash;
            }
        }
    }

}