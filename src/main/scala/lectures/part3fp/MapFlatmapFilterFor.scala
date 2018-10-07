package lectures.part3fp

/**
  * Created by cristian on 07/10/2018
  */
object MapFlatmapFilterFor extends App {

  val list = List(1, 2, 3)
  println(list)
  println(list.head)
  println(list.tail)

  //map
  println(list.map(_ + 1))
  println(list.map(_ + " is a number."))

  //filter
  println(list.filter(_ % 2 == 0))
  println(list.filterNot(_ % 2 == 0))

  // flatmap
  val toPair = (x: Int) => List(x, x + 1)
  println(list.flatMap(toPair))

  // print all combinations between 2 lists
  val numbers = List(1,2,3,4)
  val chars = List("a","b","c","d")
  val colors = List("black","white")

  // "iterations" - THIS IS HOW TO REPLACE THEM
  val combined = numbers.flatMap(n => chars.flatMap(c => colors.map(color => "" + c + n + "-" + color)))
  println(combined)

  // foreach
  list.foreach(println)

  // for-comprehensions
  val forCombined = for {
    n <- numbers if n % 2 == 0  // if guard
    c <- chars
    color <- colors
  } yield "" + c + n + "-" + color
  println(forCombined)

  // instead of numbers.foreach(println):
  for {
    n <- numbers
  } println(n)

  // syntax overload
  println(list.map(_ * 2))  // equivalent to:
  val l = list.map { x =>
    x * 2
  }
  println(l)

  /*
    1.  MyList supports for comprehensions
        map(f: A => B) => MyList[B]
        filter(p: A => Boolean) => MyList[A]
        flatMap(f: A => MyList[B]) => MyList[B]

    2.  A small collection of at most ONE element - Maybe[+T]
        - implement map, flapMap, filter
   */
}
