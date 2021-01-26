package StructuralRecursion

sealed trait PatternTrafficLight {
  def next: PatternTrafficLight =
    this match {
      case Red => Green
      case Green => Yellow
      case Yellow => Red
    }
}

final object Red extends PatternTrafficLight
final object Green extends PatternTrafficLight
final object Yellow extends PatternTrafficLight
