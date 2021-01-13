object Hello {
  def main(args: Array[String]): Unit = {
    val exercise225: Exercise225 = new Exercise225
    val exercise26: Unit2Dot6 = new Unit2Dot6

    val alejandro: PersonSample = new PersonSample(lastname = "Brunal")
    val director: PersonSample = new PersonSample("Jose", "Martinez")

    exercise225.run()

    println(Unit2Dot4.methodName)
    println(Unit2Dot4.sayHello("Alejandro"))
    println(Unit2Dot4.sayHelloInnerPerson)

    println(Unit2Dot4.methodWithNoParameters)
    println(Alien.greet(director))

    // 2.3 data types
    // For integer we have
    // Byte(8 bit), Short(16 bit), Int(32 bit), Long(64 bit)

    // For decimal we have
    // Float(32 bit), Double(64 bit)

    // String, Boolean, Unit(void in other languages)
    println(exercise26.run)
    println(alejandro.getPersonName)

    // Cat class
    val oswald = new Cat("Oswald", "Black", "Milk")
    val henderson = new Cat("Henderson", "Ginger", "Chips")
    val quentin = new Cat("Quentin", "Tabby and white", "Curry")

    println("---------------- Cats ------------------")
    println(oswald.name)
    println(henderson.name)
    println(quentin.name)

    println("--------------- Cat object ---------------")
    println(chipShop.willServe(oswald))
    println(chipShop.willServe(henderson))
  }
}
