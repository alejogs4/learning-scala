package StructuralRecursion.RecursiveTypes

import scala.annotation.tailrec

sealed trait IntList {
  def length: Int = this match {
    case End => 0
    case Pair(_, tail) => 1 + tail.length
  }

  def product: Int = this match {
    case End => 1
    case Pair(head, tail) => head * tail.length
  }

  def double: IntList = this match {
    case End => End
    case Pair(head, tail) => Pair(head * 2, tail.double)
  }
}

final case object End extends IntList
final case class Pair(head: Int, tail: IntList) extends IntList

object ListSum {
  def sum(list: IntList):Int = list match {
    case End => 0
    case Pair(head, tail) => head + sum(tail)
  }
}

object TailCallSum {
  @tailrec
  def sum(list: IntList, total: Int = 0):Int = list match {
    case End => 0
    case Pair(head, tail) => sum(tail, head + total)
  }
}
