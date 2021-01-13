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
  }
}
