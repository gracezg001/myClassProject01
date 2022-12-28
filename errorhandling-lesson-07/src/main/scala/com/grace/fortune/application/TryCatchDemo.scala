package com.grace.fortune.application

object TryCatchDemo extends App{
  def stringToEnt(in: String): Either[String, Int]={
    try{
      Right(in.toInt)
    } catch {
      case e: NumberFormatException =>Left ("No Response: " + e.getMessage)
    }
  }
 val fiveToInt = stringToEnt(in= "5")
  println(fiveToInt)

  val helloToInt = stringToEnt(in ="hello")
  println(helloToInt)



}
