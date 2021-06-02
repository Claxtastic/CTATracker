package net.thomasclaxton.ctatracker.presentation.ui.stations

sealed class StationsEvent {

  data class ShowStations(val stations: HashMap<String, Int>) : StationsEvent()
}