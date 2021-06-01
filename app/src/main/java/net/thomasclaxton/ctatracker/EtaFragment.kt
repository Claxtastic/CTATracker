package net.thomasclaxton.ctatracker

import androidx.fragment.app.viewModels
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import net.thomasclaxton.ctatracker.composable.CTATheme
import net.thomasclaxton.ctatracker.composable.EtaList

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
    // TODO: get stationId from extras


    setContent {
      val eta = viewModel.eta.value

      val loading = viewModel.loading.value

      CTATheme {
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