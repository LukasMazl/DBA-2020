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
 * RecordMachineStateDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-09T15:46:54.324+02:00")
public class RecordMachineStateDTO   {
  @SerializedName("action")
  private String action = null;

  @SerializedName("gpsX")
  private Double gpsX = null;

  @SerializedName("gpsY")
  private Double gpsY = null;

  @SerializedName("humidity")
  private Double humidity = null;

  @SerializedName("restOfFuel")
  private Double restOfFuel = null;

  @SerializedName("serialNumber")
  private String serialNumber = null;

  @SerializedName("speedX")
  private Double speedX = null;

  @SerializedName("speedY")
  private Double speedY = null;

  @SerializedName("speedZ")
  private Double speedZ = null;

  @SerializedName("streesBattery")
  private Double streesBattery = null;

  @SerializedName("tensomert")
  private Double tensomert = null;

  @SerializedName("tensometer")
  private Double tensometer = null;

  @SerializedName("vin")
  private String vin = null;

  public RecordMachineStateDTO action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public RecordMachineStateDTO gpsX(Double gpsX) {
    this.gpsX = gpsX;
    return this;
  }

   /**
   * Get gpsX
   * @return gpsX
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getGpsX() {
    return gpsX;
  }

  public void setGpsX(Double gpsX) {
    this.gpsX = gpsX;
  }

  public RecordMachineStateDTO gpsY(Double gpsY) {
    this.gpsY = gpsY;
    return this;
  }

   /**
   * Get gpsY
   * @return gpsY
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getGpsY() {
    return gpsY;
  }

  public void setGpsY(Double gpsY) {
    this.gpsY = gpsY;
  }

  public RecordMachineStateDTO humidity(Double humidity) {
    this.humidity = humidity;
    return this;
  }

   /**
   * Get humidity
   * @return humidity
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getHumidity() {
    return humidity;
  }

  public void setHumidity(Double humidity) {
    this.humidity = humidity;
  }

  public RecordMachineStateDTO restOfFuel(Double restOfFuel) {
    this.restOfFuel = restOfFuel;
    return this;
  }

   /**
   * Get restOfFuel
   * @return restOfFuel
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getRestOfFuel() {
    return restOfFuel;
  }

  public void setRestOfFuel(Double restOfFuel) {
    this.restOfFuel = restOfFuel;
  }

  public RecordMachineStateDTO serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Get serialNumber
   * @return serialNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public RecordMachineStateDTO speedX(Double speedX) {
    this.speedX = speedX;
    return this;
  }

   /**
   * Get speedX
   * @return speedX
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getSpeedX() {
    return speedX;
  }

  public void setSpeedX(Double speedX) {
    this.speedX = speedX;
  }

  public RecordMachineStateDTO speedY(Double speedY) {
    this.speedY = speedY;
    return this;
  }

   /**
   * Get speedY
   * @return speedY
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getSpeedY() {
    return speedY;
  }

  public void setSpeedY(Double speedY) {
    this.speedY = speedY;
  }

  public RecordMachineStateDTO speedZ(Double speedZ) {
    this.speedZ = speedZ;
    return this;
  }

   /**
   * Get speedZ
   * @return speedZ
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getSpeedZ() {
    return speedZ;
  }

  public void setSpeedZ(Double speedZ) {
    this.speedZ = speedZ;
  }

  public RecordMachineStateDTO streesBattery(Double streesBattery) {
    this.streesBattery = streesBattery;
    return this;
  }

   /**
   * Get streesBattery
   * @return streesBattery
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getStreesBattery() {
    return streesBattery;
  }

  public void setStreesBattery(Double streesBattery) {
    this.streesBattery = streesBattery;
  }

  public RecordMachineStateDTO tensomert(Double tensomert) {
    this.tensomert = tensomert;
    return this;
  }

   /**
   * Get tensomert
   * @return tensomert
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTensomert() {
    return tensomert;
  }

  public void setTensomert(Double tensomert) {
    this.tensomert = tensomert;
  }

  public RecordMachineStateDTO tensometer(Double tensometer) {
    this.tensometer = tensometer;
    return this;
  }

   /**
   * Get tensometer
   * @return tensometer
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTensometer() {
    return tensometer;
  }

  public void setTensometer(Double tensometer) {
    this.tensometer = tensometer;
  }

  public RecordMachineStateDTO vin(String vin) {
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
    RecordMachineStateDTO recordMachineStateDTO = (RecordMachineStateDTO) o;
    return Objects.equals(this.action, recordMachineStateDTO.action) &&
        Objects.equals(this.gpsX, recordMachineStateDTO.gpsX) &&
        Objects.equals(this.gpsY, recordMachineStateDTO.gpsY) &&
        Objects.equals(this.humidity, recordMachineStateDTO.humidity) &&
        Objects.equals(this.restOfFuel, recordMachineStateDTO.restOfFuel) &&
        Objects.equals(this.serialNumber, recordMachineStateDTO.serialNumber) &&
        Objects.equals(this.speedX, recordMachineStateDTO.speedX) &&
        Objects.equals(this.speedY, recordMachineStateDTO.speedY) &&
        Objects.equals(this.speedZ, recordMachineStateDTO.speedZ) &&
        Objects.equals(this.streesBattery, recordMachineStateDTO.streesBattery) &&
        Objects.equals(this.tensomert, recordMachineStateDTO.tensomert) &&
        Objects.equals(this.tensometer, recordMachineStateDTO.tensometer) &&
        Objects.equals(this.vin, recordMachineStateDTO.vin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, gpsX, gpsY, humidity, restOfFuel, serialNumber, speedX, speedY, speedZ, streesBattery, tensomert, tensometer, vin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordMachineStateDTO {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    gpsX: ").append(toIndentedString(gpsX)).append("\n");
    sb.append("    gpsY: ").append(toIndentedString(gpsY)).append("\n");
    sb.append("    humidity: ").append(toIndentedString(humidity)).append("\n");
    sb.append("    restOfFuel: ").append(toIndentedString(restOfFuel)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    speedX: ").append(toIndentedString(speedX)).append("\n");
    sb.append("    speedY: ").append(toIndentedString(speedY)).append("\n");
    sb.append("    speedZ: ").append(toIndentedString(speedZ)).append("\n");
    sb.append("    streesBattery: ").append(toIndentedString(streesBattery)).append("\n");
    sb.append("    tensomert: ").append(toIndentedString(tensomert)).append("\n");
    sb.append("    tensometer: ").append(toIndentedString(tensometer)).append("\n");
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

