package net.thomasclaxton.ctatracker.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import net.thomasclaxton.ctatracker.Eta

@Composable
fun EtaList(
  loading: Boolean,
  eta: List<Eta>
) {
  Box(modifier = Modifier) {
    if (loading && eta.isEmpty()) {

    } else {
      LazyColumn {
        itemsIndexed(
          items = eta
        ) { index, arrival ->
          EtaCard(arrival = arrival)
        }
      }
    }
  }
}
