package com.grace.fortune.application

import com.grace.fortune.classes.Bar

object ClassRunner {
  def main (args: Array[String]): Unit = {
    var a = Bar("foo")
    a.show()

  }

}
