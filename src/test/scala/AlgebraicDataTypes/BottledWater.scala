package AlgebraicDataTypes

sealed trait Source
final object Well extends Source
final object Spring extends Source
final object Tap extends Source

case class BottledWater(size: Int, source: Source, carbonated: Boolean)
