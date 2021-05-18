package net.thomasclaxton.ctatracker.model

import com.google.gson.annotations.SerializedName

data class ETA(
  @SerializedName("staId")
  val stationId: String,
  @SerializedName("stpId")
  val stopId: String,
  @SerializedName("staNm")
  val stationName: String,
  @SerializedName("stpDe")
  val stopDirection: String,
  @SerializedName("rn")
  val runNumber: String,
  val rt: String,
  @SerializedName("destSt")
  val destinationStop: String,
  @SerializedName("destNm")
  val destName: String,
  val trDr: String,
  @SerializedName("prdt")
  val prdt: String,
  @SerializedName("arrT")
  val arrivalTime: String,
  val isApp: String,
  val isSch: String,
  val isDly: String,
  val isFlt: String,
  val flags: String,
  val lat: String,
  val lon: String,
  val heading: String
)
