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
    /// EntityModelMachineEntity
    /// </summary>
    [DataContract]
    public partial class EntityModelMachineEntity :  IEquatable<EntityModelMachineEntity>
    {
        /// <summary>
        /// Gets or Sets MachineEntityState
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum MachineEntityStateEnum
        {
            
            /// <summary>
            /// Enum MOVING for "MOVING"
            /// </summary>
            [EnumMember(Value = "MOVING")]
            MOVING,
            
            /// <summary>
            /// Enum STOPPED for "STOPPED"
            /// </summary>
            [EnumMember(Value = "STOPPED")]
            STOPPED
        }

        /// <summary>
        /// Gets or Sets MachineEntityState
        /// </summary>
        [DataMember(Name="machineEntityState", EmitDefaultValue=false)]
        public MachineEntityStateEnum? MachineEntityState { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="EntityModelMachineEntity" /> class.
        /// </summary>
        /// <param name="DeviceEntity">DeviceEntity.</param>
        /// <param name="Id">Id.</param>
        /// <param name="Links">Links.</param>
        /// <param name="MachineEntityState">MachineEntityState.</param>
        /// <param name="Vin">Vin.</param>
        public EntityModelMachineEntity(DeviceEntity DeviceEntity = null, long? Id = null, Links Links = null, MachineEntityStateEnum? MachineEntityState = null, string Vin = null)
        {
            this.DeviceEntity = DeviceEntity;
            this.Id = Id;
            this.Links = Links;
            this.MachineEntityState = MachineEntityState;
            this.Vin = Vin;
        }
        
        /// <summary>
        /// Gets or Sets DeviceEntity
        /// </summary>
        [DataMember(Name="deviceEntity", EmitDefaultValue=false)]
        public DeviceEntity DeviceEntity { get; set; }
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
        /// Gets or Sets Vin
        /// </summary>
        [DataMember(Name="vin", EmitDefaultValue=false)]
        public string Vin { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EntityModelMachineEntity {\n");
            sb.Append("  DeviceEntity: ").Append(DeviceEntity).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Links: ").Append(Links).Append("\n");
            sb.Append("  MachineEntityState: ").Append(MachineEntityState).Append("\n");
            sb.Append("  Vin: ").Append(Vin).Append("\n");
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
            return this.Equals(obj as EntityModelMachineEntity);
        }

        /// <summary>
        /// Returns true if EntityModelMachineEntity instances are equal
        /// </summary>
        /// <param name="other">Instance of EntityModelMachineEntity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EntityModelMachineEntity other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.DeviceEntity == other.DeviceEntity ||
                    this.DeviceEntity != null &&
                    this.DeviceEntity.Equals(other.DeviceEntity)
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
                    this.MachineEntityState == other.MachineEntityState ||
                    this.MachineEntityState != null &&
                    this.MachineEntityState.Equals(other.MachineEntityState)
                ) && 
                (
                    this.Vin == other.Vin ||
                    this.Vin != null &&
                    this.Vin.Equals(other.Vin)
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
                if (this.DeviceEntity != null)
                    hash = hash * 59 + this.DeviceEntity.GetHashCode();
                if (this.Id != null)
                    hash = hash * 59 + this.Id.GetHashCode();
                if (this.Links != null)
                    hash = hash * 59 + this.Links.GetHashCode();
                if (this.MachineEntityState != null)
                    hash = hash * 59 + this.MachineEntityState.GetHashCode();
                if (this.Vin != null)
                    hash = hash * 59 + this.Vin.GetHashCode();
                return hash;
            }
        }
    }

}
