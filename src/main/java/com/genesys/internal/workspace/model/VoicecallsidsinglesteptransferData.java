/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.workspace.model;

import java.util.Objects;
import com.genesys.internal.workspace.model.Kvpair;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * VoicecallsidsinglesteptransferData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-03T12:04:51.676Z")
public class VoicecallsidsinglesteptransferData {
  @SerializedName("destination")
  private String destination = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("userData")
  private List<Kvpair> userData = null;

  @SerializedName("reasons")
  private List<Kvpair> reasons = null;

  @SerializedName("extensions")
  private List<Kvpair> extensions = null;

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

  public VoicecallsidsinglesteptransferData userData(List<Kvpair> userData) {
    this.userData = userData;
    return this;
  }

  public VoicecallsidsinglesteptransferData addUserDataItem(Kvpair userDataItem) {
    if (this.userData == null) {
      this.userData = new ArrayList<Kvpair>();
    }
    this.userData.add(userDataItem);
    return this;
  }

   /**
   * A key/value pairs list of the user data that should be attached to the call.
   * @return userData
  **/
  @ApiModelProperty(value = "A key/value pairs list of the user data that should be attached to the call.")
  public List<Kvpair> getUserData() {
    return userData;
  }

  public void setUserData(List<Kvpair> userData) {
    this.userData = userData;
  }

  public VoicecallsidsinglesteptransferData reasons(List<Kvpair> reasons) {
    this.reasons = reasons;
    return this;
  }

  public VoicecallsidsinglesteptransferData addReasonsItem(Kvpair reasonsItem) {
    if (this.reasons == null) {
      this.reasons = new ArrayList<Kvpair>();
    }
    this.reasons.add(reasonsItem);
    return this;
  }

   /**
   * A key/value pairs list of a data structure that provides additional information associated with this action.
   * @return reasons
  **/
  @ApiModelProperty(value = "A key/value pairs list of a data structure that provides additional information associated with this action.")
  public List<Kvpair> getReasons() {
    return reasons;
  }

  public void setReasons(List<Kvpair> reasons) {
    this.reasons = reasons;
  }

  public VoicecallsidsinglesteptransferData extensions(List<Kvpair> extensions) {
    this.extensions = extensions;
    return this;
  }

  public VoicecallsidsinglesteptransferData addExtensionsItem(Kvpair extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new ArrayList<Kvpair>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

   /**
   * A key/value pairs list of additional data.
   * @return extensions
  **/
  @ApiModelProperty(value = "A key/value pairs list of additional data.")
  public List<Kvpair> getExtensions() {
    return extensions;
  }

  public void setExtensions(List<Kvpair> extensions) {
    this.extensions = extensions;
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
    return Objects.equals(this.destination, voicecallsidsinglesteptransferData.destination) &&
        Objects.equals(this.location, voicecallsidsinglesteptransferData.location) &&
        Objects.equals(this.userData, voicecallsidsinglesteptransferData.userData) &&
        Objects.equals(this.reasons, voicecallsidsinglesteptransferData.reasons) &&
        Objects.equals(this.extensions, voicecallsidsinglesteptransferData.extensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, location, userData, reasons, extensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicecallsidsinglesteptransferData {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
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

