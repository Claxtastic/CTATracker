package net.thomasclaxton.ctatracker.presentation.ui.stations

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import net.thomasclaxton.ctatracker.presentation.ui.CtaTheme

@AndroidEntryPoint
@ExperimentalCoroutinesApi
class StationsFragment() : Fragment(), Parcelable {

  private val viewModel: StationsViewModel by viewModels()

  constructor(parcel: Parcel) : this() {
  }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    super.onCreateView(inflater, container, savedInstanceState)

    return ComposeView(requireContext()).apply {
      setContent {
        val stations = viewModel.stations.value

        val loading = viewModel.loading.value

        CtaTheme {
          Surface(color = MaterialTheme.colors.background) {
            StationsList(loading = loading, stations = stations)
          }
        }
      }
    }
  }

  override fun writeToParcel(parcel: Parcel, flags: Int) {

  }

  override fun describeContents(): Int {
    return 0
  }

  companion object CREATOR : Parcelable.Creator<StationsFragment> {
    override fun createFromParcel(parcel: Parcel): StationsFragment {
      return StationsFragment(parcel)
    }

    override fun newArray(size: Int): Array<StationsFragment?> {
      return arrayOfNulls(size)
    }
  }
}