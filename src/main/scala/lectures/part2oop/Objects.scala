package lectures.part2oop

/**
  * Created by cristian on 10/09/2018
  */
object Objects extends App {

  //SCALA DOES NOT HAVE CLASS LEVEL FUNCTIONALITY ("static")
  object Person {   // type + its only instance
    // "static/class" level functionality
    val N_EYES = 2
    def canFly: Boolean = true

    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }
  class Person(val name: String) {
    // Instance level functionality
  }
  //COMPANIONS

  println(Person.N_EYES)
  println(Person.canFly)

  // Scala object = SINGLETON OBJECT
  val mary = new Person("Mary")
  val tom = new Person("Tom")
  println(mary == tom)

  val person1 = Person
  val person2 = Person
  println((person1 ==person2))

  val bobbie = Person(mary, tom)

  //Scala Applications = Scala Object with
  // def main(args: Array[String]): Unit

}
