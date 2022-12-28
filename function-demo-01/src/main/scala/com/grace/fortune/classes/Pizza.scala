package com.grace.fortune.classes

class Pizza {

  def printFilename(): Any = {
    println(Pizza.HiddenAliasName)
  }

}

object Pizza {

  private val HiddenAliasName = "/tmp/PizzaHut.bar"
}