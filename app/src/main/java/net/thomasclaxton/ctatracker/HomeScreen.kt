package net.thomasclaxton.ctatracker

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen() {
  val currentLine = remember { mutableStateOf(TrainConstants.lines[0]) }
  val showDialog = remember { mutableStateOf(false) }

  if (showDialog.value) {
    AlertDialog(
      onDismissRequest = { showDialog.value = false },
      title = {
        Text(text = "Choose Direction")
      },
      confirmButton = {
        Button(
          onClick = {}) {
          Text(currentLine.value.direction1)
        }
      },
      dismissButton = {
        Button(
          onClick = {}) {
          Text(currentLine.value.direction2)
        }
      }
    )
  }

  LazyColumn {
    itemsIndexed(items = TrainConstants.lines, ) { _, line ->
      Row {
        Card(modifier = Modifier.clickable {
          currentLine.value = line
          showDialog.value = true
        }) {
          Text(text = line.name)
        }
      }
    }
  }
}
