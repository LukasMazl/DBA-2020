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
    /// GetRecordsForMachineDTO
    /// </summary>
    [DataContract]
    public partial class GetRecordsForMachineDTO :  IEquatable<GetRecordsForMachineDTO>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetRecordsForMachineDTO" /> class.
        /// </summary>
        /// <param name="Page">Page.</param>
        /// <param name="PageSize">PageSize.</param>
        /// <param name="Vin">Vin.</param>
        public GetRecordsForMachineDTO(int? Page = null, int? PageSize = null, string Vin = null)
        {
            this.Page = Page;
            this.PageSize = PageSize;
            this.Vin = Vin;
        }
        
        /// <summary>
        /// Gets or Sets Page
        /// </summary>
        [DataMember(Name="page", EmitDefaultValue=false)]
        public int? Page { get; set; }
        /// <summary>
        /// Gets or Sets PageSize
        /// </summary>
        [DataMember(Name="pageSize", EmitDefaultValue=false)]
        public int? PageSize { get; set; }
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
            sb.Append("class GetRecordsForMachineDTO {\n");
            sb.Append("  Page: ").Append(Page).Append("\n");
            sb.Append("  PageSize: ").Append(PageSize).Append("\n");
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
            return this.Equals(obj as GetRecordsForMachineDTO);
        }

        /// <summary>
        /// Returns true if GetRecordsForMachineDTO instances are equal
        /// </summary>
        /// <param name="other">Instance of GetRecordsForMachineDTO to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetRecordsForMachineDTO other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Page == other.Page ||
                    this.Page != null &&
                    this.Page.Equals(other.Page)
                ) && 
                (
                    this.PageSize == other.PageSize ||
                    this.PageSize != null &&
                    this.PageSize.Equals(other.PageSize)
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
                if (this.Page != null)
                    hash = hash * 59 + this.Page.GetHashCode();
                if (this.PageSize != null)
                    hash = hash * 59 + this.PageSize.GetHashCode();
                if (this.Vin != null)
                    hash = hash * 59 + this.Vin.GetHashCode();
                return hash;
            }
        }
    }

}