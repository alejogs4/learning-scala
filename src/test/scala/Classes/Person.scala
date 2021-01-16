package Classes

case class PersonC(firstname: String = "Alejandro", lastname: String = "Garcia") {
  def name: String = s"$firstname $lastname"
}

// Companion object
object PersonC {
  def apply(name: String): PersonC = {
    val personName = name.split(" ")
    new PersonC(personName(0), personName(1))
  }
}
