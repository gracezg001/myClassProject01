

// Map Function
case class Event(location: String, dayofWeek: String, sessionTimeTNSeconds: Integer, source: String)

val event1 =Event("US", "Sun", 10: Int, "Twitter")
val event2 =Event("China","Sun", 15: Int, "Wechat")
val event3 =Event("New Zealand", "Sun", 30: Int, "Twitter" )
val event4 =Event("US","Tue", 5: Int, "FaceBook")
val event5 =Event("US", "Thu", 24: Int, "LinkedIn")
val event6 =Event("US", "Sat", 10: Int, "FaceBook")

val events =List(event1, event2, event3, event4, event5, event6)

//get all locations
val locations = events.map(event => event.location)

// do same by
val locations =events.map (_.location)

val simpleList =List(1,2,3,4)
simpleList.map(_ +1)
val nestedList =List(List(1,2,3,4), List(4,5,6,7))
 nestedList.map(alist => alist.map(_ + 2))
nestedList.map(alist => alist.map (_ + 3))
nestedList.flatMap(alist =>alist.map(_ +2))
nestedList.map(alist => alist.map(_ +3)).flatten

val abc = nestedList.map(alist => alist.map(_ + 5))
abc.flatten

val arguments = List("10","Eight","5", "four", "3", "20", "one")


def toInt(s: String): Option[Int] = {
 try{
  Some(s.toInt)
 }catch {
  case e: NumberFormatException=> None
 }

}









