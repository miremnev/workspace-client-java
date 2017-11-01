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
import com.genesys.internal.workspace.model.StatisticValueForRegister;
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
 * StatisticsRegisterDataData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-01T21:41:20.428Z")
public class StatisticsRegisterDataData {
  @SerializedName("statistics")
  private List<StatisticValueForRegister> statistics = new ArrayList<StatisticValueForRegister>();

  public StatisticsRegisterDataData statistics(List<StatisticValueForRegister> statistics) {
    this.statistics = statistics;
    return this;
  }

  public StatisticsRegisterDataData addStatisticsItem(StatisticValueForRegister statisticsItem) {
    this.statistics.add(statisticsItem);
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @ApiModelProperty(required = true, value = "")
  public List<StatisticValueForRegister> getStatistics() {
    return statistics;
  }

  public void setStatistics(List<StatisticValueForRegister> statistics) {
    this.statistics = statistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticsRegisterDataData statisticsRegisterDataData = (StatisticsRegisterDataData) o;
    return Objects.equals(this.statistics, statisticsRegisterDataData.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticsRegisterDataData {\n");
    
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

