package net.thomasclaxton.ctatracker.presentation.ui.eta

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.thomasclaxton.ctatracker.network.model.Eta

@Composable
fun EtaCard(
  arrival: Eta,
) {
  Card(
    shape = MaterialTheme.shapes.small,
    modifier = Modifier
      .padding(
        bottom = 6.dp,
        top = 6.dp
      )
      .fillMaxWidth(),
    elevation = 8.dp
  ) {
    Column {
      Row(
        modifier = Modifier
          .fillMaxWidth()
          .padding(top = 12.dp, bottom = 12.dp, start = 8.dp, end = 8.dp)
      ) {
        val timePair: Pair<Long, Long> = arrival.timeUntilArrival()
        Text(text = arrival.runNumber)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = "${timePair.first}m ${timePair.second}s")
      }
    }
  }
}