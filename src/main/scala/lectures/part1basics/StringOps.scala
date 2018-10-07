package lectures.part1basics

/**
  * Created by cristian on 08/09/2018
  */
object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(3))
  println(str.toLowerCase)
  println(str.replace("l", "w"))

  val aNumber: String = "2"
  println('a' +: aNumber :+ 'z')
  println(str.reverse)
  println(str.take(2))

  // Scala-specific

  //s - interpolators
  val name = "Cristian"
  val age = 47
  val greeting = s"Hello, my name is $name and my age is $age"
  val anotherGreeting = s"Hello, my name is $name and my age will be ${age + 1} next year"

  println(anotherGreeting)

  //F - interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.4f burgers per minute"
  println(myth)

  //raw - interpolators
  println(raw"This is a \n new line")
  val escaped = "This is a \n new line"
  println(raw"$escaped")
}
