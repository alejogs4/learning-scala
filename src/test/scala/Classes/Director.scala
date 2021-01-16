package Classes

case class Director(firstname: String, lastname: String, yearOfBirth: Int) {
  def name: String = s"$firstname $lastname"
}

object Director {
  def older(firstDirector: Director, secondDirector: Director): Director = {
    if (firstDirector.yearOfBirth < secondDirector.yearOfBirth) firstDirector else secondDirector
  }
}