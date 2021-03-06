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
 * TakeDeviceDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-24T12:36:55.353+02:00")
public class TakeDeviceDTO   {
  @SerializedName("deviceSerialNumber")
  private String deviceSerialNumber = null;

  @SerializedName("machineVin")
  private String machineVin = null;

  public TakeDeviceDTO deviceSerialNumber(String deviceSerialNumber) {
    this.deviceSerialNumber = deviceSerialNumber;
    return this;
  }

   /**
   * Get deviceSerialNumber
   * @return deviceSerialNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDeviceSerialNumber() {
    return deviceSerialNumber;
  }

  public void setDeviceSerialNumber(String deviceSerialNumber) {
    this.deviceSerialNumber = deviceSerialNumber;
  }

  public TakeDeviceDTO machineVin(String machineVin) {
    this.machineVin = machineVin;
    return this;
  }

   /**
   * Get machineVin
   * @return machineVin
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMachineVin() {
    return machineVin;
  }

  public void setMachineVin(String machineVin) {
    this.machineVin = machineVin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TakeDeviceDTO takeDeviceDTO = (TakeDeviceDTO) o;
    return Objects.equals(this.deviceSerialNumber, takeDeviceDTO.deviceSerialNumber) &&
        Objects.equals(this.machineVin, takeDeviceDTO.machineVin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceSerialNumber, machineVin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TakeDeviceDTO {\n");
    
    sb.append("    deviceSerialNumber: ").append(toIndentedString(deviceSerialNumber)).append("\n");
    sb.append("    machineVin: ").append(toIndentedString(machineVin)).append("\n");
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

