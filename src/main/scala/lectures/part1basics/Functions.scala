package lectures.part1basics

import scala.annotation.tailrec

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Hello", 3))

  def aParameterlessFunction() = 42

  println(aParameterlessFunction())
  println(aParameterlessFunction)


  def aRepetedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepetedFunction(aString, n - 1)
  }

  println(aRepetedFunction("hello", 3))

  //WHEN YOU NEED LOOPS USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {

    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)

  }

  println(aBigFunction(5))

  // a greeting function
  def aGreeting(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old."
  }

  println(aGreeting("Cristian", 47))

  def factorial(n: Int): Int = {

    if (n <= 1) 1
    else factorial(n - 1) * n
  }

  println(factorial(-5))

  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }
  println(fibonacci(8))
}
