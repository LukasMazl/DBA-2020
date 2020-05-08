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


/**
 * DeviceConfigurationEntity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-08T21:24:51.847+02:00")
public class DeviceConfigurationEntity   {
  @SerializedName("deviceEntity")
  private DeviceEntity deviceEntity = null;

  @SerializedName("id")
  private Long id = null;

  public DeviceConfigurationEntity deviceEntity(DeviceEntity deviceEntity) {
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

  public DeviceConfigurationEntity id(Long id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceConfigurationEntity deviceConfigurationEntity = (DeviceConfigurationEntity) o;
    return Objects.equals(this.deviceEntity, deviceConfigurationEntity.deviceEntity) &&
        Objects.equals(this.id, deviceConfigurationEntity.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceEntity, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceConfigurationEntity {\n");
    
    sb.append("    deviceEntity: ").append(toIndentedString(deviceEntity)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

