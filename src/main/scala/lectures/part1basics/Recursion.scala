package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {

      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }

  println(factorial(10))
  //println(factorial(5000))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSIVE = use recursive call as the last expression

    factHelper(n, 1)
  }


  println(anotherFactorial(10))
  //println(anotherFactorial(5000))

  def fibonacci(n: Int): Int = {
    @tailrec
    def helper(x: Int, last: Int, nextToLast: Int): Int = {
      if (x >= n) last
      else helper(x + 1, last + nextToLast, last)
    }
    if (n <= 2) 1
    else helper(2, 1, 1)
  }
  println(fibonacci(8))

}
