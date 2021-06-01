package net.thomasclaxton.ctatracker.service

import net.thomasclaxton.ctatracker.model.response.AlertResponse
import net.thomasclaxton.ctatracker.model.response.EtaResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CtaService {

  @GET("/api/1.0/ttarrivals.aspx?outputType=JSON")
  suspend fun getArrivalsForStation(@Query("key") apiKey: String, @Query("mapid") mapid: Int): EtaResponse

  @GET("/api/1.0/alerts.aspx?outputType=JSON")
  suspend fun getAlertsForStation(@Query("stationid") stationid: Int): Call<AlertResponse>
}
