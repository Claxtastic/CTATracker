package net.thomasclaxton.ctatracker.presentation.ui.eta

import androidx.fragment.app.viewModels
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import net.thomasclaxton.ctatracker.presentation.ui.CtaTheme

@ExperimentalComposeUiApi
@ExperimentalMaterialApi
@ExperimentalCoroutinesApi
@AndroidEntryPoint
class EtaFragment : Fragment() {

  private val viewModel: EtaViewModel by viewModels()

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    super.onCreate(savedInstanceState)

    return ComposeView(requireContext()).apply {
      setContent {
        val eta = viewModel.eta.value

        val lineName = viewModel.lineName.value

        val direction = viewModel.direction.value

        val loading = viewModel.loading.value

        CtaTheme {
          Scaffold(
            topBar = { TopAppBar(title = { Text("$lineName to $direction") })}) {
            Surface {
              EtaList(
                loading = loading,
                eta = eta
              )
            }
          }
        }
      }
    }
  }
}