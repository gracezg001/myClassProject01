package com.grace.fotune.functions

class FunctionDemo {
   def plusOneOrZero(number: Int): Int={
   if (number < 0)
   0
   else
   number +1
  }


  def product(a: Int, b: Int): Int = { a*b }
  def productV2(a: Int, b: Int): Int = {a  * b}
  def productV3(a: Int, b: Int)= a*b
}


