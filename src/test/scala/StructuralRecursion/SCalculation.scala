package StructuralRecursion

sealed trait SCalculation
final case class Succeed(value: Int) extends SCalculation
final case class Fail(reason: String) extends SCalculation

object Calculator {
  def +(calculation: SCalculation, number: Int): SCalculation =
    calculation match {
      case Succeed(value) => Succeed(value + number)
      case Fail(reason) => Fail(reason)
    }

  def -(calculation: SCalculation, number: Int): SCalculation =
    calculation match {
      case Succeed(value) => Succeed(value - number)
      case Fail(reason) => Fail(reason)
    }

  def /(calculation: SCalculation, number: Int): SCalculation =
    calculation match {
      case Succeed(value) =>
        number match {
          case 0 => Fail("Division by zero")
          case _ => Succeed(value / number)
        }
      case Fail(reason) => Fail(reason)
    }
}
