package lectures.part2oop

/**
  * Created by cristian on 14/09/2018
  */
object CaseClasses extends App {

  /*
    equals, hashCode, toString
   */

  case class Person(name: String, age: Int)

  // 1. class parameters are fields
  val jim = new Person("Jim", 34)
  println(jim.name)

  // 2. sensible toString
  // println(instance) = println(instance.toString) //syntactic sugar
  println(jim)
  println(jim.toString)

  // 3. equals and hashCode implemented OOTB
  val jim2 = new Person("Jim", 34)
  println(jim == jim2)
  println(jim.hashCode())
  println(jim2.hashCode())

  // 4. case classes have handy copy methods
  val jim3 = jim.copy(age = 45)
  println(jim3)

  // 5. case classes have companion objects
  val thePerson = Person
  println(thePerson)
  val mary = Person("Mary", 24)
  println(mary)

  // 6. case classes are serializable
  // very useful in distributed systems, especially with Akka

  // 7. cases classes have extractor patterns = case classes can be used in  PATTERN MATCHING


  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }

  /*
   exercise: Expand MyList to use case classes and case objects whenever I see fit
   */
}
