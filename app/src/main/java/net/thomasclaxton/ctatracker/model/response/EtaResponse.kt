package net.thomasclaxton.ctatracker.model.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import net.thomasclaxton.ctatracker.model.Arrival

data class EtaResponse(
  @Expose @SerializedName("ctatt")
  val data: Arrival
)
