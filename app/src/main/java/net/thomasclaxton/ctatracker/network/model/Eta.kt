package net.thomasclaxton.ctatracker.network.model

data class Eta(
  val stationId: String,
  val stopId: String,
  val stationName: String,
  val stopDirection: String,
  val runNumber: String,
  val rt: String,
  val destinationStop: String,
  val destName: String,
  val trDr: String,
  val prdt: String,
  val arrivalTime: String,
  val isApp: String,
  val isSch: String,
  val isDly: String,
  val isFlt: String,
  val flags: String?,
  val lat: String?,
  val lon: String?,
  val heading: String
)
