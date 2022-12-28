val numbers= List(9,4,3,7)
numbers.head

println("This value is " + numbers)

//get rest of the element
val second = numbers.tail

second.head
second.tail

//all other element except last one
numbers.init
//get last
numbers.last

//add
numbers :+ 5
4+:numbers

println( "Numbers value is " + numbers)

// add two list
numbers ++ List(8,5)
List(0,1,2) ++ numbers


// drop
numbers.drop(1)
numbers.drop(2)
numbers.dropRight(1)
numbers.dropRight(2)

val lst=List(1,3,5,8,9)
lst.dropWhile(_ < 3)






