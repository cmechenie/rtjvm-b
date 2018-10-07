package lectures.part2oop

/**
  * Created by cristian on 08/09/2018
  */
object OOBasics extends App {

  val person = new Person("John", 42)
  println(person.x)
  person.greet()
  person.greet("Cristian")

  val author = new Writer("Cristian", "Mechenie", 1971)
  val novel = new Novel("My first book", 2020, author)
  println(author.fullName)
  println(novel.isWrittenBy(author))
  println(novel.authorAge)
  val newCopy: Novel = novel.copy(2030)
  println(newCopy.authorAge)
}

//constructor
class Person(name: String, val age: Int) {
  // body
  val x = 2

  println(1 + 3)

  //method
  def greet(name: String): Unit = println(s"${this.name} says: Hi $name")
  //overloading
  def greet(): Unit = println(s"Hi, I am $name")

  //multiple constructors
  def this(name: String) = this(name, 0)


}

//writer class
class Writer(firstName: String, surname: String, val yearOfBirth: Int) {
  def fullName: String = firstName + " " + surname
}
//class Novel
class Novel(name: String, releaseYear: Int, author: Writer) {
  def authorAge: Int = releaseYear - author.yearOfBirth
  def isWrittenBy(author: Writer): Boolean = (author == this.author)
  def copy(newReleaseYear: Int): Novel = new Novel(name, newReleaseYear, author)
}

//counter class
class Counter(val n: Int) {
  def currentCount: Int = n

  def increment(): Counter = new Counter(n + 1)
  def decrement(): Counter = new Counter(n - 1)
  def increment(x: Int): Counter = new Counter(n + x)
  def decrement(x: Int): Counter = new Counter(n - x)

}