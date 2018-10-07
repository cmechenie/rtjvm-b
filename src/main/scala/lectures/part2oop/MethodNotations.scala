package lectures.part2oop

/**
  * Created by cristian on 08/09/2018
  */
object MethodNotations extends App {

  class Person(val name: String, favouriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favouriteMovie

    def +(person: Person): String = s"${this.name} likes to hang out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favouriteMovie)

    def unary_! : String = s"${this.name}, what the heck?!"

    def isAlive: Boolean = true

    def apply(): String = s"Hi my name is $name and my favourite movie is $favouriteMovie"
    def apply(x: Int) = s"$name watched $favouriteMovie $x times"

    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)

    def learns(thing: String) = s"$name learns $thing"
    def learnsScala = this learns "Scala"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")
  //infix notation == operator notation (syntactic sugar)

  // "operators in Scala
  val tom = new Person("Tom", "FightClub")
  println(mary + tom)
  println(mary.+(tom))
  // ALL OPERATORS ARE METHODS
  // Akka actors have ! ?

  // Prefix notations
  val x = -1
  val y = 1.unary_-

  println(tom.unary_!)
  println(!mary)

  // postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary())

  // overloaded +
  println((mary + "the Rockstar")())


  println((+mary).age)

  println(mary learnsScala)

  println(mary(3))


}
