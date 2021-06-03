package net.thomasclaxton.ctatracker.presentation.ui.stations

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun StationsList(
  loading: Boolean,
  stations: Map<String, Int>,
  chosenDirection: String,
  onStationClick: (Int, String, String) -> Unit
) {
  Box(modifier = Modifier) {
    if (loading && stations.isEmpty()) {
      // TODO: show loading
    } else {
      LazyColumn {
        itemsIndexed(items = stations.keys.toList()) { _, stationName ->
          Card(
            shape = MaterialTheme.shapes.small,
            modifier = Modifier.clickable { onStationClick(stations[stationName]!!, stationName, chosenDirection) }) {
            Text(text = stationName)
          }
        }
      }
    }
  }
}
