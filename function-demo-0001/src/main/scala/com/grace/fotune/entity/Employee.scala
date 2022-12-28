package com.grace.fotune.entity

class
Employee extends Person {
  var empID: Int= 0
  var salary: Float= 0

  def setEmp(empID:Int, name: String, age: Int,sal: Float): Unit={
    this.empID= empID
    salary=sal

    setPerson(name, age=30)
  }

  def printEmp(): Unit = {
    println("Employee Id:" + empID)
    println("salary: " + salary)
    printPerson()
  }


}
