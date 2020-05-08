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
import io.swagger.client.model.DeviceConfigurationEntity;
import io.swagger.client.model.MachineEntity;


/**
 * DeviceEntity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-08T15:19:24.422+02:00")
public class DeviceEntity   {
  @SerializedName("deviceCode")
  private String deviceCode = null;

  @SerializedName("deviceConfigurationEntity")
  private DeviceConfigurationEntity deviceConfigurationEntity = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("machineEntity")
  private MachineEntity machineEntity = null;

  public DeviceEntity deviceCode(String deviceCode) {
    this.deviceCode = deviceCode;
    return this;
  }

   /**
   * Get deviceCode
   * @return deviceCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDeviceCode() {
    return deviceCode;
  }

  public void setDeviceCode(String deviceCode) {
    this.deviceCode = deviceCode;
  }

  public DeviceEntity deviceConfigurationEntity(DeviceConfigurationEntity deviceConfigurationEntity) {
    this.deviceConfigurationEntity = deviceConfigurationEntity;
    return this;
  }

   /**
   * Get deviceConfigurationEntity
   * @return deviceConfigurationEntity
  **/
  @ApiModelProperty(example = "null", value = "")
  public DeviceConfigurationEntity getDeviceConfigurationEntity() {
    return deviceConfigurationEntity;
  }

  public void setDeviceConfigurationEntity(DeviceConfigurationEntity deviceConfigurationEntity) {
    this.deviceConfigurationEntity = deviceConfigurationEntity;
  }

  public DeviceEntity id(Long id) {
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

  public DeviceEntity machineEntity(MachineEntity machineEntity) {
    this.machineEntity = machineEntity;
    return this;
  }

   /**
   * Get machineEntity
   * @return machineEntity
  **/
  @ApiModelProperty(example = "null", value = "")
  public MachineEntity getMachineEntity() {
    return machineEntity;
  }

  public void setMachineEntity(MachineEntity machineEntity) {
    this.machineEntity = machineEntity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceEntity deviceEntity = (DeviceEntity) o;
    return Objects.equals(this.deviceCode, deviceEntity.deviceCode) &&
        Objects.equals(this.deviceConfigurationEntity, deviceEntity.deviceConfigurationEntity) &&
        Objects.equals(this.id, deviceEntity.id) &&
        Objects.equals(this.machineEntity, deviceEntity.machineEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceCode, deviceConfigurationEntity, id, machineEntity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceEntity {\n");
    
    sb.append("    deviceCode: ").append(toIndentedString(deviceCode)).append("\n");
    sb.append("    deviceConfigurationEntity: ").append(toIndentedString(deviceConfigurationEntity)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    machineEntity: ").append(toIndentedString(machineEntity)).append("\n");
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

