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

import com.genesys.workspace.models.KeyValueCollection;

/**
 * VoicecallsidsinglesteptransferData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T16:18:36.606Z")
public class VoicecallsidsinglesteptransferData {
  @SerializedName("reasons")
  private KeyValueCollection reasons = null;

  @SerializedName("userData")
  private KeyValueCollection userData = null;

  @SerializedName("destination")
  private String destination = null;

  @SerializedName("extensions")
  private KeyValueCollection extensions = null;

  @SerializedName("location")
  private String location = null;

  public VoicecallsidsinglesteptransferData reasons(KeyValueCollection reasons) {
    this.reasons = reasons;
    return this;
  }

   /**
   * A key/value pairs list of a data structure that provides additional information associated with this action.
   * @return reasons
  **/
  @ApiModelProperty(value = "A key/value pairs list of a data structure that provides additional information associated with this action.")
  public KeyValueCollection getReasons() {
    return reasons;
  }

  public void setReasons(KeyValueCollection reasons) {
    this.reasons = reasons;
  }

  public VoicecallsidsinglesteptransferData userData(KeyValueCollection userData) {
    this.userData = userData;
    return this;
  }

   /**
   * A key/value pairs list of the user data that should be attached to the call.
   * @return userData
  **/
  @ApiModelProperty(value = "A key/value pairs list of the user data that should be attached to the call.")
  public KeyValueCollection getUserData() {
    return userData;
  }

  public void setUserData(KeyValueCollection userData) {
    this.userData = userData;
  }

  public VoicecallsidsinglesteptransferData destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * The number to transfer the call to.
   * @return destination
  **/
  @ApiModelProperty(required = true, value = "The number to transfer the call to.")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public VoicecallsidsinglesteptransferData extensions(KeyValueCollection extensions) {
    this.extensions = extensions;
    return this;
  }

   /**
   * A key/value pairs list of additional data.
   * @return extensions
  **/
  @ApiModelProperty(value = "A key/value pairs list of additional data.")
  public KeyValueCollection getExtensions() {
    return extensions;
  }

  public void setExtensions(KeyValueCollection extensions) {
    this.extensions = extensions;
  }

  public VoicecallsidsinglesteptransferData location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Name of the remote location in the form of &lt;SwitchName&gt; or &lt;T-ServerApplicationName&gt;@&lt;SwitchName&gt;. When there is no need to specify a T-Server for location, this parameter must have the value NULL, not an empty string.
   * @return location
  **/
  @ApiModelProperty(value = "Name of the remote location in the form of <SwitchName> or <T-ServerApplicationName>@<SwitchName>. When there is no need to specify a T-Server for location, this parameter must have the value NULL, not an empty string.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicecallsidsinglesteptransferData voicecallsidsinglesteptransferData = (VoicecallsidsinglesteptransferData) o;
    return Objects.equals(this.reasons, voicecallsidsinglesteptransferData.reasons) &&
        Objects.equals(this.userData, voicecallsidsinglesteptransferData.userData) &&
        Objects.equals(this.destination, voicecallsidsinglesteptransferData.destination) &&
        Objects.equals(this.extensions, voicecallsidsinglesteptransferData.extensions) &&
        Objects.equals(this.location, voicecallsidsinglesteptransferData.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasons, userData, destination, extensions, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicecallsidsinglesteptransferData {\n");
    
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

