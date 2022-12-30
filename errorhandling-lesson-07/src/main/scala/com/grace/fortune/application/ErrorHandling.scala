package com.grace.fortune.application

import scala.util._
import  scala.util.Try
object ErrorHandling extends App {

  val outcome = Try(10 / 0)

  println(outcome.isFailure)
  println(outcome.isSuccess)

  outcome match {
    case Success(value) => println("was ok")
    case Failure(e) => println("failed ! " + e.getMessage)
  }

  val employee = Set("John","Sam", "Mary", "Stacie")

  if (None ==employee.find(_ =="Mary")) {
    println("Not found")

  } else
    println("Found Mary")


}
