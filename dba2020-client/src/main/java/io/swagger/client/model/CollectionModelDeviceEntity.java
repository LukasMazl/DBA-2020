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
import java.util.ArrayList;
import java.util.List;


/**
 * CollectionModelDeviceEntity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-08T17:34:45.159+02:00")
public class CollectionModelDeviceEntity   {
  @SerializedName("content")
  private List<DeviceEntity> content = new ArrayList<DeviceEntity>();

  @SerializedName("links")
  private Links links = null;

  public CollectionModelDeviceEntity content(List<DeviceEntity> content) {
    this.content = content;
    return this;
  }

  public CollectionModelDeviceEntity addContentItem(DeviceEntity contentItem) {
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<DeviceEntity> getContent() {
    return content;
  }

  public void setContent(List<DeviceEntity> content) {
    this.content = content;
  }

  public CollectionModelDeviceEntity links(Links links) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionModelDeviceEntity collectionModelDeviceEntity = (CollectionModelDeviceEntity) o;
    return Objects.equals(this.content, collectionModelDeviceEntity.content) &&
        Objects.equals(this.links, collectionModelDeviceEntity.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionModelDeviceEntity {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

