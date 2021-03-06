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
    /// MachineDataRecordDTO
    /// </summary>
    [DataContract]
    public partial class MachineDataRecordDTO :  IEquatable<MachineDataRecordDTO>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MachineDataRecordDTO" /> class.
        /// </summary>
        /// <param name="Action">Action.</param>
        /// <param name="Create">Create.</param>
        /// <param name="DeviceConfigurationDTO">DeviceConfigurationDTO.</param>
        /// <param name="GpsX">GpsX.</param>
        /// <param name="GpsY">GpsY.</param>
        /// <param name="Humidity">Humidity.</param>
        /// <param name="RestOfFuel">RestOfFuel.</param>
        /// <param name="SerialNumber">SerialNumber.</param>
        /// <param name="SpeedX">SpeedX.</param>
        /// <param name="SpeedY">SpeedY.</param>
        /// <param name="SpeedZ">SpeedZ.</param>
        /// <param name="StreesBattery">StreesBattery.</param>
        /// <param name="Tensometer">Tensometer.</param>
        /// <param name="Vin">Vin.</param>
        public MachineDataRecordDTO(string Action = null, string Create = null, DeviceConfigurationDTO DeviceConfigurationDTO = null, double? GpsX = null, double? GpsY = null, double? Humidity = null, double? RestOfFuel = null, string SerialNumber = null, double? SpeedX = null, double? SpeedY = null, double? SpeedZ = null, double? StreesBattery = null, double? Tensometer = null, string Vin = null)
        {
            this.Action = Action;
            this.Create = Create;
            this.DeviceConfigurationDTO = DeviceConfigurationDTO;
            this.GpsX = GpsX;
            this.GpsY = GpsY;
            this.Humidity = Humidity;
            this.RestOfFuel = RestOfFuel;
            this.SerialNumber = SerialNumber;
            this.SpeedX = SpeedX;
            this.SpeedY = SpeedY;
            this.SpeedZ = SpeedZ;
            this.StreesBattery = StreesBattery;
            this.Tensometer = Tensometer;
            this.Vin = Vin;
        }
        
        /// <summary>
        /// Gets or Sets Action
        /// </summary>
        [DataMember(Name="action", EmitDefaultValue=false)]
        public string Action { get; set; }
        /// <summary>
        /// Gets or Sets Create
        /// </summary>
        [DataMember(Name="create", EmitDefaultValue=false)]
        public string Create { get; set; }
        /// <summary>
        /// Gets or Sets DeviceConfigurationDTO
        /// </summary>
        [DataMember(Name="deviceConfigurationDTO", EmitDefaultValue=false)]
        public DeviceConfigurationDTO DeviceConfigurationDTO { get; set; }
        /// <summary>
        /// Gets or Sets GpsX
        /// </summary>
        [DataMember(Name="gpsX", EmitDefaultValue=false)]
        public double? GpsX { get; set; }
        /// <summary>
        /// Gets or Sets GpsY
        /// </summary>
        [DataMember(Name="gpsY", EmitDefaultValue=false)]
        public double? GpsY { get; set; }
        /// <summary>
        /// Gets or Sets Humidity
        /// </summary>
        [DataMember(Name="humidity", EmitDefaultValue=false)]
        public double? Humidity { get; set; }
        /// <summary>
        /// Gets or Sets RestOfFuel
        /// </summary>
        [DataMember(Name="restOfFuel", EmitDefaultValue=false)]
        public double? RestOfFuel { get; set; }
        /// <summary>
        /// Gets or Sets SerialNumber
        /// </summary>
        [DataMember(Name="serialNumber", EmitDefaultValue=false)]
        public string SerialNumber { get; set; }
        /// <summary>
        /// Gets or Sets SpeedX
        /// </summary>
        [DataMember(Name="speedX", EmitDefaultValue=false)]
        public double? SpeedX { get; set; }
        /// <summary>
        /// Gets or Sets SpeedY
        /// </summary>
        [DataMember(Name="speedY", EmitDefaultValue=false)]
        public double? SpeedY { get; set; }
        /// <summary>
        /// Gets or Sets SpeedZ
        /// </summary>
        [DataMember(Name="speedZ", EmitDefaultValue=false)]
        public double? SpeedZ { get; set; }
        /// <summary>
        /// Gets or Sets StreesBattery
        /// </summary>
        [DataMember(Name="streesBattery", EmitDefaultValue=false)]
        public double? StreesBattery { get; set; }
        /// <summary>
        /// Gets or Sets Tensometer
        /// </summary>
        [DataMember(Name="tensometer", EmitDefaultValue=false)]
        public double? Tensometer { get; set; }
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
            sb.Append("class MachineDataRecordDTO {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  Create: ").Append(Create).Append("\n");
            sb.Append("  DeviceConfigurationDTO: ").Append(DeviceConfigurationDTO).Append("\n");
            sb.Append("  GpsX: ").Append(GpsX).Append("\n");
            sb.Append("  GpsY: ").Append(GpsY).Append("\n");
            sb.Append("  Humidity: ").Append(Humidity).Append("\n");
            sb.Append("  RestOfFuel: ").Append(RestOfFuel).Append("\n");
            sb.Append("  SerialNumber: ").Append(SerialNumber).Append("\n");
            sb.Append("  SpeedX: ").Append(SpeedX).Append("\n");
            sb.Append("  SpeedY: ").Append(SpeedY).Append("\n");
            sb.Append("  SpeedZ: ").Append(SpeedZ).Append("\n");
            sb.Append("  StreesBattery: ").Append(StreesBattery).Append("\n");
            sb.Append("  Tensometer: ").Append(Tensometer).Append("\n");
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
            return this.Equals(obj as MachineDataRecordDTO);
        }

        /// <summary>
        /// Returns true if MachineDataRecordDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of MachineDataRecordDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MachineDataRecordDTO other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Action == other.Action ||
                    this.Action != null &&
                    this.Action.Equals(other.Action)
                ) && 
                (
                    this.Create == other.Create ||
                    this.Create != null &&
                    this.Create.Equals(other.Create)
                ) && 
                (
                    this.DeviceConfigurationDTO == other.DeviceConfigurationDTO ||
                    this.DeviceConfigurationDTO != null &&
                    this.DeviceConfigurationDTO.Equals(other.DeviceConfigurationDTO)
                ) && 
                (
                    this.GpsX == other.GpsX ||
                    this.GpsX != null &&
                    this.GpsX.Equals(other.GpsX)
                ) && 
                (
                    this.GpsY == other.GpsY ||
                    this.GpsY != null &&
                    this.GpsY.Equals(other.GpsY)
                ) && 
                (
                    this.Humidity == other.Humidity ||
                    this.Humidity != null &&
                    this.Humidity.Equals(other.Humidity)
                ) && 
                (
                    this.RestOfFuel == other.RestOfFuel ||
                    this.RestOfFuel != null &&
                    this.RestOfFuel.Equals(other.RestOfFuel)
                ) && 
                (
                    this.SerialNumber == other.SerialNumber ||
                    this.SerialNumber != null &&
                    this.SerialNumber.Equals(other.SerialNumber)
                ) && 
                (
                    this.SpeedX == other.SpeedX ||
                    this.SpeedX != null &&
                    this.SpeedX.Equals(other.SpeedX)
                ) && 
                (
                    this.SpeedY == other.SpeedY ||
                    this.SpeedY != null &&
                    this.SpeedY.Equals(other.SpeedY)
                ) && 
                (
                    this.SpeedZ == other.SpeedZ ||
                    this.SpeedZ != null &&
                    this.SpeedZ.Equals(other.SpeedZ)
                ) && 
                (
                    this.StreesBattery == other.StreesBattery ||
                    this.StreesBattery != null &&
                    this.StreesBattery.Equals(other.StreesBattery)
                ) && 
                (
                    this.Tensometer == other.Tensometer ||
                    this.Tensometer != null &&
                    this.Tensometer.Equals(other.Tensometer)
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
                if (this.Action != null)
                    hash = hash * 59 + this.Action.GetHashCode();
                if (this.Create != null)
                    hash = hash * 59 + this.Create.GetHashCode();
                if (this.DeviceConfigurationDTO != null)
                    hash = hash * 59 + this.DeviceConfigurationDTO.GetHashCode();
                if (this.GpsX != null)
                    hash = hash * 59 + this.GpsX.GetHashCode();
                if (this.GpsY != null)
                    hash = hash * 59 + this.GpsY.GetHashCode();
                if (this.Humidity != null)
                    hash = hash * 59 + this.Humidity.GetHashCode();
                if (this.RestOfFuel != null)
                    hash = hash * 59 + this.RestOfFuel.GetHashCode();
                if (this.SerialNumber != null)
                    hash = hash * 59 + this.SerialNumber.GetHashCode();
                if (this.SpeedX != null)
                    hash = hash * 59 + this.SpeedX.GetHashCode();
                if (this.SpeedY != null)
                    hash = hash * 59 + this.SpeedY.GetHashCode();
                if (this.SpeedZ != null)
                    hash = hash * 59 + this.SpeedZ.GetHashCode();
                if (this.StreesBattery != null)
                    hash = hash * 59 + this.StreesBattery.GetHashCode();
                if (this.Tensometer != null)
                    hash = hash * 59 + this.Tensometer.GetHashCode();
                if (this.Vin != null)
                    hash = hash * 59 + this.Vin.GetHashCode();
                return hash;
            }
        }
    }

}
