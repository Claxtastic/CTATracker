package net.thomasclaxton.ctatracker.presentation.ui.eta

import androidx.compose.runtime.mutableStateOf
import androidx.hilt.Assisted
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi

import kotlinx.coroutines.launch
import net.thomasclaxton.ctatracker.network.model.Eta
import net.thomasclaxton.ctatracker.repository.EtaRepository
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
@ExperimentalCoroutinesApi
class EtaViewModel @Inject
constructor(
  private val repository: EtaRepository,
  @Assisted private val state: SavedStateHandle
) : ViewModel() {

  val eta = mutableStateOf(listOf<Eta>())

  val lineName = mutableStateOf("")

  val direction = mutableStateOf("")

  val loading = mutableStateOf(false)

  init {
    state.get<String>("lineName")?.let { this.lineName.value = it }
    state.get<String>("direction")?.let{ this.direction.value = it }
    state.get<Int>("stationId")?.let { stationId ->
      onTriggerEvent(EtaEvent.GetEtaEvent(stationId = stationId))
    }
  }

  private fun onTriggerEvent(event: EtaEvent) {
    viewModelScope.launch {
      try {
        when(event) {
          is EtaEvent.GetEtaEvent -> {
            getEta(event.stationId)
          }
        }
      } catch (e: Exception) {
        e.printStackTrace()
      }
    }
  }

  private suspend fun getEta(stationId: Int) {
    loading.value = true

    val eta = repository.getEtasByStationId(stationId=stationId)
    this.eta.value = eta

    state.set("stationId", stationId)

    loading.value = false
  }
}
