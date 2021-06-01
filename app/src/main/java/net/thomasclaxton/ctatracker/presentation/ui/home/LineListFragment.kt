package net.thomasclaxton.ctatracker.presentation.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import dagger.hilt.android.AndroidEntryPoint
import net.thomasclaxton.ctatracker.R
import net.thomasclaxton.ctatracker.presentation.ui.CTATheme

@AndroidEntryPoint
class LineListFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    super.onCreate(savedInstanceState)

    return ComposeView(requireContext()).apply {
      setContent {
        CTATheme {
          Surface(color = MaterialTheme.colors.background) {
            HomeScreen(onEtaClick = {
              val bundle = Bundle().apply { putInt("stationId", 40380) }
              findNavController().navigate(R.id.viewEta, bundle)
            })
          }
        }
      }
    }
  }
}
