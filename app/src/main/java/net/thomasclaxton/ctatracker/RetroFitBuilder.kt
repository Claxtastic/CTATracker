package net.thomasclaxton.ctatracker

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroFitBuilder {

  private val client = OkHttpClient.Builder().build()

  private val retroFit = Retrofit.Builder()
    .baseUrl("http://lapi.transitchicago.com/")
    .addConverterFactory(GsonConverterFactory.create())
    .client(client)
    .build()

  fun <T> build(service: Class<T>) : T {
    return retroFit.create(service)
  }
}
