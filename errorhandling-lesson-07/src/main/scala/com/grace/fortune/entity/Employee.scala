package com.grace.fortune.entity

class Employee extends Person {
  var empId: Int = 0
  var salary: Float = 0

  def setEmp(empId: Int, name: String, age: Int, sal: Float): Unit = {
    this.empId = empId
    salary = sal

    setPerson(name, age = 30)

  }
  def printEmp(): Unit = {
    println("Employee Id:" + empId)
    println("salary:" + salary)
    printPerson()
  }


}
