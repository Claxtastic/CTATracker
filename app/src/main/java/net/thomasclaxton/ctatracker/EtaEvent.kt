package net.thomasclaxton.ctatracker

sealed class EtaEvent {

  data class GetEtaEvent(val stationId: Int) : EtaEvent()
}
