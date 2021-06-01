package net.thomasclaxton.ctatracker.model

data class Line(
  val name: String,
  val direction1: String,
  val direction2: String,
  val stations: Map<String, Int>,
  val color: String
)
