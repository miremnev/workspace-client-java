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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VoicestartmonitoringData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-21T15:23:05.170Z")
public class VoicestartmonitoringData {
  @SerializedName("phoneNumberToMonitor")
  private String phoneNumberToMonitor = null;

  /**
   * The monitoring mode (Mute,Coach)
   */
  public enum MonitoringModeEnum {
    @SerializedName("Mute")
    MUTE("Mute"),
    
    @SerializedName("Coach")
    COACH("Coach");

    private String value;

    MonitoringModeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("monitoringMode")
  private MonitoringModeEnum monitoringMode = null;

  /**
   * The monitoring call type (NextCall/AllCalls).
   */
  public enum MonitoringNextCallTypeEnum {
    @SerializedName("OneCall")
    ONECALL("OneCall"),
    
    @SerializedName("AllCalls")
    ALLCALLS("AllCalls");

    private String value;

    MonitoringNextCallTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("monitoringNextCallType")
  private MonitoringNextCallTypeEnum monitoringNextCallType = null;

  /**
   * The monitoring scope (Call/Agent).
   */
  public enum MonitoringScopeEnum {
    @SerializedName("Call")
    CALL("Call"),
    
    @SerializedName("Agent")
    AGENT("Agent");

    private String value;

    MonitoringScopeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("monitoringScope")
  private MonitoringScopeEnum monitoringScope = null;

  @SerializedName("location")
  private String location = null;

  public VoicestartmonitoringData phoneNumberToMonitor(String phoneNumberToMonitor) {
    this.phoneNumberToMonitor = phoneNumberToMonitor;
    return this;
  }

   /**
   * The phone number that should be monitored
   * @return phoneNumberToMonitor
  **/
  @ApiModelProperty(example = "null", required = true, value = "The phone number that should be monitored")
  public String getPhoneNumberToMonitor() {
    return phoneNumberToMonitor;
  }

  public void setPhoneNumberToMonitor(String phoneNumberToMonitor) {
    this.phoneNumberToMonitor = phoneNumberToMonitor;
  }

  public VoicestartmonitoringData monitoringMode(MonitoringModeEnum monitoringMode) {
    this.monitoringMode = monitoringMode;
    return this;
  }

   /**
   * The monitoring mode (Mute,Coach)
   * @return monitoringMode
  **/
  @ApiModelProperty(example = "null", value = "The monitoring mode (Mute,Coach)")
  public MonitoringModeEnum getMonitoringMode() {
    return monitoringMode;
  }

  public void setMonitoringMode(MonitoringModeEnum monitoringMode) {
    this.monitoringMode = monitoringMode;
  }

  public VoicestartmonitoringData monitoringNextCallType(MonitoringNextCallTypeEnum monitoringNextCallType) {
    this.monitoringNextCallType = monitoringNextCallType;
    return this;
  }

   /**
   * The monitoring call type (NextCall/AllCalls).
   * @return monitoringNextCallType
  **/
  @ApiModelProperty(example = "null", value = "The monitoring call type (NextCall/AllCalls).")
  public MonitoringNextCallTypeEnum getMonitoringNextCallType() {
    return monitoringNextCallType;
  }

  public void setMonitoringNextCallType(MonitoringNextCallTypeEnum monitoringNextCallType) {
    this.monitoringNextCallType = monitoringNextCallType;
  }

  public VoicestartmonitoringData monitoringScope(MonitoringScopeEnum monitoringScope) {
    this.monitoringScope = monitoringScope;
    return this;
  }

   /**
   * The monitoring scope (Call/Agent).
   * @return monitoringScope
  **/
  @ApiModelProperty(example = "null", value = "The monitoring scope (Call/Agent).")
  public MonitoringScopeEnum getMonitoringScope() {
    return monitoringScope;
  }

  public void setMonitoringScope(MonitoringScopeEnum monitoringScope) {
    this.monitoringScope = monitoringScope;
  }

  public VoicestartmonitoringData location(String location) {
    this.location = location;
    return this;
  }

   /**
   * The switch name where the phone number to be monitored is located (optional)
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "The switch name where the phone number to be monitored is located (optional)")
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
    VoicestartmonitoringData voicestartmonitoringData = (VoicestartmonitoringData) o;
    return Objects.equals(this.phoneNumberToMonitor, voicestartmonitoringData.phoneNumberToMonitor) &&
        Objects.equals(this.monitoringMode, voicestartmonitoringData.monitoringMode) &&
        Objects.equals(this.monitoringNextCallType, voicestartmonitoringData.monitoringNextCallType) &&
        Objects.equals(this.monitoringScope, voicestartmonitoringData.monitoringScope) &&
        Objects.equals(this.location, voicestartmonitoringData.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumberToMonitor, monitoringMode, monitoringNextCallType, monitoringScope, location);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicestartmonitoringData {\n");
    
    sb.append("    phoneNumberToMonitor: ").append(toIndentedString(phoneNumberToMonitor)).append("\n");
    sb.append("    monitoringMode: ").append(toIndentedString(monitoringMode)).append("\n");
    sb.append("    monitoringNextCallType: ").append(toIndentedString(monitoringNextCallType)).append("\n");
    sb.append("    monitoringScope: ").append(toIndentedString(monitoringScope)).append("\n");
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

