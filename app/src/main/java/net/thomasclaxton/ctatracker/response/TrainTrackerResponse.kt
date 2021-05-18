package net.thomasclaxton.ctatracker.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import net.thomasclaxton.ctatracker.model.Arrival

data class TrainTrackerResponse(
  @Expose @SerializedName("ctatt")
  val data: Arrival
)
