/**
 * DBA 2020
 * semestral work
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * MachineDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T23:38:25.855+02:00")
public class MachineDTO   {
  @SerializedName("created")
  private String created = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Long id = null;

  /**
   * Gets or Sets machineEntityState
   */
  public enum MachineEntityStateEnum {
    @SerializedName("MOVING")
    MOVING("MOVING"),
    
    @SerializedName("STOPPED")
    STOPPED("STOPPED"),
    
    @SerializedName("WORKING")
    WORKING("WORKING"),
    
    @SerializedName("REMOVED")
    REMOVED("REMOVED");

    private String value;

    MachineEntityStateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("machineEntityState")
  private MachineEntityStateEnum machineEntityState = null;

  /**
   * Gets or Sets machineTypeEntity
   */
  public enum MachineTypeEntityEnum {
    @SerializedName("TRACTOR")
    TRACTOR("TRACTOR"),
    
    @SerializedName("COMBINE")
    COMBINE("COMBINE"),
    
    @SerializedName("CAR")
    CAR("CAR"),
    
    @SerializedName("TRACK")
    TRACK("TRACK"),
    
    @SerializedName("GRADER")
    GRADER("GRADER");

    private String value;

    MachineTypeEntityEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("machineTypeEntity")
  private MachineTypeEntityEnum machineTypeEntity = null;

  @SerializedName("manufacturer")
  private String manufacturer = null;

  @SerializedName("online")
  private Boolean online = null;

  @SerializedName("vin")
  private String vin = null;

  public MachineDTO created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public MachineDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MachineDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public MachineDTO machineEntityState(MachineEntityStateEnum machineEntityState) {
    this.machineEntityState = machineEntityState;
    return this;
  }

   /**
   * Get machineEntityState
   * @return machineEntityState
  **/
  @ApiModelProperty(example = "null", value = "")
  public MachineEntityStateEnum getMachineEntityState() {
    return machineEntityState;
  }

  public void setMachineEntityState(MachineEntityStateEnum machineEntityState) {
    this.machineEntityState = machineEntityState;
  }

  public MachineDTO machineTypeEntity(MachineTypeEntityEnum machineTypeEntity) {
    this.machineTypeEntity = machineTypeEntity;
    return this;
  }

   /**
   * Get machineTypeEntity
   * @return machineTypeEntity
  **/
  @ApiModelProperty(example = "null", value = "")
  public MachineTypeEntityEnum getMachineTypeEntity() {
    return machineTypeEntity;
  }

  public void setMachineTypeEntity(MachineTypeEntityEnum machineTypeEntity) {
    this.machineTypeEntity = machineTypeEntity;
  }

  public MachineDTO manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public MachineDTO online(Boolean online) {
    this.online = online;
    return this;
  }

   /**
   * Get online
   * @return online
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getOnline() {
    return online;
  }

  public void setOnline(Boolean online) {
    this.online = online;
  }

  public MachineDTO vin(String vin) {
    this.vin = vin;
    return this;
  }

   /**
   * Get vin
   * @return vin
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineDTO machineDTO = (MachineDTO) o;
    return Objects.equals(this.created, machineDTO.created) &&
        Objects.equals(this.description, machineDTO.description) &&
        Objects.equals(this.id, machineDTO.id) &&
        Objects.equals(this.machineEntityState, machineDTO.machineEntityState) &&
        Objects.equals(this.machineTypeEntity, machineDTO.machineTypeEntity) &&
        Objects.equals(this.manufacturer, machineDTO.manufacturer) &&
        Objects.equals(this.online, machineDTO.online) &&
        Objects.equals(this.vin, machineDTO.vin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, description, id, machineEntityState, machineTypeEntity, manufacturer, online, vin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineDTO {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    machineEntityState: ").append(toIndentedString(machineEntityState)).append("\n");
    sb.append("    machineTypeEntity: ").append(toIndentedString(machineTypeEntity)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
