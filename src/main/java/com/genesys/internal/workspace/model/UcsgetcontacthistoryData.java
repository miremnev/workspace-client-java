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
 * UcsgetcontacthistoryData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-15T21:18:51.133Z")
public class UcsgetcontacthistoryData {
  @SerializedName("contactId")
  private String contactId = null;

  @SerializedName("customAttributes")
  private List<String> customAttributes = null;

  @SerializedName("fromDate")
  private String fromDate = null;

  @SerializedName("toDate")
  private String toDate = null;

  public UcsgetcontacthistoryData contactId(String contactId) {
    this.contactId = contactId;
    return this;
  }

   /**
   * The id of the contact
   * @return contactId
  **/
  @ApiModelProperty(required = true, value = "The id of the contact")
  public String getContactId() {
    return contactId;
  }

  public void setContactId(String contactId) {
    this.contactId = contactId;
  }

  public UcsgetcontacthistoryData customAttributes(List<String> customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }

  public UcsgetcontacthistoryData addCustomAttributesItem(String customAttributesItem) {
    if (this.customAttributes == null) {
      this.customAttributes = new ArrayList<String>();
    }
    this.customAttributes.add(customAttributesItem);
    return this;
  }

   /**
   * The list of custom contact attributes to be returned for each interaction of the contact
   * @return customAttributes
  **/
  @ApiModelProperty(value = "The list of custom contact attributes to be returned for each interaction of the contact")
  public List<String> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<String> customAttributes) {
    this.customAttributes = customAttributes;
  }

  public UcsgetcontacthistoryData fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * The date from which the interactions should be retrieved (UCS format)
   * @return fromDate
  **/
  @ApiModelProperty(value = "The date from which the interactions should be retrieved (UCS format)")
  public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public UcsgetcontacthistoryData toDate(String toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * The date to which the interactions should be retrieved (UCS format)
   * @return toDate
  **/
  @ApiModelProperty(value = "The date to which the interactions should be retrieved (UCS format)")
  public String getToDate() {
    return toDate;
  }

  public void setToDate(String toDate) {
    this.toDate = toDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcsgetcontacthistoryData ucsgetcontacthistoryData = (UcsgetcontacthistoryData) o;
    return Objects.equals(this.contactId, ucsgetcontacthistoryData.contactId) &&
        Objects.equals(this.customAttributes, ucsgetcontacthistoryData.customAttributes) &&
        Objects.equals(this.fromDate, ucsgetcontacthistoryData.fromDate) &&
        Objects.equals(this.toDate, ucsgetcontacthistoryData.toDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, customAttributes, fromDate, toDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcsgetcontacthistoryData {\n");
    
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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

