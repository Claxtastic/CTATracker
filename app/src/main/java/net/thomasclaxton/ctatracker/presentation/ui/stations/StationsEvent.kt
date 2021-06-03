package net.thomasclaxton.ctatracker.presentation.ui.stations

import net.thomasclaxton.ctatracker.model.Line

sealed class StationsEvent {

  data class ShowStations(val line: Line) : StationsEvent()
}