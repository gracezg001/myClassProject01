package com.grace.fortune.application

import com.grace.fortune.functions.FunctionDemo

object FunctionRunner {
def main (args: Array[String]): Unit = {

  var f = new FunctionDemo
  val r1 = f.plusOneOrZero(number = 100)
  val r2 = f.plusOneOrZero(number = -10)

  println(r1)
  println(r2)

  val P = f.product(2,3)
  printf("Multiply a * b =%s\n", P)

  val funres = ( a: Int, b: Int) => a* b
  var x = funres(2,4)

  println(x)
  println(funres(2,3))
  printf("2*3 = %s", funres(2,3))

}
}
