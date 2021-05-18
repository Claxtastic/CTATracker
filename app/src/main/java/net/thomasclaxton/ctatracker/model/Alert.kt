package net.thomasclaxton.ctatracker.model

data class Alert(
  val AlertId: String,
  val Headline: String,
  val FullDescription: Object,
  val SeverityScore: String,
  val SeverityColor: String,
  val SeverityCSS: String,
  val Impact: String,
  val EventStart: String,
  val EventEnd: String,
  val TBD: String,
  val MajorAlert: String,
  val AlertURL: Object,
  val ImpactedService: Object,
  val ttim: String,
  val GUID: String
)
