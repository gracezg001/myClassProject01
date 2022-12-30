package com.grace.fortune.application

object SomeNoneDemo extends App{
  // Some, None, try catch demo
  def toInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s.trim))
    } catch {
      case e: Exception => None
    }
  }
  // Call above toInt function defined aboves
  val x: String = "10"
  val result = toInt(x) match {
    case Some(i) => i
   // case None => println("That didn't work.")
    case None => " That did not work."
  }

  println("result: " + result)
  val stringA: String = "Hello"
  val stringB: String = "g"
  val stringC: String = "65535"

  val y = for {
    a <- toInt(stringA)
    b <- toInt(stringB)
    c <- toInt(stringC)
  } yield b

  println("a: " + y)
}
