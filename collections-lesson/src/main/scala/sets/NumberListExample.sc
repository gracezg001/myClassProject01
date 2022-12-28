val numbers = List(1,2,3,4,5,6,7,8,9,10)

numbers.sum
numbers.product
numbers.min
numbers.max

val gt5 = numbers.filter(v => v>5)
val gt6 = numbers.filter(_ >=5).min
val gt7 =numbers.filter(_ >=5).max

val pageLoadTimeInSeconds = List(2,1,5,9,14,22,45,2,4,23)

//pageLoadTimeInSeconds.filter(secs =>secs >=10)
pageLoadTimeInSeconds.filter(_ >=10)

  val list = List(4,3,2,1)
list.toSeq

val set2 = Set(4,3,2,1)

val map = Map (1 -> "Sunday", 2 -> "Monday")

pageLoadTimeInSeconds.isEmpty
list.isEmpty
list.nonEmpty
map.isEmpty; map.nonEmpty

list.toSet
map.toList



