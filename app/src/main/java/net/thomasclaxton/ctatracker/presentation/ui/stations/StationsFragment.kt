package net.thomasclaxton.ctatracker.presentation.ui.stations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import net.thomasclaxton.ctatracker.R
import net.thomasclaxton.ctatracker.presentation.ui.CtaTheme

@AndroidEntryPoint
@ExperimentalCoroutinesApi
class StationsFragment : Fragment() {

  private val viewModel: StationsViewModel by viewModels()

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    super.onCreateView(inflater, container, savedInstanceState)

    return ComposeView(requireContext()).apply {
      setContent {
        val stations = viewModel.stations.value

        val lineName = viewModel.lineName.value

        val chosenDirection = viewModel.direction.value

        val loading = viewModel.loading.value

        CtaTheme {
          Surface(color = MaterialTheme.colors.background) {
            StationsList(
              loading = loading,
              stations = stations,
              lineName = lineName,
              chosenDirection = chosenDirection,
              onStationClick = { stationId, lineName, direction ->
                val bundle = Bundle().apply {
                  putInt("stationId", stationId)
                  putString("lineName", lineName)
                  putString("direction", direction)
                }
                findNavController().navigate(R.id.viewEta, bundle)
              }
            )
          }
        }
      }
    }
  }
}
