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


package com.genesys.workspace.model;

import java.util.Objects;
import com.genesys.workspace.model.Kvpair;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * UserDataData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-16T15:07:53.738Z")
public class UserDataData {
  @SerializedName("userData")
  private List<Kvpair> userData = new ArrayList<Kvpair>();

  public UserDataData userData(List<Kvpair> userData) {
    this.userData = userData;
    return this;
  }

  public UserDataData addUserDataItem(Kvpair userDataItem) {
    this.userData.add(userDataItem);
    return this;
  }

   /**
   * Get userData
   * @return userData
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<Kvpair> getUserData() {
    return userData;
  }

  public void setUserData(List<Kvpair> userData) {
    this.userData = userData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDataData userDataData = (UserDataData) o;
    return Objects.equals(this.userData, userDataData.userData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDataData {\n");
    
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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

