package Classes

sealed trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
}

sealed trait Rectangular extends Shape {
  def width: Double
  def height: Double

  override val sides = 4;

  val perimeter = (width * 2) + (height * 2)
  val area = width * height
}

final case class Circle(radius: Double) extends Shape {
  val sides = 1
  val perimeter = 2 * math.Pi * radius
  val area = math.Pi * radius * radius
}

final case class Rectangle(width: Double, height: Double) extends Rectangular

final case class Square(sideSize: Double) extends Rectangular {
  val width = sideSize
  val height = sideSize
}

object Draw {
  def apply(shape: Shape): String =
    shape match {
      case Circle(radius) => s"A circle of radius ${radius}cm"
      case Rectangle(width, height) => s"A rectangle of width ${width}cm and height ${height}cm"
      case Square(sideSize) =>  s"An square of size ${sideSize}cm"
    }
}
