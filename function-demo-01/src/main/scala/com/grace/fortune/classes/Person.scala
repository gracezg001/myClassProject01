package com.grace.fortune.classes

class Person {
  var name: Option[String] = None
  var age: Option[Int] = None

  override def toString = s"$name, $age"

}


 object Person {

  def apply(name: Option[String]): Person = {
    var P = new Person
    P.name = name
    P
  }

  def apply(name: Option[String], age: Option[Int]): Person = {
    var P =new Person
    P.name = name
    P.age = age
    P
  }

}
