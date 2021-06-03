package net.thomasclaxton.ctatracker.presentation.ui.stations

import androidx.compose.runtime.mutableStateOf
import androidx.hilt.Assisted
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import net.thomasclaxton.ctatracker.model.Line
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
@ExperimentalCoroutinesApi
class StationsViewModel @Inject
constructor(@Assisted private val state: SavedStateHandle) : ViewModel() {

  val stations = mutableStateOf(mapOf<String, Int>())

  val lineName = mutableStateOf("")

  val direction = mutableStateOf("")

  val loading = mutableStateOf(false)

  init {
    state.get<String>("chosenDirection")?.let { this.direction.value = it }
    state.get<Line>("line")?.let { line ->
      onTriggerEvent(StationsEvent.ShowStations(line))
    }
  }

  private fun onTriggerEvent(event: StationsEvent) {
    viewModelScope.launch {
      try {
        when(event) {
          is StationsEvent.ShowStations -> {
            showStations(event.line)
          }
        }
      } catch (e: Exception) {
        e.printStackTrace()
      }
    }
  }

  private fun showStations(line: Line) {
    loading.value = true

    this.stations.value = line.stations
    this.lineName.value = line.name

    state.set("stations", stations)

    loading.value = false
  }
}
