package Classes

trait Feline {
  def colour: String
  def sound: String
}

trait BigFeline extends Feline {
  override val sound = "Roar"
}

case class Cat(name: String, colour: String, food: String) extends Feline {
  val sound: String = "Meow"
}

case class Tiger(colour: String) extends BigFeline
case class Lion(colour: String, maneSize: Int) extends BigFeline
case class Panther(colour: String) extends BigFeline
