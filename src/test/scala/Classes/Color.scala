package Classes

trait Color {
  def red: Int
  def blue: Int
  def green: Int

  def isLight = (Math.random.ceil * 2) == 0;
  def isDark = !isLight
}

case object Red extends Color {
  val red = 1
  val blue = 1
  val green = 1
}

case object Yellow extends Color {
  val red = 2
  val blue = 2
  val green = 2
}

case object Pink extends Color {
  val red = 3
  val blue = 3
  val green = 3
}

final case class CustomColor(red: Int, blue: Int, green: Int) extends Color


