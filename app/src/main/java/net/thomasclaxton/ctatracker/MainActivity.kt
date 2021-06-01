package net.thomasclaxton.ctatracker

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import dagger.hilt.android.AndroidEntryPoint
import net.thomasclaxton.ctatracker.composable.CTATheme
import net.thomasclaxton.ctatracker.composable.HomeScreen

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContent {
      CTATheme {
        Surface(color = MaterialTheme.colors.background) {
          HomeScreen(onEtaClick = {
            startActivity(Intent(this@MainActivity, EtaFragment::class.java))
          })
        }
      }
    }
  }
}
