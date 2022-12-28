package com.grace.fotune.classes

class Pizza {
  def printFilename(): Unit ={
    println(Pizza.HiddenAliasName)
  }

}

object Pizza{
  private val HiddenAliasName = "/tmp/PizzaHut.bar"
}
