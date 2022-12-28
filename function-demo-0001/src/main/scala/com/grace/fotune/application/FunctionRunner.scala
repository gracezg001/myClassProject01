package com.grace.fotune.application

import com.grace.fotune.functions.FunctionDemo


object FunctionRunner {
  def main(args: Array[String]): Unit ={

    var f= new FunctionDemo
    val r1 =f.plusOneOrZero(number=100)
    val r2 =f.plusOneOrZero(number = -10)
    val r3=f.plusOneOrZero(number=120)
    println(r1)
    println(r2)
    println(r3)

    val p=f.product(2,3)
    printf("Multiply a*b = %s\n", p)

    val funres=(a: Int, b:Int)=>a * b
    var x= funres(2,4)
     println(x)
    println(funres(2,3))

    printf("2*3 = %s", funres(2,3))


  }



}
