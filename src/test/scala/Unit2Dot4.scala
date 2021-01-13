object Unit2Dot4 {
  val person = "Miguel"

  def methodName: String = "Method with no parameters"
  def sayHello(name: String): String = "Hello " + name
  def sayHelloInnerPerson: String = "Hello Mr " + person

  // Fields vs Methods
  val simpleField = {
    println("Evaluating field")
    21
  }

  def methodWithNoParameters = {
    println("Evaluating method")
    21
  }
}

object Oswald {
  val colour: String = "Black"
  val Food: String = "Milk"
}

object Henderson {
  val colour: String = "Ginger"
  val Food: String = "Chips"
}

object Quentin {
  val colour: String = "Tabby and white"
  val Food: String = "Curry"
}

object calc {
  def square(number: Double): Double = number * number
  def cube(number: Double): Double = number * square(number)
}

object calcTwo {
  def square(number: Double): Double = number * number
  def cube(number: Double): Double = number * square(number)

  def square(number: Int): Int = number * number
  def cube(number: Int): Int = number * square(number)
}

object Person {
  val firstname = "Alejandro"
  val lastname = "Garcia"
}

object Alien {
  def greet(person: PersonSample) = "Greeting " + person.firstname
}