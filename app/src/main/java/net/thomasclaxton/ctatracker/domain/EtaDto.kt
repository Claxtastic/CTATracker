package net.thomasclaxton.ctatracker.domain

import com.google.gson.annotations.SerializedName

data class EtaDto(
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

  @SerializedName("rt")
  val rt: String,

  @SerializedName("destSt")
  val destinationStop: String,

  @SerializedName("destNm")
  val destName: String,

  @SerializedName("trDr")
  val trDr: String,

  @SerializedName("prdt")
  val prdt: String,

  @SerializedName("arrT")
  val arrivalTime: String,

  @SerializedName("isApp")
  val isApp: String,

  @SerializedName("isSch")
  val isSch: String,

  @SerializedName("isDly")
  val isDly: String,

  @SerializedName("isFlt")
  val isFlt: String,

  @SerializedName("isFlags")
  val flags: String?,

  @SerializedName("isLat")
  val lat: String?,

  @SerializedName("isLon")
  val lon: String?,

  @SerializedName("heading")
  val heading: String?
)
