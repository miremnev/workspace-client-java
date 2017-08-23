/*
 * Workspace API
 * Application API used by Workspace Web Edition
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys._internal.workspace.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * TargetspersonalfavoritessaveData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T16:18:36.606Z")
public class TargetspersonalfavoritessaveData {
  @SerializedName("category")
  private String category = null;

  @SerializedName("target")
  private TargetInformation target = null;

  public TargetspersonalfavoritessaveData category(String category) {
    this.category = category;
    return this;
  }

   /**
   * category of the favorite target
   * @return category
  **/
  @ApiModelProperty(required = true, value = "category of the favorite target")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public TargetspersonalfavoritessaveData target(TargetInformation target) {
    this.target = target;
    return this;
  }

   /**
   * The personal favorite target
   * @return target
  **/
  @ApiModelProperty(required = true, value = "The personal favorite target")
  public TargetInformation getTarget() {
    return target;
  }

  public void setTarget(TargetInformation target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetspersonalfavoritessaveData targetspersonalfavoritessaveData = (TargetspersonalfavoritessaveData) o;
    return Objects.equals(this.category, targetspersonalfavoritessaveData.category) &&
        Objects.equals(this.target, targetspersonalfavoritessaveData.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetspersonalfavoritessaveData {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

