package StructuralRecursion

sealed trait STrafficLight {
  def next: STrafficLight
}

/*final object Red extends STrafficLight {
  override def next: STrafficLight = Green
}

final object Green extends STrafficLight {
  override def next: STrafficLight = Yellow
}

final object Yellow extends STrafficLight {
  override def next: STrafficLight = Red
}*/
