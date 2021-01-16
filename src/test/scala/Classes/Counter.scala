package Classes

class Adder(amount: Int) {
  def add(in: Int) = in + amount
}


case class Counter(count: Int = 0) {
  def inc:Counter = inc()
  def dec: Counter = dec()

  def inc(amount: Int = 1): Counter = copy(count = count + amount)
  def dec(amount: Int = 1): Counter = copy(count = count - amount)
  def adjust(adder: Adder): Counter = copy(adder.add(count))
}