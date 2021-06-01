package net.thomasclaxton.ctatracker.presentation.ui.eta

sealed class EtaEvent {

  data class GetEtaEvent(val stationId: Int) : EtaEvent()
}
