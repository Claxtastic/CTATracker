package net.thomasclaxton.ctatracker.network.model

import java.text.SimpleDateFormat
import java.util.*

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
  val heading: String?
) {

  private val format = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")

  fun timeUntilArrival(): Pair<Long, Long> {
    val diff: Long = format.parse(arrivalTime).time - Date().time
    val seconds = diff / 1000
    val minutes = seconds / 60

    return Pair(minutes, seconds)
  }
}
