package net.thomasclaxton.ctatracker.response

import net.thomasclaxton.ctatracker.model.Alert

data class AlertResponse(
  val TimeStamp: String,
  val ErrorCode: String,
  val ErrorMessage: String,
  val Alert: List<Alert>
)
