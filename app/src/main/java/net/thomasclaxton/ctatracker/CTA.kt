package net.thomasclaxton.ctatracker

import net.thomasclaxton.ctatracker.response.AlertResponse
import net.thomasclaxton.ctatracker.response.TrainTrackerResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CTA {

  @GET("/api/1.0/ttarrivals.aspx?outputType=JSON")
  fun getArrivalsForStation(@Query("key") apiKey: String, @Query("mapid") mapid: Int): Call<TrainTrackerResponse>

  @GET("/api/1.0/alerts.aspx?outputType=JSON")
  fun getAlertsForStation(@Query("stationid") stationid: Int): Call<AlertResponse>
}
