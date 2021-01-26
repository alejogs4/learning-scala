package Classes

sealed trait DivisionResult {}

final case class Finite(value: Double) extends DivisionResult
case object Infinite extends DivisionResult

object divide {
  def apply(first: Double, second: Double): DivisionResult = second match {
    case 0 => Infinite
    case _ => Finite(first / second)
  }
} 
