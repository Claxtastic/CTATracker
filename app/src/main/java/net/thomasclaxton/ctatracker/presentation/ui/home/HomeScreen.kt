package net.thomasclaxton.ctatracker.presentation.ui.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import net.thomasclaxton.ctatracker.constants.TrainConstants

fun Color.Companion.parse(colorString: String): Color =
  Color(color = android.graphics.Color.parseColor(colorString))

@Composable
fun HomeScreen(onEtaClick: () -> Unit) {
  var currentLine by remember { mutableStateOf(TrainConstants.lines[0]) }
  var showDialog by remember { mutableStateOf(false) }

  if (showDialog) {
    AlertDialog(onDismissRequest = { showDialog = false },
      title = {
        Text(text = "Choose Direction")
      },
      confirmButton = {
        Button(onClick = { onEtaClick() }) {
          Text(currentLine.direction1)
        }
      },
      dismissButton = {
        Button(onClick = { onEtaClick() }) {
          Text(currentLine.direction2)
        }
      }
    )
  }

  LazyColumn {
    itemsIndexed(items = TrainConstants.lines) { _, line ->
      Row {
        Card(modifier = Modifier.clickable {
            currentLine = line
            showDialog = true
          },
          shape = RoundedCornerShape(3.dp),
          elevation = 12.dp,
          backgroundColor = Color.parse(line.color)
        ) {
          Text(text = line.name, modifier = Modifier.padding(8.dp))
        }
      }
      Spacer(modifier = Modifier.height(8.dp))
    }
  }
}
