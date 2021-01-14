class Unit3Classes {

}

class PersonSample(val firstname: String = "Alejandro", val lastname: String = "Garcia") {
  def getPersonName: String = firstname + " " + lastname
}

class Cat(val name: String, val colour: String, val food: String) {}

object chipShop {
  def willServe(cat: Cat): Boolean = cat.food.toLowerCase == "chips"
}

class Director(val firstname: String, val lastname: String, val yearOfBirth: Int) {
  def name: String = s"$firstname $lastname"
}

class Film(val name: String, val yearOfRelease: Int, val imdbRating: Double, val filmDirector: Director) {
  def directorsAge: Int = yearOfRelease - filmDirector.yearOfBirth

  def isDirectedBy(director: Director): Boolean = director.name == filmDirector.name

  def copy(
            name: String = this.name,
            yearOfRelease: Int = this.yearOfRelease,
            imdbRating: Double = this.imdbRating,
            filmDirector: Director = this.filmDirector): Film = new Film(name, yearOfRelease, imdbRating, filmDirector)
}

class Adder(amount: Int) {
  def add(in: Int) = in + amount
}

class Counter(val count: Int) {
  def inc:Counter = inc()
  def dec: Counter = dec()

  def inc(amount: Int = 1): Counter = new Counter(count + amount)
  def dec(amount: Int = 1): Counter = new Counter(count - amount)

  def adjust(adder: Adder): Counter = new Counter(adder.add(count))
}