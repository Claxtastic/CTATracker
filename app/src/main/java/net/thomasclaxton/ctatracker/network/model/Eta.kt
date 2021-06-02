package net.thomasclaxton.ctatracker.network.model

import android.util.Log
import java.text.SimpleDateFormat
import java.time.Duration
import java.util.*
import java.util.concurrent.TimeUnit

private const val TAG = "Eta"

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
    val diffMillis: Long = format.parse(arrivalTime).time - Date().time
    val minutes = TimeUnit.MILLISECONDS.toMinutes(diffMillis)
    val seconds = TimeUnit.MILLISECONDS.toSeconds(diffMillis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(diffMillis))

    Log.d(TAG, "timeUntilArrival: $minutes m, $seconds s")
    return Pair(minutes, seconds)
  }
}
