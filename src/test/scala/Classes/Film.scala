package Classes

case class Film(name: String, yearOfRelease: Int, imdbRating: Double, filmDirector: Director) {
  def directorsAge: Int = yearOfRelease - filmDirector.yearOfBirth

  def isDirectedBy(director: Director): Boolean = director.name == filmDirector.name
}

object Film {
  def highestRating(filmA: Film, filmB: Film): Film = {
    if (filmA.imdbRating > filmB.imdbRating) filmA else filmB
  }

  def oldestDirectorAtTheTime(filmA: Film, filmB: Film): Director = {
    val ageAtTheTimeDirectorA = filmA.yearOfRelease - filmA.filmDirector.yearOfBirth
    val ageAtTheTimeDirectorB = filmB.yearOfRelease - filmB.filmDirector.yearOfBirth

    if (ageAtTheTimeDirectorA > ageAtTheTimeDirectorB)
      filmA.filmDirector
    else
      filmB.filmDirector
  }
}