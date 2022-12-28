package com.grace.fortune.application

import com.grace.fortune.entity._

object Main {
  def  main (args: Array[String]): Unit = {
    println("Hello world")
    var emp1 = new Employee
    var empScott = new Employee

    emp1.setEmp(empId = 10001, name = "James", age= 48, sal=1234.60f)
    empScott.setEmp(empId = 10002, name = "Alice", age = 24, sal = 2345.12f)

    emp1.printPerson()
    println("--------------------")

    empScott.printEmp();

    var mary = new ManagerCompanion

    mary.salary= 120
    println("--------------------------------")
    println("Mary's salary----->" + mary.salary)

  }

}
