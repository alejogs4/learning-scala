class Unit3Classes {

}

class PersonSample(val firstname: String = "Alejandro", val lastname: String = "Garcia") {
  def getPersonName: String = firstname + " " + lastname
}

class Cat(val name: String, val colour: String, val food: String) {}

object chipShop {
  def willServe(cat: Cat): Boolean = cat.food.toLowerCase == "chips"
}