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
 * VoicemakecallData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T16:18:36.606Z")
public class VoicemakecallData {
  @SerializedName("userData")
  private KeyValueCollection userData = null;

  @SerializedName("reasons")
  private KeyValueCollection reasons = null;

  @SerializedName("outboundCallerId")
  private String outboundCallerId = null;

  @SerializedName("destination")
  private String destination = null;

  @SerializedName("extensions")
  private KeyValueCollection extensions = null;

  @SerializedName("location")
  private String location = null;

  public VoicemakecallData userData(KeyValueCollection userData) {
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

  public VoicemakecallData reasons(KeyValueCollection reasons) {
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

  public VoicemakecallData outboundCallerId(String outboundCallerId) {
    this.outboundCallerId = outboundCallerId;
    return this;
  }

   /**
   * value to be set as CPN_DIGITS.
   * @return outboundCallerId
  **/
  @ApiModelProperty(value = "value to be set as CPN_DIGITS.")
  public String getOutboundCallerId() {
    return outboundCallerId;
  }

  public void setOutboundCallerId(String outboundCallerId) {
    this.outboundCallerId = outboundCallerId;
  }

  public VoicemakecallData destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Directory number of the party the call will be transferred to.
   * @return destination
  **/
  @ApiModelProperty(required = true, value = "Directory number of the party the call will be transferred to.")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public VoicemakecallData extensions(KeyValueCollection extensions) {
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

  public VoicemakecallData location(String location) {
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
    VoicemakecallData voicemakecallData = (VoicemakecallData) o;
    return Objects.equals(this.userData, voicemakecallData.userData) &&
        Objects.equals(this.reasons, voicemakecallData.reasons) &&
        Objects.equals(this.outboundCallerId, voicemakecallData.outboundCallerId) &&
        Objects.equals(this.destination, voicemakecallData.destination) &&
        Objects.equals(this.extensions, voicemakecallData.extensions) &&
        Objects.equals(this.location, voicemakecallData.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userData, reasons, outboundCallerId, destination, extensions, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemakecallData {\n");
    
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    outboundCallerId: ").append(toIndentedString(outboundCallerId)).append("\n");
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

