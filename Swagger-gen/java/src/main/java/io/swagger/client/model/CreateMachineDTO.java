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
 * CreateMachineDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T23:38:25.855+02:00")
public class CreateMachineDTO   {
  @SerializedName("description")
  private String description = null;

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

  @SerializedName("name")
  private String name = null;

  @SerializedName("vin")
  private String vin = null;

  public CreateMachineDTO description(String description) {
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

  public CreateMachineDTO machineEntityState(MachineEntityStateEnum machineEntityState) {
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

  public CreateMachineDTO machineTypeEntity(MachineTypeEntityEnum machineTypeEntity) {
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

  public CreateMachineDTO manufacturer(String manufacturer) {
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

  public CreateMachineDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateMachineDTO vin(String vin) {
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
    CreateMachineDTO createMachineDTO = (CreateMachineDTO) o;
    return Objects.equals(this.description, createMachineDTO.description) &&
        Objects.equals(this.machineEntityState, createMachineDTO.machineEntityState) &&
        Objects.equals(this.machineTypeEntity, createMachineDTO.machineTypeEntity) &&
        Objects.equals(this.manufacturer, createMachineDTO.manufacturer) &&
        Objects.equals(this.name, createMachineDTO.name) &&
        Objects.equals(this.vin, createMachineDTO.vin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, machineEntityState, machineTypeEntity, manufacturer, name, vin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMachineDTO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    machineEntityState: ").append(toIndentedString(machineEntityState)).append("\n");
    sb.append("    machineTypeEntity: ").append(toIndentedString(machineTypeEntity)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

