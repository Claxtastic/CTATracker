package net.thomasclaxton.ctatracker

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import dagger.assisted.Assisted
import kotlinx.coroutines.launch
import java.lang.Exception

class EtaViewModel @ViewModelInject
constructor(
  private val repository: CtaRepository,
  @Assisted stationId: Int
  ) : ViewModel() {

  val eta: MutableState<List<Eta>> = mutableStateOf(ArrayList())

  val loading = mutableStateOf(false)

  fun onTriggerEvent(event: EtaEvent) {
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

    loading.value = false
  }
}
