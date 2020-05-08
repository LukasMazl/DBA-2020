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
import io.swagger.client.model.DeviceEntity;
import io.swagger.client.model.Links;
import org.joda.time.DateTime;


/**
 * EntityModelMachineEntity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-08T17:34:45.159+02:00")
public class EntityModelMachineEntity   {
  @SerializedName("created")
  private DateTime created = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("deviceEntity")
  private DeviceEntity deviceEntity = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("links")
  private Links links = null;

  /**
   * Gets or Sets machineEntityState
   */
  public enum MachineEntityStateEnum {
    @SerializedName("MOVING")
    MOVING("MOVING"),
    
    @SerializedName("STOPPED")
    STOPPED("STOPPED"),
    
    @SerializedName("WORKING")
    WORKING("WORKING");

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

  @SerializedName("vin")
  private String vin = null;

  public EntityModelMachineEntity created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public EntityModelMachineEntity description(String description) {
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

  public EntityModelMachineEntity deviceEntity(DeviceEntity deviceEntity) {
    this.deviceEntity = deviceEntity;
    return this;
  }

   /**
   * Get deviceEntity
   * @return deviceEntity
  **/
  @ApiModelProperty(example = "null", value = "")
  public DeviceEntity getDeviceEntity() {
    return deviceEntity;
  }

  public void setDeviceEntity(DeviceEntity deviceEntity) {
    this.deviceEntity = deviceEntity;
  }

  public EntityModelMachineEntity id(Long id) {
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

  public EntityModelMachineEntity links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public EntityModelMachineEntity machineEntityState(MachineEntityStateEnum machineEntityState) {
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

  public EntityModelMachineEntity machineTypeEntity(MachineTypeEntityEnum machineTypeEntity) {
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

  public EntityModelMachineEntity manufacturer(String manufacturer) {
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

  public EntityModelMachineEntity vin(String vin) {
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
    EntityModelMachineEntity entityModelMachineEntity = (EntityModelMachineEntity) o;
    return Objects.equals(this.created, entityModelMachineEntity.created) &&
        Objects.equals(this.description, entityModelMachineEntity.description) &&
        Objects.equals(this.deviceEntity, entityModelMachineEntity.deviceEntity) &&
        Objects.equals(this.id, entityModelMachineEntity.id) &&
        Objects.equals(this.links, entityModelMachineEntity.links) &&
        Objects.equals(this.machineEntityState, entityModelMachineEntity.machineEntityState) &&
        Objects.equals(this.machineTypeEntity, entityModelMachineEntity.machineTypeEntity) &&
        Objects.equals(this.manufacturer, entityModelMachineEntity.manufacturer) &&
        Objects.equals(this.vin, entityModelMachineEntity.vin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, description, deviceEntity, id, links, machineEntityState, machineTypeEntity, manufacturer, vin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityModelMachineEntity {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceEntity: ").append(toIndentedString(deviceEntity)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    machineEntityState: ").append(toIndentedString(machineEntityState)).append("\n");
    sb.append("    machineTypeEntity: ").append(toIndentedString(machineTypeEntity)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
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

