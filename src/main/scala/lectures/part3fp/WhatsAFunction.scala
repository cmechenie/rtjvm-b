package lectures.part3fp

/**
  * Created by cristian on 29/09/2018
  */
object WhatsAFunction extends App {

  // DREAM: use functions as first class elements
  // problem: oop

  val doubler = new myFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }

  println(doubler(2))

  // function types = Function1[A, B]
  val stringToIntConverter = new Function1[String, Int] {
    override def apply(string: String): Int = string.toInt
  }

  println(stringToIntConverter("3") + 4)

  val adder: ((Int, Int) => Int) = new Function2[Int, Int, Int] {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }

  println(adder(34, 43))

  // Function types: Function2[A, B, R] === (A, B) => R

  // ALL SCALA FUNCTIONS ARE OBJECTS

  /*
    1. define a function that takes 2 strings and concatenates them
    2. in myList, transform the myPredicate and myTransformer into function types
    3. define a function that takes an int and returns another function which takes an int and returns an int
      - what's that type of this function
      - how to do it
   */

  val stringConcatenator: ((String, String) => String) = new Function2[String, String, String] {
    override def apply(v1: String, v2: String): String = v1 + v2
  }

  println(stringConcatenator("test", "er"))

  // Function1[Int, Function[Int, Int]]
  val superAdder: Function1[Int, Function1[Int, Int]] = new Function[Int, Function1[Int, Int]] {
    override def apply(v1: Int): Function1[Int, Int] = new Function1[Int, Int] {
      override def apply(v2: Int): Int = v1 + v2
    }
  }

  val adder3 = superAdder(3)
  println(adder3(7))
  println(superAdder(3)(10)) //curried function

}

trait myFunction[A, B] {
  def apply(element: A): B
}
