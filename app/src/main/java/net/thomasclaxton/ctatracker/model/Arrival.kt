package net.thomasclaxton.ctatracker.model

import com.google.gson.annotations.SerializedName
import net.thomasclaxton.ctatracker.domain.EtaDto

data class Arrival(
  @SerializedName("tmst")
  val timestamp: String,
  @SerializedName("errCd")
  val errorCode: String,
  @SerializedName("errNm")
  val errorNumber: Int,
  @SerializedName("eta")
  val eta: List<EtaDto>
)
