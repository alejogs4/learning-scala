package Traits

import java.util.Date

trait Visitor {
  def id: String
  def createdAt: Date

  def getAge: Long = new Date().getTime - createdAt.getTime
}

case class Anonymous(id: String, createdAt: Date = new Date()) extends Visitor
case class User(id: String, createdAt: Date = new Date(), email: String) extends Visitor
