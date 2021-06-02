package net.thomasclaxton.ctatracker.presentation.ui.stations

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.hilt.Assisted
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
@ExperimentalCoroutinesApi
class StationsViewModel @Inject
constructor(@Assisted private val state: SavedStateHandle) : ViewModel() {

  val stations: MutableState<Map<String, Int>> = mutableStateOf(mapOf())

  val loading = mutableStateOf(false)

  init {
    state.get<HashMap<String, Int>>("stations")?.let { stations ->
      onTriggerEvent(StationsEvent.ShowStations(stations))
    }
  }

  private fun onTriggerEvent(event: StationsEvent) {
    viewModelScope.launch {
      try {
        when(event) {
          is StationsEvent.ShowStations -> {
            showStations(event.stations)
          }
        }
      } catch (e: Exception) {
        e.printStackTrace()
      }
    }
  }

  private fun showStations(stations: HashMap<String, Int>) {
    loading.value = true

    this.stations.value = stations
    state.set("stations", stations)

    loading.value = false
  }
}
