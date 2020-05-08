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
    /// EntityModelDeviceEntity
    /// </summary>
    [DataContract]
    public partial class EntityModelDeviceEntity :  IEquatable<EntityModelDeviceEntity>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EntityModelDeviceEntity" /> class.
        /// </summary>
        /// <param name="DeviceCode">DeviceCode.</param>
        /// <param name="DeviceConfigurationEntity">DeviceConfigurationEntity.</param>
        /// <param name="Id">Id.</param>
        /// <param name="Links">Links.</param>
        /// <param name="MachineEntity">MachineEntity.</param>
        public EntityModelDeviceEntity(string DeviceCode = null, DeviceConfigurationEntity DeviceConfigurationEntity = null, long? Id = null, Links Links = null, MachineEntity MachineEntity = null)
        {
            this.DeviceCode = DeviceCode;
            this.DeviceConfigurationEntity = DeviceConfigurationEntity;
            this.Id = Id;
            this.Links = Links;
            this.MachineEntity = MachineEntity;
        }
        
        /// <summary>
        /// Gets or Sets DeviceCode
        /// </summary>
        [DataMember(Name="deviceCode", EmitDefaultValue=false)]
        public string DeviceCode { get; set; }
        /// <summary>
        /// Gets or Sets DeviceConfigurationEntity
        /// </summary>
        [DataMember(Name="deviceConfigurationEntity", EmitDefaultValue=false)]
        public DeviceConfigurationEntity DeviceConfigurationEntity { get; set; }
        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public long? Id { get; set; }
        /// <summary>
        /// Gets or Sets Links
        /// </summary>
        [DataMember(Name="links", EmitDefaultValue=false)]
        public Links Links { get; set; }
        /// <summary>
        /// Gets or Sets MachineEntity
        /// </summary>
        [DataMember(Name="machineEntity", EmitDefaultValue=false)]
        public MachineEntity MachineEntity { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EntityModelDeviceEntity {\n");
            sb.Append("  DeviceCode: ").Append(DeviceCode).Append("\n");
            sb.Append("  DeviceConfigurationEntity: ").Append(DeviceConfigurationEntity).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Links: ").Append(Links).Append("\n");
            sb.Append("  MachineEntity: ").Append(MachineEntity).Append("\n");
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
            return this.Equals(obj as EntityModelDeviceEntity);
        }

        /// <summary>
        /// Returns true if EntityModelDeviceEntity instances are equal
        /// </summary>
        /// <param name="other">Instance of EntityModelDeviceEntity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EntityModelDeviceEntity other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.DeviceCode == other.DeviceCode ||
                    this.DeviceCode != null &&
                    this.DeviceCode.Equals(other.DeviceCode)
                ) && 
                (
                    this.DeviceConfigurationEntity == other.DeviceConfigurationEntity ||
                    this.DeviceConfigurationEntity != null &&
                    this.DeviceConfigurationEntity.Equals(other.DeviceConfigurationEntity)
                ) && 
                (
                    this.Id == other.Id ||
                    this.Id != null &&
                    this.Id.Equals(other.Id)
                ) && 
                (
                    this.Links == other.Links ||
                    this.Links != null &&
                    this.Links.Equals(other.Links)
                ) && 
                (
                    this.MachineEntity == other.MachineEntity ||
                    this.MachineEntity != null &&
                    this.MachineEntity.Equals(other.MachineEntity)
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
                if (this.DeviceCode != null)
                    hash = hash * 59 + this.DeviceCode.GetHashCode();
                if (this.DeviceConfigurationEntity != null)
                    hash = hash * 59 + this.DeviceConfigurationEntity.GetHashCode();
                if (this.Id != null)
                    hash = hash * 59 + this.Id.GetHashCode();
                if (this.Links != null)
                    hash = hash * 59 + this.Links.GetHashCode();
                if (this.MachineEntity != null)
                    hash = hash * 59 + this.MachineEntity.GetHashCode();
                return hash;
            }
        }
    }

}