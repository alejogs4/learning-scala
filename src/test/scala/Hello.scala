import Classes.{Adder, Cat, Circle, Counter, Director, Draw, Film, PersonC, divide, Finite, Infinite}

object Hello {
  def main(args: Array[String]): Unit = {
    val exercise225: Exercise225 = new Exercise225
    val exercise26: Unit2Dot6 = new Unit2Dot6

    val alejandro: PersonC = new PersonC(lastname = "Brunal")
    val director: PersonC = new PersonC("Jose", "Martinez")

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
    println(alejandro.name)

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


    val inception         = new Film("Inception", 2010, 8.8, nolan)

    val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7, eastwood)
    val invictus          = new Film("Invictus", 2009, 7.4, eastwood)

    val dieHard           = new Film("Die Hard", 1988, 8.3, mcTiernan)
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

    println("----------------- Companion objects ---------------")
    println(PersonC("Alejandro Garcia").lastname)
    println(Director.older(eastwood, nolan).lastname)

    println("----------------- Case classes ---------------")
    println(Cat("Shallan", "three-color", "Turkey").toString)
    println(Cat("Shallan", "three-color", "Turkey").name)

    println("----------------- Pattern matching ---------------")
    println(chipShop.willServe(henderson))
    println(chipShop.willServe(oswald))

    println(dad.rate(highPlainsDrifter))
    println(dad.rate(dieHard))
    println(dad.rate(inception))

    println("----------------- sealed traits ---------------")
    println(Draw(Circle(10.0)))

    val result = divide(1, 0) match {
      case Finite(value) => s"It's ${value}"
      case Infinite => "It's infite"
    }

    println(result)
  }
}
