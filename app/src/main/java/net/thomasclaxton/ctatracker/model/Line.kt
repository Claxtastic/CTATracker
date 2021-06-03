package net.thomasclaxton.ctatracker.model

data class Line(
  val name: String,
  val direction1: String,
  val direction2: String,
  val stations: HashMap<String, Int>,
  val color: String
)
