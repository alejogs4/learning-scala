package AlgebraicDataTypes

sealed trait Calculation
final case class Succeed(value: Int) extends Calculation
final case class Fail(reason: String) extends Calculation
