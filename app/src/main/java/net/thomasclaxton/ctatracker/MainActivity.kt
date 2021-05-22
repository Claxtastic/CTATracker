package net.thomasclaxton.ctatracker

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import dagger.hilt.android.AndroidEntryPoint
import net.thomasclaxton.ctatracker.model.Line

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContent {
      TransitTrackerApp()
    }
  }

  @Composable
  fun TransitTrackerApp() {
    Scaffold {
      setContent { HomeScreen() }
    }
  }
}
