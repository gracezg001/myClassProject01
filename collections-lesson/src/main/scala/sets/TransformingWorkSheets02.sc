val arguments = List("10","Eight","5", "four", "3", "20", "one")

val as = arguments.map(toInt(_))
val rs=as.flatten.sum

arguments.flatMap(toInt())
arguments.flatMap(to(Int)).sum



