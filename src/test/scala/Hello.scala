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

    println("--------------- Director exercise ---------------")
    val eastwood          = new Director("Clint", "Eastwood", 1930)
    val mcTiernan         = new Director("John", "McTiernan", 1951)
    val nolan             = new Director("Christopher", "Nolan", 1970)
    val someBody          = new Director("Just", "Some Body", 1990)

    val memento           = new Film("Memento", 2000, 8.5, nolan)
    val darkKnight        = new Film("Dark Knight", 2008, 9.0, nolan)
    val inception         = new Film("Inception", 2010, 8.8, nolan)

    val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7, eastwood)
    val outlawJoseyWales  = new Film("The Outlaw Josey Wales", 1976, 7.9, eastwood)
    val unforgiven        = new Film("Unforgiven", 1992, 8.3, eastwood)
    val granTorino        = new Film("Gran Torino", 2008, 8.2, eastwood)
    val invictus          = new Film("Invictus", 2009, 7.4, eastwood)

    val predator          = new Film("Predator", 1987, 7.9, mcTiernan)
    val dieHard           = new Film("Die Hard", 1988, 8.3, mcTiernan)
    val huntForRedOctober = new Film("The Hunt for Red October", 1990, 7.6, mcTiernan)
    val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8, mcTiernan)

    println(eastwood.yearOfBirth)


    println(dieHard.filmDirector.name)
    // res17: String = John McTiernan

    println(invictus.isDirectedBy(nolan))
    // res18: Boolean = false

    highPlainsDrifter.copy(name = "L'homme des hautes plaines")
    // res19: Film = Film(L'homme des hautes plaines,1973,7.7,Director(Clint,Eastwood,1930))

    thomasCrownAffair.copy(yearOfRelease = 1968,
      filmDirector = new Director("Norman", "Jewison", 1926))
    // res20: Film = Film(The Thomas Crown Affair,1968,6.8,Director(Norman,Jewison,1926))

    inception.copy().copy().copy()
    println(inception.name)
    // res21: Film = Film(Inception,2010,8.8,Director(Christopher,Nolan,1970))

    println("----------------- Counter ---------------")
    println(new Counter(10).inc.dec.inc.inc.count)
    println(new Counter(10).inc.inc(10).count)
    println(new Counter(10).adjust(new Adder(11)).count)
  }
}
